package com.soft863.controller;

import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbquaDetail;
import com.soft863.service.ITbquaDetailService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 质检详情Controller
 *
 * @author cuihangbo
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/qua/detail")
public class TbquaDetailController extends BaseController {
    private String prefix = "qua/detail";

    @Autowired
    private ITbquaDetailService tbquaDetailService;

    @RequiresPermissions("qua:detail:view")
    @GetMapping()
    public String detail() {
        return prefix + "/detail";
    }

    /**
     * 查询质检详情列表
     */
    @RequiresPermissions("qua:detail:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbquaDetail tbquaDetail) {
        startPage();
        List<TbquaDetail> list = tbquaDetailService.selectTbquaDetailList(tbquaDetail);
        return getDataTable(list);
    }

    /**
     * 导出质检详情列表
     */
    @RequiresPermissions("qua:detail:export")
    @Log(title = "质检详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbquaDetail tbquaDetail) {
        List<TbquaDetail> list = tbquaDetailService.selectTbquaDetailList(tbquaDetail);
        ExcelUtil<TbquaDetail> util = new ExcelUtil<TbquaDetail>(TbquaDetail.class);
        return util.exportExcel(list, "质检详情数据");
    }

    /**
     * 新增质检详情
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存质检详情
     */
    @RequiresPermissions("qua:detail:add")
    @Log(title = "质检详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbquaDetail tbquaDetail) {
        return toAjax(tbquaDetailService.insertTbquaDetail(tbquaDetail));
    }

    /**
     * 修改质检详情
     */
    @RequiresPermissions("qua:detail:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap) {
        TbquaDetail tbquaDetail = tbquaDetailService.selectTbquaDetailByFId(fId);
        mmap.put("tbquaDetail", tbquaDetail);
        return prefix + "/edit";
    }

    /**
     * 修改保存质检详情
     */
    @RequiresPermissions("qua:detail:edit")
    @Log(title = "质检详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbquaDetail tbquaDetail) {
        return toAjax(tbquaDetailService.updateTbquaDetail(tbquaDetail));
    }

    /**
     * 删除质检详情
     */
    @RequiresPermissions("qua:detail:remove")
    @Log(title = "质检详情", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tbquaDetailService.deleteTbquaDetailByFIds(ids));
    }



}
