package com.soft863.controller;

import com.alibaba.fastjson.JSON;
import com.soft863.common.annotation.Log;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.common.enums.BusinessType;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.domain.TbdiaCourse;
import com.soft863.domain.TbdiaStudent;
import com.soft863.service.ITbdiaCourseService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 课程画像Controller
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
@Controller
@RequestMapping("/dia/course")
public class TbdiaCourseController extends BaseController
{
    private String prefix = "dia/course";

    @Autowired
    private ITbdiaCourseService tbdiaCourseService;

    @RequiresPermissions("dia:course:view")
    @GetMapping()
    public String course()
    {
        return prefix + "/course";
    }

    /**
     * 查询课程画像列表
     */
    @RequiresPermissions("dia:course:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaCourse tbdiaCourse)
    {
        startPage();
        List<TbdiaCourse> list = tbdiaCourseService.selectTbdiaCourseList(tbdiaCourse);
        return getDataTable(list);
    }

    /**
     * 导出课程画像列表
     */
    @RequiresPermissions("dia:course:export")
    @Log(title = "课程画像", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbdiaCourse tbdiaCourse)
    {
        List<TbdiaCourse> list = tbdiaCourseService.selectTbdiaCourseList(tbdiaCourse);
        ExcelUtil<TbdiaCourse> util = new ExcelUtil<TbdiaCourse>(TbdiaCourse.class);
        return util.exportExcel(list, "课程画像数据");
    }

    /**
     * 新增课程画像
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存课程画像
     */
    @RequiresPermissions("dia:course:add")
    @Log(title = "课程画像", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbdiaCourse tbdiaCourse)
    {
        return toAjax(tbdiaCourseService.insertTbdiaCourse(tbdiaCourse));
    }

    /**
     * 修改课程画像
     */
    @RequiresPermissions("dia:course:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        TbdiaCourse tbdiaCourse = tbdiaCourseService.selectTbdiaCourseByFId(fId);
        mmap.put("tbdiaCourse", tbdiaCourse);
        return prefix + "/edit";
    }

    /**
     * 修改保存课程画像
     */
    @RequiresPermissions("dia:course:edit")
    @Log(title = "课程画像", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbdiaCourse tbdiaCourse)
    {
        return toAjax(tbdiaCourseService.updateTbdiaCourse(tbdiaCourse));
    }

    /**
     * 删除课程画像
     */
    @RequiresPermissions("dia:course:remove")
    @Log(title = "课程画像", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbdiaCourseService.deleteTbdiaCourseByFIds(ids));
    }

    /**
     * 课程画像页面跳转
     */
    @RequiresPermissions("dia:course:list")
    @GetMapping("/dia")
    public String todia(String fCno,ModelMap map){
         TbdiaCourse tbdiaCourse= tbdiaCourseService.selectByNo(fCno);
        if (tbdiaCourse==null){
            map.put("msg","没有该课程，请输入正确的课程号");
            return prefix+"/course";
        }
        map.put("no",fCno);
        return prefix + "/dia";
    }

    /**
     * 课程画像页面跳转
     */
    @RequiresPermissions("dia:course:list")
    @GetMapping("/todia/{fCno}")
    public String toDia(@PathVariable String fCno,ModelMap map){
        TbdiaCourse tbdiaCourse= tbdiaCourseService.selectByNo(fCno);
        if (tbdiaCourse==null){
            map.put("msg","没有该课程，请输入正确的课程号");
            return prefix+"/course";
        }
        map.put("no",fCno);
        return prefix + "/dia";
    }

    /**
     * Course页面跳转
     */
    @RequiresPermissions("dia:course:list")
    @GetMapping("/course")
    public String toCourse(){
        return prefix + "/course";
    }

    /**
     * course页面展示
     */
    @RequiresPermissions("dia:course:list")
    @GetMapping("/dia/{no}")
    @ResponseBody
    public String show(@PathVariable String no){
        TbdiaCourse tbdiaCourse= tbdiaCourseService.selectByNo(no);
        String s = JSON.toJSONString(tbdiaCourse);
        return s;
    }


    /**
     * avg展示
     */
    @RequiresPermissions("dia:course:list")
    @GetMapping("/avg/{no}")
    @ResponseBody
    public String avg(@PathVariable String no){
        String avg= tbdiaCourseService.avg(no);
        String s = JSON.toJSONString(avg);
        return s;
    }

    /**
     * 出勤请假学生数量
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/cada/{no}")
    @ResponseBody
    public String cadaNum (@PathVariable String no){
        List<Map<String, Integer>> ca = tbdiaCourseService.cadaNum(no);
        List<Map<Object,Object>> cada =new ArrayList<>();
        Map<Object, Object> map1=new HashMap<>();
        Map<Object, Object> map2=new HashMap<>();
        Map<String, Integer> map = ca.get(0);
        Integer c = map.get("出勤");
        Integer l = map.get("请假");
        map1.put("name","出勤");
        map2.put("name","请假");
        map1.put("value",c);
        map2.put("value",l);
        cada.add(map1);
        cada.add(map2);
        String s = JSON.toJSONString(cada);
        return s;
    }

    /**
     * 挂科学生数量
     */
    @RequiresPermissions("dia:student:list")
    @RequestMapping( "/up/{no}")
    @ResponseBody
    public String upNum (@PathVariable String no){
        List<Map<Object,Object>> ca = tbdiaCourseService.up(no);
        List<Map<Object,Object>> list =new ArrayList<>();
        Map<Object, Object> map1=new HashMap<>();
        Map<Object, Object> map2=new HashMap<>();
        Map<Object,Object> map = ca.get(0);
        Integer g = (Integer) map.get("挂科");
        Integer p = Integer.valueOf(Long.toString((Long) map.get("通过")));
        map1.put("name","挂科");
        map2.put("name","通过");
        map1.put("value",g);
        map2.put("value",p);
        list.add(map1);
        list.add(map2);
        String s = JSON.toJSONString(list);
        return s;
    }

    /**
     * top展示
     */
    @RequiresPermissions("dia:course:list")
    @GetMapping("/top")
    @ResponseBody
    public String top(){
        List<Map<Object,Object>> top= tbdiaCourseService.top();
        List list =new ArrayList<>();
        String[] name =new String[top.size()];
        Integer[] num =new Integer[top.size()];
        for (int i = 0; i < top.size(); i++) {
            Map<Object, Object> map = top.get(i);
            name[i]= (String) map.get("f_cname");
            num[i]= (Integer) map.get("f_cnum");
        }
        list.add(name);
        list.add(num);
        String s = JSON.toJSONString(list);
        return s;
    }
}
