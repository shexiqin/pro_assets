package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 课程画像对象 tbdia_course
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
public class TbdiaCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long fId;

    /** 课程号 */
    @Excel(name = "课程号")
    private String fCno;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String fCname;

    /** 专业方向 */
    @Excel(name = "专业方向")
    private String fMajor;

    /** 课程类型 */
    @Excel(name = "课程类型")
    private String fCtype;

    /** 班级总人数 */
    @Excel(name = "班级总人数")
    private Long fCnum;

    /** 请假 */
    @Excel(name = "请假")
    private Long fCeval;

    /** 出勤人数 */
    @Excel(name = "出勤人数")
    private Long fCada;

    /** 课程价值 */
    @Excel(name = "课程价值")
    private String fCval;

    /** 讲师 */
    @Excel(name = "讲师")
    private String fClecture;

    /** 讲师职称 */
    @Excel(name = "讲师职称")
    private Long fClevel;

    /** 教室 */
    @Excel(name = "教室")
    private String fClass;

    /** 学时 */
    @Excel(name = "学时")
    private Long fChour;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfCno(String fCno) 
    {
        this.fCno = fCno;
    }

    public String getfCno() 
    {
        return fCno;
    }
    public void setfCname(String fCname) 
    {
        this.fCname = fCname;
    }

    public String getfCname() 
    {
        return fCname;
    }
    public void setfMajor(String fMajor) 
    {
        this.fMajor = fMajor;
    }

    public String getfMajor() 
    {
        return fMajor;
    }
    public void setfCtype(String fCtype) 
    {
        this.fCtype = fCtype;
    }

    public String getfCtype() 
    {
        return fCtype;
    }
    public void setfCnum(Long fCnum) 
    {
        this.fCnum = fCnum;
    }

    public Long getfCnum() 
    {
        return fCnum;
    }
    public void setfCeval(Long fCeval) 
    {
        this.fCeval = fCeval;
    }

    public Long getfCeval() 
    {
        return fCeval;
    }
    public void setfCada(Long fCada) 
    {
        this.fCada = fCada;
    }

    public Long getfCada() 
    {
        return fCada;
    }
    public void setfCval(String fCval) 
    {
        this.fCval = fCval;
    }

    public String getfCval() 
    {
        return fCval;
    }
    public void setfClecture(String fClecture) 
    {
        this.fClecture = fClecture;
    }

    public String getfClecture() 
    {
        return fClecture;
    }
    public void setfClevel(Long fClevel) 
    {
        this.fClevel = fClevel;
    }

    public Long getfClevel() 
    {
        return fClevel;
    }
    public void setfClass(String fClass) 
    {
        this.fClass = fClass;
    }

    public String getfClass() 
    {
        return fClass;
    }
    public void setfChour(Long fChour) 
    {
        this.fChour = fChour;
    }

    public Long getfChour() 
    {
        return fChour;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fCno", getfCno())
            .append("fCname", getfCname())
            .append("fMajor", getfMajor())
            .append("fCtype", getfCtype())
            .append("fCnum", getfCnum())
            .append("fCeval", getfCeval())
            .append("fCada", getfCada())
            .append("fCval", getfCval())
            .append("fClecture", getfClecture())
            .append("fClevel", getfClevel())
            .append("fClass", getfClass())
            .append("fChour", getfChour())
            .toString();
    }
}
