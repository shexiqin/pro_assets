package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbsciResults;
import com.soft863.service.ITbsciResultsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 教师科研业绩Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/sci/results")
public class TbsciResultsController extends BaseController
{
    private String prefix = "sci/results";

    @Autowired
    private ITbsciResultsService tbsciResultsService;

    @RequiresPermissions("sci:results:view")
    @GetMapping()
    public String results()
    {
        return prefix + "/results";
    }

    /**
     * 查询教师科研业绩列表
     */
    @RequiresPermissions("sci:results:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbsciResults tbsciResults)
    {
        startPage();
        List<TbsciResults> list = tbsciResultsService.selectTbsciResultsList(tbsciResults);
        return getDataTable(list);
    }

    /**
     * 导出教师科研业绩列表
     */
    @RequiresPermissions("sci:results:export")
    @Log(title = "教师科研业绩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbsciResults tbsciResults)
    {
        List<TbsciResults> list = tbsciResultsService.selectTbsciResultsList(tbsciResults);
        ExcelUtil<TbsciResults> util = new ExcelUtil<TbsciResults>(TbsciResults.class);
        return util.exportExcel(list, "教师科研业绩数据");
    }

    /**
     * 新增教师科研业绩
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教师科研业绩
     */
    @RequiresPermissions("sci:results:add")
    @Log(title = "教师科研业绩", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbsciResults tbsciResults)
    {
        return toAjax(tbsciResultsService.insertTbsciResults(tbsciResults));
    }

    /**
     * 修改教师科研业绩
     */
    @RequiresPermissions("sci:results:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbsciResults tbsciResults = tbsciResultsService.selectTbsciResultsByFId(fId);
        mmap.put("tbsciResults", tbsciResults);
        return prefix + "/edit";
    }

    /**
     * 修改保存教师科研业绩
     */
    @RequiresPermissions("sci:results:edit")
    @Log(title = "教师科研业绩", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbsciResults tbsciResults)
    {
        return toAjax(tbsciResultsService.updateTbsciResults(tbsciResults));
    }

    /**
     * 删除教师科研业绩
     */
    @RequiresPermissions("sci:results:remove")
    @Log(title = "教师科研业绩", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbsciResultsService.deleteTbsciResultsByFIds(ids));
    }
}
