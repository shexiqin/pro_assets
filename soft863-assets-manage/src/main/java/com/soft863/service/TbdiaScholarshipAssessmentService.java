package com.soft863.service;

import com.soft863.domain.TbdiaScholarshipAssessment;

import java.util.List;
import java.util.Map;

public interface TbdiaScholarshipAssessmentService {
    List<TbdiaScholarshipAssessment> list(TbdiaScholarshipAssessment tbdiaScholarshipAssessment);

    int setWeight(TbdiaScholarshipAssessment scholarshipAssessment);

    List<TbdiaScholarshipAssessment> selStudent(Map<String, Object> map);

    int setEstimate(List<TbdiaScholarshipAssessment> list);

    int delAll();

    String selEstimate();

    String selWeight();

    int updateWeight(String weight);

    int updateEstimate(String estimate);

}
