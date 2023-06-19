package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbfinExpend;
import com.soft863.service.ITbfinExpendService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学校经费支出Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/fin/expend")
public class  TbfinExpendController extends BaseController
{
    private String prefix = "fin/expend";

    @Autowired
    private ITbfinExpendService tbfinExpendService;

    @RequiresPermissions("fin:expend:view")
    @GetMapping()
    public String expend()
    {
        return prefix + "/expend";
    }

    /**
     * 查询学校经费支出列表
     */
    @RequiresPermissions("fin:expend:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbfinExpend tbfinExpend)
    {
        startPage();
        List<TbfinExpend> list = tbfinExpendService.selectTbfinExpendList(tbfinExpend);
        return getDataTable(list);
    }

    /**
     * 导出学校经费支出列表
     */
    @RequiresPermissions("fin:expend:export")
    @Log(title = "学校经费支出", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbfinExpend tbfinExpend)
    {
        List<TbfinExpend> list = tbfinExpendService.selectTbfinExpendList(tbfinExpend);
        ExcelUtil<TbfinExpend> util = new ExcelUtil<TbfinExpend>(TbfinExpend.class);
        return util.exportExcel(list, "学校经费支出数据");
    }

    /**
     * 新增学校经费支出
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学校经费支出
     */
    @RequiresPermissions("fin:expend:add")
    @Log(title = "学校经费支出", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbfinExpend tbfinExpend)
    {
        return toAjax(tbfinExpendService.insertTbfinExpend(tbfinExpend));
    }

    /**
     * 修改学校经费支出
     */
    @RequiresPermissions("fin:expend:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbfinExpend tbfinExpend = tbfinExpendService.selectTbfinExpendByFId(fId);
        mmap.put("tbfinExpend", tbfinExpend);
        return prefix + "/edit";
    }

    /**
     * 修改保存学校经费支出
     */
    @RequiresPermissions("fin:expend:edit")
    @Log(title = "学校经费支出", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbfinExpend tbfinExpend)
    {
        return toAjax(tbfinExpendService.updateTbfinExpend(tbfinExpend));
    }

    /**
     * 删除学校经费支出
     */
    @RequiresPermissions("fin:expend:remove")
    @Log(title = "学校经费支出", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbfinExpendService.deleteTbfinExpendByFIds(ids));
    }
}
