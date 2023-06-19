package com.soft863.service;

import com.soft863.domain.TbperStaff;
import com.soft863.domain.TbquaDetail;
import com.soft863.domain.TbstuInfo;

import java.util.List;

public interface QuaDataDetectionService {
    //学生教务信息缺失检测
    List<TbstuInfo> stuLoseEduInfo();

    //学生教务信息缺失检测
    List<TbstuInfo> stuLosePerInfo();

    //教师教务信息缺失检测
    List<TbperStaff> teaLoseEduInfo();

    //教师教务信息缺失检测
    List<TbperStaff> teaLosePerInfo();

    //学生冗余检测
    List<TbstuInfo> stuMore();

    //教师冗余检测
    List<TbperStaff> perMore();

    int insertTbquaDetail(TbquaDetail tbquaDetail);

    int isHave(TbquaDetail tbquaDetail);

    int count(TbquaDetail tbquaDetail);
}
