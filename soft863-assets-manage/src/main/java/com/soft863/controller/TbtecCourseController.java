package com.soft863.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.soft863.common.annotation.Log;
import com.soft863.common.enums.BusinessType;
import com.soft863.domain.TbtecCourse;
import com.soft863.service.ITbtecCourseService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 课程设置Controller
 * 
 * @author wangying
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/tec/course")
public class TbtecCourseController extends BaseController
{
    private String prefix = "tec/course";

    @Autowired
    private ITbtecCourseService tbtecCourseService;

    @RequiresPermissions("tec:course:view")
    @GetMapping()
    public String course()
    {
        return prefix + "/course";
    }

    /**
     * 查询课程设置列表
     */
    @RequiresPermissions("tec:course:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbtecCourse tbtecCourse)
    {
        startPage();
        List<TbtecCourse> list = tbtecCourseService.selectTbtecCourseList(tbtecCourse);
        return getDataTable(list);
    }

    /**
     * 导出课程设置列表
     */
    @RequiresPermissions("tec:course:export")
    @Log(title = "课程设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbtecCourse tbtecCourse)
    {
        List<TbtecCourse> list = tbtecCourseService.selectTbtecCourseList(tbtecCourse);
        ExcelUtil<TbtecCourse> util = new ExcelUtil<TbtecCourse>(TbtecCourse.class);
        return util.exportExcel(list, "课程设置数据");
    }

    /**
     * 新增课程设置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存课程设置
     */
    @RequiresPermissions("tec:course:add")
    @Log(title = "课程设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbtecCourse tbtecCourse)
    {
        return toAjax(tbtecCourseService.insertTbtecCourse(tbtecCourse));
    }

    /**
     * 修改课程设置
     */
    @RequiresPermissions("tec:course:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbtecCourse tbtecCourse = tbtecCourseService.selectTbtecCourseByFId(fId);
        mmap.put("tbtecCourse", tbtecCourse);
        return prefix + "/edit";
    }

    /**
     * 修改保存课程设置
     */
    @RequiresPermissions("tec:course:edit")
    @Log(title = "课程设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbtecCourse tbtecCourse)
    {
        return toAjax(tbtecCourseService.updateTbtecCourse(tbtecCourse));
    }

    /**
     * 删除课程设置
     */
    @RequiresPermissions("tec:course:remove")
    @Log(title = "课程设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbtecCourseService.deleteTbtecCourseByFIds(ids));
    }
}
