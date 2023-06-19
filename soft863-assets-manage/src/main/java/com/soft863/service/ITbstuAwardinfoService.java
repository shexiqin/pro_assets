package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbstuAwardinfo;

/**
 * 学生获奖信息Service接口
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
public interface ITbstuAwardinfoService 
{
    /**
     * 查询学生获奖信息
     * 
     * @param fId 学生获奖信息主键
     * @return 学生获奖信息
     */
    public TbstuAwardinfo selectTbstuAwardinfoByFId(Long fId);

    /**
     * 查询学生获奖信息列表
     * 
     * @param tbstuAwardinfo 学生获奖信息
     * @return 学生获奖信息集合
     */
    public List<TbstuAwardinfo> selectTbstuAwardinfoList(TbstuAwardinfo tbstuAwardinfo);

    /**
     * 新增学生获奖信息
     * 
     * @param tbstuAwardinfo 学生获奖信息
     * @return 结果
     */
    public int insertTbstuAwardinfo(TbstuAwardinfo tbstuAwardinfo);

    /**
     * 修改学生获奖信息
     * 
     * @param tbstuAwardinfo 学生获奖信息
     * @return 结果
     */
    public int updateTbstuAwardinfo(TbstuAwardinfo tbstuAwardinfo);

    /**
     * 批量删除学生获奖信息
     * 
     * @param fIds 需要删除的学生获奖信息主键集合
     * @return 结果
     */
    public int deleteTbstuAwardinfoByFIds(String fIds);

    /**
     * 删除学生获奖信息信息
     * 
     * @param fId 学生获奖信息主键
     * @return 结果
     */
    public int deleteTbstuAwardinfoByFId(Long fId);
}
