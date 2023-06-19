package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 职业技能等级证书获取（学工系统）对象 tbstu_certificate
 * 
 * @author 863
 * @date 2023-05-31
 */
public class TbstuCertificate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String fMajorname;

    /** 专业代码 */
    @Excel(name = "专业代码")
    private String fMajorcode;

    /** 证书名称 */
    @Excel(name = "证书名称")
    private String fName;

    /** 发证机构 */
    @Excel(name = "发证机构")
    private String fIssuingauthority;

    /** 证书等级 */
    @Excel(name = "证书等级")
    private String fLevel;

    /** 获取人数 */
    @Excel(name = "获取人数")
    private String fObtainnum;

    /** 鉴定地点 */
    @Excel(name = "鉴定地点")
    private String fAssesssite;

    /** 社员考证人数 */
    @Excel(name = "社员考证人数")
    private Long fExamnum;

    /** 社员获证人数 */
    @Excel(name = "社员获证人数")
    private Long fObtainhum;

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
    public void setfMajorname(String fMajorname) 
    {
        this.fMajorname = fMajorname;
    }

    public String getfMajorname() 
    {
        return fMajorname;
    }
    public void setfMajorcode(String fMajorcode) 
    {
        this.fMajorcode = fMajorcode;
    }

    public String getfMajorcode() 
    {
        return fMajorcode;
    }
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    public String getfName() 
    {
        return fName;
    }
    public void setfIssuingauthority(String fIssuingauthority) 
    {
        this.fIssuingauthority = fIssuingauthority;
    }

    public String getfIssuingauthority() 
    {
        return fIssuingauthority;
    }
    public void setfLevel(String fLevel) 
    {
        this.fLevel = fLevel;
    }

    public String getfLevel() 
    {
        return fLevel;
    }
    public void setfObtainnum(String fObtainnum) 
    {
        this.fObtainnum = fObtainnum;
    }

    public String getfObtainnum() 
    {
        return fObtainnum;
    }
    public void setfAssesssite(String fAssesssite) 
    {
        this.fAssesssite = fAssesssite;
    }

    public String getfAssesssite() 
    {
        return fAssesssite;
    }
    public void setfExamnum(Long fExamnum) 
    {
        this.fExamnum = fExamnum;
    }

    public Long getfExamnum() 
    {
        return fExamnum;
    }
    public void setfObtainhum(Long fObtainhum) 
    {
        this.fObtainhum = fObtainhum;
    }

    public Long getfObtainhum() 
    {
        return fObtainhum;
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
            .append("fMajorname", getfMajorname())
            .append("fMajorcode", getfMajorcode())
            .append("fName", getfName())
            .append("fIssuingauthority", getfIssuingauthority())
            .append("fLevel", getfLevel())
            .append("fObtainnum", getfObtainnum())
            .append("fAssesssite", getfAssesssite())
            .append("fExamnum", getfExamnum())
            .append("fObtainhum", getfObtainhum())
            .append("fInformant", getfInformant())
            .toString();
    }
}
