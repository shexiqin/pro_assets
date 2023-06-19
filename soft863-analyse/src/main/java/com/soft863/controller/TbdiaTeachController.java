package com.soft863.controller;

import java.util.ArrayList;
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
import com.soft863.domain.TbdiaTeach;
import com.soft863.service.ITbdiaTeachService;
import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.utils.poi.ExcelUtil;
import com.soft863.common.core.page.TableDataInfo;

/**
 * 教师画像Controller
 *
 * @author ruoyi
 * @date 2023-06-01
 */
@Controller
@RequestMapping("/dia/teach")
public class TbdiaTeachController extends BaseController {
    private String prefix = "dia/teach";

    @Autowired
    private ITbdiaTeachService tbdiaTeachService;



    @RequiresPermissions("dia:teach:view")
    @GetMapping()
    public String teach() {
        return prefix + "/teach";
    }

    /**
     * 查询教师画像列表
     */
    @RequiresPermissions("dia:teach:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaTeach tbdiaTeach) {
        startPage();
        List<TbdiaTeach> list = tbdiaTeachService.selectTbdiaTeachList(tbdiaTeach);
        return getDataTable(list);
    }

    /**
     * 导出教师画像列表
     */
    @RequiresPermissions("dia:teach:export")
    @Log(title = "教师画像", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbdiaTeach tbdiaTeach) {
        List<TbdiaTeach> list = tbdiaTeachService.selectTbdiaTeachList(tbdiaTeach);
        ExcelUtil<TbdiaTeach> util = new ExcelUtil<TbdiaTeach>(TbdiaTeach.class);
        return util.exportExcel(list, "教师画像数据");
    }

    /**
     * 新增教师画像
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存教师画像
     */
    @RequiresPermissions("dia:teach:add")
    @Log(title = "教师画像", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbdiaTeach tbdiaTeach) {
        return toAjax(tbdiaTeachService.insertTbdiaTeach(tbdiaTeach));
    }

    /**
     * 修改教师画像
     */
    @RequiresPermissions("dia:teach:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap) {
        TbdiaTeach tbdiaTeach = tbdiaTeachService.selectTbdiaTeachByFId(fId);
        mmap.put("tbdiaTeach", tbdiaTeach);
        return prefix + "/edit";
    }
    /**
     * 教师个人画像
     */

    @RequestMapping("/oneteach")
    public String oneTeach(Long fId ,ModelMap mmap) {
        System.out.println(fId);
        System.out.println("放弃");
        TbdiaTeach tbdiaTeach = tbdiaTeachService.selectTbdiaTeachByFId(fId);
        System.out.println(tbdiaTeach.getfId());
        mmap.put("tbdiaTeach", tbdiaTeach);
        return prefix + "/oneteach";
    }
    /**
     * 修改保存教师画像
     */
    @RequiresPermissions("dia:teach:edit")
    @Log(title = "教师画像", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbdiaTeach tbdiaTeach) {
        return toAjax(tbdiaTeachService.updateTbdiaTeach(tbdiaTeach));
    }

    /**
     * 删除教师画像
     */
    @RequiresPermissions("dia:teach:remove")
    @Log(title = "教师画像", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tbdiaTeachService.deleteTbdiaTeachByFIds(ids));
    }


    /**
     * 查询校内教师人数
     */

    @RequestMapping("/teachindex")
//    @ResponseBody
    public String count1(TbdiaTeach tbdiaTeach,ModelMap map) {

        int num= tbdiaTeachService.selectTbdiaTeachCouint1(tbdiaTeach);
        System.out.println("校内教师人数"+num);
        map.put("num",num);
        int count= tbdiaTeachService.selectTbdiaTeachOutCount2(tbdiaTeach);
        System.out.println("校外教师人数"+count);
        map.put("count",count);
        int awards= tbdiaTeachService.selectTbdiaTeachAwardsCount(tbdiaTeach);
        System.out.println("获奖教师人数"+awards);
        map.put("awards",awards);

        int rescrach= tbdiaTeachService.selectTbdiaTeachRescarchCount(tbdiaTeach);
        System.out.println("科研教师人数"+rescrach);
        map.put("rescrach",rescrach);


      //获奖次数统计
        int num1= tbdiaTeachService.tbdiaTeachAwardTypeCount1(tbdiaTeach);
        int num2= tbdiaTeachService.tbdiaTeachAwardTypeCount2(tbdiaTeach);
        int num3= tbdiaTeachService.tbdiaTeachAwardTypeCount3(tbdiaTeach);
        ArrayList<Object> awardList = new ArrayList<>();
        awardList.add(num1);
        awardList.add(num2);
        awardList.add(num3);
        map.put("awardList", awardList);

        //教师年龄统计
//        List<Object> teachAge = tbdiaTeachService.tbdiaTeachAge();
//        List<Object> teachName = tbdiaTeachService.tbdiaTeachName();
//
//        System.out.println(teachAge);
//        System.out.println(teachName);
//        map.put("teachAge", teachAge);
//        map.put("teachName", teachName);


            return prefix + "/teachindex";
    }



    /**
     * 导出教师画像列表
     */


    @PostMapping("/teachById")
    @ResponseBody
    public String  teachById(String id ,ModelMap map) {

        TbdiaTeach tbdiaTeach  = tbdiaTeachService.selectTeachById(id);
        map.put("tbdiaTeach",tbdiaTeach);
        return tbdiaTeach.toString();
    }

    /**
     * 获奖次数
     */
    @RequestMapping("/Award")

    public String tbdiaTeachAwardTypeCount(TbdiaTeach tbdiaTeach,ModelMap map) {

        int num1= tbdiaTeachService.tbdiaTeachAwardTypeCount1(tbdiaTeach);
        int num2= tbdiaTeachService.tbdiaTeachAwardTypeCount2(tbdiaTeach);
        int num3= tbdiaTeachService.tbdiaTeachAwardTypeCount3(tbdiaTeach);
        ArrayList<Object> awardList = new ArrayList<>();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        awardList.add(num1);
        awardList.add(num2);
        awardList.add(num3);
        map.put("num1",num1);
        map.put("num2",num2);
        map.put("num3",num3);
        return prefix + "/teachindex";
    }

    /**
     * 男女比例
     */
    @RequestMapping("/sex1")
    @ResponseBody
    public String tbdiaTeachSexCount1(TbdiaTeach tbdiaTeach,ModelMap map) {

        int woman= tbdiaTeachService.tbdiaTeachSexCount1(tbdiaTeach);
        int man= tbdiaTeachService.tbdiaTeachSexCount2(tbdiaTeach);
        System.out.println("男性人数"+man);
        System.out.println("女性人数"+woman);
        map.put("woman",woman);
        map.put("man",man);
        return prefix + "/teachindex";
    }

    /**
     * 男女比例
     */
    @RequestMapping("/teachTCount")
    @ResponseBody
    public List<Object> tbdiaTeachType(TbdiaTeach tbdiaTeach, ModelMap map) {

        //教师类型统计
        List<Map<String, Object>> countTeachType = tbdiaTeachService.getCountTeachType();
        List<Map<String, Object>> teachType =tbdiaTeachService.getTeachType();
        List<Object> typeList = new ArrayList<>();
        List<Object> typeName = new ArrayList<>();
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < countTeachType.size(); i++) {
            Map<String, Object> map1 = countTeachType.get(i);
            typeList.add(map1.get("value"));
        }
        for (int i = 0; i <  teachType.size(); i++) {
            Map<String, Object> map1 =  teachType.get(i);
            typeName.add(map1.get("name"));
        }
        list.add(typeList);
        list.add(typeName);
        System.out.println(typeList);
        System.out.println(typeName);
        System.out.println(list);
        map.put("typeList",typeList);
        map.put("typeName",typeName);

        return list;
    }
    /**
     * 教师性别比例
     * @param tbdiaTeach
     * @param map
     * @return
     */
    @RequestMapping("/sex")
    @ResponseBody
    public List<Map<String,Object>> tbdiaTeachSexCount(TbdiaTeach tbdiaTeach, ModelMap map) {

        List<Map<String, Object>> countSexType = tbdiaTeachService.getCountSexType();
        System.out.println(countSexType);
    return countSexType;

    }

    /**
     * 学历
     * @param tbdiaTeach
     * @param map
     * @return
     */
    @RequestMapping("/edu")
    @ResponseBody
    public List<Map<String, Object>> tbdiaTeachEdu(TbdiaTeach tbdiaTeach, ModelMap map) {

        List<Map<String, Object>> teachEdu =tbdiaTeachService.tbdiaTeachEdu();
        System.out.println(teachEdu);
        return teachEdu;

    }
    /**
     * 教师类型
     * @param tbdiaTeach
     * @param map
     * @return
     */
    @RequestMapping("/teachType")
    @ResponseBody
    public List<Map<String,Object>> tbdiaTeachTypeCount(TbdiaTeach tbdiaTeach, ModelMap map) {

        List<Map<String, Object>> countTeachType = tbdiaTeachService.getCountTeachType();
       List<Object> typeList = new ArrayList<>();
        for (int i = 0; i < countTeachType.size(); i++) {
            Map<String, Object> map1 = countTeachType.get(i);
               typeList.add(map.get("num"));

        }
        map.put("countTeachType",countTeachType);
        System.out.println(countTeachType);
        return countTeachType;
    }

    @RequestMapping("/getData")
    @ResponseBody
    public ArrayList<List<Object>> gatData( ) {
        //教师年龄统计
        List<Object> teachAge = tbdiaTeachService.tbdiaTeachAge();

        //
        List<Object> teachName = tbdiaTeachService.tbdiaTeachName();

        System.out.println(teachAge);
        System.out.println(teachName);

        ArrayList<List<Object>> lists = new ArrayList<>();


        lists.add(teachAge);
        lists.add(teachName);
        System.out.println(lists);

        return lists;

    }


    /**
     * 页面跳转
     */
    @RequestMapping("/index")
    public String toIndex() {
        return prefix + "/teach";

    }
}
