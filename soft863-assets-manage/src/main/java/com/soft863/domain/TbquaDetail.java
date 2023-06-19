package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 质检详情对象 tbqua_detail
 * 
 * @author cuihangbo
 * @date 2023-05-31
 */
public class TbquaDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 任务id */
    @Excel(name = "任务id")
    private Long fTaskid;

    /** 任务类型 */
    @Excel(name = "任务类型")
    private String fType;

    /** 目标数据主键 */
    @Excel(name = "目标数据主键")
    private String fDataid;

    /** 目标数据表 */
    @Excel(name = "目标数据表")
    private Long fTbname;

    /** 处理意见 */
    @Excel(name = "处理意见")
    private String fSuggestion;

    /** 是否已处理 */
    @Excel(name = "是否已处理")
    private String fStatus;

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
    public void setfType(String fType) 
    {
        this.fType = fType;
    }

    public String getfType() 
    {
        return fType;
    }
    public void setfDataid(String fDataid) 
    {
        this.fDataid = fDataid;
    }

    public String getfDataid() 
    {
        return fDataid;
    }
    public void setfTbname(Long fTbname) 
    {
        this.fTbname = fTbname;
    }

    public Long getfTbname() 
    {
        return fTbname;
    }
    public void setfSuggestion(String fSuggestion) 
    {
        this.fSuggestion = fSuggestion;
    }

    public String getfSuggestion() 
    {
        return fSuggestion;
    }
    public void setfStatus(String fStatus) 
    {
        this.fStatus = fStatus;
    }

    public String getfStatus() 
    {
        return fStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fTaskid", getfTaskid())
            .append("fType", getfType())
            .append("fDataid", getfDataid())
            .append("fTbname", getfTbname())
            .append("fSuggestion", getfSuggestion())
            .append("fStatus", getfStatus())
            .toString();
    }
}
