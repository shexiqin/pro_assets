package com.soft863.controller;

import java.util.List;
import java.util.Map;

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
import com.soft863.domain.TbdiaWarnStu;
import com.soft863.service.ITbdiaWarnTecService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 教师预警Controller
 * 
 * @author wc
 * @date 2023-06-03
 */
@Controller
@RequestMapping("/dia/tecwarn")
public class TbdiaWarnTecController extends BaseController
{

    private String prefix = "dia/tecwarn";

    @Autowired
    private ITbdiaWarnTecService tbdiaWarnStuService;

    @RequiresPermissions("dia:tecwarn:view")
    @GetMapping()
    public String tecwarn(ModelMap map)
    {
        //各学院预警数量
        List<Map<String,Object>> warnList = tbdiaWarnStuService.selectFacWarnList();
        //各学院预警比例
        List<Map<String,Object>> warnProportion = tbdiaWarnStuService.selectWarnProportionList();
        //半年预警查询
        List<Map<String,Object>> warnhalfYearList = tbdiaWarnStuService.selectWarList();
        String[] month = new String[warnhalfYearList.size()];
        String[] count1 = new String[warnhalfYearList.size()];
        String[] count2 = new String[warnhalfYearList.size()];
        for (int i = 0; i < warnhalfYearList.size(); i++) {
            Map<String, Object> map1 = warnhalfYearList.get(i);
            month[i] = map1.get("month1").toString();
            if (map1.get("count1") == null){
                count1[i] = "0";
            }else {
                count1[i] = map1.get("count1").toString();
            }
            if (map1.get("count2") == null){
                count2[i] = "0";
            }else {
                count2[i] = map1.get("count2").toString();
            }
        }
        //当月预警
        List<Map<String,Object>> currentMonthWarn = tbdiaWarnStuService.selectMonthWarnList();

        map.addAttribute("warnList",warnList);
        map.addAttribute("warnProportion",warnProportion);
        map.addAttribute("month",month);
        map.addAttribute("count1",count1);
        map.addAttribute("count2",count2);
        map.addAttribute("currentMonthWarn",currentMonthWarn);

        return prefix + "/tecwarn";
    }

    /**
     * 查询教师预警列表
     */
    @RequiresPermissions("dia:tecwarn:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaWarnStu tbdiaWarnStu)
    {
        startPage();
        List<TbdiaWarnStu> list = tbdiaWarnStuService.selectTbdiaWarnTecList(tbdiaWarnStu);
        return getDataTable(list);
    }

    /**
     * 导出教师预警列表
     */
    @RequiresPermissions("dia:tecwarn:export")
    @Log(title = "教师预警", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbdiaWarnStu tbdiaWarnStu)
    {
        List<TbdiaWarnStu> list = tbdiaWarnStuService.selectTbdiaWarnTecList(tbdiaWarnStu);
        ExcelUtil<TbdiaWarnStu> util = new ExcelUtil<TbdiaWarnStu>(TbdiaWarnStu.class);
        return util.exportExcel(list, "教师预警数据");
    }

    /**
     * 新增教师预警
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教师预警
     */
    @RequiresPermissions("dia:tecwarn:add")
    @Log(title = "教师预警", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbdiaWarnStu tbdiaWarnStu)
    {
        return toAjax(tbdiaWarnStuService.insertTbdiaWarnTec(tbdiaWarnStu));
    }

    /**
     * 修改教师预警
     */
    @RequiresPermissions("dia:tecwarn:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbdiaWarnStu tbdiaWarnStu = tbdiaWarnStuService.selectTbdiaWarnTecByFId(fId);
        mmap.put("tbdiaWarnStu", tbdiaWarnStu);
        return prefix + "/edit";
    }

    /**
     * 修改保存教师预警
     */
    @RequiresPermissions("dia:tecwarn:edit")
    @Log(title = "教师预警", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbdiaWarnStu tbdiaWarnStu)
    {
        return toAjax(tbdiaWarnStuService.updateTbdiaWarnTec(tbdiaWarnStu));
    }


    /**
     * 修改保存教师预警
     */
    @RequiresPermissions("dia:tecwarn:edit")
    @Log(title = "教师预警", businessType = BusinessType.UPDATE)
    @PostMapping("/editAll")
    @ResponseBody
    public AjaxResult editSave(String ids)
    {
        return toAjax(tbdiaWarnStuService.updateAllTbdiaWarnTec(ids));
    }

    /**
     * 删除教师预警
     */
    @RequiresPermissions("dia:tecwarn:remove")
    @Log(title = "教师预警", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbdiaWarnStuService.deleteTbdiaWarnTecByFIds(ids));
    }


    /**
     * 查看预警列表
     *
     * @return 页面
     */
    @RequiresPermissions("dia:tecwarn:view")
    @GetMapping("/more")
    public String toStuWarnList(){
        return prefix+"/allwarn";
    }
}
