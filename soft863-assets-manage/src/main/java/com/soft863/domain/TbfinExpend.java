package com.soft863.domain;

import com.soft863.common.annotation.Excel;
import com.soft863.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学校经费支出对象 tbfin_expend
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public class TbfinExpend extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long fId;

    /** 征地（万元） */
    @Excel(name = "征地", readConverterExp = "万=元")
    private Double fLandBuy;

    /** 设施建设（万元） */
    @Excel(name = "设施建设", readConverterExp = "万=元")
    private Double fFacilityConstruction;

    /** 设备采购--合计 */
    @Excel(name = "设备采购--合计")
    private Double fFacilityBuy;

    /** 教学、科研设备采购 */
    @Excel(name = "教学、科研设备采购")
    private Double fFacilityTeach;

    /** 图书费（万元） */
    @Excel(name = "图书费", readConverterExp = "万=元")
    private Double fBookBuy;

    /** 实(验) 训耗材费 */
    @Excel(name = "实(验) 训耗材费")
    private Double fPracticalFacility;

    /** 教学仪器设备维修费 */
    @Excel(name = "教学仪器设备维修费")
    private Double fTeachFacility;

    /** 实习专项经费 */
    @Excel(name = "实习专项经费")
    private Double fPracticeSpecial;

    /** 聘请兼职教师经费* */
    @Excel(name = "聘请兼职教师经费*")
    private Double fPartTimeTeach;

    /** 体育维持费 */
    @Excel(name = "体育维持费")
    private Double fSports;

    /** 思政工作专项经费* */
    @Excel(name = "思政工作专项经费*")
    private Double fPoliticalSpecial;

    /** 网络思政工作经费* */
    @Excel(name = "网络思政工作经费*")
    private Double fPolitical;

    /** 合作办学项目经费 */
    @Excel(name = "合作办学项目经费")
    private Double fSchoolProject;

    /** 实习责任保险费 */
    @Excel(name = "实习责任保险费")
    private Double fPracticeInsurance;

    /** 其他日常教学经费 */
    @Excel(name = "其他日常教学经费")
    private Double fOtherTeach;

    /** 课程开发经费 */
    @Excel(name = "课程开发经费")
    private Double fCourse;

    /** 教材建设经费 */
    @Excel(name = "教材建设经费")
    private Double fTextbook;

    /** 教学改革经费 */
    @Excel(name = "教学改革经费")
    private Double fTeachingReform;

    /** 其他教改和科研经费 */
    @Excel(name = "其他教改和科研经费")
    private Double fEducationReform;

    /** 科学研究经费 */
    @Excel(name = "科学研究经费")
    private Double fResearch;

    /** 技能大师工作室建设经费 */
    @Excel(name = "技能大师工作室建设经费")
    private Double fSkillStudio;

    /** 高水平创新团队建设经费 */
    @Excel(name = "高水平创新团队建设经费")
    private Double fInnovateTeam;

    /** 人才引进费 */
    @Excel(name = "人才引进费")
    private Double fTalents;

    /** 教职工培训进修经费 */
    @Excel(name = "教职工培训进修经费")
    private Double fStaffTrain;

    /** 其他师资队伍建设经费 */
    @Excel(name = "其他师资队伍建设经费")
    private Double fOfftcots;

    /** 人员总工资 */
    @Excel(name = "人员总工资")
    private Double fSalary;

    /** 教学、科研人员工资 */
    @Excel(name = "教学、科研人员工资")
    private Double fResearchPeople;

    /** 学生活动经费 */
    @Excel(name = "学生活动经费")
    private Double fActivity;

    /** 大学生创新创业经费 */
    @Excel(name = "大学生创新创业经费")
    private Double fStartBusiness;

    /** 心理健康专项经费 */
    @Excel(name = "心理健康专项经费")
    private Double fMental;

    /** 奖助学金 */
    @Excel(name = "奖助学金")
    private Double fScholarship;

    /** 党务及思政工作队伍建设经费（万元）* */
    @Excel(name = "党务及思政工作队伍建设经费", readConverterExp = "万=元")
    private Double fGovernment;

    /** 偿还债务本金支出（万元） */
    @Excel(name = "偿还债务本金支出", readConverterExp = "万=元")
    private Double fRepayment;

    /** 其他支出（万元） */
    @Excel(name = "其他支出", readConverterExp = "万=元")
    private Double fOther;

    /** 填报人 */
    @Excel(name = "填报人")
    private String fCreator;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setfLandBuy(Double fLandBuy) 
    {
        this.fLandBuy = fLandBuy;
    }

    public Double getfLandBuy() 
    {
        return fLandBuy;
    }
    public void setfFacilityConstruction(Double fFacilityConstruction) 
    {
        this.fFacilityConstruction = fFacilityConstruction;
    }

    public Double getfFacilityConstruction() 
    {
        return fFacilityConstruction;
    }
    public void setfFacilityBuy(Double fFacilityBuy) 
    {
        this.fFacilityBuy = fFacilityBuy;
    }

    public Double getfFacilityBuy() 
    {
        return fFacilityBuy;
    }
    public void setfFacilityTeach(Double fFacilityTeach) 
    {
        this.fFacilityTeach = fFacilityTeach;
    }

    public Double getfFacilityTeach() 
    {
        return fFacilityTeach;
    }
    public void setfBookBuy(Double fBookBuy) 
    {
        this.fBookBuy = fBookBuy;
    }

    public Double getfBookBuy() 
    {
        return fBookBuy;
    }
    public void setfPracticalFacility(Double fPracticalFacility) 
    {
        this.fPracticalFacility = fPracticalFacility;
    }

    public Double getfPracticalFacility() 
    {
        return fPracticalFacility;
    }
    public void setfTeachFacility(Double fTeachFacility) 
    {
        this.fTeachFacility = fTeachFacility;
    }

    public Double getfTeachFacility() 
    {
        return fTeachFacility;
    }
    public void setfPracticeSpecial(Double fPracticeSpecial) 
    {
        this.fPracticeSpecial = fPracticeSpecial;
    }

    public Double getfPracticeSpecial() 
    {
        return fPracticeSpecial;
    }
    public void setfPartTimeTeach(Double fPartTimeTeach) 
    {
        this.fPartTimeTeach = fPartTimeTeach;
    }

    public Double getfPartTimeTeach() 
    {
        return fPartTimeTeach;
    }
    public void setfSports(Double fSports) 
    {
        this.fSports = fSports;
    }

    public Double getfSports() 
    {
        return fSports;
    }
    public void setfPoliticalSpecial(Double fPoliticalSpecial) 
    {
        this.fPoliticalSpecial = fPoliticalSpecial;
    }

    public Double getfPoliticalSpecial() 
    {
        return fPoliticalSpecial;
    }
    public void setfPolitical(Double fPolitical) 
    {
        this.fPolitical = fPolitical;
    }

    public Double getfPolitical() 
    {
        return fPolitical;
    }
    public void setfSchoolProject(Double fSchoolProject) 
    {
        this.fSchoolProject = fSchoolProject;
    }

    public Double getfSchoolProject() 
    {
        return fSchoolProject;
    }
    public void setfPracticeInsurance(Double fPracticeInsurance) 
    {
        this.fPracticeInsurance = fPracticeInsurance;
    }

    public Double getfPracticeInsurance() 
    {
        return fPracticeInsurance;
    }
    public void setfOtherTeach(Double fOtherTeach) 
    {
        this.fOtherTeach = fOtherTeach;
    }

    public Double getfOtherTeach() 
    {
        return fOtherTeach;
    }
    public void setfCourse(Double fCourse) 
    {
        this.fCourse = fCourse;
    }

    public Double getfCourse() 
    {
        return fCourse;
    }
    public void setfTextbook(Double fTextbook) 
    {
        this.fTextbook = fTextbook;
    }

    public Double getfTextbook() 
    {
        return fTextbook;
    }
    public void setfTeachingReform(Double fTeachingReform) 
    {
        this.fTeachingReform = fTeachingReform;
    }

    public Double getfTeachingReform() 
    {
        return fTeachingReform;
    }
    public void setfEducationReform(Double fEducationReform) 
    {
        this.fEducationReform = fEducationReform;
    }

    public Double getfEducationReform() 
    {
        return fEducationReform;
    }
    public void setfResearch(Double fResearch) 
    {
        this.fResearch = fResearch;
    }

    public Double getfResearch() 
    {
        return fResearch;
    }
    public void setfSkillStudio(Double fSkillStudio) 
    {
        this.fSkillStudio = fSkillStudio;
    }

    public Double getfSkillStudio() 
    {
        return fSkillStudio;
    }
    public void setfInnovateTeam(Double fInnovateTeam) 
    {
        this.fInnovateTeam = fInnovateTeam;
    }

    public Double getfInnovateTeam() 
    {
        return fInnovateTeam;
    }
    public void setfTalents(Double fTalents) 
    {
        this.fTalents = fTalents;
    }

    public Double getfTalents() 
    {
        return fTalents;
    }
    public void setfStaffTrain(Double fStaffTrain) 
    {
        this.fStaffTrain = fStaffTrain;
    }

    public Double getfStaffTrain() 
    {
        return fStaffTrain;
    }
    public void setfOfftcots(Double fOfftcots) 
    {
        this.fOfftcots = fOfftcots;
    }

    public Double getfOfftcots() 
    {
        return fOfftcots;
    }
    public void setfSalary(Double fSalary) 
    {
        this.fSalary = fSalary;
    }

    public Double getfSalary() 
    {
        return fSalary;
    }
    public void setfResearchPeople(Double fResearchPeople) 
    {
        this.fResearchPeople = fResearchPeople;
    }

    public Double getfResearchPeople() 
    {
        return fResearchPeople;
    }
    public void setfActivity(Double fActivity) 
    {
        this.fActivity = fActivity;
    }

    public Double getfActivity() 
    {
        return fActivity;
    }
    public void setfStartBusiness(Double fStartBusiness) 
    {
        this.fStartBusiness = fStartBusiness;
    }

    public Double getfStartBusiness() 
    {
        return fStartBusiness;
    }
    public void setfMental(Double fMental) 
    {
        this.fMental = fMental;
    }

    public Double getfMental() 
    {
        return fMental;
    }
    public void setfScholarship(Double fScholarship) 
    {
        this.fScholarship = fScholarship;
    }

    public Double getfScholarship() 
    {
        return fScholarship;
    }
    public void setfGovernment(Double fGovernment) 
    {
        this.fGovernment = fGovernment;
    }

    public Double getfGovernment() 
    {
        return fGovernment;
    }
    public void setfRepayment(Double fRepayment) 
    {
        this.fRepayment = fRepayment;
    }

    public Double getfRepayment() 
    {
        return fRepayment;
    }
    public void setfOther(Double fOther) 
    {
        this.fOther = fOther;
    }

    public Double getfOther() 
    {
        return fOther;
    }
    public void setfCreator(String fCreator) 
    {
        this.fCreator = fCreator;
    }

    public String getfCreator() 
    {
        return fCreator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fLandBuy", getfLandBuy())
            .append("fFacilityConstruction", getfFacilityConstruction())
            .append("fFacilityBuy", getfFacilityBuy())
            .append("fFacilityTeach", getfFacilityTeach())
            .append("fBookBuy", getfBookBuy())
            .append("fPracticalFacility", getfPracticalFacility())
            .append("fTeachFacility", getfTeachFacility())
            .append("fPracticeSpecial", getfPracticeSpecial())
            .append("fPartTimeTeach", getfPartTimeTeach())
            .append("fSports", getfSports())
            .append("fPoliticalSpecial", getfPoliticalSpecial())
            .append("fPolitical", getfPolitical())
            .append("fSchoolProject", getfSchoolProject())
            .append("fPracticeInsurance", getfPracticeInsurance())
            .append("fOtherTeach", getfOtherTeach())
            .append("fCourse", getfCourse())
            .append("fTextbook", getfTextbook())
            .append("fTeachingReform", getfTeachingReform())
            .append("fEducationReform", getfEducationReform())
            .append("fResearch", getfResearch())
            .append("fSkillStudio", getfSkillStudio())
            .append("fInnovateTeam", getfInnovateTeam())
            .append("fTalents", getfTalents())
            .append("fStaffTrain", getfStaffTrain())
            .append("fOfftcots", getfOfftcots())
            .append("fSalary", getfSalary())
            .append("fResearchPeople", getfResearchPeople())
            .append("fActivity", getfActivity())
            .append("fStartBusiness", getfStartBusiness())
            .append("fMental", getfMental())
            .append("fScholarship", getfScholarship())
            .append("fGovernment", getfGovernment())
            .append("fRepayment", getfRepayment())
            .append("fOther", getfOther())
            .append("fCreator", getfCreator())
            .toString();
    }
}
