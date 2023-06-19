package com.soft863.controller;

import com.alibaba.fastjson.JSON;
import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbstuCard;
import com.soft863.service.ITbstuCardService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 学生一卡通Controller
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Controller
@RequestMapping("/stu/card")
public class TbstuCardController extends BaseController
{
    private String prefix = "stu/card";

    @Autowired
    private ITbstuCardService tbstuCardService;

    @RequiresPermissions("stu:card:view")
    @GetMapping()
    public String card()
    {
        return prefix + "/card";
    }


    @GetMapping("/getPieData")
    @ResponseBody
    public List<Map<String, Object>> analyze() {
        //统计每种类型的消费次数
        List<Map<String,Object>> countPerTypeList=tbstuCardService.getCountperType();

        return countPerTypeList;
    }


    @GetMapping("/analyze")
    public String analyze(ModelMap modelMap){

        //统计每时的数量
        List<Map<String,Object>> countPerHourList=tbstuCardService.getCountPerHour();
        //统计每月消费
        List<Map<String,Object>> countPerMonthList=tbstuCardService.getCountPerMonth();
        //统计在校学生消费情况
        List<Map<String,Object>> allStuConsumeList=tbstuCardService.getAllStuConsume();
        //统计前十消费榜单(男生)
        List<Map<String,Object>> tenStuConsumeList=tbstuCardService.getTenStuConsume();
        //统计每种类型的消费次数(女生)
        List<Map<String,Object>> countPerTypeList=tbstuCardService.getCountperType();


        //折线图变量
        ArrayList<Object> hourList = new ArrayList<>();
        ArrayList<Object> numList = new ArrayList<>();

        //柱状图变量
        ArrayList<Object> monthList = new ArrayList<>();
        ArrayList<Object> consumeList = new ArrayList<>();

        //散点图变量
        ArrayList<ArrayList> allStuList = new ArrayList<>();
        ArrayList<List> tenStuList = new ArrayList<>();

        //饼状图变量
        ArrayList<Object> typeList = new ArrayList<>();

        //折线图数据
        for (int i = 0; i < countPerHourList.size(); i++) {
            Map<String, Object> map = countPerHourList.get(i);
            hourList.add(map.get("hour"));
            numList.add(map.get("count"));
        }

        //柱状图数据
        for (int i = 0; i < countPerMonthList.size(); i++) {
            Map<String, Object> map = countPerMonthList.get(i);
            monthList.add(map.get("month"));
            consumeList.add(map.get("money"));
        }

        //散点图数据
        for (int i = 0; i < allStuConsumeList.size(); i++) {
            Map<String, Object> map = allStuConsumeList.get(i);
            ArrayList list=new ArrayList<>();
            list.add( map.get("count"));
            list.add( map.get("sum"));
            allStuList.add(list);
        }
        for (int i = 0; i < tenStuConsumeList.size(); i++) {
            Map<String, Object> map = tenStuConsumeList.get(i);
            ArrayList list=new ArrayList<>();
            list.add( map.get("count"));
            list.add( map.get("sum"));
            tenStuList.add(list);
        }

        //饼状图数据
        for (int i = 0; i < countPerTypeList.size(); i++) {
            Map<String, Object> map = countPerTypeList.get(i);

            typeList.add( map.get("name"));
        }

        String s = JSON.toJSONString(countPerTypeList);



        //提交数据
        modelMap.put("hourList",hourList);
        modelMap.put("numList",numList);
        modelMap.put("monthList",monthList);
        modelMap.put("consumeList",consumeList);
        modelMap.put("tenStuList",tenStuList);
        modelMap.put("allStuList",allStuList);
        modelMap.put("typeList",typeList);
        modelMap.put("pieChartList",s);

          return prefix + "/analyze";
    }

    /**
     * 查询学生一卡通列表
     */
    @RequiresPermissions("stu:card:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbstuCard tbstuCard)
    {
        startPage();
        List<TbstuCard> list = tbstuCardService.selectTbstuCardList(tbstuCard);
        return getDataTable(list);
    }

    /**
     * 导出学生一卡通列表
     */
    @RequiresPermissions("stu:card:export")
    @Log(title = "学生一卡通", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbstuCard tbstuCard)
    {
        List<TbstuCard> list = tbstuCardService.selectTbstuCardList(tbstuCard);
        ExcelUtil<TbstuCard> util = new ExcelUtil<TbstuCard>(TbstuCard.class);
        return util.exportExcel(list, "学生一卡通数据");
    }

    /**
     * 新增学生一卡通
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生一卡通
     */
    @RequiresPermissions("stu:card:add")
    @Log(title = "学生一卡通", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbstuCard tbstuCard)
    {
        tbstuCard.setfTime(new Date());
        return toAjax(tbstuCardService.insertTbstuCard(tbstuCard));
    }

    /**
     * 修改学生一卡通
     */
    @RequiresPermissions("stu:card:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbstuCard tbstuCard = tbstuCardService.selectTbstuCardByFId(fId);
        mmap.put("tbstuCard", tbstuCard);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生一卡通
     */
    @RequiresPermissions("stu:card:edit")
    @Log(title = "学生一卡通", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbstuCard tbstuCard)
    {
        return toAjax(tbstuCardService.updateTbstuCard(tbstuCard));
    }

    /**
     * 删除学生一卡通
     */
    @RequiresPermissions("stu:card:remove")
    @Log(title = "学生一卡通", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbstuCardService.deleteTbstuCardByFIds(ids));
    }


}
