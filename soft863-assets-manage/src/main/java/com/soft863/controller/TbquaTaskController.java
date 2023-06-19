package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbquaTask;
import com.soft863.service.ITbquaTaskService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 质检任务Controller
 * 
 * @author cuihangbo
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/qua/task")
public class TbquaTaskController extends BaseController
{
    private String prefix = "qua/task";

    @Autowired
    private ITbquaTaskService tbquaTaskService;

    @RequiresPermissions("qua:task:view")
    @GetMapping()
    public String task()
    {
        return prefix + "/task";
    }

    /**
     * 查询质检任务列表
     */
    @RequiresPermissions("qua:task:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbquaTask tbquaTask)
    {
        startPage();
        List<TbquaTask> list = tbquaTaskService.selectTbquaTaskList(tbquaTask);
        return getDataTable(list);
    }

    /**
     * 导出质检任务列表
     */
    @RequiresPermissions("qua:task:export")
    @Log(title = "质检任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbquaTask tbquaTask)
    {
        List<TbquaTask> list = tbquaTaskService.selectTbquaTaskList(tbquaTask);
        ExcelUtil<TbquaTask> util = new ExcelUtil<TbquaTask>(TbquaTask.class);
        return util.exportExcel(list, "质检任务数据");
    }

    /**
     * 新增质检任务
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存质检任务
     */
    @RequiresPermissions("qua:task:add")
    @Log(title = "质检任务", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbquaTask tbquaTask)
    {
        return toAjax(tbquaTaskService.insertTbquaTask(tbquaTask));
    }

    /**
     * 修改质检任务
     */
    @RequiresPermissions("qua:task:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbquaTask tbquaTask = tbquaTaskService.selectTbquaTaskByFId(fId);
        mmap.put("tbquaTask", tbquaTask);
        return prefix + "/edit";
    }

    /**
     * 修改保存质检任务
     */
    @RequiresPermissions("qua:task:edit")
    @Log(title = "质检任务", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbquaTask tbquaTask)
    {
        return toAjax(tbquaTaskService.updateTbquaTask(tbquaTask));
    }

    /**
     * 删除质检任务
     */
    @RequiresPermissions("qua:task:remove")
    @Log(title = "质检任务", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbquaTaskService.deleteTbquaTaskByFIds(ids));
    }
}
