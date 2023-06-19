package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 资产共享对象 tbmd_share
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public class TbmdShare extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资产共享 */
    @Excel(name = "资产共享")
    private Long id;

    /** 申请人名称 */
    @Excel(name = "申请人名称")
    private String fUserName;

    /** 申请人Id */
    @Excel(name = "申请人Id")
    private String fUserId;

    /** 申请组织编码 */
    @Excel(name = "申请组织编码")
    private String fOrgCode;

    /** 申请组织名称 */
    @Excel(name = "申请组织名称")
    private String fAppOrgName;

    /** 共享类型：0-部门内共享，1-公司内共享，2-对外共享 */
    @Excel(name = "共享类型：0-部门内共享，1-公司内共享，2-对外共享")
    private Long fShareType;

    /** 需求类型：0-API接口服务，1-数据导出服务，2-数据分析应用 */
    @Excel(name = "需求类型：0-API接口服务，1-数据导出服务，2-数据分析应用")
    private Long fRequireType;

    /** 使用频度：0-日，1-月，2-季，3-年 */
    @Excel(name = "使用频度：0-日，1-月，2-季，3-年")
    private Long fFrequency;

    /** 使用期限：0-长期使用，1-临时使用 */
    @Excel(name = "使用期限：0-长期使用，1-临时使用")
    private Long fUsePeriod;

    /** 数据提供部门编码 */
    @Excel(name = "数据提供部门编码")
    private String fDataOrgCode;

    /** 数据提供部门名称 */
    @Excel(name = "数据提供部门名称")
    private String fDataOrgName;

    /** 申请开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fAppStartTime;

    /** 是否脱敏：0-是，1-否 */
    @Excel(name = "是否脱敏：0-是，1-否")
    private Long fDesen;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String fPhone;

    /** 申请单名称 */
    @Excel(name = "申请单名称")
    private String fAppName;

    /** 申请原因 */
    @Excel(name = "申请原因")
    private String fAppReason;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fCreateTime;

    /** 创建人 */
    @Excel(name = "创建人")
    private String fCreator;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fModifyTime;

    /** 修改人 */
    @Excel(name = "修改人")
    private String fModifier;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setfUserName(String fUserName) 
    {
        this.fUserName = fUserName;
    }

    public String getfUserName() 
    {
        return fUserName;
    }
    public void setfUserId(String fUserId) 
    {
        this.fUserId = fUserId;
    }

    public String getfUserId() 
    {
        return fUserId;
    }
    public void setfOrgCode(String fOrgCode) 
    {
        this.fOrgCode = fOrgCode;
    }

    public String getfOrgCode() 
    {
        return fOrgCode;
    }
    public void setfAppOrgName(String fAppOrgName) 
    {
        this.fAppOrgName = fAppOrgName;
    }

    public String getfAppOrgName() 
    {
        return fAppOrgName;
    }
    public void setfShareType(Long fShareType) 
    {
        this.fShareType = fShareType;
    }

    public Long getfShareType() 
    {
        return fShareType;
    }
    public void setfRequireType(Long fRequireType) 
    {
        this.fRequireType = fRequireType;
    }

    public Long getfRequireType() 
    {
        return fRequireType;
    }
    public void setfFrequency(Long fFrequency) 
    {
        this.fFrequency = fFrequency;
    }

    public Long getfFrequency() 
    {
        return fFrequency;
    }
    public void setfUsePeriod(Long fUsePeriod) 
    {
        this.fUsePeriod = fUsePeriod;
    }

    public Long getfUsePeriod() 
    {
        return fUsePeriod;
    }
    public void setfDataOrgCode(String fDataOrgCode) 
    {
        this.fDataOrgCode = fDataOrgCode;
    }

    public String getfDataOrgCode() 
    {
        return fDataOrgCode;
    }
    public void setfDataOrgName(String fDataOrgName) 
    {
        this.fDataOrgName = fDataOrgName;
    }

    public String getfDataOrgName() 
    {
        return fDataOrgName;
    }
    public void setfAppStartTime(Date fAppStartTime) 
    {
        this.fAppStartTime = fAppStartTime;
    }

    public Date getfAppStartTime() 
    {
        return fAppStartTime;
    }
    public void setfDesen(Long fDesen) 
    {
        this.fDesen = fDesen;
    }

    public Long getfDesen() 
    {
        return fDesen;
    }
    public void setfPhone(String fPhone) 
    {
        this.fPhone = fPhone;
    }

    public String getfPhone() 
    {
        return fPhone;
    }
    public void setfAppName(String fAppName) 
    {
        this.fAppName = fAppName;
    }

    public String getfAppName() 
    {
        return fAppName;
    }
    public void setfAppReason(String fAppReason) 
    {
        this.fAppReason = fAppReason;
    }

    public String getfAppReason() 
    {
        return fAppReason;
    }
    public void setfCreateTime(Date fCreateTime) 
    {
        this.fCreateTime = fCreateTime;
    }

    public Date getfCreateTime() 
    {
        return fCreateTime;
    }
    public void setfCreator(String fCreator) 
    {
        this.fCreator = fCreator;
    }

    public String getfCreator() 
    {
        return fCreator;
    }
    public void setfModifyTime(Date fModifyTime) 
    {
        this.fModifyTime = fModifyTime;
    }

    public Date getfModifyTime() 
    {
        return fModifyTime;
    }
    public void setfModifier(String fModifier) 
    {
        this.fModifier = fModifier;
    }

    public String getfModifier() 
    {
        return fModifier;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fUserName", getfUserName())
            .append("fUserId", getfUserId())
            .append("fOrgCode", getfOrgCode())
            .append("fAppOrgName", getfAppOrgName())
            .append("fShareType", getfShareType())
            .append("fRequireType", getfRequireType())
            .append("fFrequency", getfFrequency())
            .append("fUsePeriod", getfUsePeriod())
            .append("fDataOrgCode", getfDataOrgCode())
            .append("fDataOrgName", getfDataOrgName())
            .append("fAppStartTime", getfAppStartTime())
            .append("fDesen", getfDesen())
            .append("fPhone", getfPhone())
            .append("fAppName", getfAppName())
            .append("fAppReason", getfAppReason())
            .append("fCreateTime", getfCreateTime())
            .append("fCreator", getfCreator())
            .append("fModifyTime", getfModifyTime())
            .append("fModifier", getfModifier())
            .toString();
    }
}
