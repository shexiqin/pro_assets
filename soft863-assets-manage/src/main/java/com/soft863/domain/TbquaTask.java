package com.soft863.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 质检任务对象 tbqua_task
 * 
 * @author cuihangbo
 * @date 2023-05-31
 */
public class TbquaTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 质检任务id */
    @Excel(name = "质检任务id")
    private Long fTask;

    /** 质检任务名 */
    @Excel(name = "质检任务名")
    private String fName;

    /** 质检状态 */
    @Excel(name = "质检状态")
    private Long fState;

    /** 质检规则id */
    @Excel(name = "质检规则id")
    private Long fRuleId;

    /** 质检类型  周期性/一次性 */
    @Excel(name = "质检类型  周期性/一次性")
    private Long fType;

    /** 周期频率描述 */
    @Excel(name = "周期频率描述")
    private String fRate;

    /** 处理形式 */
    @Excel(name = "处理形式")
    private Long fForm;

    /** 任务创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fCreateTime;

    /** 任务修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fUpdateTime;

    /** 任务开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fStartTime;

    /** 任务结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "任务结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fEndTime;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfTask(Long fTask) 
    {
        this.fTask = fTask;
    }

    public Long getfTask() 
    {
        return fTask;
    }
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    public String getfName() 
    {
        return fName;
    }
    public void setfState(Long fState) 
    {
        this.fState = fState;
    }

    public Long getfState() 
    {
        return fState;
    }
    public void setfRuleId(Long fRuleId) 
    {
        this.fRuleId = fRuleId;
    }

    public Long getfRuleId() 
    {
        return fRuleId;
    }
    public void setfType(Long fType) 
    {
        this.fType = fType;
    }

    public Long getfType() 
    {
        return fType;
    }
    public void setfRate(String fRate) 
    {
        this.fRate = fRate;
    }

    public String getfRate() 
    {
        return fRate;
    }
    public void setfForm(Long fForm) 
    {
        this.fForm = fForm;
    }

    public Long getfForm() 
    {
        return fForm;
    }
    public void setfCreateTime(Date fCreateTime) 
    {
        this.fCreateTime = fCreateTime;
    }

    public Date getfCreateTime() 
    {
        return fCreateTime;
    }
    public void setfUpdateTime(Date fUpdateTime) 
    {
        this.fUpdateTime = fUpdateTime;
    }

    public Date getfUpdateTime() 
    {
        return fUpdateTime;
    }
    public void setfStartTime(Date fStartTime) 
    {
        this.fStartTime = fStartTime;
    }

    public Date getfStartTime() 
    {
        return fStartTime;
    }
    public void setfEndTime(Date fEndTime) 
    {
        this.fEndTime = fEndTime;
    }

    public Date getfEndTime() 
    {
        return fEndTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fTask", getfTask())
            .append("fName", getfName())
            .append("fState", getfState())
            .append("fRuleId", getfRuleId())
            .append("fType", getfType())
            .append("fRate", getfRate())
            .append("fForm", getfForm())
            .append("fCreateTime", getfCreateTime())
            .append("fUpdateTime", getfUpdateTime())
            .append("fStartTime", getfStartTime())
            .append("fEndTime", getfEndTime())
            .toString();
    }
}
