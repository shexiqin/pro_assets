package com.soft863.mapper;

import java.util.List;
import java.util.Map;

import com.soft863.domain.TbdiaTeach;

/**
 * 教师画像Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public interface TbdiaTeachMapper 
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
     * 删除教师画像
     * 
     * @param fId 教师画像主键
     * @return 结果
     */
    public int deleteTbdiaTeachByFId(Long fId);

    /**
     * 批量删除教师画像
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbdiaTeachByFIds(String[] fIds);


    /**
     * 查询校内老师个数
     * @param tbdiaTeach
     * @return
     */

    int electTbdiaTeachCouint1(TbdiaTeach tbdiaTeach);

    /**
     * 校外老师统计
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachOutCount(TbdiaTeach tbdiaTeach);

    /**
     * 获奖老师统计
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachAwardsCoun(TbdiaTeach tbdiaTeach);

    /**
     * 科研教师人数
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachRescarchCount(TbdiaTeach tbdiaTeach);

    TbdiaTeach tbdiaTeachByFId(String id);

    /**
     * 查询女生数量
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
     *国家级
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachAwardTypeCount1(TbdiaTeach tbdiaTeach);

    /**
     * 省级
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachAwardTypeCount2(TbdiaTeach tbdiaTeach);

    /**
     * 市级
     * @param tbdiaTeach
     * @return
     */
    int tbdiaTeachAwardTypeCount3(TbdiaTeach tbdiaTeach);

    List<TbdiaTeach> selectTeacherByMajorCode(String majorCode);


    List<Map<String, Object>> getTbdiaTeachEdu();

    List<Object> getTbdiaTeachName();

    List<Object> getTbdiaTeachAge();

    List<Map<String, Object>> getCountTeachType();

    List<Map<String, Object>> getCountSexType();

    List<Map<String, String>> selectTeacherCount();

    List<Map<String, Object>> selectTeacherType();
}
