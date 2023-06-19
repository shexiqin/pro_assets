package com.soft863.mapper;

import com.soft863.domain.TbstuCard;

import java.util.List;
import java.util.Map;

/**
 * 学生一卡通Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface TbstuCardMapper 
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
     * 删除学生一卡通
     * 
     * @param fId 学生一卡通主键
     * @return 结果
     */
    public int deleteTbstuCardByFId(Long fId);

    /**
     * 批量删除学生一卡通
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbstuCardByFIds(String[] fIds);

    /**
     * 统计每小时就餐人数
     * @return
     */
    List<Map<String, Object>> queryCountPerHour();


    /**
     * 统计每月消费
     * @return
     */
    List<Map<String, Object>> queryCountPerMonth();

    /**
     * 在校学生消费
     * @return
     */
    List<Map<String, Object>> queryAllStuConsume();

    /**
     * top10消费
     * @return
     */
    List<Map<String, Object>> queryTenStuConsume();

    /**
     * 类型消费次数
     * @return
     */
    List<Map<String, Object>> queryCountPerType();
}
