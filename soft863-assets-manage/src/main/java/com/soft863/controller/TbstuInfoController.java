package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbstuInfo;
import com.soft863.service.ITbstuInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生基本信息Controller
 * 
 * @author ybb
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/stu/info")
public class TbstuInfoController extends BaseController
{
    private String prefix = "stu/info";

    @Autowired
    private ITbstuInfoService tbstuInfoService;

    @RequiresPermissions("stu:info:view")
    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询学生基本信息列表
     */
    @RequiresPermissions("stu:info:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbstuInfo tbstuInfo)
    {
        startPage();
        List<TbstuInfo> list = tbstuInfoService.selectTbstuInfoList(tbstuInfo);
        return getDataTable(list);
    }

    /**
     * 导出学生基本信息列表
     */
    @RequiresPermissions("stu:info:export")
    @Log(title = "学生基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbstuInfo tbstuInfo)
    {
        List<TbstuInfo> list = tbstuInfoService.selectTbstuInfoList(tbstuInfo);
        ExcelUtil<TbstuInfo> util = new ExcelUtil<TbstuInfo>(TbstuInfo.class);
        return util.exportExcel(list, "学生基本信息数据");
    }

    /**
     * 新增学生基本信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生基本信息
     */
    @RequiresPermissions("stu:info:add")
    @Log(title = "学生基本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbstuInfo tbstuInfo)
    {
        return toAjax(tbstuInfoService.insertTbstuInfo(tbstuInfo));
    }

    /**
     * 修改学生基本信息
     */
    @RequiresPermissions("stu:info:edit")
    @RequestMapping (value = "/edit/{fId}",method = {RequestMethod.POST,RequestMethod.GET})
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbstuInfo tbstuInfo = tbstuInfoService.selectTbstuInfoByFId(fId);
        mmap.put("tbstuInfo", tbstuInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生基本信息
     */
    @RequiresPermissions("stu:info:edit")
    @Log(title = "学生基本信息", businessType = BusinessType.UPDATE)
    @RequestMapping(value = "/edit",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public AjaxResult editSave(TbstuInfo tbstuInfo)
    {
        return toAjax(tbstuInfoService.updateTbstuInfo(tbstuInfo));
    }

    /**
     * 删除学生基本信息
     */
    @RequiresPermissions("stu:info:remove")
    @Log(title = "学生基本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbstuInfoService.deleteTbstuInfoByFIds(ids));
    }
}
