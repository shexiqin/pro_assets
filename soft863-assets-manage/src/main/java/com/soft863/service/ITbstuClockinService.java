package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbstuClockin;

/**
 * 学生打卡Service接口
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public interface ITbstuClockinService 
{
    /**
     * 查询学生打卡
     * 
     * @param fId 学生打卡主键
     * @return 学生打卡
     */
    public TbstuClockin selectTbstuClockinByFId(Long fId);

    /**
     * 查询学生打卡列表
     * 
     * @param tbstuClockin 学生打卡
     * @return 学生打卡集合
     */
    public List<TbstuClockin> selectTbstuClockinList(TbstuClockin tbstuClockin);

    /**
     * 新增学生打卡
     * 
     * @param tbstuClockin 学生打卡
     * @return 结果
     */
    public int insertTbstuClockin(TbstuClockin tbstuClockin);

    /**
     * 修改学生打卡
     * 
     * @param tbstuClockin 学生打卡
     * @return 结果
     */
    public int updateTbstuClockin(TbstuClockin tbstuClockin);

    /**
     * 批量删除学生打卡
     * 
     * @param fIds 需要删除的学生打卡主键集合
     * @return 结果
     */
    public int deleteTbstuClockinByFIds(String fIds);

    /**
     * 删除学生打卡信息
     * 
     * @param fId 学生打卡主键
     * @return 结果
     */
    public int deleteTbstuClockinByFId(Long fId);
}
