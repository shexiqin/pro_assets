package com.soft863.service;

import java.util.List;
import java.util.Map;

import com.soft863.domain.TbdiaTeach;

/**
 * 教师画像Service接口
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public interface ITbdiaTeachService 
{
    /**
     * 查询教师画像
     * 
     * @param fId 教师画像主键
     * @return 教师画像
     */
    public TbdiaTeach selectTbdiaTeachByFId(Long fId);

    /**
     * 查询教师画像列表
     * 
     * @param tbdiaTeach 教师画像
     * @return 教师画像集合
     */
    public List<TbdiaTeach> selectTbdiaTeachList(TbdiaTeach tbdiaTeach);

    /**
     * 新增教师画像
     * 
     * @param tbdiaTeach 教师画像
     * @return 结果
     */
    public int insertTbdiaTeach(TbdiaTeach tbdiaTeach);

    /**
     * 修改教师画像
     * 
     * @param tbdiaTeach 教师画像
     * @return 结果
     */
    public int updateTbdiaTeach(TbdiaTeach tbdiaTeach);

    /**
     * 批量删除教师画像
     * 
     * @param fIds 需要删除的教师画像主键集合
     * @return 结果
     */
    public int deleteTbdiaTeachByFIds(String fIds);

    /**
     * 删除教师画像信息
     * 
     * @param fId 教师画像主键
     * @return 结果
     */
    public int deleteTbdiaTeachByFId(Long fId);

    /**
     * 根据专业代码获取教师信息
     */
    public List<TbdiaTeach> selectTeacherByMajorCode(String majorCode);

    /**
     * 校内老师统计
     * @param tbdiaTeach
     * @return
     */
    int selectTbdiaTeachCouint1(TbdiaTeach tbdiaTeach);

    /**
     * 校外老师统计
     * @param tbdiaTeach
     * @return
     */
    int selectTbdiaTeachOutCount2(TbdiaTeach tbdiaTeach);

    /**
     * 获奖教师人数
     * @param tbdiaTeach
     * @return
     */
    int selectTbdiaTeachAwardsCount(TbdiaTeach tbdiaTeach);

    /**
     * 科研教师人数
     * @param tbdiaTeach
     * @return
     */
    int selectTbdiaTeachRescarchCount(TbdiaTeach tbdiaTeach);

    /**
     * 展示个人信息
     * @param id
     * @return
     */
    TbdiaTeach selectTeachById(String id);

    /**
     * 女
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachSexCount1(TbdiaTeach tbdiaTeach);

    /**
     * 查询男性
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachSexCount2(TbdiaTeach tbdiaTeach);

    /**
     * 国家级
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachAwardTypeCount1(TbdiaTeach tbdiaTeach);

    /**
     * 省级别
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachAwardTypeCount2(TbdiaTeach tbdiaTeach);

    /**
     * 市级别
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachAwardTypeCount3(TbdiaTeach tbdiaTeach);

    /**
     * 性别类型
     * @return
     */
    List<Map<String, Object>> getCountSexType();

    /**
     * 教师类型
     * @return
     */
    List<Map<String, Object>> getCountTeachType();



    /**
     * 教师年龄
     * @return
     */
    List<Object> tbdiaTeachAge();

    /**
     * 教师姓名
     * @return
     */
    List<Object> tbdiaTeachName();

/*
教师学历
 */
    List<Map<String, Object>> tbdiaTeachEdu();


    List<Map<String, String>> selectTeacherCount();

    /**
     * 教师类型
     * @return
     */
    List<Map<String, Object>> getTeachType();
}
