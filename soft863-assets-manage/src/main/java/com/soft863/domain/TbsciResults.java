package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 教师科研业绩对象 tbsci_results
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public class TbsciResults extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long fId;

    /** 教师姓名 */
    @Excel(name = "教师姓名")
    private String fTeachername;

    /** 教工号 */
    @Excel(name = "教工号")
    private Long fTeacherno;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String fProjectName;

    /** 教工类别(专任教师/校内兼课教师/其它） */
    @Excel(name = "教工类别(专任教师/校内兼课教师/其它）")
    private String fTeacherType;

    /** 项目类型（软件著作权/外观设计/实用新型专利/发明专利) */
    @Excel(name = "项目类型", readConverterExp = "项目类型（软件著作权/外观设计/实用新型专利/发明专利)")
    private String fProjectType;

    /** 派出部门级别（国家级/省级/地市级/校级/无） */
    @Excel(name = "派出部门级别", readConverterExp = "国=家级/省级/地市级/校级/无")
    private String fDepartLevel;

    /** 课题分类(自然科学与技术/人文科学与技术） */
    @Excel(name = "课题分类(自然科学与技术/人文科学与技术）")
    private String fSubjectClass;

    /** 课题性质（教学改革/技术开发/其它） */
    @Excel(name = "课题性质", readConverterExp = "教=学改革/技术开发/其它")
    private String fSubjectPropert;

    /** 是否横向课题 (是/否) */
    @Excel(name = "是否横向课题 (是/否)")
    private String fCrossFlg;

    /** 完成人顺序（独立/第一/第二/第三/第四/第五/以后） */
    @Excel(name = "完成人顺序", readConverterExp = "独=立/第一/第二/第三/第四/第五/以后")
    private String fOrder;

    /** 本学年行业工作时间（天) */
    @Excel(name = "本学年行业工作时间", readConverterExp = "本学年行业工作时间（天)")
    private Long fWorkTime;

    /** 评审结果（优秀/良好/合格/不合格/通过/不通过） */
    @Excel(name = "评审结果", readConverterExp = "优=秀/良好/合格/不合格/通过/不通过")
    private String fResult;

    /** 课题来源（政府/企业） */
    @Excel(name = "课题来源", readConverterExp = "政=府/企业")
    private String fSubjectSource;

    /** 课题级别（国家级/省部级/地市级/区县级/校级/无等级） */
    @Excel(name = "课题级别", readConverterExp = "国=家级/省部级/地市级/区县级/校级/无等级")
    private String fSubjectLevel;

    /** 是否相关部门备案 */
    @Excel(name = "是否相关部门备案")
    private String fRecordFlg;

    /** 纵向批准部门 */
    @Excel(name = "纵向批准部门")
    private String fVertical;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfTeachername(String fTeachername) 
    {
        this.fTeachername = fTeachername;
    }

    public String getfTeachername() 
    {
        return fTeachername;
    }
    public void setfTeacherno(Long fTeacherno) 
    {
        this.fTeacherno = fTeacherno;
    }

    public Long getfTeacherno() 
    {
        return fTeacherno;
    }
    public void setfProjectName(String fProjectName) 
    {
        this.fProjectName = fProjectName;
    }

    public String getfProjectName() 
    {
        return fProjectName;
    }
    public void setfTeacherType(String fTeacherType) 
    {
        this.fTeacherType = fTeacherType;
    }

    public String getfTeacherType() 
    {
        return fTeacherType;
    }
    public void setfProjectType(String fProjectType) 
    {
        this.fProjectType = fProjectType;
    }

    public String getfProjectType() 
    {
        return fProjectType;
    }
    public void setfDepartLevel(String fDepartLevel) 
    {
        this.fDepartLevel = fDepartLevel;
    }

    public String getfDepartLevel() 
    {
        return fDepartLevel;
    }
    public void setfSubjectClass(String fSubjectClass) 
    {
        this.fSubjectClass = fSubjectClass;
    }

    public String getfSubjectClass() 
    {
        return fSubjectClass;
    }
    public void setfSubjectPropert(String fSubjectPropert) 
    {
        this.fSubjectPropert = fSubjectPropert;
    }

    public String getfSubjectPropert() 
    {
        return fSubjectPropert;
    }
    public void setfCrossFlg(String fCrossFlg) 
    {
        this.fCrossFlg = fCrossFlg;
    }

    public String getfCrossFlg() 
    {
        return fCrossFlg;
    }
    public void setfOrder(String fOrder) 
    {
        this.fOrder = fOrder;
    }

    public String getfOrder() 
    {
        return fOrder;
    }
    public void setfWorkTime(Long fWorkTime) 
    {
        this.fWorkTime = fWorkTime;
    }

    public Long getfWorkTime() 
    {
        return fWorkTime;
    }
    public void setfResult(String fResult) 
    {
        this.fResult = fResult;
    }

    public String getfResult() 
    {
        return fResult;
    }
    public void setfSubjectSource(String fSubjectSource) 
    {
        this.fSubjectSource = fSubjectSource;
    }

    public String getfSubjectSource() 
    {
        return fSubjectSource;
    }
    public void setfSubjectLevel(String fSubjectLevel) 
    {
        this.fSubjectLevel = fSubjectLevel;
    }

    public String getfSubjectLevel() 
    {
        return fSubjectLevel;
    }
    public void setfRecordFlg(String fRecordFlg) 
    {
        this.fRecordFlg = fRecordFlg;
    }

    public String getfRecordFlg() 
    {
        return fRecordFlg;
    }
    public void setfVertical(String fVertical) 
    {
        this.fVertical = fVertical;
    }

    public String getfVertical() 
    {
        return fVertical;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fTeachername", getfTeachername())
            .append("fTeacherno", getfTeacherno())
            .append("fProjectName", getfProjectName())
            .append("fTeacherType", getfTeacherType())
            .append("fProjectType", getfProjectType())
            .append("fDepartLevel", getfDepartLevel())
            .append("fSubjectClass", getfSubjectClass())
            .append("fSubjectPropert", getfSubjectPropert())
            .append("fCrossFlg", getfCrossFlg())
            .append("fOrder", getfOrder())
            .append("fWorkTime", getfWorkTime())
            .append("fResult", getfResult())
            .append("fSubjectSource", getfSubjectSource())
            .append("fSubjectLevel", getfSubjectLevel())
            .append("fRecordFlg", getfRecordFlg())
            .append("fVertical", getfVertical())
            .toString();
    }
}
