package com.soft863.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.soft863.common.annotation.Log;
import com.soft863.common.enums.BusinessType;
import com.soft863.domain.TbsynTask;
import com.soft863.service.ITbsynTaskService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 定时任务Controller
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
@Controller
@RequestMapping("/syn/task")
public class TbsynTaskController extends BaseController
{
    private String prefix = "syn/task";

    @Autowired
    private ITbsynTaskService tbsynTaskService;

    @RequiresPermissions("syn:task:view")
    @GetMapping()
    public String task()
    {
        return prefix + "/task";
    }

    /**
     * 查询定时任务列表
     */
    @RequiresPermissions("syn:task:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbsynTask tbsynTask)
    {
        startPage();
        List<TbsynTask> list = tbsynTaskService.selectTbsynTaskList(tbsynTask);
        return getDataTable(list);
    }

    /**
     * 导出定时任务列表
     */
    @RequiresPermissions("syn:task:export")
    @Log(title = "定时任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbsynTask tbsynTask)
    {
        List<TbsynTask> list = tbsynTaskService.selectTbsynTaskList(tbsynTask);
        ExcelUtil<TbsynTask> util = new ExcelUtil<TbsynTask>(TbsynTask.class);
        return util.exportExcel(list, "定时任务数据");
    }

    /**
     * 新增定时任务
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存定时任务
     */
    @RequiresPermissions("syn:task:add")
    @Log(title = "定时任务", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbsynTask tbsynTask)
    {
        return toAjax(tbsynTaskService.insertTbsynTask(tbsynTask));
    }

    /**
     * 修改定时任务
     */
    @RequiresPermissions("syn:task:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbsynTask tbsynTask = tbsynTaskService.selectTbsynTaskByFId(fId);
        mmap.put("tbsynTask", tbsynTask);
        return prefix + "/edit";
    }

    /**
     * 修改保存定时任务
     */
    @RequiresPermissions("syn:task:edit")
    @Log(title = "定时任务", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbsynTask tbsynTask)
    {
        return toAjax(tbsynTaskService.updateTbsynTask(tbsynTask));
    }

    /**
     * 删除定时任务
     */
    @RequiresPermissions("syn:task:remove")
    @Log(title = "定时任务", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbsynTaskService.deleteTbsynTaskByFIds(ids));
    }
}
