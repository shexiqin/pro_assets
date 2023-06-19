package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbstuLeave;
import com.soft863.service.ITbstuLeaveService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生请假信息（学工系统）Controller
 * 
 * @author cuihangbo
 * @date 2023-05-30
 */
@Controller
@RequestMapping("/stu/leave")
public class TbstuLeaveController extends BaseController
{
    private String prefix = "stu/leave";

    @Autowired
    private ITbstuLeaveService tbstuLeaveService;

    @RequiresPermissions("stu:leave:view")
    @GetMapping()
    public String leave()
    {
        return prefix + "/leave";
    }

    /**
     * 查询学生请假信息（学工系统）列表
     */
    @RequiresPermissions("stu:leave:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbstuLeave tbstuLeave)
    {
        startPage();
        List<TbstuLeave> list = tbstuLeaveService.selectTbstuLeaveList(tbstuLeave);
        return getDataTable(list);
    }

    /**
     * 导出学生请假信息（学工系统）列表
     */
    @RequiresPermissions("stu:leave:export")
    @Log(title = "学生请假信息（学工系统）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbstuLeave tbstuLeave)
    {
        List<TbstuLeave> list = tbstuLeaveService.selectTbstuLeaveList(tbstuLeave);
        ExcelUtil<TbstuLeave> util = new ExcelUtil<TbstuLeave>(TbstuLeave.class);
        return util.exportExcel(list, "学生请假信息（学工系统）数据");
    }

    /**
     * 新增学生请假信息（学工系统）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生请假信息（学工系统）
     */
    @RequiresPermissions("stu:leave:add")
    @Log(title = "学生请假信息（学工系统）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbstuLeave tbstuLeave)
    {
        return toAjax(tbstuLeaveService.insertTbstuLeave(tbstuLeave));
    }

    /**
     * 修改学生请假信息（学工系统）
     */
    @RequiresPermissions("stu:leave:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbstuLeave tbstuLeave = tbstuLeaveService.selectTbstuLeaveByFId(fId);
        mmap.put("tbstuLeave", tbstuLeave);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生请假信息（学工系统）
     */
    @RequiresPermissions("stu:leave:edit")
    @Log(title = "学生请假信息（学工系统）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbstuLeave tbstuLeave)
    {
        return toAjax(tbstuLeaveService.updateTbstuLeave(tbstuLeave));
    }

    /**
     * 删除学生请假信息（学工系统）
     */
    @RequiresPermissions("stu:leave:remove")
    @Log(title = "学生请假信息（学工系统）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbstuLeaveService.deleteTbstuLeaveByFIds(ids));
    }
}
