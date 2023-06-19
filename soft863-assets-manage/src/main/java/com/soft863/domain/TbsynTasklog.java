package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 任务日志对象 tbsyn_tasklog
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
public class TbsynTasklog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID号 */
    private Long fId;

    /** 任务ID */
    @Excel(name = "任务ID")
    private Long fTaskid;

    /** 任务名 */
    @Excel(name = "任务名")
    private String fTaskName;

    /** 日志信息 */
    @Excel(name = "日志信息")
    private String fLog;

    /** 日志类型 */
    @Excel(name = "日志类型")
    private String fType;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd hh:mm:ss")
    private Date fTime;

    /** 异常信息 */
    @Excel(name = "异常信息")
    private String fException;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfTaskid(Long fTaskid) 
    {
        this.fTaskid = fTaskid;
    }

    public Long getfTaskid() 
    {
        return fTaskid;
    }
    public void setfTaskName(String fTaskName) 
    {
        this.fTaskName = fTaskName;
    }

    public String getfTaskName() 
    {
        return fTaskName;
    }
    public void setfLog(String fLog) 
    {
        this.fLog = fLog;
    }

    public String getfLog() 
    {
        return fLog;
    }
    public void setfType(String fType) 
    {
        this.fType = fType;
    }

    public String getfType() 
    {
        return fType;
    }
    public void setfTime(Date fTime) 
    {
        this.fTime = fTime;
    }

    public Date getfTime() 
    {
        return fTime;
    }
    public void setfException(String fException) 
    {
        this.fException = fException;
    }

    public String getfException() 
    {
        return fException;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fTaskid", getfTaskid())
            .append("fTaskName", getfTaskName())
            .append("fLog", getfLog())
            .append("fType", getfType())
            .append("fTime", getfTime())
            .append("fException", getfException())
            .toString();
    }
}
