package com.soft863.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 专业画像对象 tbdia_major
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public class TbdiaMajor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long fMid;

    /** 专业代码 */
    @Excel(name = "专业代码")
    private String fCode;

    /** 专业方向 */
    @Excel(name = "专业方向")
    private String fMaj;

    /** 课程性质 */
    @Excel(name = "课程性质")
    private String fMchar;

    /** 考核方式 */
    @Excel(name = "考核方式")
    private String fMmethod;

    /** 总学时 */
    @Excel(name = "总学时")
    private Long fMhour;

    /** 学分 */
    @Excel(name = "学分")
    private Long fMsorce;

    /** 教学资源 */
    @Excel(name = "教学资源")
    private String fMresource;

    /** 招生人数 */
    @Excel(name = "招生人数")
    private Long fMnum;

    /** 校企合作 */
    @Excel(name = "校企合作")
    private String fMpartner;

    /** 就业前景 */
    @Excel(name = "就业前景")
    private String fMdevelop;

    /** 招生对象 */
    @Excel(name = "招生对象")
    private Long fMentrollment;

    /** 师资力量 */
    @Excel(name = "师资力量")
    private Long fTchnum;

    /** 教研成果 */
    @Excel(name = "教研成果")
    private String fMachievements;

    /** 专业在校人数 */
    @Excel(name = "专业在校人数")
    private Long fMstunum;

    /** 开设时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开设时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fMstarter;

    /** 专业通过率 */
    @Excel(name = "专业通过率")
    private BigDecimal fMpass;

    /** 实习 */
    @Excel(name = "实习")
    private String fPractice;

    /** 课程类型 */
    @Excel(name = "课程类型")
    private String fType;

    public void setfType(String fType)
    {
        this.fType = fType;
    }

    public String getfType()
    {
        return fType;
    }

    public void setfMid(Long fMid) 
    {
        this.fMid = fMid;
    }

    public Long getfMid() 
    {
        return fMid;
    }
    public void setfCode(String fCode) 
    {
        this.fCode = fCode;
    }

    public String getfCode() 
    {
        return fCode;
    }
    public void setfMaj(String fMaj) 
    {
        this.fMaj = fMaj;
    }

    public String getfMaj() 
    {
        return fMaj;
    }
    public void setfMchar(String fMchar) 
    {
        this.fMchar = fMchar;
    }

    public String getfMchar() 
    {
        return fMchar;
    }
    public void setfMmethod(String fMmethod) 
    {
        this.fMmethod = fMmethod;
    }

    public String getfMmethod() 
    {
        return fMmethod;
    }
    public void setfMhour(Long fMhour) 
    {
        this.fMhour = fMhour;
    }

    public Long getfMhour() 
    {
        return fMhour;
    }
    public void setfMsorce(Long fMsorce) 
    {
        this.fMsorce = fMsorce;
    }

    public Long getfMsorce() 
    {
        return fMsorce;
    }
    public void setfMresource(String fMresource) 
    {
        this.fMresource = fMresource;
    }

    public String getfMresource() 
    {
        return fMresource;
    }
    public void setfMnum(Long fMnum) 
    {
        this.fMnum = fMnum;
    }

    public Long getfMnum() 
    {
        return fMnum;
    }
    public void setfMpartner(String fMpartner) 
    {
        this.fMpartner = fMpartner;
    }

    public String getfMpartner() 
    {
        return fMpartner;
    }
    public void setfMdevelop(String fMdevelop) 
    {
        this.fMdevelop = fMdevelop;
    }

    public String getfMdevelop() 
    {
        return fMdevelop;
    }
    public void setfMentrollment(Long fMentrollment) 
    {
        this.fMentrollment = fMentrollment;
    }

    public Long getfMentrollment() 
    {
        return fMentrollment;
    }
    public void setfTchnum(Long fTchnum) 
    {
        this.fTchnum = fTchnum;
    }

    public Long getfTchnum() 
    {
        return fTchnum;
    }
    public void setfMachievements(String fMachievements) 
    {
        this.fMachievements = fMachievements;
    }

    public String getfMachievements() 
    {
        return fMachievements;
    }
    public void setfMstunum(Long fMstunum) 
    {
        this.fMstunum = fMstunum;
    }

    public Long getfMstunum() 
    {
        return fMstunum;
    }
    public void setfMstarter(Date fMstarter) 
    {
        this.fMstarter = fMstarter;
    }

    public Date getfMstarter() 
    {
        return fMstarter;
    }
    public void setfMpass(BigDecimal fMpass) 
    {
        this.fMpass = fMpass;
    }

    public BigDecimal getfMpass() 
    {
        return fMpass;
    }
    public void setfPractice(String fPractice) 
    {
        this.fPractice = fPractice;
    }

    public String getfPractice() 
    {
        return fPractice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fMid", getfMid())
            .append("fCode", getfCode())
            .append("fMaj", getfMaj())
            .append("fMchar", getfMchar())
            .append("fMmethod", getfMmethod())
            .append("fMhour", getfMhour())
            .append("fMsorce", getfMsorce())
            .append("fMresource", getfMresource())
            .append("fMnum", getfMnum())
            .append("fMpartner", getfMpartner())
            .append("fMdevelop", getfMdevelop())
            .append("fMentrollment", getfMentrollment())
            .append("fTchnum", getfTchnum())
            .append("fMachievements", getfMachievements())
            .append("fMstunum", getfMstunum())
            .append("fMstarter", getfMstarter())
            .append("fMpass", getfMpass())
            .append("fPractice", getfPractice())
            .append("fType", getfType())
            .toString();
    }
}
