package com.soft863.domain;

//奖学金评估表
public class TbdiaScholarshipAssessment {
//id
private Long fId;
//学生id
private Long fStuId;
//学生姓名
private String fStuName;
//专业
private String fMajor;
//班级
private String fClass;
//综合分数
private Double fCompisiteScore;
//绩点
private Double fStuGpa;
//获奖次数
private Integer fGainnum;
//计算后得出的评估分
private Double fAssessmentSocre;
//奖学金等级
private String fScholarshipLevel;

    @Override
    public String toString() {
        return "TbdiaScholarshipAssessment{" +
                "fId=" + fId +
                ", fStuId=" + fStuId +
                ", fStuName='" + fStuName + '\'' +
                ", fMajor='" + fMajor + '\'' +
                ", fClass='" + fClass + '\'' +
                ", fCompisiteScore=" + fCompisiteScore +
                ", fStuGpa=" + fStuGpa +
                ", fGainnum='" + fGainnum + '\'' +
                ", fAssessmentSocre=" + fAssessmentSocre +
                ", fScholarshipLevel='" + fScholarshipLevel + '\'' +
                '}';
    }

    public void setfGainnum(Integer fGainnum) {
        this.fGainnum = fGainnum;
    }

    public Integer getfGainnum() {
        return fGainnum;
    }
    public void setfId(Long fId) {
        this.fId = fId;
    }

    public void setfStuId(Long fStuId) {
        this.fStuId = fStuId;
    }

    public void setfStuName(String fStuName) {
        this.fStuName = fStuName;
    }

    public void setfMajor(String fMajor) {
        this.fMajor = fMajor;
    }

    public void setfClass(String fClass) {
        this.fClass = fClass;
    }

    public void setfCompisiteScore(Double fCompisiteScore) {
        this.fCompisiteScore = fCompisiteScore;
    }

    public void setfStuGpa(Double fStuGpa) {
        this.fStuGpa = fStuGpa;
    }

    public void setfAssessmentSocre(Double fAssessmentSocre) {
        this.fAssessmentSocre = fAssessmentSocre;
    }

    public void setfScholarshipLevel(String fScholarshipLevel) {
        this.fScholarshipLevel = fScholarshipLevel;
    }

    public Long getfId() {
        return fId;
    }

    public Long getfStuId() {
        return fStuId;
    }

    public String getfStuName() {
        return fStuName;
    }

    public String getfMajor() {
        return fMajor;
    }

    public String getfClass() {
        return fClass;
    }

    public Double getfCompisiteScore() {
        return fCompisiteScore;
    }

    public Double getfStuGpa() {
        return fStuGpa;
    }

    public Double getfAssessmentSocre() {
        return fAssessmentSocre;
    }

    public String getfScholarshipLevel() {
        return fScholarshipLevel;
    }
}
