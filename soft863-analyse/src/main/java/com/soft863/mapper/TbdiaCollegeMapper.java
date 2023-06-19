package com.soft863.mapper;

import com.soft863.domain.TbdiaCollege;
import com.soft863.domain.TbdiaMajor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TbdiaCollegeMapper {

    @Select("select f_maj fMaj,f_mnum fMnum,f_mdevelop fMdevelop,f_mpass fMpass from tbdia_major ORDER BY f_mpass desc")
    List<TbdiaMajor> getEmpRate();
    @Select("select f_maj fMaj,f_mnum fMnum,f_mdevelop fMdevelop,f_mpass fMpass from tbdia_major ORDER BY f_mpass asc")
    List<TbdiaMajor> getEmpRateAsc();
    @Select("select f_edu fEdu,count(1) eduCount from tbdia_teach group by f_edu")
    List<TbdiaCollege> getTeaEdu();
    @Select("select inc.f_create_time fCreateTime , inc.f_tuition fTuition,exp.f_other fOther from tbfin_income inc left join tbfin_expend exp on inc.f_create_time = exp.f_create_time")
    List<TbdiaCollege> getIncAndEmp();
    @Select("select config_value from sys_config where config_key = 'cArea'")
    String getArea();
    @Select("select config_value from sys_config where config_key = 'profile'")
    String getProfile();
    @Select("select config_value from sys_config where config_key = 'fArea'")
    String getfArea();

    @Select("select count(1) from tbdia_student")
    String selectAllStu();

    @Select("select count(1) from tbdia_teach")
    String selectAllTeacher();
}
