package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 定时任务对象 tbsyn_task
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
public class TbsynTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long fId;

    /** 任务ID */
    @Excel(name = "任务ID")
    private Long fTaskId;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String fTaskName;

    /** 状态（0正常 1暂停） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=暂停")
    private String fStatus;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fCreateTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fEndTime;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfTaskId(Long fTaskId) 
    {
        this.fTaskId = fTaskId;
    }

    public Long getfTaskId() 
    {
        return fTaskId;
    }
    public void setfTaskName(String fTaskName) 
    {
        this.fTaskName = fTaskName;
    }

    public String getfTaskName() 
    {
        return fTaskName;
    }
    public void setfStatus(String fStatus) 
    {
        this.fStatus = fStatus;
    }

    public String getfStatus() 
    {
        return fStatus;
    }
    public void setfCreateTime(Date fCreateTime) 
    {
        this.fCreateTime = fCreateTime;
    }

    public Date getfCreateTime() 
    {
        return fCreateTime;
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
            .append("fTaskId", getfTaskId())
            .append("fTaskName", getfTaskName())
            .append("fStatus", getfStatus())
            .append("fCreateTime", getfCreateTime())
            .append("fEndTime", getfEndTime())
            .toString();
    }
}
