package com.soft863.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.soft863.service.ITbdiaWarnStuService;
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
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 学生预警Controller
 * 
 * @author wc
 * @date 2023-06-03
 */
@Controller
@RequestMapping("/dia/stuwarn")
public class TbdiaWarnStuController extends BaseController
{
    private String prefix = "dia/stuwarn";

    @Autowired
    private ITbdiaWarnStuService tbdiaWarnStuService;

    @RequiresPermissions("dia:stuwarn:view")
    @GetMapping()
    public String stuwarn(ModelMap map)
    {

        //获取雷达图数据
        // 1 获取所有预警种类和其对应预警数
        List<Map<String,Object>> list02=tbdiaWarnStuService.getWarnRadar();
        //2 获取预警数最多的学生
        String name=tbdiaWarnStuService.getMaxWarnName();
        //3 获取该学生的所有预警数量
        List<Map<Object,Object>> warninfo=tbdiaWarnStuService.getWarnInfoByName(name);
        Object[] warnArr=new Object[list02.size()];
        for (int i = 0; (int)i < warnArr.length; i++) {
            for (Map<Object, Object> map1 : warninfo) {
                if (i== (Integer)map1.get("type")){
                    warnArr[i]= map1.get("num");
                    break;
                }else {
                    warnArr[i]=0;
                }
            }
        }

        map.put("list02",list02);
        map.put("warnStu",name);
        map.put("warnArr",warnArr);



        return prefix + "/stuwarn";
    }

    /**
     * 查询学生预警列表
     */
    @RequiresPermissions("dia:stuwarn:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaWarnStu tbdiaWarnStu)
    {
        startPage();
        List<TbdiaWarnStu> list = tbdiaWarnStuService.selectTbdiaWarnStuList(tbdiaWarnStu);
        return getDataTable(list);
    }

    /**
     * 导出学生预警列表
     */
    @RequiresPermissions("dia:stuwarn:export")
    @Log(title = "学生预警", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbdiaWarnStu tbdiaWarnStu)
    {
        List<TbdiaWarnStu> list = tbdiaWarnStuService.selectTbdiaWarnStuList(tbdiaWarnStu);
        ExcelUtil<TbdiaWarnStu> util = new ExcelUtil<TbdiaWarnStu>(TbdiaWarnStu.class);
        return util.exportExcel(list, "学生预警数据");
    }

    /**
     * 新增学生预警
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生预警
     */
    @RequiresPermissions("dia:stuwarn:add")
    @Log(title = "学生预警", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbdiaWarnStu tbdiaWarnStu)
    {
        return toAjax(tbdiaWarnStuService.insertTbdiaWarnStu(tbdiaWarnStu));
    }

    /**
     * 修改学生预警
     */
    @RequiresPermissions("dia:stuwarn:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbdiaWarnStu tbdiaWarnStu = tbdiaWarnStuService.selectTbdiaWarnStuByFId(fId);
        mmap.put("tbdiaWarnStu", tbdiaWarnStu);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生预警
     */
    @RequiresPermissions("dia:stuwarn:edit")
    @Log(title = "学生预警", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbdiaWarnStu tbdiaWarnStu)
    {
        return toAjax(tbdiaWarnStuService.updateTbdiaWarnStu(tbdiaWarnStu));
    }

    /**
     * 删除学生预警
     */
    @RequiresPermissions("dia:stuwarn:remove")
    @Log(title = "学生预警", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbdiaWarnStuService.deleteTbdiaWarnStuByFIds(ids));
    }


    @RequestMapping("/dealwarn")
    @ResponseBody
    public Object dealWarn()
    {
        Object dealcount=tbdiaWarnStuService.getDealWarn();
        return dealcount;
    }

    @RequestMapping("/getPieData")
    @ResponseBody
    public List<Map<String,Object>> getPieData()
    {
        List<Map<String,Object>> list02=tbdiaWarnStuService.getWarnProportion();
        return list02;
    }

    @RequestMapping("/getBarData")
    @ResponseBody
    public List getBarData()
    {
        //获取柱状图数据
        List<Map<String,Object>> list01=tbdiaWarnStuService.getWarnBar();
        List<Map<String,Object>> dealList=tbdiaWarnStuService.getDealWarnMonth();
        List<String> months=new ArrayList<>();
        List<Object> counts=new ArrayList<>();
        Object[] dealCounts=new Object[list01.size()];

        int index=0;
        for (Map<String, Object> map1 : list01) {
            String month= (String) map1.get("months")+"月";
            Object count=map1.get("counts");
            months.add(month);
            counts.add(count);
            for (Map<String, Object> dealWarn : dealList) {
                if (dealWarn.get("months").equals(map1.get("months")) ) {
                    dealCounts[index]=dealWarn.get("counts");
                    break;
                }else {
                    dealCounts[index]=0;
                }

            }
            index++;
        }
        System.out.println(dealCounts.length);

        List listBar=new ArrayList();
        listBar.add(months);
        listBar.add(counts);
        listBar.add(dealCounts);

        return listBar;
    }




    @PostMapping("/warntotal")
    @ResponseBody
    public Object getWarnTotal()
    {
        Object total=tbdiaWarnStuService.getWarntotal();
        System.out.println(total);
        return total;
    }

    @RequestMapping("/nodealwarn")
    @ResponseBody
    public Object nodealWarn()
    {
        Object nodealcount=tbdiaWarnStuService.getNoDealWarn();
        return nodealcount;
    }

    @RequestMapping("/curwarn")
    @ResponseBody
    public Object curWarn()
    {
        Object curwarn=tbdiaWarnStuService.getCurWarn();
        return curwarn;
    }

    @RequestMapping("/update")
    public String update(ModelMap map){
        Date date=new Date();

        //获取挂科预警数
        List<TbdiaWarnStu> listGk=tbdiaWarnStuService.getGkWarn();
        for (TbdiaWarnStu tbdiaWarnStu : listGk) {
            tbdiaWarnStu.setfWarnType(2);
            tbdiaWarnStu.setfTime(date);
            tbdiaWarnStu.setfStatue(0);
            tbdiaWarnStuService.insertTbdiaWarnStu(tbdiaWarnStu);
        }
        //获取毕业预警数
        List<TbdiaWarnStu> listBy=tbdiaWarnStuService.getByWarn();
        for (TbdiaWarnStu tbdiaWarnStu : listBy) {
            tbdiaWarnStu.setfWarnType(3);
            tbdiaWarnStu.setfTime(date);
            tbdiaWarnStu.setfStatue(0);
            tbdiaWarnStuService.insertTbdiaWarnStu(tbdiaWarnStu);
        }
        //获取逃课/失联预警数
        List<TbdiaWarnStu> listTk=tbdiaWarnStuService.getTkWarn();
        for (TbdiaWarnStu tbdiaWarnStu : listTk) {
            tbdiaWarnStu.setfWarnType(0);
            tbdiaWarnStu.setfTime(date);
            tbdiaWarnStu.setfStatue(0);
            tbdiaWarnStuService.insertTbdiaWarnStu(tbdiaWarnStu);
        }


        //方法内部跳转需要使用重定向
       return "redirect:/dia/stuwarn";


    }
    @RequestMapping("showWarnInfo")
    public String showWarnInfo(ModelMap map){
        //获取雷达图数据
        // 1 获取所有预警种类和其对应预警数
        List<Map<String,Object>> list02=tbdiaWarnStuService.getWarnRadar();
        //2 获取预警数最多的学生
        String name=tbdiaWarnStuService.getMaxWarnName();
        //3 获取该学生的所有预警数量
        List<Map<Object,Object>> warninfo=tbdiaWarnStuService.getWarnInfoByName(name);
        Object[] warnArr=new Object[list02.size()];
        for (int i = 0; (int)i < warnArr.length; i++) {
            for (Map<Object, Object> map1 : warninfo) {
                if (i== (Integer)map1.get("type")){
                    warnArr[i]= map1.get("num");
                    break;
                }else {
                    warnArr[i]=0;
                }
            }
        }

        map.put("list02",list02);
        map.put("warnStu",name);
        map.put("warnArr",warnArr);

        return prefix + "/warnInfo";

    }

    @RequestMapping("showOneWarn/{sno}")
    public String showOneWarn(ModelMap map,@PathVariable String sno){
        System.out.println(sno);
        TbdiaWarnStu tbdiaWarnStu=tbdiaWarnStuService.getWarnBySno(sno);
        System.out.println(tbdiaWarnStu);
        map.put("tbdiaWarnStu",tbdiaWarnStu);
        return prefix + "/oneWarnInfo";
    }
}
