package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbquaAlgorithm;
import com.soft863.service.ITbquaAlgorithmService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 算法规则Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/qua/algorithm")
public class TbquaAlgorithmController extends BaseController
{
    private String prefix = "qua/algorithm";

    @Autowired
    private ITbquaAlgorithmService tbquaAlgorithmService;

    @RequiresPermissions("qua:algorithm:view")
    @GetMapping()
    public String algorithm()
    {
        return prefix + "/algorithm";
    }

    /**
     * 查询算法规则列表
     */
    @RequiresPermissions("qua:algorithm:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbquaAlgorithm tbquaAlgorithm)
    {
        startPage();
        List<TbquaAlgorithm> list = tbquaAlgorithmService.selectTbquaAlgorithmList(tbquaAlgorithm);
        return getDataTable(list);
    }

    /**
     * 导出算法规则列表
     */
    @RequiresPermissions("qua:algorithm:export")
    @Log(title = "算法规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbquaAlgorithm tbquaAlgorithm)
    {
        List<TbquaAlgorithm> list = tbquaAlgorithmService.selectTbquaAlgorithmList(tbquaAlgorithm);
        ExcelUtil<TbquaAlgorithm> util = new ExcelUtil<TbquaAlgorithm>(TbquaAlgorithm.class);
        return util.exportExcel(list, "算法规则数据");
    }

    /**
     * 新增算法规则
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存算法规则
     */
    @RequiresPermissions("qua:algorithm:add")
    @Log(title = "算法规则", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbquaAlgorithm tbquaAlgorithm)
    {
        return toAjax(tbquaAlgorithmService.insertTbquaAlgorithm(tbquaAlgorithm));
    }

    /**
     * 修改算法规则
     */
    @RequiresPermissions("qua:algorithm:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbquaAlgorithm tbquaAlgorithm = tbquaAlgorithmService.selectTbquaAlgorithmByFId(fId);
        mmap.put("tbquaAlgorithm", tbquaAlgorithm);
        return prefix + "/edit";
    }

    /**
     * 修改保存算法规则
     */
    @RequiresPermissions("qua:algorithm:edit")
    @Log(title = "算法规则", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbquaAlgorithm tbquaAlgorithm)
    {
        return toAjax(tbquaAlgorithmService.updateTbquaAlgorithm(tbquaAlgorithm));
    }

    /**
     * 删除算法规则
     */
    @RequiresPermissions("qua:algorithm:remove")
    @Log(title = "算法规则", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbquaAlgorithmService.deleteTbquaAlgorithmByFIds(ids));
    }
}
