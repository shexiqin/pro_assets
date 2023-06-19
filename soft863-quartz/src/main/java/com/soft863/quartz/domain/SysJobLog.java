package com.soft863.quartz.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;

/**
 * 定时任务调度日志表 sys_job_log
 * 
 * @author ruoyi
 */
public class SysJobLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 日志序号 */
    @Excel(name = "日志序号")
    private Long fID;

    /** 任务id */
    @Excel(name = "任务id")
    private Long fTaskId;

    @Excel(name = "任务名称")
    private String fTaskName;

    /** 日志信息 */
    @Excel(name = "日志信息")
    private String fLog;

    /** 日志类型（0正常 1失败） */
    @Excel(name = "日志类型", readConverterExp = "（0正常 1失败）")
    private String fType;

    @Excel(name = "异常信息")
    private String fException;

    /** 开始时间 */
    private Date fTime;

    public Long getfID() {
        return fID;
    }

    public void setfID(Long fID) {
        this.fID = fID;
    }

    public Long getfTaskId() {
        return fTaskId;
    }

    public void setfTaskId(Long fTaskId) {
        this.fTaskId = fTaskId;
    }

    public String getfTaskName() {
        return fTaskName;
    }

    public void setfTaskName(String fTaskName) {
        this.fTaskName = fTaskName;
    }

    public String getfLog() {
        return fLog;
    }

    public void setfLog(String fLog) {
        this.fLog = fLog;
    }

    public String getfType() {
        return fType;
    }

    public String getfException() {
        return fException;
    }

    public void setfException(String fException) {
        this.fException = fException;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public Date getfTime() {
        return fTime;
    }

    public void setfTime(Date fTime) {
        this.fTime = fTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("fID",getfID())
                .append("fTaskId",getfTaskId())
                .append("fTaskName",getfTaskName())
                .append("fLog",getfLog())
                .append("fType",getfType())
                .append("fException",getfException())
                .append("fTime",getfTime())
            .toString();
    }
}
