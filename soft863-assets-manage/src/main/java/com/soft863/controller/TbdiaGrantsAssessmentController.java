package com.soft863.controller;

import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.domain.TbdiaGrantsAssessment;
import com.soft863.service.ITbdiaGrantsAssessmentService;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * 助学金评估Controller
 *
 * @author ruoyi
 * @date 2023-06-03
 */
@Controller
@RequestMapping("/dia/assessment")
public class TbdiaGrantsAssessmentController extends BaseController {
    private String prefix = "dia/assessment";


    @Autowired
    private ITbdiaGrantsAssessmentService grantstService;

    @RequiresPermissions("dia:assessment:view")
    @GetMapping()
    public String assessment() {
        return prefix + "/assessment";
    }

    /**
     * 查询助学金评估列表
     */
    @RequiresPermissions("dia:assessment:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaGrantsAssessment assessment) {
        startPage();
        List<TbdiaGrantsAssessment> list = grantstService.selectTbdiaGrantsAssessmentList(assessment);
        return getDataTable(list);

    }

    /**
     * 去权重页面
     *
     * @return 结果
     */
    @GetMapping("/weight")

    public String WeightSetting(ModelMap map) {
       String configKey="grant.assess";
        //查询参数数据库里的值
        String configValue=grantstService.selectByKey(configKey);
        String[] strings = configValue.split("_");
        //把切割出来的字符串分别放入map里
        //绩点比重
        map.put("gpaProportion",strings[0]);
        //分数比重
        map.put("gradeProportion",strings[1]);
        //绩点占比
        map.put("gpaPercentage",strings[2]);
        //分数占比
        map.put("gradePercentage",strings[3]);
        //贫困加分
        map.put("extra1",strings[4]);
        //困难加分
        map.put("extra2",strings[5]);
        //一等奖数量
        map.put("onePrizesNum",strings[6]);
        //二等奖数量
        map.put("twoPrizesNum",strings[7]);
        //三等奖数量
        map.put("threePrizesNum",strings[8]);
        return prefix + "/weight";
    }

    /**
     * 编辑权重条件
     *
     * @param map 从页面传来的参数
     * @return ajax
     */
    @PostMapping("/weight")
    @ResponseBody
    public AjaxResult setWeight(@RequestParam Map<String, Object> map) {
        String configKey="grant.assess";
        BigDecimal gpt = new BigDecimal((String) map.get("gpaProportion"));//绩点比重
        BigDecimal mark = new BigDecimal((String) map.get("gradeProportion"));//成绩比重
        BigDecimal weight1 = new BigDecimal(Double.parseDouble((String) map.get("gpaPercentage")) / 100);//绩点权重占比
        BigDecimal weight2 = new BigDecimal(Double.parseDouble((String) map.get("gradePercentage")) / 100);//成绩权重占比
        if ((String)map.get("extra1")==null){
            map.put("extra1","0");
        }
        if ((String)map.get("extra2")==null){
            map.put("extra2","0");
        }
        BigDecimal extra1 = new BigDecimal((String) map.get("extra1"));//贫困加分
        BigDecimal extra2 = new BigDecimal((String) map.get("extra2"));//困难加分
        Integer onePrizesNum = Integer.parseInt((String) map.get("onePrizesNum"));//一等奖数量
        Integer twoPrizesNum = Integer.parseInt((String) map.get("twoPrizesNum"));//二等奖数量
        Integer threePrizesNum = Integer.parseInt((String) map.get("threePrizesNum"));//三等奖数量
        /**
         * 遍历map，拼接字符串
         */
        StringBuilder stringBuilder=new StringBuilder() ;
        Set<String> strings = map.keySet();
        for (String string : strings) {
            String value = (String) map.get(string);
            stringBuilder.append(value).append("_");
        }
        String configValue = stringBuilder.toString();
        //修改评估参数数据库里的值
        int c=grantstService.setValue(configKey,configValue);

        //第一次查询，为了设置评估分数
        List<TbdiaGrantsAssessment> list = grantstService.selectTbdiaGrantsAssessmentList(new TbdiaGrantsAssessment());
        int i = 0;
        int count = 0;
        for (TbdiaGrantsAssessment tbdiaGrantsAssessment : list) {
            //计算评估得分：绩点*比重*权重+综合成绩*比重*权重+加分项
            BigDecimal gptResult = new BigDecimal(Double.toString(tbdiaGrantsAssessment.getfStuGpa())).multiply(mark).multiply(weight1);
            BigDecimal sourceResult = new BigDecimal(Double.toString(tbdiaGrantsAssessment.getfComprehensiveScore())).multiply(gpt).multiply(weight2);
            BigDecimal extra;
            if ("3".equals(tbdiaGrantsAssessment.getfFamMoney())) {
                extra = extra1;
            } else {
                extra = extra2;
            }
            Double assessmentScore = gptResult.add(sourceResult).add(extra).doubleValue();
            tbdiaGrantsAssessment.setfAssessmentResult(assessmentScore);
            int i1 = grantstService.setWeight(tbdiaGrantsAssessment);
            count += i1;
        }
        //第二次查询，为了给助学金等级
        List<TbdiaGrantsAssessment> list1 = grantstService.selectTbdiaGrantsAssessmentList(new TbdiaGrantsAssessment());
        for (TbdiaGrantsAssessment tbdiaScholarshipAssessment : list1) {
            i++;
            if (i <= onePrizesNum) {
                tbdiaScholarshipAssessment.setfStipendLevel("一等奖");
            } else if (i <= twoPrizesNum + onePrizesNum && i > onePrizesNum) {
                tbdiaScholarshipAssessment.setfStipendLevel("二等奖");
            } else if (i <= twoPrizesNum + onePrizesNum + threePrizesNum && i > onePrizesNum + twoPrizesNum) {
                tbdiaScholarshipAssessment.setfStipendLevel("三等奖");
            }
            int i1 = grantstService.setWeight(tbdiaScholarshipAssessment);
        }

        return toAjax(count);
    }




    /**
     * 去跳转 评选范围界面
     *
     * @return 结果
     */
    @GetMapping("/selection")
    public String toSelection(ModelMap map) {

        String configKey="grant.condition";
        String configValue = grantstService.selectByKey(configKey);
        String[] strings = configValue.split("_");
//        map.put("fMajor",strings[0]);
//        map.put("fClazz",strings[1]);
        map.put("fStuGpa",strings[2]);
        map.put("fConsumption",strings[3]);
        map.put("fLeaveNum",strings[4]);
        return prefix + "/selection";

    }

    @PostMapping("/selection")
    @ResponseBody
    public AjaxResult selection(TbdiaGrantsAssessment assessment) {
        String configKey="grant.condition";
        StringBuilder sb=new StringBuilder();
        /*
         * 拼接字符串
         */
        if("".equals(assessment.getfMajor())){
            sb.append(" ").append("_");
        }else {
        sb.append(assessment.getfMajor()).append("_");
        }
        if ("".equals(assessment.getfClazz())){
            sb.append(" ").append("_");
        }else {
            sb.append(assessment.getfClazz()).append("_");
        }
        /*
         * 判断这个属性是否为null
         */
        if (assessment.getfStuGpa()==null){
           sb.append(" ").append("_");
        }else {
        sb.append(assessment.getfStuGpa()).append("_");
        }
        if (assessment.getfConsumption()==null){
            sb.append(" ").append("_");
        }else {
            sb.append(assessment.getfConsumption()).append("_");
        }
        if (assessment.getfLeaveNum()==null){
            sb.append(" ");
        }else {
            sb.append(assessment.getfLeaveNum());
        }
        String configValue = sb.toString();
        /*
        把值放入数据库
         */
        int i = grantstService.setValue(configKey, configValue);
        //清空评估表
        grantstService.delAll();
        //把画像表里的字段插入到评估表里
       int count=grantstService.insertAll(assessment);
     return  toAjax(count);
    }

}
