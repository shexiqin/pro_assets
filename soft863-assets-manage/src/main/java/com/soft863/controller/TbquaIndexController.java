package com.soft863.controller;

import com.soft863.common.core.controller.BaseController;
import com.soft863.domain.TbquaDetail;
import com.soft863.domain.TbquaTask;
import com.soft863.scheduledtask.TaskServiceImpl;
import com.soft863.service.impl.QuaDataDetectionServiceImpl;
import com.soft863.service.impl.TbquaDetailServiceImpl;
import com.soft863.service.impl.TbquaTaskServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/qua/index")
public class TbquaIndexController extends BaseController {
    private  static TbquaTask tbLoseTask;
    private  static TbquaTask tbMoreTask;
    private String prefix = "qua/index";
    @Autowired
    QuaDataDetectionServiceImpl quaDataDetectionService;
    @Autowired
    TbquaDetailServiceImpl tbquaDetailService;

    @RequiresPermissions("qua:index:view")
    @GetMapping()
    public String quaIndex(ModelMap map) {
        TbquaDetail stuLose=new TbquaDetail();
        stuLose.setfTbname(Long.parseLong("1012"));
        stuLose.setfType("1");
        TbquaDetail stuMore=new TbquaDetail();
        stuMore.setfTbname(Long.parseLong("1012"));
        stuMore.setfType("0");
        TbquaDetail teaLose=new TbquaDetail();
        teaLose.setfTbname(Long.parseLong("1013"));
        teaLose.setfType("1");
        TbquaDetail teaMore=new TbquaDetail();
        teaMore.setfTbname(Long.parseLong("1013"));
        teaMore.setfType("0");
        List<Integer> lose=new ArrayList<>();
        List<Integer> more=new ArrayList<>();
        int stuLoseCount = quaDataDetectionService.count(stuLose);
        int stuMoreCount =quaDataDetectionService.count(stuMore);
        int teaLoseCount = quaDataDetectionService.count(teaLose);
        int teaMoreCount =quaDataDetectionService.count(teaMore);
        lose.add(stuLoseCount);
        lose.add(teaLoseCount);
        more.add(stuMoreCount);
        more.add(teaMoreCount);
        List<Integer> loseList = TaskServiceImpl.getLose();
        List<Integer> moreList = TaskServiceImpl.getMore();
        List<String> date = TaskServiceImpl.getDate();
        map.put("lose",lose);
        map.put("more",more);
        map.put("loseList",loseList);
        map.put("moreList",moreList);
        map.put("date",date);
        return prefix + "/index";
    }
    @Autowired
    TaskServiceImpl taskService;

    @GetMapping("/task")
    @ResponseBody
    public void taskCon(HttpServletRequest request){
        String time = request.getParameter("time");
        String type = request.getParameter("type");
        String task = request.getParameter("task");
        if ("qua".equals(task)){
            loseTaskStart(time,type);
            moreTaskStart(time,type);
        }
    }

    public void loseTaskStart(String time, String type) {
        TimeUnit taskType = TimeUnit.MINUTES;
        if ("1".equals(type)) {
            taskType = TimeUnit.HOURS;
        } else if ("2".equals(type)) {
            taskType = TimeUnit.DAYS;
        }
        ScheduledFuture<?> scheduledFuture = taskService.getScheduledFutureLose();
        try {
            if (scheduledFuture == null) {
                tbLoseTask = taskService.loseTask(Integer.parseInt(time), taskType);
                if (taskService.getScheduledFutureLose() != null) {
                    System.out.println("缺失质检启动成功");
                } else {
                    System.out.println("缺失质检启动失败");
                }
            } else {
                System.out.println("缺失质检任务已启动！");
            }
        } catch (Exception e) {
            System.out.println("缺失质检启动失败");
        }
    }

    public void moreTaskStart(String time, String type) {
        TimeUnit taskType = TimeUnit.MINUTES;
        if ("1".equals(type)) {
            taskType = TimeUnit.HOURS;
            TaskServiceImpl.setType("MM月dd日HH时");
        } else if ("2".equals(type)) {
            TaskServiceImpl.setType("MM月dd日");
            taskType = TimeUnit.DAYS;
        }
        TaskServiceImpl.setMore(new ArrayList<>());
        TaskServiceImpl.setLose(new ArrayList<>());
        TaskServiceImpl.setDate(new ArrayList<>());
        ScheduledFuture<?> scheduledFuture = taskService.getScheduledFutureMore();
        try {
            if (scheduledFuture == null) {
                tbMoreTask= taskService.moreTask(Integer.parseInt(time), taskType);
                if (taskService.getExecutorMore() != null) {
                    System.out.println("冗余质检启动成功");
                } else {
                    System.out.println("冗余质检启动失败");
                }
            } else {
                System.out.println("冗余质检任务已启动！");
            }
        } catch (Exception e) {
            System.out.println("冗余质检启动失败");
        }


    }
    @Autowired
    TbquaTaskServiceImpl tbquaTaskService;

    @GetMapping("/stopTask")
    @ResponseBody
    public void stopTask(HttpServletRequest request){
        String task = request.getParameter("task");
        //List<TbquaTask> tbquaTasks = tbquaTaskService.selectTbquaTaskList(new TbquaTask());
        if ("qua".equals(task)){
            stopLoseTask();
            TbquaTask loseTask = tbquaTaskService.selectByTaskId(tbLoseTask);
            tbquaTaskService.deleteTbquaTaskByFId(loseTask.getfId());
            stopMoreTask();
            TbquaTask moreTasks = tbquaTaskService.selectByTaskId(tbMoreTask);
            tbquaTaskService.deleteTbquaTaskByFId(moreTasks.getfId());
        }
    }
    public void stopLoseTask() {
        ScheduledFuture<?> scheduledFuture = taskService.getScheduledFutureLose();
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            taskService.setScheduledFutureLose(null);
            System.out.println("缺失质检任务已成功停止");
        }
    }
    public void stopMoreTask() {
        ScheduledFuture<?> scheduledFuture = taskService.getScheduledFutureMore();
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            taskService.setScheduledFutureMore(null);
            System.out.println("冗余质检任务已成功停止");
        }
    }
}
