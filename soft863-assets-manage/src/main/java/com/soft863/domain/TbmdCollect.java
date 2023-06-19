package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 资产目录收藏对象 tbmd_collect
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
public class TbmdCollect extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @Excel(name = "主键id")
    private Long fId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long fUserid;

    /** 用户名称 */
    @Excel(name = "用户名称")
    private String fUsername;

    /** 目录id */
    @Excel(name = "目录id")
    private Long fCatalogId;

    /** 目录名称 */
    @Excel(name = "目录名称")
    private String fCatalogName;

    /** 收藏时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "收藏时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fCreateTime;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfUserid(Long fUserid) 
    {
        this.fUserid = fUserid;
    }

    public Long getfUserid() 
    {
        return fUserid;
    }
    public void setfUsername(String fUsername) 
    {
        this.fUsername = fUsername;
    }

    public String getfUsername() 
    {
        return fUsername;
    }
    public void setfCatalogId(Long fCatalogId) 
    {
        this.fCatalogId = fCatalogId;
    }

    public Long getfCatalogId() 
    {
        return fCatalogId;
    }
    public void setfCatalogName(String fCatalogName) 
    {
        this.fCatalogName = fCatalogName;
    }

    public String getfCatalogName() 
    {
        return fCatalogName;
    }
    public void setfCreateTime(Date fCreateTime) 
    {
        this.fCreateTime = fCreateTime;
    }

    public Date getfCreateTime() 
    {
        return fCreateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fUserid", getfUserid())
            .append("fUsername", getfUsername())
            .append("fCatalogId", getfCatalogId())
            .append("fCatalogName", getfCatalogName())
            .append("fCreateTime", getfCreateTime())
            .toString();
    }
}
