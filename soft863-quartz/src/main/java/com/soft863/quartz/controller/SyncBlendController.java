package com.soft863.quartz.controller;

import com.soft863.quartz.service.impl.SyncBlendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 董文斌
 */
@Controller
@RequestMapping("/sync")
@Component("qua")
public class SyncBlendController {
    @Autowired
    SyncBlendServiceImpl syncBlendService;

    @RequestMapping("/stu")
    public void SyncStudent() {
        syncBlendService.syncStudent();

    }
    /**
     * 袁梦轲
     * @return
     */
    @RequestMapping("/teach")
    @ResponseBody
    public void SyncTeacher(){
        syncBlendService.SyncTeacher();
        syncBlendService.updateEdu();
        System.out.println("教师画像已同步执行成功");
    }
}
