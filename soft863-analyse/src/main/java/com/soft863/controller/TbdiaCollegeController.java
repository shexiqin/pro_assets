package com.soft863.controller;


import com.soft863.domain.TbdiaCollege;
import com.soft863.domain.TbdiaMajor;
import com.soft863.service.TbdiaCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dia/college")
public class TbdiaCollegeController {

    @Autowired
    private TbdiaCollegeService tbdiaCollegeService;

  /*  //学院简介
    private static String  profile="河南周口技术学院是河南省一所经河南省人民政府批准、国家教育部备案的全日制普通专科院校......";
    //占地面积
    private static String cArea;
    //建筑面积
    private static String fArea="51.3";*/


    /**
     * 去学院画像首页
     *
     * @return
     */
    @RequestMapping("/goIndex")
    public String goIndex(){
        return "dia/college/index";
    }


    @RequestMapping("/toMajor")
    public String toMajor(){

        return "/dia/major";
    }
    /**
     * 获取学校基本信息
     *
     */

    @RequestMapping("/getCollegeInfo")
    @ResponseBody
    public List<String> getCollegeInfo(){
        ArrayList<String> collegeData = new ArrayList<>();

        collegeData.add(tbdiaCollegeService.getProfile());
        collegeData.add(tbdiaCollegeService.getArea());
        collegeData.add(tbdiaCollegeService.getfArea());
        return collegeData;
    }


    /**
     *
     * 获取专业通过率（就业率）
     */
    @RequestMapping("/getEmpRate")
    @ResponseBody
    public List<TbdiaMajor> getEmpRate(){
        List<TbdiaMajor> majors = tbdiaCollegeService.getEmpRate();
        for (TbdiaMajor major : majors) {
            System.out.println(major);
        }
        return majors;
    }


    @RequestMapping("/getEmpRateAsc")
    @ResponseBody
    public List<TbdiaMajor> getEmpRateAsc(){
        List<TbdiaMajor> majors = tbdiaCollegeService.getEmpRateAsc();
        for (TbdiaMajor major : majors) {
            System.out.println(major);
        }
        return majors;
    }


    /**
     *
     * 查询教师学历
     *
     */
    @RequestMapping("/getTeaEdu")
    @ResponseBody
    public List<Map<Object,Object>> getTeaEdu(){
        List<TbdiaCollege> teaEdu = tbdiaCollegeService.getTeaEdu();
        ArrayList<Map<Object, Object>> list = new ArrayList<>();
        for (int i = 0; i < teaEdu.size(); i++) {
            LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
            map.put("value",teaEdu.get(i).getEduCount());
            map.put("name",teaEdu.get(i).getfEdu());
            list.add(map);
        }
        return list;
       /* int benke = 0;
        int yanjiusheng = 0;
        int boshi = 0;
        ArrayList<Map<Object, Object>> list = new ArrayList<>();
        HashMap<Object, Object> map1 = new HashMap<>();
        HashMap<Object, Object> map2 = new HashMap<>();
        HashMap<Object, Object> map3 = new HashMap<>();
        for (TbdiaTeach tbdiaTeach : teaEdu) {
            if (tbdiaTeach.getfEdu().equals("本科")){
                benke++;
            }else if (tbdiaTeach.getfEdu().equals("研究生")){
                yanjiusheng++;
            }else {
                boshi++;
            }
        }
        map1.put("value",benke);
        map1.put("name","本科");
        map2.put("value",yanjiusheng);
        map2.put("name","研究生");
        map3.put("value",boshi);
        map3.put("name","博士");
        list.add(map1);
        list.add(map2);
        list.add(map3);

        System.out.println(list);
        return list;*/
    }


    /**
     * 查询收支情况
     */

    @RequestMapping("/incAndExp")
    @ResponseBody
    public List<Map<Object,Object>> incAndExp(){
        List<TbdiaCollege> incAndExp = tbdiaCollegeService.getIncAndExp();
        ArrayList<Map<Object, Object>> maps = new ArrayList<>();


        for (int i = 0; i < incAndExp.size(); i++) {
            LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
            map.put("创建时间",incAndExp.get(i).getfCreateTime());
            map.put("收入",incAndExp.get(i).getfTuition());
            map.put("支出",incAndExp.get(i).getfOther());
            maps.add(map);
        }

        System.out.println(maps);
        return maps;
    }

    /**
     * 查询学生总数
     */
    @RequestMapping("/getAllStu")
    @ResponseBody
    public String selectAllStu(){
        String stuCount = tbdiaCollegeService.selectAllStu();
        return stuCount;
    }

    /**
     * 查询教师总数
     */
    @RequestMapping("/getAllTeacher")
    @ResponseBody
    public String selectAllTeacher(){
        String teacherCount = tbdiaCollegeService.selectAllTeacher();
        return teacherCount;
    }
}
