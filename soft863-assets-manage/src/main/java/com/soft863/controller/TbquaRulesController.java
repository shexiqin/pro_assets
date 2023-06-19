package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbquaRules;
import com.soft863.service.ITbquaRulesService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 质检规则Controller
 * 
 * @author cuihangbo
 * @date 2023-06-06
 */
@Controller
@RequestMapping("/qua/rules")
public class TbquaRulesController extends BaseController
{
    private String prefix = "qua/rules";

    @Autowired
    private ITbquaRulesService tbquaRulesService;

    @RequiresPermissions("qua:rules:view")
    @GetMapping()
    public String rules()
    {
        return prefix + "/rules";
    }

    /**
     * 查询质检规则列表
     */
    @RequiresPermissions("qua:rules:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbquaRules tbquaRules)
    {
        startPage();
        List<TbquaRules> list = tbquaRulesService.selectTbquaRulesList(tbquaRules);
        return getDataTable(list);
    }

    /**
     * 导出质检规则列表
     */
    @RequiresPermissions("qua:rules:export")
    @Log(title = "质检规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbquaRules tbquaRules)
    {
        List<TbquaRules> list = tbquaRulesService.selectTbquaRulesList(tbquaRules);
        ExcelUtil<TbquaRules> util = new ExcelUtil<TbquaRules>(TbquaRules.class);
        return util.exportExcel(list, "质检规则数据");
    }

    /**
     * 新增质检规则
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存质检规则
     */
    @RequiresPermissions("qua:rules:add")
    @Log(title = "质检规则", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbquaRules tbquaRules)
    {
        return toAjax(tbquaRulesService.insertTbquaRules(tbquaRules));
    }

    /**
     * 修改质检规则
     */
    @RequiresPermissions("qua:rules:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbquaRules tbquaRules = tbquaRulesService.selectTbquaRulesByFId(fId);
        mmap.put("tbquaRules", tbquaRules);
        return prefix + "/edit";
    }

    /**
     * 修改保存质检规则
     */
    @RequiresPermissions("qua:rules:edit")
    @Log(title = "质检规则", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbquaRules tbquaRules)
    {
        return toAjax(tbquaRulesService.updateTbquaRules(tbquaRules));
    }

    /**
     * 删除质检规则
     */
    @RequiresPermissions("qua:rules:remove")
    @Log(title = "质检规则", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbquaRulesService.deleteTbquaRulesByFIds(ids));
    }
}
