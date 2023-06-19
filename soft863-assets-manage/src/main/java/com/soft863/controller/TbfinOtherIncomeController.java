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
import com.soft863.domain.TbfinOtherIncome;
import com.soft863.service.ITbfinOtherIncomeService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 学校其他收入情况（财务系统）Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/fin/otherIncome")
public class TbfinOtherIncomeController extends BaseController
{
    private String prefix = "fin/otherIncome";

    @Autowired
    private ITbfinOtherIncomeService tbfinOtherIncomeService;

    @RequiresPermissions("fin:otherIncome:view")
    @GetMapping()
    public String otherIncome()
    {
        return prefix + "/otherIncome";
    }

    /**
     * 查询学校其他收入情况（财务系统）列表
     */
    @RequiresPermissions("fin:otherIncome:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbfinOtherIncome tbfinOtherIncome)
    {
        startPage();
        List<TbfinOtherIncome> list = tbfinOtherIncomeService.selectTbfinOtherIncomeList(tbfinOtherIncome);
        return getDataTable(list);
    }

    /**
     * 导出学校其他收入情况（财务系统）列表
     */
    @RequiresPermissions("fin:otherIncome:export")
    @Log(title = "学校其他收入情况（财务系统）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbfinOtherIncome tbfinOtherIncome)
    {
        List<TbfinOtherIncome> list = tbfinOtherIncomeService.selectTbfinOtherIncomeList(tbfinOtherIncome);
        ExcelUtil<TbfinOtherIncome> util = new ExcelUtil<TbfinOtherIncome>(TbfinOtherIncome.class);
        return util.exportExcel(list, "学校其他收入情况（财务系统）数据");
    }

    /**
     * 新增学校其他收入情况（财务系统）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学校其他收入情况（财务系统）
     */
    @RequiresPermissions("fin:otherIncome:add")
    @Log(title = "学校其他收入情况（财务系统）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbfinOtherIncome tbfinOtherIncome)
    {
        return toAjax(tbfinOtherIncomeService.insertTbfinOtherIncome(tbfinOtherIncome));
    }

    /**
     * 修改学校其他收入情况（财务系统）
     */
    @RequiresPermissions("fin:otherIncome:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbfinOtherIncome tbfinOtherIncome = tbfinOtherIncomeService.selectTbfinOtherIncomeByFId(fId);
        mmap.put("tbfinOtherIncome", tbfinOtherIncome);
        return prefix + "/edit";
    }

    /**
     * 修改保存学校其他收入情况（财务系统）
     */
    @RequiresPermissions("fin:otherIncome:edit")
    @Log(title = "学校其他收入情况（财务系统）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbfinOtherIncome tbfinOtherIncome)
    {
        return toAjax(tbfinOtherIncomeService.updateTbfinOtherIncome(tbfinOtherIncome));
    }

    /**
     * 删除学校其他收入情况（财务系统）
     */
    @RequiresPermissions("fin:otherIncome:remove")
    @Log(title = "学校其他收入情况（财务系统）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbfinOtherIncomeService.deleteTbfinOtherIncomeByFIds(ids));
    }
}
