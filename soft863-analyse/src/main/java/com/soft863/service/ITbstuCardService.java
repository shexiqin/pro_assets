package com.soft863.service;

import com.soft863.domain.TbstuCard;

import java.util.List;
import java.util.Map;

/**
 * 学生一卡通Service接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface ITbstuCardService 
{
    /**
     * 查询学生一卡通
     * 
     * @param fId 学生一卡通主键
     * @return 学生一卡通
     */
    public TbstuCard selectTbstuCardByFId(Long fId);

    /**
     * 查询学生一卡通列表
     * 
     * @param tbstuCard 学生一卡通
     * @return 学生一卡通集合
     */
    public List<TbstuCard> selectTbstuCardList(TbstuCard tbstuCard);

    /**
     * 新增学生一卡通
     * 
     * @param tbstuCard 学生一卡通
     * @return 结果
     */
    public int insertTbstuCard(TbstuCard tbstuCard);

    /**
     * 修改学生一卡通
     * 
     * @param tbstuCard 学生一卡通
     * @return 结果
     */
    public int updateTbstuCard(TbstuCard tbstuCard);

    /**
     * 批量删除学生一卡通
     * 
     * @param fIds 需要删除的学生一卡通主键集合
     * @return 结果
     */
    public int deleteTbstuCardByFIds(String fIds);

    /**
     * 删除学生一卡通信息
     * 
     * @param fId 学生一卡通主键
     * @return 结果
     */
    public int deleteTbstuCardByFId(Long fId);

    /**
     * 每小时人数
     * @return
     */
    List<Map<String, Object>> getCountPerHour();

    /**
     * 每月消费数量
     * @return
     */
    List<Map<String, Object>> getCountPerMonth();

    /**
     * 统计在校学生消费
     * @return
     */
    List<Map<String, Object>> getAllStuConsume();

    /**
     * 统计消费top10
     * @return
     */
    List<Map<String, Object>> getTenStuConsume();

    /**
     * 消费类型次数
     * @return
     */
    List<Map<String, Object>> getCountperType();
}
