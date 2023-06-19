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
import com.soft863.domain.TbperStaff;
import com.soft863.service.ITbperStaffService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 人事数据Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/per/staff")
public class TbperStaffController extends BaseController
{
    private String prefix = "per/staff";

    @Autowired
    private ITbperStaffService tbperStaffService;

    @RequiresPermissions("per:staff:view")
    @GetMapping()
    public String staff()
    {
        return prefix + "/staff";
    }

    /**
     * 查询人事数据列表
     */
    @RequiresPermissions("per:staff:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbperStaff tbperStaff)
    {
        startPage();
        List<TbperStaff> list = tbperStaffService.selectTbperStaffList(tbperStaff);
        return getDataTable(list);
    }

    /**
     * 导出人事数据列表
     */
    @RequiresPermissions("per:staff:export")
    @Log(title = "人事数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbperStaff tbperStaff)
    {
        List<TbperStaff> list = tbperStaffService.selectTbperStaffList(tbperStaff);
        ExcelUtil<TbperStaff> util = new ExcelUtil<TbperStaff>(TbperStaff.class);
        return util.exportExcel(list, "人事数据数据");
    }

    /**
     * 新增人事数据
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存人事数据
     */
    @RequiresPermissions("per:staff:add")
    @Log(title = "人事数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbperStaff tbperStaff)
    {
        return toAjax(tbperStaffService.insertTbperStaff(tbperStaff));
    }

    /**
     * 修改人事数据
     */
    @RequiresPermissions("per:staff:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbperStaff tbperStaff = tbperStaffService.selectTbperStaffByFId(fId);
        mmap.put("tbperStaff", tbperStaff);
        return prefix + "/edit";
    }

    /**
     * 修改保存人事数据
     */
    @RequiresPermissions("per:staff:edit")
    @Log(title = "人事数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbperStaff tbperStaff)
    {
        return toAjax(tbperStaffService.updateTbperStaff(tbperStaff));
    }

    /**
     * 删除人事数据
     */
    @RequiresPermissions("per:staff:remove")
    @Log(title = "人事数据", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbperStaffService.deleteTbperStaffByFIds(ids));
    }
}
