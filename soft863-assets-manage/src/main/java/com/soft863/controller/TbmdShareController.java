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
import com.soft863.domain.TbmdShare;
import com.soft863.service.ITbmdShareService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 资产共享Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/md/share")
public class TbmdShareController extends BaseController
{
    private String prefix = "md/share";

    @Autowired
    private ITbmdShareService tbmdShareService;

    @RequiresPermissions("md:share:view")
    @GetMapping()
    public String share()
    {
        return prefix + "/share";
    }

    /**
     * 查询资产共享列表
     */
    @RequiresPermissions("md:share:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbmdShare tbmdShare)
    {
        startPage();
        List<TbmdShare> list = tbmdShareService.selectTbmdShareList(tbmdShare);
        return getDataTable(list);
    }

    /**
     * 导出资产共享列表
     */
    @RequiresPermissions("md:share:export")
    @Log(title = "资产共享", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbmdShare tbmdShare)
    {
        List<TbmdShare> list = tbmdShareService.selectTbmdShareList(tbmdShare);
        ExcelUtil<TbmdShare> util = new ExcelUtil<TbmdShare>(TbmdShare.class);
        return util.exportExcel(list, "资产共享数据");
    }

    /**
     * 新增资产共享
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存资产共享
     */
    @RequiresPermissions("md:share:add")
    @Log(title = "资产共享", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbmdShare tbmdShare)
    {
        return toAjax(tbmdShareService.insertTbmdShare(tbmdShare));
    }

    /**
     * 修改资产共享
     */
    @RequiresPermissions("md:share:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbmdShare tbmdShare = tbmdShareService.selectTbmdShareById(id);
        mmap.put("tbmdShare", tbmdShare);
        return prefix + "/edit";
    }

    /**
     * 修改保存资产共享
     */
    @RequiresPermissions("md:share:edit")
    @Log(title = "资产共享", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbmdShare tbmdShare)
    {
        return toAjax(tbmdShareService.updateTbmdShare(tbmdShare));
    }

    /**
     * 删除资产共享
     */
    @RequiresPermissions("md:share:remove")
    @Log(title = "资产共享", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbmdShareService.deleteTbmdShareByIds(ids));
    }
}
