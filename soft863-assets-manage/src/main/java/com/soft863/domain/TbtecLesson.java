package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 教师授课对象 tbtec_lesson
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public class TbtecLesson extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 授课教师工号 */
    @Excel(name = "授课教师工号")
    private String fTeacherNo;

    /** 授课教师姓名 */
    @Excel(name = "授课教师姓名")
    private String fTeacherName;

    /** 教师类别 */
    @Excel(name = "教师类别")
    private Integer fTeacherType;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String fProName;

    /** 专业代码 */
    @Excel(name = "专业代码")
    private String fProCode;

    /** 专业层次 */
    @Excel(name = "专业层次")
    private Integer fProLevel;

    /** 学制 */
    @Excel(name = "学制")
    private Integer fAcademic;

    /** 培养方式 */
    @Excel(name = "培养方式")
    private Integer fCulMethods;

    /** 具体形式 */
    @Excel(name = "具体形式")
    private String fSpcForm;

    /** 生源类型 */
    @Excel(name = "生源类型")
    private String fSourceType;

    /** 授课年级 */
    @Excel(name = "授课年级")
    private String fGrade;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String fCourseName;

    /** 课程代码 */
    @Excel(name = "课程代码")
    private String fCourseCode;

    /** 授课学期 */
    @Excel(name = "授课学期")
    private String fTecSemesters;

    /** 班级名称 */
    @Excel(name = "班级名称")
    private String fClassName;

    /** 授课任务 */
    @Excel(name = "授课任务")
    private Integer fTecTask;

    /** 教学工作量（学时） */
    @Excel(name = "教学工作量", readConverterExp = "学=时")
    private String fTecTime;

    /** 教学工作量（学时） */
    @Excel(name = "教学工作量", readConverterExp = "学=时")
    private String fOnlineTime;

    /** 填报人 */
    @Excel(name = "填报人")
    private String fFiller;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfTeacherNo(String fTeacherNo) 
    {
        this.fTeacherNo = fTeacherNo;
    }

    public String getfTeacherNo() 
    {
        return fTeacherNo;
    }
    public void setfTeacherName(String fTeacherName) 
    {
        this.fTeacherName = fTeacherName;
    }

    public String getfTeacherName() 
    {
        return fTeacherName;
    }
    public void setfTeacherType(Integer fTeacherType) 
    {
        this.fTeacherType = fTeacherType;
    }

    public Integer getfTeacherType() 
    {
        return fTeacherType;
    }
    public void setfProName(String fProName) 
    {
        this.fProName = fProName;
    }

    public String getfProName() 
    {
        return fProName;
    }
    public void setfProCode(String fProCode) 
    {
        this.fProCode = fProCode;
    }

    public String getfProCode() 
    {
        return fProCode;
    }
    public void setfProLevel(Integer fProLevel) 
    {
        this.fProLevel = fProLevel;
    }

    public Integer getfProLevel() 
    {
        return fProLevel;
    }
    public void setfAcademic(Integer fAcademic) 
    {
        this.fAcademic = fAcademic;
    }

    public Integer getfAcademic() 
    {
        return fAcademic;
    }
    public void setfCulMethods(Integer fCulMethods) 
    {
        this.fCulMethods = fCulMethods;
    }

    public Integer getfCulMethods() 
    {
        return fCulMethods;
    }
    public void setfSpcForm(String fSpcForm) 
    {
        this.fSpcForm = fSpcForm;
    }

    public String getfSpcForm() 
    {
        return fSpcForm;
    }
    public void setfSourceType(String fSourceType) 
    {
        this.fSourceType = fSourceType;
    }

    public String getfSourceType() 
    {
        return fSourceType;
    }
    public void setfGrade(String fGrade) 
    {
        this.fGrade = fGrade;
    }

    public String getfGrade() 
    {
        return fGrade;
    }
    public void setfCourseName(String fCourseName) 
    {
        this.fCourseName = fCourseName;
    }

    public String getfCourseName() 
    {
        return fCourseName;
    }
    public void setfCourseCode(String fCourseCode) 
    {
        this.fCourseCode = fCourseCode;
    }

    public String getfCourseCode() 
    {
        return fCourseCode;
    }
    public void setfTecSemesters(String fTecSemesters) 
    {
        this.fTecSemesters = fTecSemesters;
    }

    public String getfTecSemesters() 
    {
        return fTecSemesters;
    }
    public void setfClassName(String fClassName) 
    {
        this.fClassName = fClassName;
    }

    public String getfClassName() 
    {
        return fClassName;
    }
    public void setfTecTask(Integer fTecTask) 
    {
        this.fTecTask = fTecTask;
    }

    public Integer getfTecTask() 
    {
        return fTecTask;
    }
    public void setfTecTime(String fTecTime) 
    {
        this.fTecTime = fTecTime;
    }

    public String getfTecTime() 
    {
        return fTecTime;
    }
    public void setfOnlineTime(String fOnlineTime) 
    {
        this.fOnlineTime = fOnlineTime;
    }

    public String getfOnlineTime() 
    {
        return fOnlineTime;
    }
    public void setfFiller(String fFiller) 
    {
        this.fFiller = fFiller;
    }

    public String getfFiller() 
    {
        return fFiller;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fTeacherNo", getfTeacherNo())
            .append("fTeacherName", getfTeacherName())
            .append("fTeacherType", getfTeacherType())
            .append("fProName", getfProName())
            .append("fProCode", getfProCode())
            .append("fProLevel", getfProLevel())
            .append("fAcademic", getfAcademic())
            .append("fCulMethods", getfCulMethods())
            .append("fSpcForm", getfSpcForm())
            .append("fSourceType", getfSourceType())
            .append("fGrade", getfGrade())
            .append("fCourseName", getfCourseName())
            .append("fCourseCode", getfCourseCode())
            .append("fTecSemesters", getfTecSemesters())
            .append("fClassName", getfClassName())
            .append("fTecTask", getfTecTask())
            .append("fTecTime", getfTecTime())
            .append("fOnlineTime", getfOnlineTime())
            .append("fFiller", getfFiller())
            .toString();
    }
}
