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
import com.soft863.domain.TbstuAwardinfo;
import com.soft863.service.ITbstuAwardinfoService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 学生获奖信息Controller
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/stu/awardinfo")
public class TbstuAwardinfoController extends BaseController
{
    private String prefix = "stu/awardinfo";

    @Autowired
    private ITbstuAwardinfoService tbstuAwardinfoService;

    @RequiresPermissions("stu:awardinfo:view")
    @GetMapping()
    public String awardinfo()
    {
        return prefix + "/awardinfo";
    }

    /**
     * 查询学生获奖信息列表
     */
    @RequiresPermissions("stu:awardinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbstuAwardinfo tbstuAwardinfo)
    {
        startPage();
        List<TbstuAwardinfo> list = tbstuAwardinfoService.selectTbstuAwardinfoList(tbstuAwardinfo);
        return getDataTable(list);
    }

    /**
     * 导出学生获奖信息列表
     */
    @RequiresPermissions("stu:awardinfo:export")
    @Log(title = "学生获奖信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbstuAwardinfo tbstuAwardinfo)
    {
        List<TbstuAwardinfo> list = tbstuAwardinfoService.selectTbstuAwardinfoList(tbstuAwardinfo);
        ExcelUtil<TbstuAwardinfo> util = new ExcelUtil<TbstuAwardinfo>(TbstuAwardinfo.class);
        return util.exportExcel(list, "学生获奖信息数据");
    }

    /**
     * 新增学生获奖信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生获奖信息
     */
    @RequiresPermissions("stu:awardinfo:add")
    @Log(title = "学生获奖信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbstuAwardinfo tbstuAwardinfo)
    {
        return toAjax(tbstuAwardinfoService.insertTbstuAwardinfo(tbstuAwardinfo));
    }

    /**
     * 修改学生获奖信息
     */
    @RequiresPermissions("stu:awardinfo:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbstuAwardinfo tbstuAwardinfo = tbstuAwardinfoService.selectTbstuAwardinfoByFId(fId);
        mmap.put("tbstuAwardinfo", tbstuAwardinfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生获奖信息
     */
    @RequiresPermissions("stu:awardinfo:edit")
    @Log(title = "学生获奖信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbstuAwardinfo tbstuAwardinfo)
    {
        return toAjax(tbstuAwardinfoService.updateTbstuAwardinfo(tbstuAwardinfo));
    }

    /**
     * 删除学生获奖信息
     */
    @RequiresPermissions("stu:awardinfo:remove")
    @Log(title = "学生获奖信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbstuAwardinfoService.deleteTbstuAwardinfoByFIds(ids));
    }
}
