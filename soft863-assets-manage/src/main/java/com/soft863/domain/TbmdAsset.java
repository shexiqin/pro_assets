package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 数据资产对象 tbmd_asset
 * 
 * @author wc
 * @date 2023-05-30
 */
public class TbmdAsset extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long fId;

    /** 目录编号 */
    @Excel(name = "目录编号")
    private Long fCatalogCode;

    /** 表编号 */
    @Excel(name = "表编号")
    private Long fTableCode;

    /** 表名 */
    @Excel(name = "表名")
    private String fTableName;

    /** 分类 */
    @Excel(name = "分类")
    private String fType;

    /** 是否发布 */
    @Excel(name = "是否发布")
    private Integer fDeployStatus;

    /** 数据级别 */
    @Excel(name = "数据级别")
    private Integer fGradeType;

    /** 自定义标签 */
    @Excel(name = "自定义标签")
    private String fLabelName;

    /** 创建者 */
    @Excel(name = "创建者")
    private String fCreator;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fCreateTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String fModifier;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fModifyTime;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfCatalogCode(Long fCatalogCode) 
    {
        this.fCatalogCode = fCatalogCode;
    }

    public Long getfCatalogCode() 
    {
        return fCatalogCode;
    }
    public void setfTableCode(Long fTableCode) 
    {
        this.fTableCode = fTableCode;
    }

    public Long getfTableCode() 
    {
        return fTableCode;
    }
    public void setfTableName(String fTableName) 
    {
        this.fTableName = fTableName;
    }

    public String getfTableName() 
    {
        return fTableName;
    }
    public void setfType(String fType) 
    {
        this.fType = fType;
    }

    public String getfType() 
    {
        return fType;
    }
    public void setfDeployStatus(Integer fDeployStatus) 
    {
        this.fDeployStatus = fDeployStatus;
    }

    public Integer getfDeployStatus() 
    {
        return fDeployStatus;
    }
    public void setfGradeType(Integer fGradeType) 
    {
        this.fGradeType = fGradeType;
    }

    public Integer getfGradeType() 
    {
        return fGradeType;
    }
    public void setfLabelName(String fLabelName) 
    {
        this.fLabelName = fLabelName;
    }

    public String getfLabelName() 
    {
        return fLabelName;
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
            .append("fId", getfId())
            .append("fCatalogCode", getfCatalogCode())
            .append("fTableCode", getfTableCode())
            .append("fTableName", getfTableName())
            .append("fType", getfType())
            .append("fDeployStatus", getfDeployStatus())
            .append("fGradeType", getfGradeType())
            .append("fLabelName", getfLabelName())
            .append("fCreator", getfCreator())
            .append("fCreateTime", getfCreateTime())
            .append("fModifier", getfModifier())
            .append("fModifyTime", getfModifyTime())
            .toString();
    }
}
