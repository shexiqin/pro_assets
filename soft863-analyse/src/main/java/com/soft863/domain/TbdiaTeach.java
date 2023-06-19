package com.soft863.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 教师画像对象 tbdia_teach
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public class TbdiaTeach extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标识 */
    @Excel(name = "标识")
    private Long fId;

    /** 教工号 */
    @Excel(name = "教工号")
    private Long fTno;

    /** 教师姓名 */
    @Excel(name = "教师姓名")
    private String fTname;

    /** 性别 */
    @Excel(name = "性别")
    private String fSex;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fBirth;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String fPolit;

    /** 民族 */
    @Excel(name = "民族")
    private String fNation;

    /** 学历 */
    @Excel(name = "学历")
    private String fEdu;

    /** 职务 */
    @Excel(name = "职务")
    private String fPost;

    /** 院系 */
    @Excel(name = "院系")
    private String fDept;

    /** 职工类别 */
    @Excel(name = "职工类别")
    private String fPostType;

    /** 专业代码 */
    @Excel(name = "专业代码")
    private String fProCode;

    /** 课程号 */
    @Excel(name = "课程号")
    private String fCourseId;

    /** 课程评分 */
    @Excel(name = "课程评分")
    private Long fCourseScore;

    /** 专业领域 */
    @Excel(name = "专业领域")
    private String fProfess;

    /** 工资收入 */
    @Excel(name = "工资收入")
    private Long fSalary;

    /** 工作年限 */
    @Excel(name = "工作年限")
    private Long fWorkday;

    /** 国家获奖次数 */
    @Excel(name = "国家获奖次数")
    private Integer fNationGainnum;

    /** 省级获奖次数 */
    @Excel(name = "省级获奖次数")
    private Integer fProvinGainnum;

    /** 市级获奖次数 */
    @Excel(name = "市级获奖次数")
    private Integer fTownGainnum;

    /** 县区级获奖次数 */
    @Excel(name = "县区级获奖次数")
    private Integer fCounGainnum;

    /** 校级获奖次数 */
    @Excel(name = "校级获奖次数")
    private Integer fScoGainnum;

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
    public void setfTno(Long fTno) 
    {
        this.fTno = fTno;
    }

    public Long getfTno() 
    {
        return fTno;
    }
    public void setfTname(String fTname) 
    {
        this.fTname = fTname;
    }

    public String getfTname() 
    {
        return fTname;
    }
    public void setfSex(String fSex) 
    {
        this.fSex = fSex;
    }

    public String getfSex() 
    {
        return fSex;
    }
    public void setfBirth(Date fBirth) 
    {
        this.fBirth = fBirth;
    }

    public Date getfBirth() 
    {
        return fBirth;
    }
    public void setfPolit(String fPolit) 
    {
        this.fPolit = fPolit;
    }

    public String getfPolit() 
    {
        return fPolit;
    }
    public void setfNation(String fNation) 
    {
        this.fNation = fNation;
    }

    public String getfNation() 
    {
        return fNation;
    }
    public void setfEdu(String fEdu) 
    {
        this.fEdu = fEdu;
    }

    public String getfEdu() 
    {
        return fEdu;
    }
    public void setfPost(String fPost) 
    {
        this.fPost = fPost;
    }

    public String getfPost() 
    {
        return fPost;
    }
    public void setfDept(String fDept) 
    {
        this.fDept = fDept;
    }

    public String getfDept() 
    {
        return fDept;
    }
    public void setfPostType(String fPostType) 
    {
        this.fPostType = fPostType;
    }

    public String getfPostType() 
    {
        return fPostType;
    }
    public void setfProCode(String fProCode) 
    {
        this.fProCode = fProCode;
    }

    public String getfProCode() 
    {
        return fProCode;
    }
    public void setfCourseId(String fCourseId) 
    {
        this.fCourseId = fCourseId;
    }

    public String getfCourseId() 
    {
        return fCourseId;
    }
    public void setfCourseScore(Long fCourseScore) 
    {
        this.fCourseScore = fCourseScore;
    }

    public Long getfCourseScore() 
    {
        return fCourseScore;
    }
    public void setfProfess(String fProfess) 
    {
        this.fProfess = fProfess;
    }

    public String getfProfess() 
    {
        return fProfess;
    }
    public void setfSalary(Long fSalary) 
    {
        this.fSalary = fSalary;
    }

    public Long getfSalary() 
    {
        return fSalary;
    }
    public void setfWorkday(Long fWorkday) 
    {
        this.fWorkday = fWorkday;
    }

    public Long getfWorkday() 
    {
        return fWorkday;
    }
    public void setfNationGainnum(Integer fNationGainnum) 
    {
        this.fNationGainnum = fNationGainnum;
    }

    public Integer getfNationGainnum() 
    {
        return fNationGainnum;
    }
    public void setfProvinGainnum(Integer fProvinGainnum) 
    {
        this.fProvinGainnum = fProvinGainnum;
    }

    public Integer getfProvinGainnum() 
    {
        return fProvinGainnum;
    }
    public void setfTownGainnum(Integer fTownGainnum) 
    {
        this.fTownGainnum = fTownGainnum;
    }

    public Integer getfTownGainnum() 
    {
        return fTownGainnum;
    }
    public void setfCounGainnum(Integer fCounGainnum) 
    {
        this.fCounGainnum = fCounGainnum;
    }

    public Integer getfCounGainnum() 
    {
        return fCounGainnum;
    }
    public void setfScoGainnum(Integer fScoGainnum) 
    {
        this.fScoGainnum = fScoGainnum;
    }

    public Integer getfScoGainnum() 
    {
        return fScoGainnum;
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
            .append("fTno", getfTno())
            .append("fTname", getfTname())
            .append("fSex", getfSex())
            .append("fBirth", getfBirth())
            .append("fPolit", getfPolit())
            .append("fNation", getfNation())
            .append("fEdu", getfEdu())
            .append("fPost", getfPost())
            .append("fDept", getfDept())
            .append("fPostType", getfPostType())
            .append("fProCode", getfProCode())
            .append("fCourseId", getfCourseId())
            .append("fCourseScore", getfCourseScore())
            .append("fProfess", getfProfess())
            .append("fSalary", getfSalary())
            .append("fWorkday", getfWorkday())
            .append("fNationGainnum", getfNationGainnum())
            .append("fProvinGainnum", getfProvinGainnum())
            .append("fTownGainnum", getfTownGainnum())
            .append("fCounGainnum", getfCounGainnum())
            .append("fScoGainnum", getfScoGainnum())
            .append("fCommres", getfCommres())
            .append("fComment", getfComment())
            .toString();
    }


}
