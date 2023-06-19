package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbstuInfoMapper;
import com.soft863.domain.TbstuInfo;
import com.soft863.service.ITbstuInfoService;
import com.soft863.common.core.text.Convert;

/**
 * 学生基本信息Service业务层处理
 * 
 * @author ybb
 * @date 2023-06-02
 */
@Service
public class TbstuInfoServiceImpl implements ITbstuInfoService 
{
    @Autowired
    private TbstuInfoMapper tbstuInfoMapper;

    /**
     * 查询学生基本信息
     * 
     * @param fId 学生基本信息主键
     * @return 学生基本信息
     */
    @Override
    public TbstuInfo selectTbstuInfoByFId(Long fId)
    {
        return tbstuInfoMapper.selectTbstuInfoByFId(fId);
    }

    /**
     * 查询学生基本信息列表
     * 
     * @param tbstuInfo 学生基本信息
     * @return 学生基本信息
     */
    @Override
    public List<TbstuInfo> selectTbstuInfoList(TbstuInfo tbstuInfo)
    {
        return tbstuInfoMapper.selectTbstuInfoList(tbstuInfo);
    }

    /**
     * 新增学生基本信息
     * 
     * @param tbstuInfo 学生基本信息
     * @return 结果
     */
    @Override
    public int insertTbstuInfo(TbstuInfo tbstuInfo)
    {
        return tbstuInfoMapper.insertTbstuInfo(tbstuInfo);
    }

    /**
     * 修改学生基本信息
     * 
     * @param tbstuInfo 学生基本信息
     * @return 结果
     */
    @Override
    public int updateTbstuInfo(TbstuInfo tbstuInfo)
    {
        return tbstuInfoMapper.updateTbstuInfo(tbstuInfo);
    }

    /**
     * 批量删除学生基本信息
     * 
     * @param fIds 需要删除的学生基本信息主键
     * @return 结果
     */
    @Override
    public int deleteTbstuInfoByFIds(String fIds)
    {
        return tbstuInfoMapper.deleteTbstuInfoByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生基本信息信息
     * 
     * @param fId 学生基本信息主键
     * @return 结果
     */
    @Override
    public int deleteTbstuInfoByFId(Long fId)
    {
        return tbstuInfoMapper.deleteTbstuInfoByFId(fId);
    }
}
