package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学校其他收入情况（财务系统）对象 tbfin_other_income
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public class TbfinOtherIncome extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long fId;

    /** 信息网络设备采购（万元） */
    @Excel(name = "信息网络设备采购", readConverterExp = "万=元")
    private Long fPoine;

    /** 国际交流合作经费（万元） */
    @Excel(name = "国际交流合作经费", readConverterExp = "万=元")
    private Long fIeacf;

    /** 混合所有制办学经费（万元） */
    @Excel(name = "混合所有制办学经费", readConverterExp = "万=元")
    private Long fMoef;

    /** 计提政府债券还本资金（万元） */
    @Excel(name = "计提政府债券还本资金", readConverterExp = "万=元")
    private Long fWogbrf;

    /** 填报人 */
    @Excel(name = "填报人")
    private String fInformant;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfPoine(Long fPoine) 
    {
        this.fPoine = fPoine;
    }

    public Long getfPoine() 
    {
        return fPoine;
    }
    public void setfIeacf(Long fIeacf) 
    {
        this.fIeacf = fIeacf;
    }

    public Long getfIeacf() 
    {
        return fIeacf;
    }
    public void setfMoef(Long fMoef) 
    {
        this.fMoef = fMoef;
    }

    public Long getfMoef() 
    {
        return fMoef;
    }
    public void setfWogbrf(Long fWogbrf) 
    {
        this.fWogbrf = fWogbrf;
    }

    public Long getfWogbrf() 
    {
        return fWogbrf;
    }
    public void setfInformant(String fInformant) 
    {
        this.fInformant = fInformant;
    }

    public String getfInformant() 
    {
        return fInformant;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fPoine", getfPoine())
            .append("fIeacf", getfIeacf())
            .append("fMoef", getfMoef())
            .append("fWogbrf", getfWogbrf())
            .append("fInformant", getfInformant())
            .toString();
    }
}
