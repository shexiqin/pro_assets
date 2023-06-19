package com.soft863.quartz.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import com.soft863.quartz.domain.SynTask;
import com.soft863.quartz.mapper.SysJobLogMapper;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.soft863.common.constant.Constants;
import com.soft863.common.constant.ScheduleConstants;
import com.soft863.common.utils.ExceptionUtil;
import com.soft863.common.utils.StringUtils;
import com.soft863.common.utils.bean.BeanUtils;
import com.soft863.common.utils.spring.SpringUtils;
import com.soft863.quartz.domain.SysJob;
import com.soft863.quartz.domain.SysJobLog;
import com.soft863.quartz.service.ISysJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 抽象quartz调用
 *
 * @author ruoyi
 */
@Component
public abstract class AbstractQuartzJob implements Job {
    @Autowired
    private SysJobLogMapper sysJobLogMapper;
    private static final Logger log = LoggerFactory.getLogger(AbstractQuartzJob.class);

    /**
     * 线程本地变量
     */
    private static ThreadLocal<Date> threadLocal = new ThreadLocal<>();

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        SysJob sysJob = new SysJob();
        BeanUtils.copyBeanProp(sysJob, context.getMergedJobDataMap().get(ScheduleConstants.TASK_PROPERTIES));
        try {
            before(context, sysJob);
            if (sysJob != null) {
                doExecute(context, sysJob);
            }
            after(context, sysJob, null);
        } catch (Exception e) {
            log.error("任务执行异常  - ：", e);
            after(context, sysJob, e);
        }
    }

    /**
     * 执行前
     *
     * @param context 工作执行上下文对象
     * @param sysJob  系统计划任务
     */
    protected void before(JobExecutionContext context, SysJob sysJob) {
        threadLocal.set(new Date());
    }

    /**
     * 执行后
     *
     * @param context 工作执行上下文对象
     * @param sysJob  系统计划任务
     */
    protected void after(JobExecutionContext context, SysJob sysJob, Exception e) {
        Date startTime = threadLocal.get();
        threadLocal.remove();

        final SynTask task = new SynTask();
        final SysJobLog sysJobLog = new SysJobLog();
        //任务信息
        task.setfTaskId(sysJob.getJobId());
        task.setfTaskName(sysJob.getJobName());
        task.setfCreateTime(startTime);
        task.setfEndTime(new Date());
        //任务日志
        sysJobLog.setfTaskId(sysJob.getJobId());
        sysJobLog.setfTaskName(sysJob.getJobName());
        Date now = new Date();
        long runMs = now.getTime() - startTime.getTime();
        sysJobLog.setfLog(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTime)+ "   任务开始执行...." );
        SpringUtils.getBean(ISysJobLogService.class).addJobLog(sysJobLog);
        if (e != null) {
            task.setfStatus(Constants.FAIL);
            sysJobLog.setfType(Constants.FAIL);
            String errorMsg = StringUtils.substring(ExceptionUtil.getExceptionMessage(e), 0, 2000);
            sysJobLog.setfException(errorMsg);
            sysJobLog.setfLog("任务执行失败");
            SpringUtils.getBean(ISysJobLogService.class).addJobLog(sysJobLog);
        } else {
            task.setfStatus(Constants.SUCCESS);
            sysJobLog.setfType(Constants.SUCCESS);
            sysJobLog.setfLog("任务执行成功");
        }
        sysJobLog.setfLog("数据融合了 "+ sysJobLogMapper.selectAll()+" 条数据");
        SpringUtils.getBean(ISysJobLogService.class).addJobLog(sysJobLog);
        sysJobLog.setfLog(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now)+ "   任务执行结束。");
        SpringUtils.getBean(ISysJobLogService.class).addJobLog(sysJobLog);
        sysJobLog.setfLog(sysJob.getJobName() + "任务" + "总耗时：" + runMs + "毫秒");
        // 写入数据库当中
        SpringUtils.getBean(ISysJobLogService.class).addJobLog(sysJobLog);
        SpringUtils.getBean(ISysJobLogService.class).addTask(task);
    }

    /**
     * 执行方法，由子类重载
     *
     * @param context 工作执行上下文对象
     * @param sysJob  系统计划任务
     * @throws Exception 执行过程中的异常
     */
    protected abstract void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception;
}
