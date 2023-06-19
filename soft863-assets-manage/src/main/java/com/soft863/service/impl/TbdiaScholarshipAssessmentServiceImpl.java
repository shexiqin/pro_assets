package com.soft863.service.impl;

import com.soft863.domain.TbdiaScholarshipAssessment;
import com.soft863.mapper.TbdiaScholarshipAssessmentMapper;
import com.soft863.service.TbdiaScholarshipAssessmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TbdiaScholarshipAssessmentServiceImpl implements TbdiaScholarshipAssessmentService {
    @Resource
    TbdiaScholarshipAssessmentMapper mapper;

    public List<TbdiaScholarshipAssessment> list(TbdiaScholarshipAssessment tbdiaScholarshipAssessment) {
        return mapper.selAll(tbdiaScholarshipAssessment);
    }

    public int setWeight(TbdiaScholarshipAssessment scholarshipAssessment) {
       return mapper.setScoreAndLevel(scholarshipAssessment);
    }

    public List<TbdiaScholarshipAssessment> selStudent(Map<String, Object> map) {
        return mapper.selStudent(map);
    }

    @Override
    public int setEstimate(List<TbdiaScholarshipAssessment> list) {
        return mapper.insertScholarshipAssessment(list);
    }

    @Override
    public int delAll() {
        return mapper.delAll();
    }

    @Override
    public String selEstimate() {
        return mapper.selEstimate();
    }

    @Override
    public String selWeight() {
        return mapper.selWeight();
    }

    @Override
    public int updateWeight(String weight) {
        return mapper.updateWeight(weight);
    }

    @Override
    public int updateEstimate(String estimate) {
        return mapper.updateEstimate(estimate);
    }
}
