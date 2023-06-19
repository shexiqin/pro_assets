package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbstuAwardinfoMapper;
import com.soft863.domain.TbstuAwardinfo;
import com.soft863.service.ITbstuAwardinfoService;
import com.soft863.common.core.text.Convert;

/**
 * 学生获奖信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
@Service
public class TbstuAwardinfoServiceImpl implements ITbstuAwardinfoService 
{
    @Autowired
    private TbstuAwardinfoMapper tbstuAwardinfoMapper;

    /**
     * 查询学生获奖信息
     * 
     * @param fId 学生获奖信息主键
     * @return 学生获奖信息
     */
    @Override
    public TbstuAwardinfo selectTbstuAwardinfoByFId(Long fId)
    {
        return tbstuAwardinfoMapper.selectTbstuAwardinfoByFId(fId);
    }

    /**
     * 查询学生获奖信息列表
     * 
     * @param tbstuAwardinfo 学生获奖信息
     * @return 学生获奖信息
     */
    @Override
    public List<TbstuAwardinfo> selectTbstuAwardinfoList(TbstuAwardinfo tbstuAwardinfo)
    {
        return tbstuAwardinfoMapper.selectTbstuAwardinfoList(tbstuAwardinfo);
    }

    /**
     * 新增学生获奖信息
     * 
     * @param tbstuAwardinfo 学生获奖信息
     * @return 结果
     */
    @Override
    public int insertTbstuAwardinfo(TbstuAwardinfo tbstuAwardinfo)
    {
        return tbstuAwardinfoMapper.insertTbstuAwardinfo(tbstuAwardinfo);
    }

    /**
     * 修改学生获奖信息
     * 
     * @param tbstuAwardinfo 学生获奖信息
     * @return 结果
     */
    @Override
    public int updateTbstuAwardinfo(TbstuAwardinfo tbstuAwardinfo)
    {
        return tbstuAwardinfoMapper.updateTbstuAwardinfo(tbstuAwardinfo);
    }

    /**
     * 批量删除学生获奖信息
     * 
     * @param fIds 需要删除的学生获奖信息主键
     * @return 结果
     */
    @Override
    public int deleteTbstuAwardinfoByFIds(String fIds)
    {
        return tbstuAwardinfoMapper.deleteTbstuAwardinfoByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生获奖信息信息
     * 
     * @param fId 学生获奖信息主键
     * @return 结果
     */
    @Override
    public int deleteTbstuAwardinfoByFId(Long fId)
    {
        return tbstuAwardinfoMapper.deleteTbstuAwardinfoByFId(fId);
    }
}
