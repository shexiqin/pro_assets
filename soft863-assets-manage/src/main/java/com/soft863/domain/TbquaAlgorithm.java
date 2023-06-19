package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 算法规则对象 tbqua_algorithm
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public class TbquaAlgorithm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 算法规则id */
    private Long fId;

    /** 算法编码 */
    @Excel(name = "算法编码")
    private Long fCode;

    /** 算法名称 */
    @Excel(name = "算法名称")
    private String fName;

    /** 算法详情 */
    @Excel(name = "算法详情")
    private String fDetail;

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
    public void setfDetail(String fDetail) 
    {
        this.fDetail = fDetail;
    }

    public String getfDetail() 
    {
        return fDetail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fCode", getfCode())
            .append("fName", getfName())
            .append("fDetail", getfDetail())
            .toString();
    }
}
