package com.soft863.controller;

import com.alibaba.fastjson.JSON;
import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbdiaCourse;
import com.soft863.domain.TbdiaMajor;
import com.soft863.domain.TbdiaTeach;
import com.soft863.service.ITbdiaCourseService;
import com.soft863.service.ITbdiaMajorService;
import com.soft863.service.ITbdiaTeachService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 专业画像Controller
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
@Controller
@RequestMapping("/dia/major")
public class TbdiaMajorController extends BaseController
{
    private String prefix = "dia/major";

    @Autowired
    private ITbdiaMajorService tbdiaMajorService;

    @Autowired
    private ITbdiaCourseService tbdiaCourseService;

    @Autowired
    private ITbdiaTeachService tbdiaTeachService;

    @RequiresPermissions("dia:major:view")
    @GetMapping()
    public String major()
    {
        return prefix + "/major";
    }

    /**
     * 查询专业画像列表
     */
    @RequiresPermissions("dia:major:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaMajor tbdiaMajor)
    {
        startPage();
        List<TbdiaMajor> list = tbdiaMajorService.selectTbdiaMajorList(tbdiaMajor);
        return getDataTable(list);
    }

    /**
     * 导出专业画像列表
     */
    @RequiresPermissions("dia:major:export")
    @Log(title = "专业画像", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbdiaMajor tbdiaMajor)
    {
        List<TbdiaMajor> list = tbdiaMajorService.selectTbdiaMajorList(tbdiaMajor);
        ExcelUtil<TbdiaMajor> util = new ExcelUtil<TbdiaMajor>(TbdiaMajor.class);
        return util.exportExcel(list, "专业画像数据");
    }

    /**
     * 新增专业画像
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存专业画像
     */
    @RequiresPermissions("dia:major:add")
    @Log(title = "专业画像", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbdiaMajor tbdiaMajor)
    {
        return toAjax(tbdiaMajorService.insertTbdiaMajor(tbdiaMajor));
    }

    /**
     * 修改专业画像
     */
    @RequiresPermissions("dia:major:edit")
    @GetMapping("/edit/{fMid}")
    public String edit(@PathVariable("fMid") Long fMid, ModelMap mmap)
    {
        TbdiaMajor tbdiaMajor = tbdiaMajorService.selectTbdiaMajorByFMid(fMid);
        mmap.put("tbdiaMajor", tbdiaMajor);
        return prefix + "/edit";
    }

    /**
     * 修改保存专业画像
     */
    @RequiresPermissions("dia:major:edit")
    @Log(title = "专业画像", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbdiaMajor tbdiaMajor)
    {
        return toAjax(tbdiaMajorService.updateTbdiaMajor(tbdiaMajor));
    }

    /**
     * 删除专业画像
     */
    @RequiresPermissions("dia:major:remove")
    @Log(title = "专业画像", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbdiaMajorService.deleteTbdiaMajorByFMids(ids));
    }

    /**
     * 专业画像分析
     */
    @RequestMapping("/detail")
    public String getDetail(ModelMap map){
        return prefix +"/detail";
    }

    /**
     * 师资力量
     */
    @RequestMapping("/getTeacher")
    @ResponseBody
    public void getTeacher(String majorCode,ModelMap map){
       List<TbdiaTeach> teacherList = tbdiaTeachService.selectTeacherByMajorCode(majorCode);
        for (TbdiaTeach tbdiaTeach : teacherList) {
            System.out.println(tbdiaTeach);
        }
       map.put("teacherList", teacherList);
    }

    /**
     * 根据专业代码获取专业详情
     */
    @RequestMapping("/getInfo")
    public void getInfo(Long majorCode,ModelMap map){
        TbdiaMajor major= tbdiaMajorService.selectTbdiaMajorByFMid(majorCode);
        map.put("major", major);
    }

    /**
     * 根据专业方向查询对应课程
     */
    @RequestMapping("/getCourse")
    public void getCourse(String majorName){
        List<TbdiaCourse> courseList = tbdiaCourseService.selectCourseByMajor(majorName);
    }



    /**
     * 专业升学率图表
     */
    @PostMapping("/shengxue")
    @ResponseBody
    public String getMpass(ModelMap map){
        System.out.println(11111);
        //查询所有专业名
        List<String> majorName = tbdiaMajorService.getMajorName();
        List<String> mpass = tbdiaMajorService.getMpass();
        map.put("majorName", majorName);
        map.put("mpass", mpass);
        String json = JSON.toJSONString(map);
        return json;
    }

    /**
     * 查询所有老师的数量
     */
    @PostMapping("/teacher")
    @ResponseBody
    public String getTeacherCount(){
        List<Map<String,String>> teacherList = tbdiaTeachService.selectTeacherCount();
        String jsonString = JSON.toJSONString(teacherList);
        return jsonString;
    }

    /**
     * 查询专业类型即数量
     */
    @PostMapping("/getMajor")
    @ResponseBody
    public String getMajorCount() {
        List<Map<String, String>> majorList = tbdiaMajorService.selectMajorCount();
        String jsonString = JSON.toJSONString(majorList);
        return jsonString;
    }

    /**
     * 获取专业 在校人数前五排行
     */
    @PostMapping("/mstunumOrder")
    public String getMajorOrder(ModelMap map){
        List<TbdiaMajor> majorList = tbdiaMajorService.selectMajorOrder();
        map.put("majorList",majorList);
        return "/dia/major/detail::orderTable";
    }

    /**
     * 获取专业 升学率前五排行
     */
    @PostMapping("/mpassOrder")
    public String getMstunumOrder(ModelMap map){
        List<TbdiaMajor> mpassList = tbdiaMajorService.selectMpassOrder();
        map.put("mpassList",mpassList);
        return "/dia/major/detail::mpassOrder";
    }

    /**
     * 跳转更多
     */
    @RequestMapping("/more")
    public String toMore(){
        return prefix+"/more";
    }

}
