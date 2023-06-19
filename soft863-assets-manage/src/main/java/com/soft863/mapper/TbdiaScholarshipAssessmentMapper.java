package com.soft863.mapper;

import com.soft863.domain.TbdiaScholarshipAssessment;

import java.util.List;
import java.util.Map;

public interface TbdiaScholarshipAssessmentMapper {
    List<TbdiaScholarshipAssessment> selAll(TbdiaScholarshipAssessment tbdiaScholarshipAssessment);

    int setScoreAndLevel(TbdiaScholarshipAssessment scholarshipAssessment);

    List<TbdiaScholarshipAssessment> selStudent(Map<String, Object> map);

    int insertScholarshipAssessment(List<TbdiaScholarshipAssessment> list);

    int delAll();

    String selEstimate();

    String selWeight();

    int updateWeight(String weight);

    int updateEstimate(String estimate);

}
