package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学校经费收入对象 tbfin_income
 * 
 * @author zpc
 * @date 2023-05-31
 */
public class TbfinIncome extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long fId;

    /** 学费收入 */
    @Excel(name = "学费收入")
    private Long fTuition;

    /** 住宿费收入 */
    @Excel(name = "住宿费收入")
    private Long fAccommodationFee;

    /** 培训费收入 */
    @Excel(name = "培训费收入")
    private Long fTrainingFee;

    /** 成人教育收费收入 */
    @Excel(name = "成人教育收费收入")
    private Long fAdultEducationFee;

    /** 其他教育事业收入 */
    @Excel(name = "其他教育事业收入")
    private Long fOtherEducationFee;

    /** 横向科研事业收入 */
    @Excel(name = "横向科研事业收入")
    private Long fHorizontalResearchFee;

    /** 纵向科研事业收入 */
    @Excel(name = "纵向科研事业收入")
    private Long fVerticalResearchFee;

    /** 其他科研事业收入 */
    @Excel(name = "其他科研事业收入")
    private Long fOtherResearchFee;

    /** 财政生均拨款收入 */
    @Excel(name = "财政生均拨款收入")
    private Long fAverageFinancialExpense;

    /** 财政专项拨款收入 */
    @Excel(name = "财政专项拨款收入")
    private Long fSpecialFinancialExpense;

    /** 政府性基金收入 */
    @Excel(name = "政府性基金收入")
    private Long fGovernmentFunds;

    /** 国有资本经营预算收入 */
    @Excel(name = "国有资本经营预算收入")
    private Long fCapitalOperationExpense;

    /** 上级补助收入（万元） */
    @Excel(name = "上级补助收入", readConverterExp = "万=元")
    private Long fSuperiorSubsidy;

    /** 非同级财政拨款收入（万元） */
    @Excel(name = "非同级财政拨款收入", readConverterExp = "万=元")
    private Long fUnpeerFinancialAllocation;

    /** 企业办学中企业拨款（万元） */
    @Excel(name = "企业办学中企业拨款", readConverterExp = "万=元")
    private Long fEnterpriseEducationExpense;

    /** 社会培训收入 */
    @Excel(name = "社会培训收入")
    private Long fSocialTrainingExpense;

    /** 技术产权交易收入 */
    @Excel(name = "技术产权交易收入")
    private Long fTechnologyTransactionFee;

    /** 其他社会服务收入 */
    @Excel(name = "其他社会服务收入")
    private Long fOtherServicesFee;

    /** 校办企业投资收益 */
    @Excel(name = "校办企业投资收益")
    private Long fSchoolEnterpriseFee;

    /** 其他投资收益 */
    @Excel(name = "其他投资收益")
    private Long fOtherFunding;

    /** 校企合作捐赠收入 */
    @Excel(name = "校企合作捐赠收入")
    private Long fSchoolEnterpriseDonation;

    /** 现代学徒制捐赠收入 */
    @Excel(name = "现代学徒制捐赠收入")
    private Long fModernApprenticeDonation;

    /** 其他捐赠收入 */
    @Excel(name = "其他捐赠收入")
    private Long fOtherDonation;

    /** 其他收入（万元） */
    @Excel(name = "其他收入", readConverterExp = "万=元")
    private Long fOtherIncome;

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
    public void setfTuition(Long fTuition) 
    {
        this.fTuition = fTuition;
    }

    public Long getfTuition() 
    {
        return fTuition;
    }
    public void setfAccommodationFee(Long fAccommodationFee) 
    {
        this.fAccommodationFee = fAccommodationFee;
    }

    public Long getfAccommodationFee() 
    {
        return fAccommodationFee;
    }
    public void setfTrainingFee(Long fTrainingFee) 
    {
        this.fTrainingFee = fTrainingFee;
    }

    public Long getfTrainingFee() 
    {
        return fTrainingFee;
    }
    public void setfAdultEducationFee(Long fAdultEducationFee) 
    {
        this.fAdultEducationFee = fAdultEducationFee;
    }

    public Long getfAdultEducationFee() 
    {
        return fAdultEducationFee;
    }
    public void setfOtherEducationFee(Long fOtherEducationFee) 
    {
        this.fOtherEducationFee = fOtherEducationFee;
    }

    public Long getfOtherEducationFee() 
    {
        return fOtherEducationFee;
    }
    public void setfHorizontalResearchFee(Long fHorizontalResearchFee) 
    {
        this.fHorizontalResearchFee = fHorizontalResearchFee;
    }

    public Long getfHorizontalResearchFee() 
    {
        return fHorizontalResearchFee;
    }
    public void setfVerticalResearchFee(Long fVerticalResearchFee) 
    {
        this.fVerticalResearchFee = fVerticalResearchFee;
    }

    public Long getfVerticalResearchFee() 
    {
        return fVerticalResearchFee;
    }
    public void setfOtherResearchFee(Long fOtherResearchFee) 
    {
        this.fOtherResearchFee = fOtherResearchFee;
    }

    public Long getfOtherResearchFee() 
    {
        return fOtherResearchFee;
    }
    public void setfAverageFinancialExpense(Long fAverageFinancialExpense) 
    {
        this.fAverageFinancialExpense = fAverageFinancialExpense;
    }

    public Long getfAverageFinancialExpense() 
    {
        return fAverageFinancialExpense;
    }
    public void setfSpecialFinancialExpense(Long fSpecialFinancialExpense) 
    {
        this.fSpecialFinancialExpense = fSpecialFinancialExpense;
    }

    public Long getfSpecialFinancialExpense() 
    {
        return fSpecialFinancialExpense;
    }
    public void setfGovernmentFunds(Long fGovernmentFunds) 
    {
        this.fGovernmentFunds = fGovernmentFunds;
    }

    public Long getfGovernmentFunds() 
    {
        return fGovernmentFunds;
    }
    public void setfCapitalOperationExpense(Long fCapitalOperationExpense) 
    {
        this.fCapitalOperationExpense = fCapitalOperationExpense;
    }

    public Long getfCapitalOperationExpense() 
    {
        return fCapitalOperationExpense;
    }
    public void setfSuperiorSubsidy(Long fSuperiorSubsidy) 
    {
        this.fSuperiorSubsidy = fSuperiorSubsidy;
    }

    public Long getfSuperiorSubsidy() 
    {
        return fSuperiorSubsidy;
    }
    public void setfUnpeerFinancialAllocation(Long fUnpeerFinancialAllocation) 
    {
        this.fUnpeerFinancialAllocation = fUnpeerFinancialAllocation;
    }

    public Long getfUnpeerFinancialAllocation() 
    {
        return fUnpeerFinancialAllocation;
    }
    public void setfEnterpriseEducationExpense(Long fEnterpriseEducationExpense) 
    {
        this.fEnterpriseEducationExpense = fEnterpriseEducationExpense;
    }

    public Long getfEnterpriseEducationExpense() 
    {
        return fEnterpriseEducationExpense;
    }
    public void setfSocialTrainingExpense(Long fSocialTrainingExpense) 
    {
        this.fSocialTrainingExpense = fSocialTrainingExpense;
    }

    public Long getfSocialTrainingExpense() 
    {
        return fSocialTrainingExpense;
    }
    public void setfTechnologyTransactionFee(Long fTechnologyTransactionFee) 
    {
        this.fTechnologyTransactionFee = fTechnologyTransactionFee;
    }

    public Long getfTechnologyTransactionFee() 
    {
        return fTechnologyTransactionFee;
    }
    public void setfOtherServicesFee(Long fOtherServicesFee) 
    {
        this.fOtherServicesFee = fOtherServicesFee;
    }

    public Long getfOtherServicesFee() 
    {
        return fOtherServicesFee;
    }
    public void setfSchoolEnterpriseFee(Long fSchoolEnterpriseFee) 
    {
        this.fSchoolEnterpriseFee = fSchoolEnterpriseFee;
    }

    public Long getfSchoolEnterpriseFee() 
    {
        return fSchoolEnterpriseFee;
    }
    public void setfOtherFunding(Long fOtherFunding) 
    {
        this.fOtherFunding = fOtherFunding;
    }

    public Long getfOtherFunding() 
    {
        return fOtherFunding;
    }
    public void setfSchoolEnterpriseDonation(Long fSchoolEnterpriseDonation) 
    {
        this.fSchoolEnterpriseDonation = fSchoolEnterpriseDonation;
    }

    public Long getfSchoolEnterpriseDonation() 
    {
        return fSchoolEnterpriseDonation;
    }
    public void setfModernApprenticeDonation(Long fModernApprenticeDonation) 
    {
        this.fModernApprenticeDonation = fModernApprenticeDonation;
    }

    public Long getfModernApprenticeDonation() 
    {
        return fModernApprenticeDonation;
    }
    public void setfOtherDonation(Long fOtherDonation) 
    {
        this.fOtherDonation = fOtherDonation;
    }

    public Long getfOtherDonation() 
    {
        return fOtherDonation;
    }
    public void setfOtherIncome(Long fOtherIncome) 
    {
        this.fOtherIncome = fOtherIncome;
    }

    public Long getfOtherIncome() 
    {
        return fOtherIncome;
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
            .append("fTuition", getfTuition())
            .append("fAccommodationFee", getfAccommodationFee())
            .append("fTrainingFee", getfTrainingFee())
            .append("fAdultEducationFee", getfAdultEducationFee())
            .append("fOtherEducationFee", getfOtherEducationFee())
            .append("fHorizontalResearchFee", getfHorizontalResearchFee())
            .append("fVerticalResearchFee", getfVerticalResearchFee())
            .append("fOtherResearchFee", getfOtherResearchFee())
            .append("fAverageFinancialExpense", getfAverageFinancialExpense())
            .append("fSpecialFinancialExpense", getfSpecialFinancialExpense())
            .append("fGovernmentFunds", getfGovernmentFunds())
            .append("fCapitalOperationExpense", getfCapitalOperationExpense())
            .append("fSuperiorSubsidy", getfSuperiorSubsidy())
            .append("fUnpeerFinancialAllocation", getfUnpeerFinancialAllocation())
            .append("fEnterpriseEducationExpense", getfEnterpriseEducationExpense())
            .append("fSocialTrainingExpense", getfSocialTrainingExpense())
            .append("fTechnologyTransactionFee", getfTechnologyTransactionFee())
            .append("fOtherServicesFee", getfOtherServicesFee())
            .append("fSchoolEnterpriseFee", getfSchoolEnterpriseFee())
            .append("fOtherFunding", getfOtherFunding())
            .append("fSchoolEnterpriseDonation", getfSchoolEnterpriseDonation())
            .append("fModernApprenticeDonation", getfModernApprenticeDonation())
            .append("fOtherDonation", getfOtherDonation())
            .append("fOtherIncome", getfOtherIncome())
            .append("fInformant", getfInformant())
            .toString();
    }
}
