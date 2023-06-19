package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbstuInfo;

/**
 * 学生基本信息Service接口
 * 
 * @author ybb
 * @date 2023-06-02
 */
public interface ITbstuInfoService 
{
    /**
     * 查询学生基本信息
     * 
     * @param fId 学生基本信息主键
     * @return 学生基本信息
     */
    public TbstuInfo selectTbstuInfoByFId(Long fId);

    /**
     * 查询学生基本信息列表
     * 
     * @param tbstuInfo 学生基本信息
     * @return 学生基本信息集合
     */
    public List<TbstuInfo> selectTbstuInfoList(TbstuInfo tbstuInfo);

    /**
     * 新增学生基本信息
     * 
     * @param tbstuInfo 学生基本信息
     * @return 结果
     */
    public int insertTbstuInfo(TbstuInfo tbstuInfo);

    /**
     * 修改学生基本信息
     * 
     * @param tbstuInfo 学生基本信息
     * @return 结果
     */
    public int updateTbstuInfo(TbstuInfo tbstuInfo);

    /**
     * 批量删除学生基本信息
     * 
     * @param fIds 需要删除的学生基本信息主键集合
     * @return 结果
     */
    public int deleteTbstuInfoByFIds(String fIds);

    /**
     * 删除学生基本信息信息
     * 
     * @param fId 学生基本信息主键
     * @return 结果
     */
    public int deleteTbstuInfoByFId(Long fId);
}
