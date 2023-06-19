package com.soft863.mapper;

import com.soft863.domain.TbdiaGrantsAssessment;

import java.util.List;

/**
 * 助学金评估Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
public interface TbdiaGrantsAssessmentMapper 
{




    /**
     * 查询助学金评估列表
     * 
     * @param tbdiaGrantsAssessment 助学金评估
     * @return 助学金评估集合
     */
    public List<TbdiaGrantsAssessment> selectTbdiaGrantsAssessmentList(TbdiaGrantsAssessment tbdiaGrantsAssessment);


    /**
     * 给评估分数
     * 
     * @param tbdiaGrantsAssessment 助学金评估
     * @return 结果
     */
    public int updateTbdiaGrantsAssessment(TbdiaGrantsAssessment tbdiaGrantsAssessment);


    void delAll();

    int insertAll(TbdiaGrantsAssessment tbdiaGrantsAssessment);

    String selectByKey(String configKey);

    int setValue(String configKey, String configValue);
}

