package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbstuInfo;

/**
 * 学生基本信息Mapper接口
 * 
 * @author ybb
 * @date 2023-06-02
 */
public interface TbstuInfoMapper 
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
     * 删除学生基本信息
     * 
     * @param fId 学生基本信息主键
     * @return 结果
     */
    public int deleteTbstuInfoByFId(Long fId);

    /**
     * 批量删除学生基本信息
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbstuInfoByFIds(String[] fIds);
}
