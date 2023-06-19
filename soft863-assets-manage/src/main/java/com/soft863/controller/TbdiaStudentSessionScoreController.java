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
import com.soft863.domain.TbdiaStudentSessionScore;
import com.soft863.service.ITbdiaStudentSessionScoreService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 学生成绩Controller
 * 
 * @author ruoyi
 * @date 2023-06-07
 */
@Controller
@RequestMapping("/tec/sc")
public class TbdiaStudentSessionScoreController extends BaseController
{
    private String prefix = "tec/sc";

    @Autowired
    private ITbdiaStudentSessionScoreService tbdiaStudentSessionScoreService;

    @RequiresPermissions("tec:sc:view")
    @GetMapping()
    public String sc()
    {
        return prefix + "/sc";
    }

    /**
     * 查询学生成绩列表
     */
    @RequiresPermissions("tec:sc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaStudentSessionScore tbdiaStudentSessionScore)
    {
        startPage();
        List<TbdiaStudentSessionScore> list = tbdiaStudentSessionScoreService.selectTbdiaStudentSessionScoreList(tbdiaStudentSessionScore);
        return getDataTable(list);
    }

    /**
     * 导出学生成绩列表
     */
    @RequiresPermissions("tec:sc:export")
    @Log(title = "学生成绩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbdiaStudentSessionScore tbdiaStudentSessionScore)
    {
        List<TbdiaStudentSessionScore> list = tbdiaStudentSessionScoreService.selectTbdiaStudentSessionScoreList(tbdiaStudentSessionScore);
        ExcelUtil<TbdiaStudentSessionScore> util = new ExcelUtil<TbdiaStudentSessionScore>(TbdiaStudentSessionScore.class);
        return util.exportExcel(list, "学生成绩数据");
    }

    /**
     * 新增学生成绩
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生成绩
     */
    @RequiresPermissions("tec:sc:add")
    @Log(title = "学生成绩", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbdiaStudentSessionScore tbdiaStudentSessionScore)
    {
        return toAjax(tbdiaStudentSessionScoreService.insertTbdiaStudentSessionScore(tbdiaStudentSessionScore));
    }

    /**
     * 修改学生成绩
     */
    @RequiresPermissions("tec:sc:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbdiaStudentSessionScore tbdiaStudentSessionScore = tbdiaStudentSessionScoreService.selectTbdiaStudentSessionScoreByFId(fId);
        mmap.put("tbdiaStudentSessionScore", tbdiaStudentSessionScore);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生成绩
     */
    @RequiresPermissions("tec:sc:edit")
    @Log(title = "学生成绩", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbdiaStudentSessionScore tbdiaStudentSessionScore)
    {
        return toAjax(tbdiaStudentSessionScoreService.updateTbdiaStudentSessionScore(tbdiaStudentSessionScore));
    }

    /**
     * 删除学生成绩
     */
    @RequiresPermissions("tec:sc:remove")
    @Log(title = "学生成绩", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbdiaStudentSessionScoreService.deleteTbdiaStudentSessionScoreByFIds(ids));
    }
}
