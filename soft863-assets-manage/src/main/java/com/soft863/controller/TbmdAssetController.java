package com.soft863.controller;

import java.util.ArrayList;
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
import com.soft863.domain.TbmdAsset;
import com.soft863.service.ITbmdAssetService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 数据资产Controller
 * 
 * @author wc
 * @date 2023-05-30
 */
@Controller
@RequestMapping("/md/asset")
public class TbmdAssetController extends BaseController
{
    private String prefix = "md/asset";

    @Autowired
    private ITbmdAssetService tbmdAssetService;

    @RequiresPermissions("md:asset:view")
    @GetMapping()
    public String asset(ModelMap map){
        Integer total = tbmdAssetService.selTotal();
        Integer publish = tbmdAssetService.selPublish();
        int[] list1 = tbmdAssetService.selNum1();

        int[] share = tbmdAssetService.selShare();

        map.put("common",list1[0]);
        map.put("important",list1[1]);
        map.put("secret",list1[2]);
        map.put("total",total);
        map.put("publish",publish);

        map.put("share",share);
        return prefix + "/asset";
    }

    @RequestMapping("/data")
    public String getData(ModelMap map){
        Integer total = tbmdAssetService.selTotal();
        Integer publish = tbmdAssetService.selPublish();
        int[] list1 = tbmdAssetService.selNum1();

        int[] share = tbmdAssetService.selShare();

        map.put("common",list1[0]);
        map.put("important",list1[1]);
        map.put("secret",list1[2]);
        map.put("total",total);
        map.put("publish",publish);

        map.put("share",share);
        return prefix +"/data";
    }

    /**
     * 查询数据资产列表
     */
    @RequiresPermissions("md:asset:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbmdAsset tbmdAsset)
    {
        startPage();
        List<TbmdAsset> list = tbmdAssetService.selectTbmdAssetList(tbmdAsset);
        return getDataTable(list);
    }

    /**
     * 导出数据资产列表
     */
    @RequiresPermissions("md:asset:export")
    @Log(title = "数据资产", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbmdAsset tbmdAsset)
    {
        List<TbmdAsset> list = tbmdAssetService.selectTbmdAssetList(tbmdAsset);
        ExcelUtil<TbmdAsset> util = new ExcelUtil<TbmdAsset>(TbmdAsset.class);
        return util.exportExcel(list, "数据资产数据");
    }

    /**
     * 新增数据资产
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存数据资产
     */
    @RequiresPermissions("md:asset:add")
    @Log(title = "数据资产", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbmdAsset tbmdAsset)
    {
        return toAjax(tbmdAssetService.insertTbmdAsset(tbmdAsset));
    }

    /**
     * 修改数据资产
     */
    @RequiresPermissions("md:asset:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbmdAsset tbmdAsset = tbmdAssetService.selectTbmdAssetByFId(fId);
        mmap.put("tbmdAsset", tbmdAsset);
        return prefix + "/edit";
    }

    /**
     * 修改保存数据资产
     */
    @RequiresPermissions("md:asset:edit")
    @Log(title = "数据资产", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbmdAsset tbmdAsset)
    {
        return toAjax(tbmdAssetService.updateTbmdAsset(tbmdAsset));
    }

    /**
     * 删除数据资产
     */
    @RequiresPermissions("md:asset:remove")
    @Log(title = "数据资产", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbmdAssetService.deleteTbmdAssetByFIds(ids));
    }
}
