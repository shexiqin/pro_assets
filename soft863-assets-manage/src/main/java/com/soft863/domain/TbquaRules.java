package com.soft863.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 质检规则对象 tbqua_rules
 * 
 * @author cuihangbo
 * @date 2023-06-06
 */
public class TbquaRules extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规则ID */
    private Long fId;

    /** 规则编码 */
    @Excel(name = "规则编码")
    private Long fCode;

    /** 规则名称 */
    @Excel(name = "规则名称")
    private String fName;

    /** 描述 */
    @Excel(name = "描述")
    private String fDescription;

    /** 算法编码 */
    @Excel(name = "算法编码")
    private String fAlgcode;

    /** 创建人 */
    @Excel(name = "创建人")
    private String fCreator;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fDate;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfCode(Long fCode) 
    {
        this.fCode = fCode;
    }

    public Long getfCode() 
    {
        return fCode;
    }
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    public String getfName() 
    {
        return fName;
    }
    public void setfDescription(String fDescription) 
    {
        this.fDescription = fDescription;
    }

    public String getfDescription() 
    {
        return fDescription;
    }
    public void setfAlgcode(String fAlgcode)
    {
        this.fAlgcode = fAlgcode;
    }

    public String getfAlgcode()
    {
        return fAlgcode;
    }
    public void setfCreator(String fCreator) 
    {
        this.fCreator = fCreator;
    }

    public String getfCreator() 
    {
        return fCreator;
    }
    public void setfDate(Date fDate) 
    {
        this.fDate = fDate;
    }

    public Date getfDate() 
    {
        return fDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fCode", getfCode())
            .append("fName", getfName())
            .append("fDescription", getfDescription())
            .append("fAlgcode", getfAlgcode())
            .append("fCreator", getfCreator())
            .append("fDate", getfDate())
            .toString();
    }
}
