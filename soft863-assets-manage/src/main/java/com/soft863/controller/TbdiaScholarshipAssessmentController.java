package com.soft863.controller;
import com.soft863.common.annotation.Log;


import com.soft863.common.core.controller.BaseController;
import com.soft863.common.core.domain.AjaxResult;
import com.soft863.common.core.page.TableDataInfo;
import com.soft863.domain.TbdiaScholarshipAssessment;
import com.soft863.service.TbdiaScholarshipAssessmentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/dia/scholarshipAssessment")
public class TbdiaScholarshipAssessmentController extends BaseController {
    @Autowired
    TbdiaScholarshipAssessmentService service;

    private String prefix = "dia/scholarshipAssessment";

    @RequiresPermissions("dia:scholarshipAssessment:view")
    @GetMapping()
    public String scholarshipAssessment()
    {
        return prefix + "/list";
    }

    /**
     * 查询奖学金评估列表
     */
    @RequiresPermissions("fin:expend:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbdiaScholarshipAssessment tbdiaScholarshipAssessment)
    {
        startPage();
        List<TbdiaScholarshipAssessment> list = service.list(tbdiaScholarshipAssessment);
        return getDataTable(list);
    }

    @GetMapping("/weight")
    public String weight(ModelMap map)
    {
        String weight=service.selWeight();
        map.put("weight",weight);
        return prefix + "/weight";
    }


    /**
     * 权重与奖学金数量设置
     */
    @PostMapping("/weight")
    @ResponseBody
    public AjaxResult setWeight(@RequestParam Map<String,Object> map)
    {
        BigDecimal weight1 = new BigDecimal((String) map.get("weight1"));//绩点比重
        BigDecimal weight2 = new BigDecimal((String) map.get("weight2"));//成绩比重
        BigDecimal weight3 = new BigDecimal(Double.parseDouble((String) map.get("weight3"))/100);//绩点权重占比
        BigDecimal weight4 = new BigDecimal(Double.parseDouble((String) map.get("weight4"))/100);//成绩权重占比
        BigDecimal weight5 = new BigDecimal((String) map.get("weight1"));//获奖加分数
        Integer weight6 = Integer.parseInt((String)map.get("weight6"));//一等奖数量
        Integer weight7 = Integer.parseInt((String)map.get("weight7"));//二等奖数量
        Integer weight8 = Integer.parseInt((String)map.get("weight8"));//三等奖数量
        List<TbdiaScholarshipAssessment> list = service.list(new TbdiaScholarshipAssessment());
        int i=0;
        int count=0;
        for (TbdiaScholarshipAssessment scholarshipAssessment : list) {
            //计算评估得分：绩点*比重*权重+综合成绩*比重*权重+加分项*获奖次数
            BigDecimal bigDecimal = new BigDecimal(Double.toString(scholarshipAssessment.getfStuGpa())).multiply(weight2).multiply(weight3);
            BigDecimal bigDecima2 = new BigDecimal(Double.toString(scholarshipAssessment.getfCompisiteScore())).multiply(weight1).multiply(weight4);
            BigDecimal bigDecima3 = weight5.multiply(new BigDecimal(Double.toString(scholarshipAssessment.getfGainnum())));
            Double assessmentScore = bigDecimal.add(bigDecima2).add(bigDecima3).doubleValue();
            scholarshipAssessment.setfAssessmentSocre(assessmentScore);
            int i1 = service.setWeight(scholarshipAssessment);
            count+=i1;
        }
        List<TbdiaScholarshipAssessment> list1 = service.list(new TbdiaScholarshipAssessment());
        for (TbdiaScholarshipAssessment tbdiaScholarshipAssessment : list1) {
            i++;
            if (i<=weight6){
                tbdiaScholarshipAssessment.setfScholarshipLevel("一等奖");
            }else if (i<=weight7+weight6&&i>weight6){
                tbdiaScholarshipAssessment.setfScholarshipLevel("二等奖");
            }else if (i<=weight7+weight6+weight8&&i>weight6+weight7){
                tbdiaScholarshipAssessment.setfScholarshipLevel("三等奖");
            }
            int i1 = service.setWeight(tbdiaScholarshipAssessment);
        }
        String weight = map.get("weight1") + "." + map.get("weight2") + "." + map.get("weight3") + "." + map.get("weight4") + "." + map.get("weight5") + "." + map.get("weight6") + "." + map.get("weight7") + "." + map.get("weight8");
        service.updateWeight(weight);
        return toAjax(count);
    }



    /**
     * 评估条件设置数量设置
     */
    @PostMapping("/estimate")
    @ResponseBody
    public AjaxResult setEstimate(@RequestParam Map<String,Object> map)
    {
        Double estimate1 = Double.parseDouble((String) map.get("estimate1"));//学分绩效（大于）
        Double estimate2 = Double.parseDouble((String) map.get("estimate2"));//综合成绩（大于）
        Integer estimate3 = Integer.parseInt((String) map.get("estimate3"));//请假次数（小于）
        Integer estimate4 = Integer.parseInt((String) map.get("estimate4"));//请假次数（小于）
        //从画像表中获取数据
        List<TbdiaScholarshipAssessment> list=service.selStudent(map);
        if (list.size() == 0) {
            return toAjax(0);
        }else {
            String estimate = map.get("estimate1") + "." + map.get("estimate2") + "." + map.get("estimate3") + "." + map.get("estimate4");
            //删除原有数据
            service.delAll();
            //更新评估条件
            service.updateEstimate(estimate);
        return toAjax(service.setEstimate(list));
        }

    }


    @GetMapping("/estimate")
    public String estimate(ModelMap map)
    {
        String estimate=service.selEstimate();
        map.put("estimate",estimate);
        return prefix + "/estimate";
    }

}
