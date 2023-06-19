package com.soft863.controller;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

import com.alibaba.fastjson.JSON;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.soft863.common.annotation.Log;
import com.soft863.common.enums.BusinessType;
import com.soft863.domain.TbdiaStudent;
import com.soft863.service.ITbdiaStudentService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 学生画像Controller
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
@Controller
@RequestMapping("/dia/student")
public class TbdiaStudentController extends BaseController
{
    private String prefix = "dia/student";

    @Autowired
    private ITbdiaStudentService tbdiaStudentService;

    @RequiresPermissions("dia:student:view")
    @GetMapping()
    public String student()
    {
        return prefix + "/student";
    }

    /**
     * 查询学生画像列表
     */
    @RequiresPermissions("dia:student:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaStudent tbdiaStudent)
    {
        startPage();
        List<TbdiaStudent> list = tbdiaStudentService.selectTbdiaStudentList(tbdiaStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生画像列表
     */
    @RequiresPermissions("dia:student:export")
    @Log(title = "学生画像", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbdiaStudent tbdiaStudent)
    {
        List<TbdiaStudent> list = tbdiaStudentService.selectTbdiaStudentList(tbdiaStudent);
        ExcelUtil<TbdiaStudent> util = new ExcelUtil<TbdiaStudent>(TbdiaStudent.class);
        return util.exportExcel(list, "学生画像数据");
    }

    /**
     * 新增学生画像
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生画像
     */
    @RequiresPermissions("dia:student:add")
    @Log(title = "学生画像", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbdiaStudent tbdiaStudent)
    {
        return toAjax(tbdiaStudentService.insertTbdiaStudent(tbdiaStudent));
    }

    /**
     * 修改学生画像
     */
    @RequiresPermissions("dia:student:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbdiaStudent tbdiaStudent = tbdiaStudentService.selectTbdiaStudentByFId(fId);
        mmap.put("tbdiaStudent", tbdiaStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生画像
     */
    @RequiresPermissions("dia:student:edit")
    @Log(title = "学生画像", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbdiaStudent tbdiaStudent)
    {
        return toAjax(tbdiaStudentService.updateTbdiaStudent(tbdiaStudent));
    }

    /**
     * 删除学生画像
     */
    @RequiresPermissions("dia:student:remove")
    @Log(title = "学生画像", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbdiaStudentService.deleteTbdiaStudentByFIds(ids));
    }

    /**
     * 男女学生数量
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/sex")
    @ResponseBody
    public String sexNum (){
        List<Map<String, Integer>> sexNum = tbdiaStudentService.sexNum();
        String s = JSON.toJSONString(sexNum);
        return s;
    }

    /**
     * 奖学金占比学生数量
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/award")
    @ResponseBody
    public String award (){
        List<Map<String, Integer>> award1 = tbdiaStudentService.award();
        String s = JSON.toJSONString(award1);
        return s;
    }

    /**
     * 各个专业学生人数
     */
    @RequiresPermissions("dia:student:list")
    @GetMapping( "/deptnum")
    @ResponseBody
    public String deptnum (){

         List count= tbdiaStudentService.count();

        List<Map<Object, Object>> deptnum = tbdiaStudentService.deptnum();
        Object[] key = new Object[count.size()];
        Object[] value=new Object[count.size()];
        List<Object[]> de=new ArrayList<>();
        int i=0;
        for (Map<Object, Object> map1 : deptnum) {
            Object k = map1.get("major");
            Object v = map1.get("num");
            key[i]=k;
            value[i]=v;
            i++;
        }
        de.add(key);
        de.add(value);
        String s = JSON.toJSONString(de);
        return s;

      /*  List<String> dept =null;
        int num[]={};
        Set<Map.Entry<String, Integer>> entries = deptnum.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        int i=0;
        while (iterator.hasNext()){
            dept.add(iterator.next().getKey());
            num[i]= iterator.next().getValue();
        }
        map.put("dept",dept);
        map.put("num",num);*/
    }

    /**
     * 学生籍贯分布
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/birthplace")
    @ResponseBody
    public String birthplace (){
        List<Map<String, Integer>> birthplace = tbdiaStudentService.birthplace();
        String s = JSON.toJSONString(birthplace);
        return s;
    }

    /**
     * 群体画像List界面跳转
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping("/many")
    public String tomany(){
        return prefix + "/many";
    }

    /**
     * 群体画像页面跳转
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping("/student")
    public String tostudent(){
        return prefix + "/student";
    }

    /**
     * 个人画像页面跳转
     */
    @RequiresPermissions("dia:student:list")
    @GetMapping("/one")
    public String toone(String fNo,ModelMap map){
        TbdiaStudent tbdiaStudent = tbdiaStudentService.selectTbdiaStudentByFNo(fNo);
        if (tbdiaStudent==null){
            map.put("msg","没有该学生，请输入正确的学号");
            return prefix+"/many";
        }
        map.put("no",fNo);
        return prefix + "/one";
    }

    /**
     * 个人画像页面跳转
     */
    @RequiresPermissions("dia:student:list")
    @GetMapping("/toOne/{fNo}")
    public String toOne(@PathVariable String fNo,ModelMap map){
        TbdiaStudent tbdiaStudent = tbdiaStudentService.selectTbdiaStudentByFNo(fNo);
        if (tbdiaStudent==null){
            map.put("msg","没有该学生，请输入正确的学号");
            return prefix+"/many";
        }
        map.put("no",fNo);
        return prefix + "/one";
    }

    /**
     * 学生个人画像
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/one/{fNo}")
    @ResponseBody
    public String stuDia(@PathVariable String fNo){
        TbdiaStudent stuDia = tbdiaStudentService.selectTbdiaStudentByFNo(fNo);
        String s = JSON.toJSONString(stuDia);
        return s;
    }

    /**
     * 学生总数
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping("/allNum")
    @ResponseBody
    public String allNum(){
        String num = tbdiaStudentService.allNum();
        return num;
    }

    /**
     * 优秀学生数量
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/excellent")
    @ResponseBody
    public String excellentNum (){
        String excellentNum = tbdiaStudentService.excellentNum();
        return  excellentNum;
    }

    /**
     * 竞赛学生数量
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/test")
    @ResponseBody
    public String test (){
        String num = tbdiaStudentService.test();
        return num;
    }

    /**
     * 奖学金学生数量
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/good")
    @ResponseBody
    public String good(){
        String num = tbdiaStudentService.good();
        return num;
    }

    /**
     * 综合成绩分数
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/sc/{fNo}")
    @ResponseBody
    public String sc(@PathVariable String fNo){
        String num = tbdiaStudentService.sc(fNo);
        return num;
    }

    /**
     * 缺勤次数
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/absent/{fNo}")
    @ResponseBody
    public String absent(@PathVariable String fNo){
        String num = tbdiaStudentService.absent(fNo);
        return num;
    }


    /**
     * 综合成绩分析
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/leida/{fNo}")
    @ResponseBody
    public String leida(@PathVariable String fNo){
        Integer[] arr=new Integer[6];

        List l=new ArrayList<>();
        int sum=0;
        int sc=0;
        List list = tbdiaStudentService.stuSC(fNo);
        for (int i = 0; i <list.size(); i++) {
            Map<Object,Object> o = (Map<Object, Object>) list.get(i);
            BigDecimal a = (BigDecimal)o.get("avg");
            int i1 = a.intValue();
            sum+=i1;
        }
            int avg=sum/list.size();
            if (avg<=100){sc=5;}
            if (avg<=90){sc=4;}
            if (avg<=80){sc=3;}
            if (avg<=70){sc=2;}
            if (avg<=60){sc=1;}

        List<Map<Object,Object>> dia=   tbdiaStudentService.stuDia(fNo);
        Map<Object, Object> map = dia.get(0);
        BigDecimal a = (BigDecimal)map.get("zh");
        int zh=1;
        int b=a.intValue();
        if (b<=100){zh=5;}
        if (b<=90){zh=4;}
        if (b<=80){zh=3;}
        if (b<=70){zh=2;}
        if (b<=60){zh=1;}




         Integer jj = Integer.valueOf(map.get("jj").toString());
            switch (jj){
                case 0: jj=1 ; break;
                case 1: jj=2 ; break;
                case 2: jj=3 ; break;
                case 3: jj=4 ; break;
                default:jj=5 ;
            }
         Integer hj = Integer.valueOf(map.get("hj").toString());
            switch (hj){
                case 0: hj=1 ; break;
                case 1: hj=2 ; break;
                case 2: hj=3 ; break;
                case 3: hj=4 ; break;
                default:hj=5 ;
            }
                int kq=1;
            Integer qj = (Integer) map.get("qj");
            Integer qq = (Integer) map.get("qq");
                if ((qj+qq)<=9){kq=2;}
                if ((qj+qq)<=7){kq=3;}
                if ((qj+qq)<=5){kq=4;}
                if ((qj+qq)<=3){kq=5;}
        BigDecimal gpa = (BigDecimal)map.get("jd");
        double v = gpa.doubleValue();
                int jd=1;
                if (v<=5){jd=5;}
                if (v<=4.0){jd=4;}
                if (v<=3.5){jd=3;}
                if (v<=3.0){jd=2;}
                if (v<=2.5){jd=1;}


                arr[0]=zh;
                arr[1]=hj;
                arr[2]=jj;
                arr[3]=jd;
                arr[4]=sc;
                arr[5]=kq;

                l.add(arr);

            String s = JSON.toJSONString(l);
        return s;
    }

    /**
     * 缺勤次数
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/yearSC/{fNo}")
    @ResponseBody
    public String yearSC(@PathVariable String fNo){
        List<Map<Object,Object>> yearSC=tbdiaStudentService.yearSC(fNo);
        List list =new ArrayList<>();
        String[] year =new String[yearSC.size()];
        String[] sc =new String[yearSC.size()];
        for (int i = 0; i < yearSC.size(); i++) {
            String y = (String)yearSC.get(i).get("year");
            BigDecimal s =(BigDecimal) yearSC.get(i).get("sc");
            String result = s.toString();
            year[i]=y;
            sc[i]=result;
        }
        list.add(year);
        list.add(sc);
        String s = JSON.toJSONString(list);
        return s;
    }

}
