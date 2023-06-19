package com.soft863.domain;

import java.math.BigDecimal;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学生成绩对象 tbdia_student_session_score
 * 
 * @author ruoyi
 * @date 2023-06-07
 */
public class TbdiaStudentSessionScore extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @Excel(name = "id")
    private Long fId;

    /** 学生工号 */
    @Excel(name = "学生工号")
    private String fStuId;

    /** 平均平时分 */
    @Excel(name = "平均平时分")
    private BigDecimal fDailyPerAverage;

    /** 缺勤次数 */
    @Excel(name = "缺勤次数")
    private Long fAbsenceTimes;

    /** 综合分数 */
    @Excel(name = "综合分数")
    private BigDecimal fComprehensiveScore;

    /** 学分绩点 */
    @Excel(name = "学分绩点")
    private BigDecimal fStuGpa;

    /** 是否挂科 （0：是 1：否） */
    @Excel(name = "是否挂科 ", readConverterExp = "0=：是,1=：否")
    private Long fHangingUp;

    /** 是否重修（0：是 1：否） */
    @Excel(name = "是否重修", readConverterExp = "0=：是,1=：否")
    private Long fRebuild;

    /** 学年 */
    @Excel(name = "学年")
    private String fYear;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfStuId(String fStuId) 
    {
        this.fStuId = fStuId;
    }

    public String getfStuId() 
    {
        return fStuId;
    }
    public void setfDailyPerAverage(BigDecimal fDailyPerAverage) 
    {
        this.fDailyPerAverage = fDailyPerAverage;
    }

    public BigDecimal getfDailyPerAverage() 
    {
        return fDailyPerAverage;
    }
    public void setfAbsenceTimes(Long fAbsenceTimes) 
    {
        this.fAbsenceTimes = fAbsenceTimes;
    }

    public Long getfAbsenceTimes() 
    {
        return fAbsenceTimes;
    }
    public void setfComprehensiveScore(BigDecimal fComprehensiveScore) 
    {
        this.fComprehensiveScore = fComprehensiveScore;
    }

    public BigDecimal getfComprehensiveScore() 
    {
        return fComprehensiveScore;
    }
    public void setfStuGpa(BigDecimal fStuGpa) 
    {
        this.fStuGpa = fStuGpa;
    }

    public BigDecimal getfStuGpa() 
    {
        return fStuGpa;
    }
    public void setfHangingUp(Long fHangingUp) 
    {
        this.fHangingUp = fHangingUp;
    }

    public Long getfHangingUp() 
    {
        return fHangingUp;
    }
    public void setfRebuild(Long fRebuild) 
    {
        this.fRebuild = fRebuild;
    }

    public Long getfRebuild() 
    {
        return fRebuild;
    }
    public void setfYear(String fYear) 
    {
        this.fYear = fYear;
    }

    public String getfYear() 
    {
        return fYear;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fStuId", getfStuId())
            .append("fDailyPerAverage", getfDailyPerAverage())
            .append("fAbsenceTimes", getfAbsenceTimes())
            .append("fComprehensiveScore", getfComprehensiveScore())
            .append("fStuGpa", getfStuGpa())
            .append("fHangingUp", getfHangingUp())
            .append("fRebuild", getfRebuild())
            .append("fYear", getfYear())
            .toString();
    }
}
