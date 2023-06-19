package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 获奖学生(学工系统)对象 tbstu_award
 * 
 * @author 863
 * @date 2023-06-02
 */
public class TbstuAward extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 学生学号 */
    @Excel(name = "学生学号")
    private Long fSno;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String fSname;

    /** 获奖类型 */
    @Excel(name = "获奖类型")
    private String fAwardType;

    /** 获奖原因 */
    @Excel(name = "获奖原因")
    private String fAwardReason;

    /** 获奖日期（年月） */
    @Excel(name = "获奖日期", readConverterExp = "年=月")
    private Date fDateaward;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfSno(Long fSno) 
    {
        this.fSno = fSno;
    }

    public Long getfSno() 
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
    public void setfAwardType(String fAwardType) 
    {
        this.fAwardType = fAwardType;
    }

    public String getfAwardType() 
    {
        return fAwardType;
    }
    public void setfAwardReason(String fAwardReason) 
    {
        this.fAwardReason = fAwardReason;
    }

    public String getfAwardReason() 
    {
        return fAwardReason;
    }
    public void setfDateaward(Date fDateaward) 
    {
        this.fDateaward = fDateaward;
    }

    public Date getfDateaward() 
    {
        return fDateaward;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fSno", getfSno())
            .append("fSname", getfSname())
            .append("fAwardType", getfAwardType())
            .append("fAwardReason", getfAwardReason())
            .append("fDateaward", getfDateaward())
            .toString();
    }
}
