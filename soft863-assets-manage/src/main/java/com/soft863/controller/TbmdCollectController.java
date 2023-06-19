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
import com.soft863.domain.TbmdCollect;
import com.soft863.service.ITbmdCollectService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 资产目录收藏Controller
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
@Controller
@RequestMapping("/md/collect")
public class TbmdCollectController extends BaseController
{
    private String prefix = "md/collect";

    @Autowired
    private ITbmdCollectService tbmdCollectService;

    @RequiresPermissions("md:collect:view")
    @GetMapping()
    public String collect()
    {
        return prefix + "/collect";
    }

    /**
     * 查询资产目录收藏列表
     */
    @RequiresPermissions("md:collect:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbmdCollect tbmdCollect)
    {
        startPage();
        List<TbmdCollect> list = tbmdCollectService.selectTbmdCollectList(tbmdCollect);
        return getDataTable(list);
    }

    /**
     * 导出资产目录收藏列表
     */
    @RequiresPermissions("md:collect:export")
    @Log(title = "资产目录收藏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbmdCollect tbmdCollect)
    {
        List<TbmdCollect> list = tbmdCollectService.selectTbmdCollectList(tbmdCollect);
        ExcelUtil<TbmdCollect> util = new ExcelUtil<TbmdCollect>(TbmdCollect.class);
        return util.exportExcel(list, "资产目录收藏数据");
    }

    /**
     * 新增资产目录收藏
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存资产目录收藏
     */
    @RequiresPermissions("md:collect:add")
    @Log(title = "资产目录收藏", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbmdCollect tbmdCollect)
    {
        return toAjax(tbmdCollectService.insertTbmdCollect(tbmdCollect));
    }

    /**
     * 修改资产目录收藏
     */
    @RequiresPermissions("md:collect:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbmdCollect tbmdCollect = tbmdCollectService.selectTbmdCollectByFId(fId);
        mmap.put("tbmdCollect", tbmdCollect);
        return prefix + "/edit";
    }

    /**
     * 修改保存资产目录收藏
     */
    @RequiresPermissions("md:collect:edit")
    @Log(title = "资产目录收藏", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbmdCollect tbmdCollect)
    {
        return toAjax(tbmdCollectService.updateTbmdCollect(tbmdCollect));
    }

    /**
     * 删除资产目录收藏
     */
    @RequiresPermissions("md:collect:remove")
    @Log(title = "资产目录收藏", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbmdCollectService.deleteTbmdCollectByFIds(ids));
    }
}
