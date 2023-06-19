package com.soft863.service.impl;

import com.soft863.domain.TbdiaCollege;
import com.soft863.domain.TbdiaMajor;
import com.soft863.mapper.TbdiaCollegeMapper;
import com.soft863.service.TbdiaCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbdiaCollegeServiceImpl implements TbdiaCollegeService {

    @Autowired
    private TbdiaCollegeMapper tbdiaCollegeMapper;

    @Override
    public List<TbdiaMajor> getEmpRate() {
        List<TbdiaMajor> empRate = tbdiaCollegeMapper.getEmpRate();
        for (TbdiaMajor tbdiaMajor : empRate) {
            System.out.println(tbdiaMajor);
        }
        return tbdiaCollegeMapper.getEmpRate();
    }

    @Override
    public List<TbdiaMajor> getEmpRateAsc() {
        return tbdiaCollegeMapper.getEmpRateAsc();
    }

    @Override
    public List<TbdiaCollege> getTeaEdu() {

        return tbdiaCollegeMapper.getTeaEdu();
    }

    @Override
    public List<TbdiaCollege> getIncAndExp() {
        return tbdiaCollegeMapper.getIncAndEmp();
    }

    @Override
    public String getArea() {
        return tbdiaCollegeMapper.getArea();
    }

    @Override
    public String getProfile() {
        return tbdiaCollegeMapper.getProfile();
    }

    @Override
    public String getfArea() {
        return tbdiaCollegeMapper.getfArea();
    }

    @Override
    public String selectAllStu() {
        return tbdiaCollegeMapper.selectAllStu();
    }

    @Override
    public String selectAllTeacher() {
        return tbdiaCollegeMapper.selectAllTeacher();
    }


}
