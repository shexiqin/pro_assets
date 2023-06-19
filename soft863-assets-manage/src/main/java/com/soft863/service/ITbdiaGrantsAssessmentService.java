package com.soft863.service;

import com.soft863.domain.TbdiaGrantsAssessment;

import java.util.List;

/**
 * 助学金评估Service接口
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
public interface ITbdiaGrantsAssessmentService 
{

    /**
     * 查询助学金评估列表
     * 
     * @param tbdiaGrantsAssessment 助学金评估
     * @return 助学金评估集合
     */
    public List<TbdiaGrantsAssessment> selectTbdiaGrantsAssessmentList(TbdiaGrantsAssessment tbdiaGrantsAssessment);


    /**
     * 设置权重
     * @param tbdiaGrantsAssessment 实体类
     * @return int类型
     */
    int setWeight(TbdiaGrantsAssessment tbdiaGrantsAssessment);

    void delAll();

    int insertAll(TbdiaGrantsAssessment tbdiaGrantsAssessment);

    String selectByKey(String configKey);

    int setValue(String configKey, String configValue);
}
