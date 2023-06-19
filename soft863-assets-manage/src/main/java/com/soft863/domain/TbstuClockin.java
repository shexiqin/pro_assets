package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学生打卡对象 tbstu_clockin
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public class TbstuClockin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long fId;

    /** 学生ID */
    @Excel(name = "学生ID")
    private Long fStuid;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String fStuname;

    /** 打卡地点 */
    @Excel(name = "打卡地点")
    private String fLocation;

    /** 打卡时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "打卡时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fClocktime;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfStuid(Long fStuid) 
    {
        this.fStuid = fStuid;
    }

    public Long getfStuid() 
    {
        return fStuid;
    }
    public void setfStuname(String fStuname) 
    {
        this.fStuname = fStuname;
    }

    public String getfStuname() 
    {
        return fStuname;
    }
    public void setfLocation(String fLocation) 
    {
        this.fLocation = fLocation;
    }

    public String getfLocation() 
    {
        return fLocation;
    }
    public void setfClocktime(Date fClocktime) 
    {
        this.fClocktime = fClocktime;
    }

    public Date getfClocktime() 
    {
        return fClocktime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fStuid", getfStuid())
            .append("fStuname", getfStuname())
            .append("fLocation", getfLocation())
            .append("fClocktime", getfClocktime())
            .toString();
    }
}
