package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学生获奖信息对象 tbstu_awardinfo
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
public class TbstuAwardinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String fProjectname;

    /** 项目类别 */
    @Excel(name = "项目类别")
    private String fProjectcategory;

    /** 级别 */
    @Excel(name = "级别")
    private String fLevel;

    /** 获奖等级 */
    @Excel(name = "获奖等级")
    private String fAwardgrade;

    /** 获奖日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "获奖日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fDateaward;

    /** 获奖学生 */
    @Excel(name = "获奖学生")
    private String fSname;

    /** 指导教师名单 */
    @Excel(name = "指导教师名单")
    private String fListinstructors;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfProjectname(String fProjectname) 
    {
        this.fProjectname = fProjectname;
    }

    public String getfProjectname() 
    {
        return fProjectname;
    }
    public void setfProjectcategory(String fProjectcategory) 
    {
        this.fProjectcategory = fProjectcategory;
    }

    public String getfProjectcategory() 
    {
        return fProjectcategory;
    }
    public void setfLevel(String fLevel) 
    {
        this.fLevel = fLevel;
    }

    public String getfLevel() 
    {
        return fLevel;
    }
    public void setfAwardgrade(String fAwardgrade) 
    {
        this.fAwardgrade = fAwardgrade;
    }

    public String getfAwardgrade() 
    {
        return fAwardgrade;
    }
    public void setfDateaward(Date fDateaward) 
    {
        this.fDateaward = fDateaward;
    }

    public Date getfDateaward() 
    {
        return fDateaward;
    }
    public void setfSname(String fSname) 
    {
        this.fSname = fSname;
    }

    public String getfSname() 
    {
        return fSname;
    }
    public void setfListinstructors(String fListinstructors) 
    {
        this.fListinstructors = fListinstructors;
    }

    public String getfListinstructors() 
    {
        return fListinstructors;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fProjectname", getfProjectname())
            .append("fProjectcategory", getfProjectcategory())
            .append("fLevel", getfLevel())
            .append("fAwardgrade", getfAwardgrade())
            .append("fDateaward", getfDateaward())
            .append("fSname", getfSname())
            .append("fListinstructors", getfListinstructors())
            .toString();
    }
}
