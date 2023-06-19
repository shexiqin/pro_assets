package com.soft863.controller;

import java.util.List;

import com.soft863.service.ITbtecStudentService;
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
import com.soft863.domain.TbtecStudent;
import com.soft863.service.ITbtecStudentService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 学生信息Controller
 * 
 * @author 863
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/tec/student")
public class TbtecStudentController extends BaseController
{
    private String prefix = "tec/student";

    @Autowired
    private ITbtecStudentService tbtecStudentService;

    @RequiresPermissions("tec:student:view")
    @GetMapping()
    public String student()
    {
        return prefix + "/student";
    }

    /**
     * 查询学生信息列表
     */
    @RequiresPermissions("tec:student:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbtecStudent tbtecStudent)
    {
        startPage();
        List<TbtecStudent> list = tbtecStudentService.selectTbtecStudentList(tbtecStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生信息列表
     */
    @RequiresPermissions("tec:student:export")
    @Log(title = "学生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbtecStudent tbtecStudent)
    {
        List<TbtecStudent> list = tbtecStudentService.selectTbtecStudentList(tbtecStudent);
        ExcelUtil<TbtecStudent> util = new ExcelUtil<TbtecStudent>(TbtecStudent.class);
        return util.exportExcel(list, "学生信息数据");
    }

    /**
     * 新增学生信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生信息
     */
    @RequiresPermissions("tec:student:add")
    @Log(title = "学生信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbtecStudent tbtecStudent)
    {
        return toAjax(tbtecStudentService.insertTbtecStudent(tbtecStudent));
    }

    /**
     * 修改学生信息
     */
    @RequiresPermissions("tec:student:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbtecStudent tbtecStudent = tbtecStudentService.selectTbtecStudentByFId(fId);
        mmap.put("tbtecStudent", tbtecStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生信息
     */
    @RequiresPermissions("tec:student:edit")
    @Log(title = "学生信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbtecStudent tbtecStudent)
    {
        return toAjax(tbtecStudentService.updateTbtecStudent(tbtecStudent));
    }

    /**
     * 删除学生信息
     */
    @RequiresPermissions("tec:student:remove")
    @Log(title = "学生信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbtecStudentService.deleteTbtecStudentByFIds(ids));
    }
}
