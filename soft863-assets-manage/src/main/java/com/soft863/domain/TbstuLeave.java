package com.soft863.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 学生请假信息（学工系统）对象 tbstu_leave
 * 
 * @author cuihangbo
 * @date 2023-05-30
 */
public class TbstuLeave extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long fId;

    /** 学号 */
    @Excel(name = "学号")
    private String fNum;

    /** 姓名 */
    @Excel(name = "姓名")
    private String fName;

    /** 性别 */
    @Excel(name = "性别")
    private String fSex;

    /** 民族 */
    @Excel(name = "民族")
    private String fNation;

    /** 手机号 */
    @Excel(name = "手机号")
    private String fPhone;

    /** 年级 */
    @Excel(name = "年级")
    private String fGrade;

    /** 校区 */
    @Excel(name = "校区")
    private String fCampus;

    /** 院系 */
    @Excel(name = "院系")
    private String fFaculties;

    /** 专业 */
    @Excel(name = "专业")
    private String fMajor;

    /** 班级 */
    @Excel(name = "班级")
    private String fClass;

    /** 请假类型 */
    @Excel(name = "请假类型")
    private String fType;

    /** 申请发起时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请发起时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fStarttime;

    /** 需要离校 */
    @Excel(name = "需要离校")
    private String fFlg;

    /** 紧急联系人手机号 */
    @Excel(name = "紧急联系人手机号")
    private String fEmergencycontacts;

    /** 请假时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "请假时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fDate;

    /** 实际休假时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实际休假时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fActualdate;

    /** 销假时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "销假时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fTimecancelleave;

    /** 请假原因 */
    @Excel(name = "请假原因")
    private String fReasontakingleave;

    /** 审批人 */
    @Excel(name = "审批人")
    private String fApprover;

    /** 请假状态 */
    @Excel(name = "请假状态")
    private String fStatus;

    /** 目的地 */
    @Excel(name = "目的地")
    private String fDestination;

    /** 宿舍楼名称 */
    @Excel(name = "宿舍楼名称")
    private String fDormitoryname;

    /** 房间号 */
    @Excel(name = "房间号")
    private String fRoomnumber;

    /** 床位号 */
    @Excel(name = "床位号")
    private String fBednumber;

    /** 发起位置 */
    @Excel(name = "发起位置")
    private String fOriginatinglocation;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfNum(String fNum) 
    {
        this.fNum = fNum;
    }

    public String getfNum() 
    {
        return fNum;
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
    public void setfNation(String fNation) 
    {
        this.fNation = fNation;
    }

    public String getfNation() 
    {
        return fNation;
    }
    public void setfPhone(String fPhone) 
    {
        this.fPhone = fPhone;
    }

    public String getfPhone() 
    {
        return fPhone;
    }
    public void setfGrade(String fGrade) 
    {
        this.fGrade = fGrade;
    }

    public String getfGrade() 
    {
        return fGrade;
    }
    public void setfCampus(String fCampus) 
    {
        this.fCampus = fCampus;
    }

    public String getfCampus() 
    {
        return fCampus;
    }
    public void setfFaculties(String fFaculties) 
    {
        this.fFaculties = fFaculties;
    }

    public String getfFaculties() 
    {
        return fFaculties;
    }
    public void setfMajor(String fMajor) 
    {
        this.fMajor = fMajor;
    }

    public String getfMajor() 
    {
        return fMajor;
    }
    public void setfClass(String fClass) 
    {
        this.fClass = fClass;
    }

    public String getfClass() 
    {
        return fClass;
    }
    public void setfType(String fType) 
    {
        this.fType = fType;
    }

    public String getfType() 
    {
        return fType;
    }
    public void setfStarttime(Date fStarttime) 
    {
        this.fStarttime = fStarttime;
    }

    public Date getfStarttime() 
    {
        return fStarttime;
    }
    public void setfFlg(String fFlg) 
    {
        this.fFlg = fFlg;
    }

    public String getfFlg() 
    {
        return fFlg;
    }
    public void setfEmergencycontacts(String fEmergencycontacts) 
    {
        this.fEmergencycontacts = fEmergencycontacts;
    }

    public String getfEmergencycontacts() 
    {
        return fEmergencycontacts;
    }
    public void setfDate(Date fDate) 
    {
        this.fDate = fDate;
    }

    public Date getfDate() 
    {
        return fDate;
    }
    public void setfActualdate(Date fActualdate) 
    {
        this.fActualdate = fActualdate;
    }

    public Date getfActualdate() 
    {
        return fActualdate;
    }
    public void setfTimecancelleave(Date fTimecancelleave) 
    {
        this.fTimecancelleave = fTimecancelleave;
    }

    public Date getfTimecancelleave() 
    {
        return fTimecancelleave;
    }
    public void setfReasontakingleave(String fReasontakingleave) 
    {
        this.fReasontakingleave = fReasontakingleave;
    }

    public String getfReasontakingleave() 
    {
        return fReasontakingleave;
    }
    public void setfApprover(String fApprover) 
    {
        this.fApprover = fApprover;
    }

    public String getfApprover() 
    {
        return fApprover;
    }
    public void setfStatus(String fStatus) 
    {
        this.fStatus = fStatus;
    }

    public String getfStatus() 
    {
        return fStatus;
    }
    public void setfDestination(String fDestination) 
    {
        this.fDestination = fDestination;
    }

    public String getfDestination() 
    {
        return fDestination;
    }
    public void setfDormitoryname(String fDormitoryname) 
    {
        this.fDormitoryname = fDormitoryname;
    }

    public String getfDormitoryname() 
    {
        return fDormitoryname;
    }
    public void setfRoomnumber(String fRoomnumber) 
    {
        this.fRoomnumber = fRoomnumber;
    }

    public String getfRoomnumber() 
    {
        return fRoomnumber;
    }
    public void setfBednumber(String fBednumber) 
    {
        this.fBednumber = fBednumber;
    }

    public String getfBednumber() 
    {
        return fBednumber;
    }
    public void setfOriginatinglocation(String fOriginatinglocation) 
    {
        this.fOriginatinglocation = fOriginatinglocation;
    }

    public String getfOriginatinglocation() 
    {
        return fOriginatinglocation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fNum", getfNum())
            .append("fName", getfName())
            .append("fSex", getfSex())
            .append("fNation", getfNation())
            .append("fPhone", getfPhone())
            .append("fGrade", getfGrade())
            .append("fCampus", getfCampus())
            .append("fFaculties", getfFaculties())
            .append("fMajor", getfMajor())
            .append("fClass", getfClass())
            .append("fType", getfType())
            .append("fStarttime", getfStarttime())
            .append("fFlg", getfFlg())
            .append("fEmergencycontacts", getfEmergencycontacts())
            .append("fDate", getfDate())
            .append("fActualdate", getfActualdate())
            .append("fTimecancelleave", getfTimecancelleave())
            .append("fReasontakingleave", getfReasontakingleave())
            .append("fApprover", getfApprover())
            .append("fStatus", getfStatus())
            .append("fDestination", getfDestination())
            .append("fDormitoryname", getfDormitoryname())
            .append("fRoomnumber", getfRoomnumber())
            .append("fBednumber", getfBednumber())
            .append("fOriginatinglocation", getfOriginatinglocation())
            .toString();
    }
}
