package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 优秀讲师评估对象 tbdia_teacher_estimate
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
public class TbdiaTeacherEstimate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long fId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String fTname;

    /** 工号 */
    @Excel(name = "工号")
    private Long fTno;

    /** 教学质量 */
    @Excel(name = "教学质量")
    private String fTeaQuality;

    /** 国家级奖项获取次数 */
    @Excel(name = "国家级奖项获取次数")
    private Integer fNationGainnum;

    /** 课程评分 */
    @Excel(name = "课程评分")
    private Long fCourseScore;

    /** 工作年限 */
    @Excel(name = "工作年限")
    private Long fWorkday;

    /** 评定结果 */
    @Excel(name = "评定结果")
    private String fCommres;

    /** 评价 */
    @Excel(name = "评价")
    private String fComment;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfTname(String fTname) 
    {
        this.fTname = fTname;
    }

    public String getfTname() 
    {
        return fTname;
    }
    public void setfTno(Long fTno) 
    {
        this.fTno = fTno;
    }

    public Long getfTno() 
    {
        return fTno;
    }
    public void setfTeaQuality(String fTeaQuality) 
    {
        this.fTeaQuality = fTeaQuality;
    }

    public String getfTeaQuality() 
    {
        return fTeaQuality;
    }
    public void setfNationGainnum(Integer fNationGainnum)
    {
        this.fNationGainnum = fNationGainnum;
    }

    public Integer getfNationGainnum()
    {
        return fNationGainnum;
    }
    public void setfCourseScore(Long fCourseScore) 
    {
        this.fCourseScore = fCourseScore;
    }

    public Long getfCourseScore() 
    {
        return fCourseScore;
    }
    public void setfWorkday(Long fWorkday) 
    {
        this.fWorkday = fWorkday;
    }

    public Long getfWorkday() 
    {
        return fWorkday;
    }
    public void setfCommres(String fCommres) 
    {
        this.fCommres = fCommres;
    }

    public String getfCommres() 
    {
        return fCommres;
    }
    public void setfComment(String fComment) 
    {
        this.fComment = fComment;
    }

    public String getfComment() 
    {
        return fComment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fTname", getfTname())
            .append("fTno", getfTno())
            .append("fTeaQuality", getfTeaQuality())
            .append("fNationGainnum", getfNationGainnum())
            .append("fCourseScore", getfCourseScore())
            .append("fWorkday", getfWorkday())
            .append("fCommres", getfCommres())
            .append("fComment", getfComment())
            .toString();
    }
}
