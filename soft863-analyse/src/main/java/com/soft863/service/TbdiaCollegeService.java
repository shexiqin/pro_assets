package com.soft863.service;

import com.soft863.domain.TbdiaCollege;
import com.soft863.domain.TbdiaMajor;

import java.util.List;

public interface TbdiaCollegeService {

    List<TbdiaMajor> getEmpRate();

    List<TbdiaMajor> getEmpRateAsc();

    List<TbdiaCollege> getTeaEdu();


    List<TbdiaCollege> getIncAndExp();

    //获取学校简介
    String getArea();

    String getProfile();

    String getfArea();

    String selectAllStu();

    String selectAllTeacher();
}
