package com.soft863.scheduledtask;

import com.soft863.domain.TbperStaff;
import com.soft863.domain.TbquaDetail;
import com.soft863.domain.TbquaTask;
import com.soft863.domain.TbstuInfo;
import com.soft863.service.impl.QuaDataDetectionServiceImpl;
import com.soft863.service.impl.TbquaDetailServiceImpl;
import com.soft863.service.impl.TbquaTaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;


@Service
public class TaskServiceImpl implements TaskService {
    private ScheduledExecutorService executorLose;
    private ScheduledExecutorService executorMore;
    private ScheduledFuture<?> scheduledFutureLose;
    private ScheduledFuture<?> scheduledFutureMore;
    private int x = 10;
    private static String type = "MM月dd日HH时mm分";
    private static List<Integer> lose = new ArrayList<>();
    private static List<Integer> more = new ArrayList<>();
    private static List<String> date = new ArrayList<>();



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        TaskServiceImpl.type = type;
    }

    public static List<Integer> getLose() {
        return lose;
    }

    public static void setLose(List<Integer> lose) {
        TaskServiceImpl.lose = lose;
    }

    public static List<Integer> getMore() {
        return more;
    }

    public static void setMore(List<Integer> more) {
        TaskServiceImpl.more = more;
    }

    public static List<String> getDate() {
        return date;
    }

    public static void setDate(List<String> date) {
        TaskServiceImpl.date = date;
    }

    public ScheduledExecutorService getExecutorLose() {
        return executorLose;
    }

    public void setExecutorLose(ScheduledExecutorService executorLose) {
        this.executorLose = executorLose;
    }

    public ScheduledExecutorService getExecutorMore() {
        return executorMore;
    }

    public void setExecutorMore(ScheduledExecutorService executorMore) {
        this.executorMore = executorMore;
    }

    public ScheduledFuture<?> getScheduledFutureLose() {
        return scheduledFutureLose;
    }

    public void setScheduledFutureLose(ScheduledFuture<?> scheduledFutureLose) {
        this.scheduledFutureLose = scheduledFutureLose;
    }

    public ScheduledFuture<?> getScheduledFutureMore() {
        return scheduledFutureMore;
    }

    public void setScheduledFutureMore(ScheduledFuture<?> scheduledFutureMore) {
        this.scheduledFutureMore = scheduledFutureMore;
    }

    @Autowired
    QuaDataDetectionServiceImpl quaDataDetectionService;
    @Autowired
    TbquaDetailServiceImpl detailService;
    @Autowired
    TbquaTaskServiceImpl taskService;

    @Override
    public TbquaTask loseTask(Integer timeInterval, TimeUnit timeUnit) {
        System.out.println("当前时间：" + LocalDateTime.now());
        TbquaTask tbquaTask = new TbquaTask();
        int i = new Random().nextInt((8999) + 1000);
        Long taskId = Long.parseLong(new SimpleDateFormat("yyyyMMdd").format(new Date()) + i);
        tbquaTask.setfTask(taskId);
        tbquaTask.setfCreateTime(new Date());
        tbquaTask.setfName("信息缺失质检");
        tbquaTask.setfState(Long.parseLong("0"));
        tbquaTask.setfRate("" + timeInterval + timeUnit);
        tbquaTask.setfRuleId(Long.parseLong("0"));
        tbquaTask.setfForm(Long.parseLong("0"));
        AtomicReference<TbquaTask> loseTask = new AtomicReference<>(new TbquaTask());
        executorLose = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
            System.out.println("信息缺失质检开始");
            loseTask.set(quaIns(tbquaTask));
            System.out.println("信息缺失质检结束");
        };
        scheduledFutureLose = executorLose.scheduleAtFixedRate(task, 0, timeInterval, timeUnit);
        return tbquaTask;
    }

    @Override
    public TbquaTask moreTask(Integer timeInterval, TimeUnit timeUnit) {
        System.out.println("当前时间：" + LocalDateTime.now());
        int i = new Random().nextInt((8999) + 1000);
        Long taskId = Long.parseLong(new SimpleDateFormat("yyyyMMdd").format(new Date()) + i);
        TbquaTask tbquaTask = new TbquaTask();
        tbquaTask.setfTask(taskId);
        tbquaTask.setfCreateTime(new Date());
        tbquaTask.setfName("信息冗余质检");
        tbquaTask.setfState(Long.parseLong("0"));
        tbquaTask.setfRate("" + timeInterval + timeUnit);
        tbquaTask.setfRuleId(Long.parseLong("1"));
        tbquaTask.setfForm(Long.parseLong("1"));
        AtomicReference<TbquaTask> moreTask = new AtomicReference<>(new TbquaTask());
        executorMore = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
            System.out.println("信息冗余质检开始");
            moreTask.set(moreTask(tbquaTask));
            System.out.println("信息冗余质检结束");
        };
        scheduledFutureMore = executorMore.scheduleAtFixedRate(task, 0, timeInterval, timeUnit);
        return tbquaTask;
    }


    @Autowired
    TbquaDetailServiceImpl tbquaDetailService;


    public void dateAdd(){
        date.add(new SimpleDateFormat(TaskServiceImpl.type).format(new Date()));
    }
    //数据冗余检测
    public TbquaTask moreTask(TbquaTask tbquaTask) {
        tbquaTask.setfStartTime(new Date());
        List<TbstuInfo> tbstuInfos = quaDataDetectionService.stuMore();
        String type = "0";
        TbquaTask selectByTaskIdTask = taskService.selectByTaskId(tbquaTask);
        TbquaTask temp=new TbquaTask();
        if (selectByTaskIdTask==null){
            temp=tbquaTask;
        }else {
            temp=selectByTaskIdTask;
        }
        for (TbstuInfo tbstuInfo : tbstuInfos) {
            TbquaDetail detail = new TbquaDetail();
            String no = String.valueOf(tbstuInfo.getfId());
            detail.setfDataid(no);
            detail.setfTbname(Long.parseLong("1012"));
            int num = quaDataDetectionService.isHave(detail);
            detail.setfType(type);
            detail.setfTaskid(temp.getfTask());
            detail.setfSuggestion("已毕业");
            if (num <= 0) {
                detailService.insertTbquaDetail(detail);
            } else {
                detailService.updateTbquaDetail(detail);
            }
        }
        tbquaTask.setfEndTime(new Date());

        if (selectByTaskIdTask == null) {
            taskService.insertTbquaTask(tbquaTask);
        } else {
            tbquaTask.setfId(selectByTaskIdTask.getfId());
            tbquaTask.setfTask(selectByTaskIdTask.getfTask());
            taskService.updateTbquaTask(tbquaTask);
        }

            more.add(tbstuInfos.size());

        if (date.size() >= x) {
            date.remove(0);
            lose.remove(0);
            more.remove(0);
        }
        return tbquaTask;
    }

    /**
     * 学生教师信息质检
     */

    public TbquaTask quaIns(TbquaTask tbquaTask) {
        tbquaTask.setfStartTime(new Date());
        List<TbstuInfo> stuLoseEduInfo;
        List<TbstuInfo> stuLosePerInfo;
        List<TbperStaff> teaLoseEduInfo;
        List<TbperStaff> teaLosePerInfo;
        TbquaTask selectByTaskIdTask = taskService.selectByTaskId(tbquaTask);
        TbquaTask temp =new TbquaTask();
        if (selectByTaskIdTask==null){
            temp=tbquaTask;
        }else {
            temp=selectByTaskIdTask;
        }
            stuLoseEduInfo = quaDataDetectionService.stuLoseEduInfo();
            stuLosePerInfo = quaDataDetectionService.stuLosePerInfo();
            teaLoseEduInfo = quaDataDetectionService.teaLoseEduInfo();
            teaLosePerInfo = quaDataDetectionService.teaLosePerInfo();
            String type = "1";


            //学生质检
            for (TbstuInfo tbstuInfo : stuLoseEduInfo) {
                TbquaDetail detail = new TbquaDetail();
                String no = String.valueOf(tbstuInfo.getfId());
                detail.setfDataid(no);
                detail.setfTbname(Long.parseLong("1012"));
                int num = quaDataDetectionService.isHave(detail);
                detail.setfType(type);
                detail.setfTaskid(temp.getfTask());
                detail.setfSuggestion("教务信息缺失");
                if (num <= 0) {
                    detailService.insertTbquaDetail(detail);
                } else {
                    detailService.updateTbquaDetail(detail);
                }
            }

            for (TbstuInfo tbstuInfo : stuLosePerInfo) {
                TbquaDetail detail = new TbquaDetail();
                String no = String.valueOf(tbstuInfo.getfId());
                detail.setfType(type);
                detail.setfDataid(no);
                detail.setfTbname(Long.parseLong("1012"));
                int num = quaDataDetectionService.isHave(detail);
                detail.setfTaskid(temp.getfTask());
                detail.setfSuggestion("个人信息缺失");
                if (num <= 0) {
                    detailService.insertTbquaDetail(detail);
                } else {
                    detailService.updateTbquaDetail(detail);
                }
            }

            //老师质检
            for (TbperStaff tbperStaff : teaLoseEduInfo) {
                TbquaDetail detail = new TbquaDetail();
                String no = String.valueOf(tbperStaff.getfId());
                detail.setfType(type);
                detail.setfDataid(no);
                detail.setfTbname(Long.parseLong("1013"));
                int num = quaDataDetectionService.isHave(detail);
                detail.setfTaskid(temp.getfTask());
                detail.setfSuggestion("教务信息缺失");
                if (num <= 0) {
                    detailService.insertTbquaDetail(detail);
                } else {
                    detailService.updateTbquaDetail(detail);
                }
            }

            for (TbperStaff tbperStaff : teaLosePerInfo) {
                TbquaDetail detail = new TbquaDetail();
                String no = String.valueOf(tbperStaff.getfId());
                detail.setfType(type);
                detail.setfDataid(no);
                detail.setfTbname(Long.parseLong("1013"));
                int num = quaDataDetectionService.isHave(detail);
                detail.setfTaskid(temp.getfTask());
                detail.setfSuggestion("个人信息缺失");
                if (num <= 0) {
                    detailService.insertTbquaDetail(detail);
                } else {
                    detailService.updateTbquaDetail(detail);
                }
            }
            tbquaTask.setfEndTime(new Date());
            if (selectByTaskIdTask == null) {
                taskService.insertTbquaTask(tbquaTask);
            } else {
                tbquaTask.setfId(selectByTaskIdTask.getfId());
                tbquaTask.setfTask(selectByTaskIdTask.getfTask());
                taskService.updateTbquaTask(tbquaTask);
            }
                lose.add(stuLoseEduInfo.size() + stuLosePerInfo.size() + teaLoseEduInfo.size() + teaLosePerInfo.size());
            if (date.size() >=x) {
                date.remove(0);
                lose.remove(0);
                more.remove(0);
            }
            dateAdd();
        return tbquaTask;
    }
}

