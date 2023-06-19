package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 课程设置对象 tbtec_course
 * 
 * @author wangying
 * @date 2023-05-31
 */
public class TbtecCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String fProName;

    /** 专业代码 */
    @Excel(name = "专业代码")
    private String fProCode;

    /** 专业层次（0高职本科，1高职专科） */
    @Excel(name = "专业层次", readConverterExp = "0=高职本科，1高职专科")
    private Integer fProLevel;

    /** 学制（0：三年，1：五年） */
    @Excel(name = "学制", readConverterExp = "0=：三年，1：五年")
    private Integer fAcademic;

    /** 培养方式(0普通班，1企业新型学徒制，2现代学徒制，3现代职教体系项目，4订单班，5其他) */
    @Excel(name = "培养方式(0普通班，1企业新型学徒制，2现代学徒制，3现代职教体系项目，4订单班，5其他)")
    private Integer fCulMethods;

    /** 具体形式（当“培训方式”为“现代教职体系项目”时：”4+0“，五年一贯制，高本“5+0”，中高“3+3”，高职“3+2”，高职“2+3”，高本“3+2”，中职本科”3+4“分段培养，高本贯通“3+3”分段培养）（当“培训方式”为“其他”时：智能化办公方向，JAVA工程师方向，电子商务技术，新媒体客户服务管理方向，移动UI方向，中教文创（北京）教育科技研究院，WEB前端开发工程师，母婴护理方向，武汉格莱信息科技有限公司，智慧酒店管理方向，蒙氏管理方向，校企合作，京东教育文化有限公司，CAD方向，康复护理方向） */
    @Excel(name = "具体形式", readConverterExp = "当=“培训方式”为“现代教职体系项目”时：”4+0“，五年一贯制，高本“5+0”，中高“3+3”，高职“3+2”，高职“2+3”，高本“3+2”，中职本科”3+4“分段培养，高本贯通“3+3”分段培养")
    private String fSpecificForm;

    /** 生源类型（当“专业层次”为“高职本科”时：三校生，留学生，普通高中生，五年一贯制专科生，高本贯通3+2分段培养，高本贯通3+3分段培养，中本贯通3+4分段培养，专转本（专升本）选拔考试专科生，其他）（当“专业层次”为“高职专科”时：留学生，三校生，普通高中生，五年一贯制第三年，五年一贯制第四年，扩招，高职“3+2”学生，中高贯通3+3分段培养，社招，其他） */
    @Excel(name = "生源类型", readConverterExp = "当=“专业层次”为“高职本科”时：三校生，留学生，普通高中生，五年一贯制专科生，高本贯通3+2分段培养，高本贯通3+3分段培养，中本贯通3+4分段培养，专转本（专升本")
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

    /** 课程类型（0：A类(纯理论课)，1：B类(理论+实践课),2：C类(纯实践课):3：其他） */
    @Excel(name = "课程类型", readConverterExp = "0=：A类(纯理论课)，1：B类(理论+实践课),2：C类(纯实践课):3：其他")
    private Integer fCourseType;

    /** 课程属性（0公共基础课，1专业技能课） */
    @Excel(name = "课程属性", readConverterExp = "0=公共基础课，1专业技能课")
    private Integer fCourseAttr;

    /** 公共基础课 */
    @Excel(name = "公共基础课")
    private String fPubCourses;

    /** 专业技能课 */
    @Excel(name = "专业技能课")
    private String fProCourses;

    /** 课程性质（0必修课，1公共选修课） */
    @Excel(name = "课程性质", readConverterExp = "0=必修课，1公共选修课")
    private Integer fCourseNature;

    /** 开课学期 */
    @Excel(name = "开课学期")
    private String fSemester;

    /** 开课单位名称 */
    @Excel(name = "开课单位名称")
    private String fUnitName;

    /** 是否校企合作开发课程（0是，1否） */
    @Excel(name = "是否校企合作开发课程", readConverterExp = "0=是，1否")
    private Integer fIsCooperation;

    /** 合作企业名称 */
    @Excel(name = "合作企业名称")
    private String fPartnerName;

    /** 精品在线开放课程 */
    @Excel(name = "精品在线开放课程")
    private String fQualityCourses;

    /** 是否课证融通课程（0是，1否） */
    @Excel(name = "是否课证融通课程", readConverterExp = "0=是，1否")
    private Integer fIsFinancing;

    /** 是否网络教学或课程思政示范课程（0是，1否） */
    @Excel(name = "是否网络教学或课程思政示范课程", readConverterExp = "0=是，1否")
    private Integer fIsDemonstration;

    /** 课程总学时（个） */
    @Excel(name = "课程总学时", readConverterExp = "个=")
    private String fTotalHours;

    /** 实践教学学时（个） */
    @Excel(name = "实践教学学时", readConverterExp = "个=")
    private String fPracticeHours;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
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
    public void setfSpecificForm(String fSpecificForm) 
    {
        this.fSpecificForm = fSpecificForm;
    }

    public String getfSpecificForm() 
    {
        return fSpecificForm;
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
    public void setfCourseType(Integer fCourseType) 
    {
        this.fCourseType = fCourseType;
    }

    public Integer getfCourseType() 
    {
        return fCourseType;
    }
    public void setfCourseAttr(Integer fCourseAttr) 
    {
        this.fCourseAttr = fCourseAttr;
    }

    public Integer getfCourseAttr() 
    {
        return fCourseAttr;
    }
    public void setfPubCourses(String fPubCourses) 
    {
        this.fPubCourses = fPubCourses;
    }

    public String getfPubCourses() 
    {
        return fPubCourses;
    }
    public void setfProCourses(String fProCourses) 
    {
        this.fProCourses = fProCourses;
    }

    public String getfProCourses() 
    {
        return fProCourses;
    }
    public void setfCourseNature(Integer fCourseNature) 
    {
        this.fCourseNature = fCourseNature;
    }

    public Integer getfCourseNature() 
    {
        return fCourseNature;
    }
    public void setfSemester(String fSemester) 
    {
        this.fSemester = fSemester;
    }

    public String getfSemester() 
    {
        return fSemester;
    }
    public void setfUnitName(String fUnitName) 
    {
        this.fUnitName = fUnitName;
    }

    public String getfUnitName() 
    {
        return fUnitName;
    }
    public void setfIsCooperation(Integer fIsCooperation) 
    {
        this.fIsCooperation = fIsCooperation;
    }

    public Integer getfIsCooperation() 
    {
        return fIsCooperation;
    }
    public void setfPartnerName(String fPartnerName) 
    {
        this.fPartnerName = fPartnerName;
    }

    public String getfPartnerName() 
    {
        return fPartnerName;
    }
    public void setfQualityCourses(String fQualityCourses) 
    {
        this.fQualityCourses = fQualityCourses;
    }

    public String getfQualityCourses() 
    {
        return fQualityCourses;
    }
    public void setfIsFinancing(Integer fIsFinancing) 
    {
        this.fIsFinancing = fIsFinancing;
    }

    public Integer getfIsFinancing() 
    {
        return fIsFinancing;
    }
    public void setfIsDemonstration(Integer fIsDemonstration) 
    {
        this.fIsDemonstration = fIsDemonstration;
    }

    public Integer getfIsDemonstration() 
    {
        return fIsDemonstration;
    }
    public void setfTotalHours(String fTotalHours) 
    {
        this.fTotalHours = fTotalHours;
    }

    public String getfTotalHours() 
    {
        return fTotalHours;
    }
    public void setfPracticeHours(String fPracticeHours) 
    {
        this.fPracticeHours = fPracticeHours;
    }

    public String getfPracticeHours() 
    {
        return fPracticeHours;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fProName", getfProName())
            .append("fProCode", getfProCode())
            .append("fProLevel", getfProLevel())
            .append("fAcademic", getfAcademic())
            .append("fCulMethods", getfCulMethods())
            .append("fSpecificForm", getfSpecificForm())
            .append("fSourceType", getfSourceType())
            .append("fGrade", getfGrade())
            .append("fCourseName", getfCourseName())
            .append("fCourseCode", getfCourseCode())
            .append("fCourseType", getfCourseType())
            .append("fCourseAttr", getfCourseAttr())
            .append("fPubCourses", getfPubCourses())
            .append("fProCourses", getfProCourses())
            .append("fCourseNature", getfCourseNature())
            .append("fSemester", getfSemester())
            .append("fUnitName", getfUnitName())
            .append("fIsCooperation", getfIsCooperation())
            .append("fPartnerName", getfPartnerName())
            .append("fQualityCourses", getfQualityCourses())
            .append("fIsFinancing", getfIsFinancing())
            .append("fIsDemonstration", getfIsDemonstration())
            .append("fTotalHours", getfTotalHours())
            .append("fPracticeHours", getfPracticeHours())
            .toString();
    }
}
