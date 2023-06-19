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
import com.soft863.domain.TbstuAward;
import com.soft863.service.ITbstuAwardService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 获奖学生(学工系统)Controller
 * 
 * @author 863
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/stu/award")
public class TbstuAwardController extends BaseController
{
    private String prefix = "stu/award";

    @Autowired
    private ITbstuAwardService tbstuAwardService;

    @RequiresPermissions("stu:award:view")
    @GetMapping()
    public String award()
    {
        return prefix + "/award";
    }

    /**
     * 查询获奖学生(学工系统)列表
     */
    @RequiresPermissions("stu:award:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbstuAward tbstuAward)
    {
        startPage();
        List<TbstuAward> list = tbstuAwardService.selectTbstuAwardList(tbstuAward);
        return getDataTable(list);
    }

    /**
     * 导出获奖学生(学工系统)列表
     */
    @RequiresPermissions("stu:award:export")
    @Log(title = "获奖学生(学工系统)", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbstuAward tbstuAward)
    {
        List<TbstuAward> list = tbstuAwardService.selectTbstuAwardList(tbstuAward);
        ExcelUtil<TbstuAward> util = new ExcelUtil<TbstuAward>(TbstuAward.class);
        return util.exportExcel(list, "获奖学生(学工系统)数据");
    }

    /**
     * 新增获奖学生(学工系统)
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存获奖学生(学工系统)
     */
    @RequiresPermissions("stu:award:add")
    @Log(title = "获奖学生(学工系统)", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbstuAward tbstuAward)
    {
        return toAjax(tbstuAwardService.insertTbstuAward(tbstuAward));
    }

    /**
     * 修改获奖学生(学工系统)
     */
    @RequiresPermissions("stu:award:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbstuAward tbstuAward = tbstuAwardService.selectTbstuAwardByFId(fId);
        mmap.put("tbstuAward", tbstuAward);
        return prefix + "/edit";
    }

    /**
     * 修改保存获奖学生(学工系统)
     */
    @RequiresPermissions("stu:award:edit")
    @Log(title = "获奖学生(学工系统)", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbstuAward tbstuAward)
    {
        return toAjax(tbstuAwardService.updateTbstuAward(tbstuAward));
    }

    /**
     * 删除获奖学生(学工系统)
     */
    @RequiresPermissions("stu:award:remove")
    @Log(title = "获奖学生(学工系统)", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbstuAwardService.deleteTbstuAwardByFIds(ids));
    }
}
