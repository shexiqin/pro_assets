package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 教材选用对象 tbtec_textbooks
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public class TbtecTextbooks extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String fCourseName;

    /** 课程代码 */
    @Excel(name = "课程代码")
    private String fCourseCode;

    /** 教材名称 */
    @Excel(name = "教材名称")
    private String fBookName;

    /** 是否正式出版教材(0是，1否) */
    @Excel(name = "是否正式出版教材(0是，1否)")
    private Integer fIsLegal;

    /** ISBN号 */
    @Excel(name = "ISBN号")
    private String fIsbn;

    /** 出版单位 */
    @Excel(name = "出版单位")
    private String fPublisher;

    /** 版次日期（年月） */
    @Excel(name = "版次日期", readConverterExp = "年=月")
    private Date fEditionDate;

    /** 第一主编姓名 */
    @Excel(name = "第一主编姓名")
    private String fFirEditName;

    /** 第一主编单位 */
    @Excel(name = "第一主编单位")
    private String fFirEditUnit;

    /** 使用数量（本） */
    @Excel(name = "使用数量", readConverterExp = "本=")
    private String fUsedNum;

    /** 是否教育部统编教材 */
    @Excel(name = "是否教育部统编教材")
    private Integer fIsEducate;

    /** 是否国家教材奖教材(0是，1否) */
    @Excel(name = "是否国家教材奖教材(0是，1否)")
    private Integer fIsCountry;

    /** 纳入规划教材情况 */
    @Excel(name = "纳入规划教材情况")
    private Integer fPlanning;

    /** 适用层次(多选) */
    @Excel(name = "适用层次(多选)")
    private String fLevel;

    /** 教材类型 */
    @Excel(name = "教材类型")
    private Integer fBookType;

    /** 对应领域 */
    @Excel(name = "对应领域")
    private String fField;

    /** 教材特色 */
    @Excel(name = "教材特色")
    private String fBookFeatures;

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
    public void setfBookName(String fBookName) 
    {
        this.fBookName = fBookName;
    }

    public String getfBookName() 
    {
        return fBookName;
    }
    public void setfIsLegal(Integer fIsLegal) 
    {
        this.fIsLegal = fIsLegal;
    }

    public Integer getfIsLegal() 
    {
        return fIsLegal;
    }
    public void setfIsbn(String fIsbn) 
    {
        this.fIsbn = fIsbn;
    }

    public String getfIsbn() 
    {
        return fIsbn;
    }
    public void setfPublisher(String fPublisher) 
    {
        this.fPublisher = fPublisher;
    }

    public String getfPublisher() 
    {
        return fPublisher;
    }
    public void setfEditionDate(Date fEditionDate) 
    {
        this.fEditionDate = fEditionDate;
    }

    public Date getfEditionDate() 
    {
        return fEditionDate;
    }
    public void setfFirEditName(String fFirEditName) 
    {
        this.fFirEditName = fFirEditName;
    }

    public String getfFirEditName() 
    {
        return fFirEditName;
    }
    public void setfFirEditUnit(String fFirEditUnit) 
    {
        this.fFirEditUnit = fFirEditUnit;
    }

    public String getfFirEditUnit() 
    {
        return fFirEditUnit;
    }
    public void setfUsedNum(String fUsedNum) 
    {
        this.fUsedNum = fUsedNum;
    }

    public String getfUsedNum() 
    {
        return fUsedNum;
    }
    public void setfIsEducate(Integer fIsEducate) 
    {
        this.fIsEducate = fIsEducate;
    }

    public Integer getfIsEducate() 
    {
        return fIsEducate;
    }
    public void setfIsCountry(Integer fIsCountry) 
    {
        this.fIsCountry = fIsCountry;
    }

    public Integer getfIsCountry() 
    {
        return fIsCountry;
    }
    public void setfPlanning(Integer fPlanning) 
    {
        this.fPlanning = fPlanning;
    }

    public Integer getfPlanning() 
    {
        return fPlanning;
    }
    public void setfLevel(String fLevel) 
    {
        this.fLevel = fLevel;
    }

    public String getfLevel() 
    {
        return fLevel;
    }
    public void setfBookType(Integer fBookType) 
    {
        this.fBookType = fBookType;
    }

    public Integer getfBookType() 
    {
        return fBookType;
    }
    public void setfField(String fField) 
    {
        this.fField = fField;
    }

    public String getfField() 
    {
        return fField;
    }
    public void setfBookFeatures(String fBookFeatures) 
    {
        this.fBookFeatures = fBookFeatures;
    }

    public String getfBookFeatures() 
    {
        return fBookFeatures;
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
            .append("fCourseName", getfCourseName())
            .append("fCourseCode", getfCourseCode())
            .append("fBookName", getfBookName())
            .append("fIsLegal", getfIsLegal())
            .append("fIsbn", getfIsbn())
            .append("fPublisher", getfPublisher())
            .append("fEditionDate", getfEditionDate())
            .append("fFirEditName", getfFirEditName())
            .append("fFirEditUnit", getfFirEditUnit())
            .append("fUsedNum", getfUsedNum())
            .append("fIsEducate", getfIsEducate())
            .append("fIsCountry", getfIsCountry())
            .append("fPlanning", getfPlanning())
            .append("fLevel", getfLevel())
            .append("fBookType", getfBookType())
            .append("fField", getfField())
            .append("fBookFeatures", getfBookFeatures())
            .append("fFiller", getfFiller())
            .toString();
    }
}
