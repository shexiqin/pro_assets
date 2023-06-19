package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbfinIncome;
import com.soft863.service.ITbfinIncomeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学校经费收入Controller
 * 
 * @author zpc
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/fin/income")
public class TbfinIncomeController extends BaseController
{
    private String prefix = "fin/income";

    @Autowired
    private ITbfinIncomeService tbfinIncomeService;

    @RequiresPermissions("fin:income:view")
    @GetMapping()
    public String income()
    {
        return prefix + "/income";
    }

    /**
     * 查询学校经费收入列表
     */
    @RequiresPermissions("fin:income:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbfinIncome tbfinIncome)
    {
        startPage();
        List<TbfinIncome> list = tbfinIncomeService.selectTbfinIncomeList(tbfinIncome);
        return getDataTable(list);
    }

    /**
     * 导出学校经费收入列表
     */
    @RequiresPermissions("fin:income:export")
    @Log(title = "学校经费收入", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbfinIncome tbfinIncome)
    {
        List<TbfinIncome> list = tbfinIncomeService.selectTbfinIncomeList(tbfinIncome);
        ExcelUtil<TbfinIncome> util = new ExcelUtil<TbfinIncome>(TbfinIncome.class);
        return util.exportExcel(list, "学校经费收入数据");
    }

    /**
     * 新增学校经费收入
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学校经费收入
     */
    @RequiresPermissions("fin:income:add")
    @Log(title = "学校经费收入", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbfinIncome tbfinIncome)
    {
        return toAjax(tbfinIncomeService.insertTbfinIncome(tbfinIncome));
    }

    /**
     * 修改学校经费收入
     */
    @RequiresPermissions("fin:income:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbfinIncome tbfinIncome = tbfinIncomeService.selectTbfinIncomeByFId(fId);
        mmap.put("tbfinIncome", tbfinIncome);
        return prefix + "/edit";
    }

    /**
     * 修改保存学校经费收入
     */
    @RequiresPermissions("fin:income:edit")
    @Log(title = "学校经费收入", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbfinIncome tbfinIncome)
    {
        return toAjax(tbfinIncomeService.updateTbfinIncome(tbfinIncome));
    }

    /**
     * 删除学校经费收入
     */
    @RequiresPermissions("fin:income:remove")
    @Log(title = "学校经费收入", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbfinIncomeService.deleteTbfinIncomeByFIds(ids));
    }
}
