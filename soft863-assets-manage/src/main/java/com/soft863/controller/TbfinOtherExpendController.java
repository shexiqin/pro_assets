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
import com.soft863.domain.TbfinOtherExpend;
import com.soft863.service.ITbfinOtherExpendService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 学校其他支出情况Controller
 * 
 * @author gcx
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/fin/otherExpend")
public class TbfinOtherExpendController extends BaseController
{
    private String prefix = "fin/otherExpend";

    @Autowired
    private ITbfinOtherExpendService tbfinOtherExpendService;

    @RequiresPermissions("fin:otherExpend:view")
    @GetMapping()
    public String otherExpend()
    {
        return prefix + "/otherExpend";
    }

    /**
     * 查询学校其他支出情况列表
     */
    @RequiresPermissions("fin:otherExpend:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbfinOtherExpend tbfinOtherExpend)
    {
        startPage();
        List<TbfinOtherExpend> list = tbfinOtherExpendService.selectTbfinOtherExpendList(tbfinOtherExpend);
        return getDataTable(list);
    }

    /**
     * 导出学校其他支出情况列表
     */
    @RequiresPermissions("fin:otherExpend:export")
    @Log(title = "学校其他支出情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbfinOtherExpend tbfinOtherExpend)
    {
        List<TbfinOtherExpend> list = tbfinOtherExpendService.selectTbfinOtherExpendList(tbfinOtherExpend);
        ExcelUtil<TbfinOtherExpend> util = new ExcelUtil<TbfinOtherExpend>(TbfinOtherExpend.class);
        return util.exportExcel(list, "学校其他支出情况数据");
    }

    /**
     * 新增学校其他支出情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学校其他支出情况
     */
    @RequiresPermissions("fin:otherExpend:add")
    @Log(title = "学校其他支出情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbfinOtherExpend tbfinOtherExpend)
    {
        return toAjax(tbfinOtherExpendService.insertTbfinOtherExpend(tbfinOtherExpend));
    }

    /**
     * 修改学校其他支出情况
     */
    @RequiresPermissions("fin:otherExpend:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Integer fId, ModelMap mmap)
    {
        TbfinOtherExpend tbfinOtherExpend = tbfinOtherExpendService.selectTbfinOtherExpendByFId(fId);
        mmap.put("tbfinOtherExpend", tbfinOtherExpend);
        return prefix + "/edit";
    }

    /**
     * 修改保存学校其他支出情况
     */
    @RequiresPermissions("fin:otherExpend:edit")
    @Log(title = "学校其他支出情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbfinOtherExpend tbfinOtherExpend)
    {
        return toAjax(tbfinOtherExpendService.updateTbfinOtherExpend(tbfinOtherExpend));
    }

    /**
     * 删除学校其他支出情况
     */
    @RequiresPermissions("fin:otherExpend:remove")
    @Log(title = "学校其他支出情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbfinOtherExpendService.deleteTbfinOtherExpendByFIds(ids));
    }
}
