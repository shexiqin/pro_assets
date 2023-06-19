package com.soft863.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 学生一卡通(学工系统)对象 tbstu_card
 * 
 * @author ruoyi
 * @date 2023-06-05
 */
public class TbstuCard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long fId;

    /** 学生卡号 */
    @Excel(name = "学生卡号")
    private String fCardid;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String fSname;

    /** 学生性别 */
    @Excel(name = "学生性别")
    private Long fSex;

    /** 剩余金额 */
    @Excel(name = "剩余金额")
    private Long fRemaining;

    /** 消费金额 */
    @Excel(name = "消费金额")
    private Long fConsumption;

    /** 消费时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "消费时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date fTime;

    /** 卡机号 */
    @Excel(name = "卡机号")
    private String fCardnum;

    /** 归属单位 */
    @Excel(name = "归属单位")
    private String fLocation;

    /** 消费类型 */
    @Excel(name = "消费类型")
    private String fType;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfCardid(String fCardid) 
    {
        this.fCardid = fCardid;
    }

    public String getfCardid() 
    {
        return fCardid;
    }
    public void setfSname(String fSname) 
    {
        this.fSname = fSname;
    }

    public String getfSname() 
    {
        return fSname;
    }
    public void setfSex(Long fSex) 
    {
        this.fSex = fSex;
    }

    public Long getfSex() 
    {
        return fSex;
    }
    public void setfRemaining(Long fRemaining) 
    {
        this.fRemaining = fRemaining;
    }

    public Long getfRemaining() 
    {
        return fRemaining;
    }
    public void setfConsumption(Long fConsumption) 
    {
        this.fConsumption = fConsumption;
    }

    public Long getfConsumption() 
    {
        return fConsumption;
    }
    public void setfTime(Date fTime) 
    {
        this.fTime = fTime;
    }

    public Date getfTime() 
    {
        return fTime;
    }
    public void setfCardnum(String fCardnum) 
    {
        this.fCardnum = fCardnum;
    }

    public String getfCardnum() 
    {
        return fCardnum;
    }
    public void setfLocation(String fLocation) 
    {
        this.fLocation = fLocation;
    }

    public String getfLocation() 
    {
        return fLocation;
    }
    public void setfType(String fType) 
    {
        this.fType = fType;
    }

    public String getfType() 
    {
        return fType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fCardid", getfCardid())
            .append("fSname", getfSname())
            .append("fSex", getfSex())
            .append("fRemaining", getfRemaining())
            .append("fConsumption", getfConsumption())
            .append("fTime", getfTime())
            .append("fCardnum", getfCardnum())
            .append("fLocation", getfLocation())
            .append("fType", getfType())
            .toString();
    }
}
