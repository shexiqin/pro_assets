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
import com.soft863.domain.TbstuClockin;
import com.soft863.service.ITbstuClockinService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 学生打卡Controller
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
@Controller
@RequestMapping("/stu/clockin")
public class TbstuClockinController extends BaseController
{
    private String prefix = "stu/clockin";

    @Autowired
    private ITbstuClockinService tbstuClockinService;

    @RequiresPermissions("stu:clockin:view")
    @GetMapping()
    public String clockin()
    {
        return prefix + "/clockin";
    }

    /**
     * 查询学生打卡列表
     */
    @RequiresPermissions("stu:clockin:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbstuClockin tbstuClockin)
    {
        startPage();
        List<TbstuClockin> list = tbstuClockinService.selectTbstuClockinList(tbstuClockin);
        return getDataTable(list);
    }

    /**
     * 导出学生打卡列表
     */
    @RequiresPermissions("stu:clockin:export")
    @Log(title = "学生打卡", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbstuClockin tbstuClockin)
    {
        List<TbstuClockin> list = tbstuClockinService.selectTbstuClockinList(tbstuClockin);
        ExcelUtil<TbstuClockin> util = new ExcelUtil<TbstuClockin>(TbstuClockin.class);
        return util.exportExcel(list, "学生打卡数据");
    }

    /**
     * 新增学生打卡
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生打卡
     */
    @RequiresPermissions("stu:clockin:add")
    @Log(title = "学生打卡", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbstuClockin tbstuClockin)
    {
        return toAjax(tbstuClockinService.insertTbstuClockin(tbstuClockin));
    }

    /**
     * 修改学生打卡
     */
    @RequiresPermissions("stu:clockin:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbstuClockin tbstuClockin = tbstuClockinService.selectTbstuClockinByFId(fId);
        mmap.put("tbstuClockin", tbstuClockin);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生打卡
     */
    @RequiresPermissions("stu:clockin:edit")
    @Log(title = "学生打卡", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbstuClockin tbstuClockin)
    {
        return toAjax(tbstuClockinService.updateTbstuClockin(tbstuClockin));
    }

    /**
     * 删除学生打卡
     */
    @RequiresPermissions("stu:clockin:remove")
    @Log(title = "学生打卡", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbstuClockinService.deleteTbstuClockinByFIds(ids));
    }
}
