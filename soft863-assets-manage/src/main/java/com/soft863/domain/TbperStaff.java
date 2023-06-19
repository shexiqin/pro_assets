package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 人事数据对象 tbper_staff
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public class TbperStaff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private Long fId;

    /** 院系部名称 */
    @Excel(name = "院系部名称")
    private String fDepartmentname;

    /** 编号 */
    @Excel(name = "编号")
    private String fNumbering;

    /** 姓名 */
    @Excel(name = "姓名")
    private String fName;

    /** 性别 */
    @Excel(name = "性别")
    private String fSex;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String fBirthdate;

    /** 学历 */
    @Excel(name = "学历")
    private String fDegree;

    /** 学位 */
    @Excel(name = "学位")
    private String fAcademicdegrees;

    /** 职务 */
    @Excel(name = "职务")
    private String fDuties;

    /** 人员类别 */
    @Excel(name = "人员类别")
    private String fPersonnelcategory;

    /** 专业领域 */
    @Excel(name = "专业领域")
    private String fSpecialized;

    /** 研究特长 */
    @Excel(name = "研究特长")
    private String fDevelopment;

    /** 发证单位 */
    @Excel(name = "发证单位")
    private String fLssuingunit;

    /** 获取日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "获取日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fGetdate;

    /** 专业技术职务 */
    @Excel(name = "专业技术职务")
    private String fExpertise;

    /** 职业资格证书 */
    @Excel(name = "职业资格证书")
    private String fCertificateeligibility;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String fProfessionalname;

    /** 行政所属专业 */
    @Excel(name = "行政所属专业")
    private String fAdministrativemajor;

    /** 教学名师 */
    @Excel(name = "教学名师")
    private String fFamousteachers;

    /** 是否专业 */
    @Excel(name = "是否专业")
    private String fFlgHead;

    /** 是否专业带头人 */
    @Excel(name = "是否专业带头人")
    private String fFlgLeaders;

    /** 担任年限 */
    @Excel(name = "担任年限")
    private String fYearsservice;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String fPoliticalStatus;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfDepartmentname(String fDepartmentname) 
    {
        this.fDepartmentname = fDepartmentname;
    }

    public String getfDepartmentname() 
    {
        return fDepartmentname;
    }
    public void setfNumbering(String fNumbering) 
    {
        this.fNumbering = fNumbering;
    }

    public String getfNumbering() 
    {
        return fNumbering;
    }
    public void setfName(String fName) 
    {
        this.fName = fName;
    }

    public String getfName() 
    {
        return fName;
    }
    public void setfSex(String fSex) 
    {
        this.fSex = fSex;
    }

    public String getfSex() 
    {
        return fSex;
    }
    public void setfBirthdate(String fBirthdate) 
    {
        this.fBirthdate = fBirthdate;
    }

    public String getfBirthdate() 
    {
        return fBirthdate;
    }
    public void setfDegree(String fDegree) 
    {
        this.fDegree = fDegree;
    }

    public String getfDegree() 
    {
        return fDegree;
    }
    public void setfAcademicdegrees(String fAcademicdegrees) 
    {
        this.fAcademicdegrees = fAcademicdegrees;
    }

    public String getfAcademicdegrees() 
    {
        return fAcademicdegrees;
    }
    public void setfDuties(String fDuties) 
    {
        this.fDuties = fDuties;
    }

    public String getfDuties() 
    {
        return fDuties;
    }
    public void setfPersonnelcategory(String fPersonnelcategory) 
    {
        this.fPersonnelcategory = fPersonnelcategory;
    }

    public String getfPersonnelcategory() 
    {
        return fPersonnelcategory;
    }
    public void setfSpecialized(String fSpecialized) 
    {
        this.fSpecialized = fSpecialized;
    }

    public String getfSpecialized() 
    {
        return fSpecialized;
    }
    public void setfDevelopment(String fDevelopment) 
    {
        this.fDevelopment = fDevelopment;
    }

    public String getfDevelopment() 
    {
        return fDevelopment;
    }
    public void setfLssuingunit(String fLssuingunit) 
    {
        this.fLssuingunit = fLssuingunit;
    }

    public String getfLssuingunit() 
    {
        return fLssuingunit;
    }
    public void setfGetdate(Date fGetdate) 
    {
        this.fGetdate = fGetdate;
    }

    public Date getfGetdate() 
    {
        return fGetdate;
    }
    public void setfExpertise(String fExpertise) 
    {
        this.fExpertise = fExpertise;
    }

    public String getfExpertise() 
    {
        return fExpertise;
    }
    public void setfCertificateeligibility(String fCertificateeligibility) 
    {
        this.fCertificateeligibility = fCertificateeligibility;
    }

    public String getfCertificateeligibility() 
    {
        return fCertificateeligibility;
    }
    public void setfProfessionalname(String fProfessionalname) 
    {
        this.fProfessionalname = fProfessionalname;
    }

    public String getfProfessionalname() 
    {
        return fProfessionalname;
    }
    public void setfAdministrativemajor(String fAdministrativemajor) 
    {
        this.fAdministrativemajor = fAdministrativemajor;
    }

    public String getfAdministrativemajor() 
    {
        return fAdministrativemajor;
    }
    public void setfFamousteachers(String fFamousteachers) 
    {
        this.fFamousteachers = fFamousteachers;
    }

    public String getfFamousteachers() 
    {
        return fFamousteachers;
    }
    public void setfFlgHead(String fFlgHead) 
    {
        this.fFlgHead = fFlgHead;
    }

    public String getfFlgHead() 
    {
        return fFlgHead;
    }
    public void setfFlgLeaders(String fFlgLeaders) 
    {
        this.fFlgLeaders = fFlgLeaders;
    }

    public String getfFlgLeaders() 
    {
        return fFlgLeaders;
    }
    public void setfYearsservice(String fYearsservice) 
    {
        this.fYearsservice = fYearsservice;
    }

    public String getfYearsservice() 
    {
        return fYearsservice;
    }
    public void setfPoliticalStatus(String fPoliticalStatus) 
    {
        this.fPoliticalStatus = fPoliticalStatus;
    }

    public String getfPoliticalStatus() 
    {
        return fPoliticalStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fDepartmentname", getfDepartmentname())
            .append("fNumbering", getfNumbering())
            .append("fName", getfName())
            .append("fSex", getfSex())
            .append("fBirthdate", getfBirthdate())
            .append("fDegree", getfDegree())
            .append("fAcademicdegrees", getfAcademicdegrees())
            .append("fDuties", getfDuties())
            .append("fPersonnelcategory", getfPersonnelcategory())
            .append("fSpecialized", getfSpecialized())
            .append("fDevelopment", getfDevelopment())
            .append("fLssuingunit", getfLssuingunit())
            .append("fGetdate", getfGetdate())
            .append("fExpertise", getfExpertise())
            .append("fCertificateeligibility", getfCertificateeligibility())
            .append("fProfessionalname", getfProfessionalname())
            .append("fAdministrativemajor", getfAdministrativemajor())
            .append("fFamousteachers", getfFamousteachers())
            .append("fFlgHead", getfFlgHead())
            .append("fFlgLeaders", getfFlgLeaders())
            .append("fYearsservice", getfYearsservice())
            .append("fPoliticalStatus", getfPoliticalStatus())
            .toString();
    }
}
