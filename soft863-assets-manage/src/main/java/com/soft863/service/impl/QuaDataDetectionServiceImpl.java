package com.soft863.service.impl;

import com.soft863.domain.TbperStaff;
import com.soft863.domain.TbquaDetail;
import com.soft863.domain.TbstuInfo;
import com.soft863.mapper.DataDetectionMapper;
import com.soft863.service.QuaDataDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuaDataDetectionServiceImpl implements QuaDataDetectionService {
    @Autowired
    DataDetectionMapper dataDetection;

    @Override
    public List<TbstuInfo> stuLoseEduInfo() {
        return dataDetection.stuLoseEduInfo();
    }

    @Override
    public List<TbstuInfo> stuLosePerInfo() {
        return dataDetection.stuLosePerInfo();
    }

    @Override
    public List<TbperStaff> teaLoseEduInfo() {
        return dataDetection.teaLoseEduInfo();
    }

    @Override
    public List<TbperStaff> teaLosePerInfo() {
        return dataDetection.teaLosePerInfo();
    }

    //已毕业学生
    @Override
    public List<TbstuInfo> stuMore() {
        return dataDetection.stuMore();
    }

    @Override
    public List<TbperStaff> perMore() {
        return dataDetection.perMore();
    }

    @Override
    public int insertTbquaDetail(TbquaDetail tbquaDetail) {
        return dataDetection.insertTbquaDetail(tbquaDetail);
    }

    @Override
    public int isHave(TbquaDetail tbquaDetail) {
        return dataDetection.isHave(tbquaDetail);
    }

    @Override
    public int count(TbquaDetail tbquaDetail) {
        return dataDetection.count(tbquaDetail);
    }
}
