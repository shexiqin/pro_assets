package com.soft863.mapper;

import com.soft863.domain.TbperStaff;
import com.soft863.domain.TbquaDetail;
import com.soft863.domain.TbstuInfo;

import java.util.List;

public interface DataDetectionMapper {
    //学生教务信息缺失检测
    List<TbstuInfo> stuLoseEduInfo();

    //学生教务信息缺失检测
    List<TbstuInfo> stuLosePerInfo();

    //教师教务信息缺失检测
    List<TbperStaff> teaLoseEduInfo();

    //教师教务信息缺失检测
    List<TbperStaff> teaLosePerInfo();

    List<TbstuInfo> stuMore();

    List<TbperStaff> perMore();

    int insertTbquaDetail(TbquaDetail tbquaDetail);

    int isHave(TbquaDetail tbquaDetail);

    int count(TbquaDetail tbquaDetail);
}
