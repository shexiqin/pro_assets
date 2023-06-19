package com.soft863.service.impl;

import com.soft863.domain.TbdiaGrantsAssessment;
import com.soft863.mapper.TbdiaGrantsAssessmentMapper;
import com.soft863.service.ITbdiaGrantsAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 助学金评估Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
@Service
public class TbdiaGrantsAssessmentServiceImpl implements ITbdiaGrantsAssessmentService 
{
    @Autowired
    private TbdiaGrantsAssessmentMapper tbdiaGrantsAssessmentMapper;



    /**
     * 查询助学金评估列表
     * 
     * @param tbdiaGrantsAssessment 助学金评估
     * @return 助学金评估
     */
    @Override
    public List<TbdiaGrantsAssessment> selectTbdiaGrantsAssessmentList(TbdiaGrantsAssessment tbdiaGrantsAssessment)
    {
        return tbdiaGrantsAssessmentMapper.selectTbdiaGrantsAssessmentList(tbdiaGrantsAssessment);
    }


    @Override
    public int setWeight(TbdiaGrantsAssessment tbdiaGrantsAssessment) {
        return tbdiaGrantsAssessmentMapper.updateTbdiaGrantsAssessment(tbdiaGrantsAssessment);
    }

    @Override
    public void delAll() {
        tbdiaGrantsAssessmentMapper.delAll();
    }

    @Override
    public int insertAll(TbdiaGrantsAssessment tbdiaGrantsAssessment) {
      return   tbdiaGrantsAssessmentMapper.insertAll(tbdiaGrantsAssessment);
    }

    @Override
    public String selectByKey(String configKey) {
        return tbdiaGrantsAssessmentMapper.selectByKey(configKey);
    }

    @Override
    public int setValue(String configKey, String configValue) {
        return tbdiaGrantsAssessmentMapper.setValue(configKey,configValue);
    }


}
