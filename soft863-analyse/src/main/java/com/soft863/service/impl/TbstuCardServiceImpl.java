package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbstuCard;
import com.soft863.mapper.TbstuCardMapper;
import com.soft863.service.ITbstuCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 学生一卡通Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbstuCardServiceImpl implements ITbstuCardService 
{
    @Autowired
    private TbstuCardMapper tbstuCardMapper;

    /**
     * 查询学生一卡通
     * 
     * @param fId 学生一卡通主键
     * @return 学生一卡通
     */
    @Override
    public TbstuCard selectTbstuCardByFId(Long fId)
    {
        return tbstuCardMapper.selectTbstuCardByFId(fId);
    }

    /**
     * 查询学生一卡通列表
     * 
     * @param tbstuCard 学生一卡通
     * @return 学生一卡通
     */
    @Override
    public List<TbstuCard> selectTbstuCardList(TbstuCard tbstuCard)
    {
        return tbstuCardMapper.selectTbstuCardList(tbstuCard);
    }

    /**
     * 新增学生一卡通
     * 
     * @param tbstuCard 学生一卡通
     * @return 结果
     */
    @Override
    public int insertTbstuCard(TbstuCard tbstuCard)
    {
        return tbstuCardMapper.insertTbstuCard(tbstuCard);
    }

    /**
     * 修改学生一卡通
     * 
     * @param tbstuCard 学生一卡通
     * @return 结果
     */
    @Override
    public int updateTbstuCard(TbstuCard tbstuCard)
    {
        return tbstuCardMapper.updateTbstuCard(tbstuCard);
    }

    /**
     * 批量删除学生一卡通
     * 
     * @param fIds 需要删除的学生一卡通主键
     * @return 结果
     */
    @Override
    public int deleteTbstuCardByFIds(String fIds)
    {
        return tbstuCardMapper.deleteTbstuCardByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生一卡通信息
     * 
     * @param fId 学生一卡通主键
     * @return 结果
     */
    @Override
    public int deleteTbstuCardByFId(Long fId)
    {
        return tbstuCardMapper.deleteTbstuCardByFId(fId);
    }

    /**
     * 每小时人数
     * @return
     */
    @Override
    public List<Map<String, Object>> getCountPerHour() {
        return tbstuCardMapper.queryCountPerHour();
    }

    /**
     * 每月消费
     * @return
     */
    @Override
    public List<Map<String, Object>> getCountPerMonth() {
        return tbstuCardMapper.queryCountPerMonth();
    }

    @Override
    public List<Map<String, Object>> getAllStuConsume() {
        return tbstuCardMapper.queryAllStuConsume();
    }

    /**
     * 统计消费top10
     * @return
     */
    @Override
    public List<Map<String, Object>> getTenStuConsume() {
        return tbstuCardMapper.queryTenStuConsume();
    }

    @Override
    public List<Map<String, Object>> getCountperType() {
        return tbstuCardMapper.queryCountPerType();
    }
}
