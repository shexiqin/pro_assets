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
import com.soft863.domain.TbstuCertificate;
import com.soft863.service.ITbstuCertificateService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 职业技能等级证书获取（学工系统）Controller
 * 
 * @author 863
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/stu/certificate")
public class TbstuCertificateController extends BaseController
{
    private String prefix = "stu/certificate";

    @Autowired
    private ITbstuCertificateService tbstuCertificateService;

    @RequiresPermissions("stu:certificate:view")
    @GetMapping()
    public String certificate()
    {
        return prefix + "/certificate";
    }

    /**
     * 查询职业技能等级证书获取（学工系统）列表
     */
    @RequiresPermissions("stu:certificate:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbstuCertificate tbstuCertificate)
    {
        startPage();
        List<TbstuCertificate> list = tbstuCertificateService.selectTbstuCertificateList(tbstuCertificate);
        return getDataTable(list);
    }

    /**
     * 导出职业技能等级证书获取（学工系统）列表
     */
    @RequiresPermissions("stu:certificate:export")
    @Log(title = "职业技能等级证书获取（学工系统）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbstuCertificate tbstuCertificate)
    {
        List<TbstuCertificate> list = tbstuCertificateService.selectTbstuCertificateList(tbstuCertificate);
        ExcelUtil<TbstuCertificate> util = new ExcelUtil<TbstuCertificate>(TbstuCertificate.class);
        return util.exportExcel(list, "职业技能等级证书获取（学工系统）数据");
    }

    /**
     * 新增职业技能等级证书获取（学工系统）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存职业技能等级证书获取（学工系统）
     */
    @RequiresPermissions("stu:certificate:add")
    @Log(title = "职业技能等级证书获取（学工系统）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbstuCertificate tbstuCertificate)
    {
        return toAjax(tbstuCertificateService.insertTbstuCertificate(tbstuCertificate));
    }

    /**
     * 修改职业技能等级证书获取（学工系统）
     */
    @RequiresPermissions("stu:certificate:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbstuCertificate tbstuCertificate = tbstuCertificateService.selectTbstuCertificateByFId(fId);
        mmap.put("tbstuCertificate", tbstuCertificate);
        return prefix + "/edit";
    }

    /**
     * 修改保存职业技能等级证书获取（学工系统）
     */
    @RequiresPermissions("stu:certificate:edit")
    @Log(title = "职业技能等级证书获取（学工系统）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbstuCertificate tbstuCertificate)
    {
        return toAjax(tbstuCertificateService.updateTbstuCertificate(tbstuCertificate));
    }

    /**
     * 删除职业技能等级证书获取（学工系统）
     */
    @RequiresPermissions("stu:certificate:remove")
    @Log(title = "职业技能等级证书获取（学工系统）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbstuCertificateService.deleteTbstuCertificateByFIds(ids));
    }
}
