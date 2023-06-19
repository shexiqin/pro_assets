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
import com.soft863.domain.TbtecLesson;
import com.soft863.service.ITbtecLessonService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 教师授课Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/tec/lesson")
public class TbtecLessonController extends BaseController
{
    private String prefix = "tec/lesson";

    @Autowired
    private ITbtecLessonService tbtecLessonService;

    @RequiresPermissions("tec:lesson:view")
    @GetMapping()
    public String lesson()
    {
        return prefix + "/lesson";
    }

    /**
     * 查询教师授课列表
     */
    @RequiresPermissions("tec:lesson:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbtecLesson tbtecLesson)
    {
        startPage();
        List<TbtecLesson> list = tbtecLessonService.selectTbtecLessonList(tbtecLesson);
        return getDataTable(list);
    }

    /**
     * 导出教师授课列表
     */
    @RequiresPermissions("tec:lesson:export")
    @Log(title = "教师授课", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbtecLesson tbtecLesson)
    {
        List<TbtecLesson> list = tbtecLessonService.selectTbtecLessonList(tbtecLesson);
        ExcelUtil<TbtecLesson> util = new ExcelUtil<TbtecLesson>(TbtecLesson.class);
        return util.exportExcel(list, "教师授课数据");
    }

    /**
     * 新增教师授课
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教师授课
     */
    @RequiresPermissions("tec:lesson:add")
    @Log(title = "教师授课", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbtecLesson tbtecLesson)
    {
        return toAjax(tbtecLessonService.insertTbtecLesson(tbtecLesson));
    }

    /**
     * 修改教师授课
     */
    @RequiresPermissions("tec:lesson:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbtecLesson tbtecLesson = tbtecLessonService.selectTbtecLessonByFId(fId);
        mmap.put("tbtecLesson", tbtecLesson);
        return prefix + "/edit";
    }

    /**
     * 修改保存教师授课
     */
    @RequiresPermissions("tec:lesson:edit")
    @Log(title = "教师授课", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbtecLesson tbtecLesson)
    {
        return toAjax(tbtecLessonService.updateTbtecLesson(tbtecLesson));
    }

    /**
     * 删除教师授课
     */
    @RequiresPermissions("tec:lesson:remove")
    @Log(title = "教师授课", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbtecLessonService.deleteTbtecLessonByFIds(ids));
    }
}
