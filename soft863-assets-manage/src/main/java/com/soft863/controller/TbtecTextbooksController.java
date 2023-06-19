package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbtecTextbooks;
import com.soft863.service.ITbtecTextbooksService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 教材选用Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/tec/textbooks")
public class TbtecTextbooksController extends BaseController
{
    private String prefix = "tec/textbooks";

    @Autowired
    private ITbtecTextbooksService tbtecTextbooksService;

    @RequiresPermissions("tec:textbooks:view")
    @GetMapping()
    public String textbooks()
    {
        return prefix + "/textbooks";
    }

    /**
     * 查询教材选用列表
     */
    @RequiresPermissions("tec:textbooks:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbtecTextbooks tbtecTextbooks)
    {
        startPage();
        List<TbtecTextbooks> list = tbtecTextbooksService.selectTbtecTextbooksList(tbtecTextbooks);
        return getDataTable(list);
    }

    /**
     * 导出教材选用列表
     */
    @RequiresPermissions("tec:textbooks:export")
    @Log(title = "教材选用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbtecTextbooks tbtecTextbooks)
    {
        List<TbtecTextbooks> list = tbtecTextbooksService.selectTbtecTextbooksList(tbtecTextbooks);
        ExcelUtil<TbtecTextbooks> util = new ExcelUtil<TbtecTextbooks>(TbtecTextbooks.class);
        return util.exportExcel(list, "教材选用数据");
    }

    /**
     * 新增教材选用
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教材选用
     */
    @RequiresPermissions("tec:textbooks:add")
    @Log(title = "教材选用", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbtecTextbooks tbtecTextbooks)
    {
        return toAjax(tbtecTextbooksService.insertTbtecTextbooks(tbtecTextbooks));
    }

    /**
     * 修改教材选用
     */
    @RequiresPermissions("tec:textbooks:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbtecTextbooks tbtecTextbooks = tbtecTextbooksService.selectTbtecTextbooksByFId(fId);
        mmap.put("tbtecTextbooks", tbtecTextbooks);
        return prefix + "/edit";
    }

    /**
     * 修改保存教材选用
     */
    @RequiresPermissions("tec:textbooks:edit")
    @Log(title = "教材选用", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbtecTextbooks tbtecTextbooks)
    {
        return toAjax(tbtecTextbooksService.updateTbtecTextbooks(tbtecTextbooks));
    }

    /**
     * 删除教材选用
     */
    @RequiresPermissions("tec:textbooks:remove")
    @Log(title = "教材选用", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbtecTextbooksService.deleteTbtecTextbooksByFIds(ids));
    }
}
