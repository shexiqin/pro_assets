package com.soft863.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 资产目录对象 tbmd_catalog
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
public class TbmdCatalog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 目录id */
    private Long fDirectId;

    /** 目录名称 */
    @Excel(name = "目录名称")
    private String fName;

    /** 目录编码 */
    @Excel(name = "目录编码")
    private Long fCode;

    /** 上级目录id */
    @Excel(name = "上级目录id")
    private Long fParentId;

    /** 目录描述 */
    @Excel(name = "目录描述")
    private String fDesc;

    /** 状态 */
    @Excel(name = "状态")
    private Integer fState;

    /** 创建人 */
    @Excel(name = "创建人")
    private String fCreator;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fCreateTime;

    /** 修改人 */
    @Excel(name = "修改人")
    private String fModifier;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fModifyTime;

    public void setfDirectId(Long fDirectId) 
    {
        this.fDirectId = fDirectId;
    }

    public Long getfDirectId() 
    {
        return fDirectId;
    }
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    public String getfName() 
    {
        return fName;
    }
    public void setfCode(Long fCode) 
    {
        this.fCode = fCode;
    }

    public Long getfCode() 
    {
        return fCode;
    }
    public void setfParentId(Long fParentId) 
    {
        this.fParentId = fParentId;
    }

    public Long getfParentId() 
    {
        return fParentId;
    }
    public void setfDesc(String fDesc) 
    {
        this.fDesc = fDesc;
    }

    public String getfDesc() 
    {
        return fDesc;
    }
    public void setfState(Integer fState) 
    {
        this.fState = fState;
    }

    public Integer getfState() 
    {
        return fState;
    }
    public void setfCreator(String fCreator) 
    {
        this.fCreator = fCreator;
    }

    public String getfCreator() 
    {
        return fCreator;
    }
    public void setfCreateTime(Date fCreateTime) 
    {
        this.fCreateTime = fCreateTime;
    }

    public Date getfCreateTime() 
    {
        return fCreateTime;
    }
    public void setfModifier(String fModifier) 
    {
        this.fModifier = fModifier;
    }

    public String getfModifier() 
    {
        return fModifier;
    }
    public void setfModifyTime(Date fModifyTime) 
    {
        this.fModifyTime = fModifyTime;
    }

    public Date getfModifyTime() 
    {
        return fModifyTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fDirectId", getfDirectId())
            .append("fName", getfName())
            .append("fCode", getfCode())
            .append("fParentId", getfParentId())
            .append("fDesc", getfDesc())
            .append("fState", getfState())
            .append("fCreator", getfCreator())
            .append("fCreateTime", getfCreateTime())
            .append("fModifier", getfModifier())
            .append("fModifyTime", getfModifyTime())
            .toString();
    }
}
