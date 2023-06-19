package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学生预警对象 tbdia_warn_stu
 * 
 * @author wc
 * @date 2023-06-03
 */
public class TbdiaWarnStu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 学生学号 */
    @Excel(name = "学生学号")
    private String fSno;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String fSname;

    /** 教工号 */
    @Excel(name = "教工号")
    private String fTno;

    /** 教工姓名 */
    @Excel(name = "教工姓名")
    private String fTname;

    /** 预警类型 */
    @Excel(name = "预警类型")
    private Integer fWarnType;

    /** 预警时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预警时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fTime;

    /** 是否处理预警 */
    @Excel(name = "是否处理预警")
    private Integer fStatue;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfSno(String fSno) 
    {
        this.fSno = fSno;
    }

    public String getfSno() 
    {
        return fSno;
    }
    public void setfSname(String fSname) 
    {
        this.fSname = fSname;
    }

    public String getfSname() 
    {
        return fSname;
    }
    public void setfTno(String fTno) 
    {
        this.fTno = fTno;
    }

    public String getfTno() 
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
    public void setfWarnType(Integer fWarnType) 
    {
        this.fWarnType = fWarnType;
    }

    public Integer getfWarnType() 
    {
        return fWarnType;
    }
    public void setfTime(Date fTime) 
    {
        this.fTime = fTime;
    }

    public Date getfTime() 
    {
        return fTime;
    }
    public void setfStatue(Integer fStatue) 
    {
        this.fStatue = fStatue;
    }

    public Integer getfStatue() 
    {
        return fStatue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fSno", getfSno())
            .append("fSname", getfSname())
            .append("fTno", getfTno())
            .append("fTname", getfTname())
            .append("fWarnType", getfWarnType())
            .append("fTime", getfTime())
            .append("fStatue", getfStatue())
            .toString();
    }
}
