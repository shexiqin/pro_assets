package com.soft863.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学生画像对象 tbdia_student
 *
 * @author 863
 * @date 2023-06-03
 */
public class TbdiaStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long fId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String fName;

    /** 学号 */
    @Excel(name = "学号")
    private String fNo;

    /** 性别 */
    @Excel(name = "性别")
    private String fSex;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fBirth;

    /** 院系 */
    @Excel(name = "院系")
    private String fFaculties;

    /** 班级 */
    @Excel(name = "班级")
    private String fClazz;

    /** 专业 */
    @Excel(name = "专业")
    private String fMajor;

    /** 现在年级 */
    @Excel(name = "现在年级")
    private String fNowgrade;

    /** 学制 */
    @Excel(name = "学制")
    private String fAcademic;

    /** 民族 */
    @Excel(name = "民族")
    private String fNationality;

    /** 身份证件号 */
    @Excel(name = "身份证件号")
    private String fCardid;

    /** 出生地 */
    @Excel(name = "出生地")
    private String fBirthplace;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String fPoliticsstatus;

    /** 家庭经济情况 */
    @Excel(name = "家庭经济情况")
    private String fFamMoney;

    /** 学生类别 */
    @Excel(name = "学生类别")
    private String fStucategory;

    /** 学分绩点 */
    @Excel(name = "学分绩点")
    private BigDecimal fStuGpa;

    /** 请假次数 */
    @Excel(name = "请假次数")
    private Integer fLeaveNum;

    /** 助学金次数 */
    @Excel(name = "助学金次数")
    private Long fStipendNum;

    /** 奖学金次数 */
    @Excel(name = "奖学金次数")
    private Long fScholNum;

    /** 获奖次数 */
    @Excel(name = "获奖次数")
    private Integer fGainnum;

    /** 剩余金额 */
    @Excel(name = "剩余金额")
    private Long fRemaining;

    /** 消费金额 */
    @Excel(name = "消费金额")
    private Long fConsumption;

    public void setfId(Long fId)
    {
        this.fId = fId;
    }

    public Long getfId()
    {
        return fId;
    }
    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public String getfName()
    {
        return fName;
    }
    public void setfNo(String fNo)
    {
        this.fNo = fNo;
    }

    public String getfNo()
    {
        return fNo;
    }
    public void setfSex(String fSex)
    {
        this.fSex = fSex;
    }

    public String getfSex()
    {
        return fSex;
    }
    public void setfBirth(Date fBirth)
    {
        this.fBirth = fBirth;
    }

    public Date getfBirth()
    {
        return fBirth;
    }
    public void setfFaculties(String fFaculties)
    {
        this.fFaculties = fFaculties;
    }

    public String getfFaculties()
    {
        return fFaculties;
    }
    public void setfClazz(String fClazz)
    {
        this.fClazz = fClazz;
    }

    public String getfClazz()
    {
        return fClazz;
    }
    public void setfMajor(String fMajor)
    {
        this.fMajor = fMajor;
    }

    public String getfMajor()
    {
        return fMajor;
    }
    public void setfNowgrade(String fNowgrade)
    {
        this.fNowgrade = fNowgrade;
    }

    public String getfNowgrade()
    {
        return fNowgrade;
    }
    public void setfAcademic(String fAcademic)
    {
        this.fAcademic = fAcademic;
    }

    public String getfAcademic()
    {
        return fAcademic;
    }
    public void setfNationality(String fNationality)
    {
        this.fNationality = fNationality;
    }

    public String getfNationality()
    {
        return fNationality;
    }
    public void setfCardid(String fCardid)
    {
        this.fCardid = fCardid;
    }

    public String getfCardid()
    {
        return fCardid;
    }
    public void setfBirthplace(String fBirthplace)
    {
        this.fBirthplace = fBirthplace;
    }

    public String getfBirthplace()
    {
        return fBirthplace;
    }
    public void setfPoliticsstatus(String fPoliticsstatus)
    {
        this.fPoliticsstatus = fPoliticsstatus;
    }

    public String getfPoliticsstatus()
    {
        return fPoliticsstatus;
    }
    public void setfFamMoney(String fFamMoney)
    {
        this.fFamMoney = fFamMoney;
    }

    public String getfFamMoney()
    {
        return fFamMoney;
    }
    public void setfStucategory(String fStucategory)
    {
        this.fStucategory = fStucategory;
    }

    public String getfStucategory()
    {
        return fStucategory;
    }
    public void setfStuGpa(BigDecimal fStuGpa)
    {
        this.fStuGpa = fStuGpa;
    }

    public BigDecimal getfStuGpa()
    {
        return fStuGpa;
    }
    public void setfLeaveNum(Integer fLeaveNum)
    {
        this.fLeaveNum = fLeaveNum;
    }

    public Integer getfLeaveNum()
    {
        return fLeaveNum;
    }
    public void setfStipendNum(Long fStipendNum)
    {
        this.fStipendNum = fStipendNum;
    }

    public Long getfStipendNum()
    {
        return fStipendNum;
    }
    public void setfScholNum(Long fScholNum)
    {
        this.fScholNum = fScholNum;
    }

    public Long getfScholNum()
    {
        return fScholNum;
    }
    public void setfGainnum(Integer fGainnum)
    {
        this.fGainnum = fGainnum;
    }

    public Integer getfGainnum()
    {
        return fGainnum;
    }
    public void setfRemaining(Long fRemaining)
    {
        this.fRemaining = fRemaining;
    }

    public Long getfRemaining()
    {
        return fRemaining;
    }
    public void setfConsumption(Long fConsumption)
    {
        this.fConsumption = fConsumption;
    }

    public Long getfConsumption()
    {
        return fConsumption;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("fId", getfId())
                .append("fName", getfName())
                .append("fNo", getfNo())
                .append("fSex", getfSex())
                .append("fBirth", getfBirth())
                .append("fFaculties", getfFaculties())
                .append("fClazz", getfClazz())
                .append("fMajor", getfMajor())
                .append("fNowgrade", getfNowgrade())
                .append("fAcademic", getfAcademic())
                .append("fNationality", getfNationality())
                .append("fCardid", getfCardid())
                .append("fBirthplace", getfBirthplace())
                .append("fPoliticsstatus", getfPoliticsstatus())
                .append("fFamMoney", getfFamMoney())
                .append("fStucategory", getfStucategory())
                .append("fStuGpa", getfStuGpa())
                .append("fLeaveNum", getfLeaveNum())
                .append("fStipendNum", getfStipendNum())
                .append("fScholNum", getfScholNum())
                .append("fGainnum", getfGainnum())
                .append("fRemaining", getfRemaining())
                .append("fConsumption", getfConsumption())
                .toString();
    }
}
