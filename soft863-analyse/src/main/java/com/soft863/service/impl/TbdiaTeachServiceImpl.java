package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbdiaTeach;
import com.soft863.mapper.TbdiaTeachMapper;
import com.soft863.service.ITbdiaTeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 教师画像Service业务层处理
 *
 * @author ruoyi
 * @date 2023-06-01
 */
@Service
public class TbdiaTeachServiceImpl implements ITbdiaTeachService {

    @Autowired
    private TbdiaTeachMapper tbdiaTeachMapper;

    /**
     * 查询教师画像
     *
     * @param fId 教师画像主键
     * @return 教师画像
     */
    @Override
    public TbdiaTeach selectTbdiaTeachByFId(Long fId) {
        return tbdiaTeachMapper.selectTbdiaTeachByFId(fId);
    }

    /**
     * 查询教师画像列表
     *
     * @param tbdiaTeach 教师画像
     * @return 教师画像
     */
    @Override
    public List<TbdiaTeach> selectTbdiaTeachList(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.selectTbdiaTeachList(tbdiaTeach);
    }

    /**
     * 新增教师画像
     *
     * @param tbdiaTeach 教师画像
     * @return 结果
     */
    @Override
    public int insertTbdiaTeach(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.insertTbdiaTeach(tbdiaTeach);
    }

    /**
     * 修改教师画像
     *
     * @param tbdiaTeach 教师画像
     * @return 结果
     */
    @Override
    public int updateTbdiaTeach(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.updateTbdiaTeach(tbdiaTeach);
    }

    /**
     * 批量删除教师画像
     *
     * @param fIds 需要删除的教师画像主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaTeachByFIds(String fIds) {
        return tbdiaTeachMapper.deleteTbdiaTeachByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除教师画像信息
     *
     * @param fId 教师画像主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaTeachByFId(Long fId) {
        return tbdiaTeachMapper.deleteTbdiaTeachByFId(fId);
    }

    @Override
    public List<TbdiaTeach> selectTeacherByMajorCode(String majorCode) {
        return tbdiaTeachMapper.selectTeacherByMajorCode(majorCode);
    }

    @Override
    public List<Map<String, String>> selectTeacherCount() {
        return tbdiaTeachMapper.selectTeacherCount();
    }

    @Override
    public List<Map<String, Object>> getTeachType() {
        return tbdiaTeachMapper.selectTeacherType();
    }


    /**
     * 查询校内老师人数
     *
     * @param tbdiaTeach
     * @return
     */
    @Override
    public int selectTbdiaTeachCouint1(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.electTbdiaTeachCouint1(tbdiaTeach);

    }

    /**
     * 校外老师统计
     *
     * @param tbdiaTeach
     * @return
     */
    @Override
    public int selectTbdiaTeachOutCount2(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.tbdiaTeachOutCount(tbdiaTeach);
    }

    /**
     * 获奖教师人数
     * @param tbdiaTeach
     * @return
     */
    @Override
    public int selectTbdiaTeachAwardsCount(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.tbdiaTeachAwardsCoun(tbdiaTeach);
    }

    /**
     * 科研教师人数
     * @param tbdiaTeach
     * @return
     */
    @Override
    public int selectTbdiaTeachRescarchCount(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.tbdiaTeachRescarchCount(tbdiaTeach);
    }

    /**
     * 查询科研人数
     * @param id
     * @return
     */
    @Override
    public TbdiaTeach selectTeachById(String id) {
        return tbdiaTeachMapper.tbdiaTeachByFId(id);
    }

    /**
     * 查询女性
     * @param tbdiaTeach
     * @return
     */
    @Override
    public int tbdiaTeachSexCount1(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.tbdiaTeachSexCount1(tbdiaTeach);
    }

    @Override
    public int tbdiaTeachSexCount2(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.tbdiaTeachSexCount2(tbdiaTeach);
    }

    /**
     * 国家级奖项
     * @param tbdiaTeach
     * @return
     */
    @Override
    public int tbdiaTeachAwardTypeCount1(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.tbdiaTeachAwardTypeCount1(tbdiaTeach);
    }

    @Override
    public int tbdiaTeachAwardTypeCount2(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.tbdiaTeachAwardTypeCount2(tbdiaTeach);
    }

    /**
     * 市级
     * @param tbdiaTeach
     * @return
     */
    @Override
    public int tbdiaTeachAwardTypeCount3(TbdiaTeach tbdiaTeach) {
        return tbdiaTeachMapper.tbdiaTeachAwardTypeCount3(tbdiaTeach);
    }

    /**
     * 性别类型
     * @return
     */
    @Override
    public List<Map<String, Object>> getCountSexType() {
        return tbdiaTeachMapper.getCountSexType();
    }

    /**
     * 教师类型
     * @return
     */
    @Override
    public List<Map<String, Object>> getCountTeachType() {
        return tbdiaTeachMapper.getCountTeachType();
    }

    @Override
    public List<Object> tbdiaTeachAge() {
        return tbdiaTeachMapper.getTbdiaTeachAge();
    }

    /***
     * 教师姓名
     * @return
     */
    @Override
    public List<Object> tbdiaTeachName() {
        return tbdiaTeachMapper.getTbdiaTeachName();
    }

    @Override
    public List<Map<String, Object>> tbdiaTeachEdu() {
        return tbdiaTeachMapper.getTbdiaTeachEdu();
    }
}
