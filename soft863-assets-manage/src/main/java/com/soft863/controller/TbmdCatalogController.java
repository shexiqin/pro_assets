package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbmdCatalog;
import com.soft863.service.ITbmdCatalogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 资产目录Controller
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
@Controller
@RequestMapping("/md/catalog")
public class TbmdCatalogController extends BaseController
{
    private String prefix = "md/catalog";

    @Autowired
    private ITbmdCatalogService tbmdCatalogService;

    @RequiresPermissions("md:catalog:view")
    @GetMapping()
    public String catalog()
    {
        return prefix + "/catalog";
    }

    /**
     * 查询资产目录列表
     */
    @RequiresPermissions("md:catalog:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbmdCatalog tbmdCatalog)
    {
        startPage();
        List<TbmdCatalog> list = tbmdCatalogService.selectTbmdCatalogList(tbmdCatalog);
        return getDataTable(list);
    }

    /**
     * 导出资产目录列表
     */
    @RequiresPermissions("md:catalog:export")
    @Log(title = "资产目录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbmdCatalog tbmdCatalog)
    {
        List<TbmdCatalog> list = tbmdCatalogService.selectTbmdCatalogList(tbmdCatalog);
        ExcelUtil<TbmdCatalog> util = new ExcelUtil<TbmdCatalog>(TbmdCatalog.class);
        return util.exportExcel(list, "资产目录数据");
    }

    /**
     * 新增资产目录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存资产目录
     */
    @RequiresPermissions("md:catalog:add")
    @Log(title = "资产目录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbmdCatalog tbmdCatalog)
    {
        return toAjax(tbmdCatalogService.insertTbmdCatalog(tbmdCatalog));
    }

    /**
     * 修改资产目录
     */
    @RequiresPermissions("md:catalog:edit")
    @GetMapping("/edit/{fDirectId}")
    public String edit(@PathVariable("fDirectId") Long fDirectId, ModelMap mmap)
    {
        TbmdCatalog tbmdCatalog = tbmdCatalogService.selectTbmdCatalogByFDirectId(fDirectId);
        mmap.put("tbmdCatalog", tbmdCatalog);
        return prefix + "/edit";
    }

    /**
     * 修改保存资产目录
     */
    @RequiresPermissions("md:catalog:edit")
    @Log(title = "资产目录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbmdCatalog tbmdCatalog)
    {
        return toAjax(tbmdCatalogService.updateTbmdCatalog(tbmdCatalog));
    }

    /**
     * 删除资产目录
     */
    @RequiresPermissions("md:catalog:remove")
    @Log(title = "资产目录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbmdCatalogService.deleteTbmdCatalogByFDirectIds(ids));
    }
}
