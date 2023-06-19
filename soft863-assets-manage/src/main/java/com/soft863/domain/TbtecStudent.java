package com.soft863.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学生信息对象 tbtec_student
 * 
 * @author 863
 * @date 2023-06-02
 */
public class TbtecStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
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
    private Date fBirthday;

    /** 院系 */
    @Excel(name = "院系")
    private String fFaculty;

    /** 专业 */
    @Excel(name = "专业")
    private String fMajor;

    /** 现在年级 */
    @Excel(name = "现在年级")
    private String fGrade;

    /** 学制 */
    @Excel(name = "学制")
    private String fAcademic;

    /** 预计毕业年份 */
    @Excel(name = "预计毕业年份")
    private String fGraduationdate;

    /** 考生号 */
    @Excel(name = "考生号")
    private String fExamineenumber;

    /** 民族 */
    @Excel(name = "民族")
    private String fNation;

    /** 身份证件号 */
    @Excel(name = "身份证件号")
    private String fIdentitycard;

    /** 出生地 */
    @Excel(name = "出生地")
    private String fBirthplace;

    /** 国家地区 */
    @Excel(name = "国家地区")
    private String fZone;

    /** 港澳台侨 */
    @Excel(name = "港澳台侨")
    private String fHongkong;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String fPoliticsstatus;

    /** 户口所在地 */
    @Excel(name = "户口所在地")
    private String fCensusregister;

    /** 入学前户口性质 */
    @Excel(name = "入学前户口性质")
    private String fDomicilearea;

    /** 班级 */
    @Excel(name = "班级")
    private String fClass;

    /** 入学年月 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入学年月", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fEnrolltime;

    /** 学生类别 */
    @Excel(name = "学生类别")
    private String fCategory;

    /** 培养层次 */
    @Excel(name = "培养层次")
    private String fCultivatelevels;

    /** 学籍状态 */
    @Excel(name = "学籍状态")
    private String fStatus;

    /** 手机号 */
    @Excel(name = "手机号")
    private String fPhone;

    /** 电子信箱 */
    @Excel(name = "电子信箱")
    private String fEmail;

    /** QQ号 */
    @Excel(name = "QQ号")
    private String fQq;

    /** 微信号 */
    @Excel(name = "微信号")
    private String fWechat;

    /** 家庭地址 */
    @Excel(name = "家庭地址")
    private String fAddress;

    /** 家庭电话 */
    @Excel(name = "家庭电话")
    private String fFamilyphone;

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
    public void setfBirthday(Date fBirthday) 
    {
        this.fBirthday = fBirthday;
    }

    public Date getfBirthday() 
    {
        return fBirthday;
    }
    public void setfFaculty(String fFaculty) 
    {
        this.fFaculty = fFaculty;
    }

    public String getfFaculty() 
    {
        return fFaculty;
    }
    public void setfMajor(String fMajor) 
    {
        this.fMajor = fMajor;
    }

    public String getfMajor() 
    {
        return fMajor;
    }
    public void setfGrade(String fGrade) 
    {
        this.fGrade = fGrade;
    }

    public String getfGrade() 
    {
        return fGrade;
    }
    public void setfAcademic(String fAcademic) 
    {
        this.fAcademic = fAcademic;
    }

    public String getfAcademic() 
    {
        return fAcademic;
    }
    public void setfGraduationdate(String fGraduationdate) 
    {
        this.fGraduationdate = fGraduationdate;
    }

    public String getfGraduationdate() 
    {
        return fGraduationdate;
    }
    public void setfExamineenumber(String fExamineenumber) 
    {
        this.fExamineenumber = fExamineenumber;
    }

    public String getfExamineenumber() 
    {
        return fExamineenumber;
    }
    public void setfNation(String fNation) 
    {
        this.fNation = fNation;
    }

    public String getfNation() 
    {
        return fNation;
    }
    public void setfIdentitycard(String fIdentitycard) 
    {
        this.fIdentitycard = fIdentitycard;
    }

    public String getfIdentitycard() 
    {
        return fIdentitycard;
    }
    public void setfBirthplace(String fBirthplace) 
    {
        this.fBirthplace = fBirthplace;
    }

    public String getfBirthplace() 
    {
        return fBirthplace;
    }
    public void setfZone(String fZone) 
    {
        this.fZone = fZone;
    }

    public String getfZone() 
    {
        return fZone;
    }
    public void setfHongkong(String fHongkong) 
    {
        this.fHongkong = fHongkong;
    }

    public String getfHongkong() 
    {
        return fHongkong;
    }
    public void setfPoliticsstatus(String fPoliticsstatus) 
    {
        this.fPoliticsstatus = fPoliticsstatus;
    }

    public String getfPoliticsstatus() 
    {
        return fPoliticsstatus;
    }
    public void setfCensusregister(String fCensusregister) 
    {
        this.fCensusregister = fCensusregister;
    }

    public String getfCensusregister() 
    {
        return fCensusregister;
    }
    public void setfDomicilearea(String fDomicilearea) 
    {
        this.fDomicilearea = fDomicilearea;
    }

    public String getfDomicilearea() 
    {
        return fDomicilearea;
    }
    public void setfClass(String fClass) 
    {
        this.fClass = fClass;
    }

    public String getfClass() 
    {
        return fClass;
    }
    public void setfEnrolltime(Date fEnrolltime) 
    {
        this.fEnrolltime = fEnrolltime;
    }

    public Date getfEnrolltime() 
    {
        return fEnrolltime;
    }
    public void setfCategory(String fCategory) 
    {
        this.fCategory = fCategory;
    }

    public String getfCategory() 
    {
        return fCategory;
    }
    public void setfCultivatelevels(String fCultivatelevels) 
    {
        this.fCultivatelevels = fCultivatelevels;
    }

    public String getfCultivatelevels() 
    {
        return fCultivatelevels;
    }
    public void setfStatus(String fStatus) 
    {
        this.fStatus = fStatus;
    }

    public String getfStatus() 
    {
        return fStatus;
    }
    public void setfPhone(String fPhone) 
    {
        this.fPhone = fPhone;
    }

    public String getfPhone() 
    {
        return fPhone;
    }
    public void setfEmail(String fEmail) 
    {
        this.fEmail = fEmail;
    }

    public String getfEmail() 
    {
        return fEmail;
    }
    public void setfQq(String fQq) 
    {
        this.fQq = fQq;
    }

    public String getfQq() 
    {
        return fQq;
    }
    public void setfWechat(String fWechat) 
    {
        this.fWechat = fWechat;
    }

    public String getfWechat() 
    {
        return fWechat;
    }
    public void setfAddress(String fAddress) 
    {
        this.fAddress = fAddress;
    }

    public String getfAddress() 
    {
        return fAddress;
    }
    public void setfFamilyphone(String fFamilyphone) 
    {
        this.fFamilyphone = fFamilyphone;
    }

    public String getfFamilyphone() 
    {
        return fFamilyphone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fName", getfName())
            .append("fNo", getfNo())
            .append("fSex", getfSex())
            .append("fBirthday", getfBirthday())
            .append("fFaculty", getfFaculty())
            .append("fMajor", getfMajor())
            .append("fGrade", getfGrade())
            .append("fAcademic", getfAcademic())
            .append("fGraduationdate", getfGraduationdate())
            .append("fExamineenumber", getfExamineenumber())
            .append("fNation", getfNation())
            .append("fIdentitycard", getfIdentitycard())
            .append("fBirthplace", getfBirthplace())
            .append("fZone", getfZone())
            .append("fHongkong", getfHongkong())
            .append("fPoliticsstatus", getfPoliticsstatus())
            .append("fCensusregister", getfCensusregister())
            .append("fDomicilearea", getfDomicilearea())
            .append("fClass", getfClass())
            .append("fEnrolltime", getfEnrolltime())
            .append("fCategory", getfCategory())
            .append("fCultivatelevels", getfCultivatelevels())
            .append("fStatus", getfStatus())
            .append("fPhone", getfPhone())
            .append("fEmail", getfEmail())
            .append("fQq", getfQq())
            .append("fWechat", getfWechat())
            .append("fAddress", getfAddress())
            .append("fFamilyphone", getfFamilyphone())
            .toString();
    }
}
