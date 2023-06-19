package com.soft863.domain;

import java.math.BigDecimal;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学校其他支出情况对象 tbfin_other_expend
 * 
 * @author gcx
 * @date 2023-05-31
 */
public class TbfinOtherExpend extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Integer fId;

    /** 贷款余额（万元） */
    @Excel(name = "贷款余额", readConverterExp = "万=元")
    private Integer fLb;

    /** 地方政府债券余额（万元） */
    @Excel(name = "地方政府债券余额", readConverterExp = "万=元")
    private Integer fBolgb;

    /** 捐赠收入财政配比（万元） */
    @Excel(name = "捐赠收入财政配比", readConverterExp = "万=元")
    private BigDecimal fFrodi;

    /** 扶贫专项（万元） */
    @Excel(name = "扶贫专项", readConverterExp = "万=元")
    private Integer fPasp;

    /** 填报人 */
    @Excel(name = "填报人")
    private String fInformant;

    public void setfId(Integer fId) 
    {
        this.fId = fId;
    }

    public Integer getfId() 
    {
        return fId;
    }
    public void setfLb(Integer fLb) 
    {
        this.fLb = fLb;
    }

    public Integer getfLb() 
    {
        return fLb;
    }
    public void setfBolgb(Integer fBolgb) 
    {
        this.fBolgb = fBolgb;
    }

    public Integer getfBolgb() 
    {
        return fBolgb;
    }
    public void setfFrodi(BigDecimal fFrodi) 
    {
        this.fFrodi = fFrodi;
    }

    public BigDecimal getfFrodi() 
    {
        return fFrodi;
    }
    public void setfPasp(Integer fPasp) 
    {
        this.fPasp = fPasp;
    }

    public Integer getfPasp() 
    {
        return fPasp;
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
            .append("fLb", getfLb())
            .append("fBolgb", getfBolgb())
            .append("fFrodi", getfFrodi())
            .append("fPasp", getfPasp())
            .append("fInformant", getfInformant())
            .toString();
    }
}
