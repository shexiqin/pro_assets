package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 助学金评估对象 tbdia_grants_assessment
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
public class TbdiaGrantsAssessment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long fId;

    /** 学生工号 */
    @Excel(name = "学生工号")
    private String fNo;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String fName;

    /** 绩点 */
    @Excel(name = "绩点")
    private Double fStuGpa;
    

    /** 请假次数 */
    @Excel(name = "请假次数")
    private Long fLeaveNum;

    /** 专业 */
    @Excel(name = "专业")
    private String fMajor;

    /** 班级 */
    @Excel(name = "班级")
    private String fClazz;

    /** 校园卡消费统计 */
    @Excel(name = "校园卡消费统计")
    private Double fConsumption;

    /** 综合分数 */
    @Excel(name = "综合分数")
    private Double fComprehensiveScore;

    /** 助学金等极 */
    @Excel(name = "助学金等极")
    private String fStipendLevel;

    /** 评估分数 */
    @Excel(name = "评估分数")
    private double fAssessmentResult;

    /** 家庭经济情况 */
    @Excel(name = "家庭经济情况")
    private String fFamMoney;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfNo(String fNo) 
    {
        this.fNo = fNo;
    }

    public String getfNo() 
    {
        return fNo;
    }
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    public String getfName() 
    {
        return fName;
    }
    public void setfStuGpa(Double fStuGpa) 
    {
        this.fStuGpa = fStuGpa;
    }

    public Double getfStuGpa() 
    {
        return fStuGpa;
    }

 
    public void setfLeaveNum(Long fLeaveNum) 
    {
        this.fLeaveNum = fLeaveNum;
    }

    public Long getfLeaveNum() 
    {
        return fLeaveNum;
    }
    public void setfMajor(String fMajor) 
    {
        this.fMajor = fMajor;
    }

    public String getfMajor() 
    {
        return fMajor;
    }
    public void setfClazz(String fClazz) 
    {
        this.fClazz = fClazz;
    }

    public String getfClazz() 
    {
        return fClazz;
    }
    public void setfConsumption(Double fConsumption) 
    {
        this.fConsumption = fConsumption;
    }

    public Double getfConsumption() 
    {
        return fConsumption;
    }
    public void setfComprehensiveScore(Double fComprehensiveScore) 
    {
        this.fComprehensiveScore = fComprehensiveScore;
    }

    public Double getfComprehensiveScore() 
    {
        return fComprehensiveScore;
    }
    public void setfStipendLevel(String fStipendLevel) 
    {
        this.fStipendLevel = fStipendLevel;
    }

    public String getfStipendLevel() 
    {
        return fStipendLevel;
    }
    public void setfAssessmentResult(double fAssessmentResult)
    {
        this.fAssessmentResult = fAssessmentResult;
    }

    public double getfAssessmentResult()
    {
        return fAssessmentResult;
    }
    public void setfFamMoney(String fFamMoney) 
    {
        this.fFamMoney = fFamMoney;
    }

    public String getfFamMoney() 
    {
        return fFamMoney;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fNo", getfNo())
            .append("fName", getfName())
            .append("fStuGpa", getfStuGpa())
            .append("fLeaveNum", getfLeaveNum())
            .append("fMajor", getfMajor())
            .append("fClazz", getfClazz())
            .append("fConsumption", getfConsumption())
            .append("fComprehensiveScore", getfComprehensiveScore())
            .append("fStipendLevel", getfStipendLevel())
            .append("fAssessmentResult", getfAssessmentResult())
            .append("fFamMoney", getfFamMoney())
            .toString();
    }


}
