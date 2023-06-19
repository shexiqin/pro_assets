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
import com.soft863.domain.TbsynTasklog;
import com.soft863.service.ITbsynTasklogService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 任务日志Controller
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
@Controller
@RequestMapping("/syn/tasklog")
public class TbsynTasklogController extends BaseController
{
    private String prefix = "syn/tasklog";

    @Autowired
    private ITbsynTasklogService tbsynTasklogService;

    @RequiresPermissions("syn:tasklog:view")
    @GetMapping()
    public String tasklog()
    {
        return prefix + "/tasklog";
    }

    /**
     * 查询任务日志列表
     */
    @RequiresPermissions("syn:tasklog:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbsynTasklog tbsynTasklog)
    {
        startPage();
        List<TbsynTasklog> list = tbsynTasklogService.selectTbsynTasklogList(tbsynTasklog);
        return getDataTable(list);
    }

    /**
     * 导出任务日志列表
     */
    @RequiresPermissions("syn:tasklog:export")
    @Log(title = "任务日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbsynTasklog tbsynTasklog)
    {
        List<TbsynTasklog> list = tbsynTasklogService.selectTbsynTasklogList(tbsynTasklog);
        ExcelUtil<TbsynTasklog> util = new ExcelUtil<TbsynTasklog>(TbsynTasklog.class);
        return util.exportExcel(list, "任务日志数据");
    }

    /**
     * 新增任务日志
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存任务日志
     */
    @RequiresPermissions("syn:tasklog:add")
    @Log(title = "任务日志", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbsynTasklog tbsynTasklog)
    {
        return toAjax(tbsynTasklogService.insertTbsynTasklog(tbsynTasklog));
    }

    /**
     * 修改任务日志
     */
    @RequiresPermissions("syn:tasklog:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbsynTasklog tbsynTasklog = tbsynTasklogService.selectTbsynTasklogByFId(fId);
        mmap.put("tbsynTasklog", tbsynTasklog);
        return prefix + "/edit";
    }

    /**
     * 修改保存任务日志
     */
    @RequiresPermissions("syn:tasklog:edit")
    @Log(title = "任务日志", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbsynTasklog tbsynTasklog)
    {
        return toAjax(tbsynTasklogService.updateTbsynTasklog(tbsynTasklog));
    }

    /**
     * 删除任务日志
     */
    @RequiresPermissions("syn:tasklog:remove")
    @Log(title = "任务日志", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbsynTasklogService.deleteTbsynTasklogByFIds(ids));
    }
}
