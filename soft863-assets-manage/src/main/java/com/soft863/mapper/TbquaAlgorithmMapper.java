package com.soft863.mapper;

import com.soft863.domain.TbquaAlgorithm;

import java.util.List;

/**
 * 算法规则Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface TbquaAlgorithmMapper 
{
    /**
     * 查询算法规则
     * 
     * @param fId 算法规则主键
     * @return 算法规则
     */
    public TbquaAlgorithm selectTbquaAlgorithmByFId(Long fId);

    /**
     * 查询算法规则列表
     * 
     * @param tbquaAlgorithm 算法规则
     * @return 算法规则集合
     */
    public List<TbquaAlgorithm> selectTbquaAlgorithmList(TbquaAlgorithm tbquaAlgorithm);

    /**
     * 新增算法规则
     * 
     * @param tbquaAlgorithm 算法规则
     * @return 结果
     */
    public int insertTbquaAlgorithm(TbquaAlgorithm tbquaAlgorithm);

    /**
     * 修改算法规则
     * 
     * @param tbquaAlgorithm 算法规则
     * @return 结果
     */
    public int updateTbquaAlgorithm(TbquaAlgorithm tbquaAlgorithm);

    /**
     * 删除算法规则
     * 
     * @param fId 算法规则主键
     * @return 结果
     */
    public int deleteTbquaAlgorithmByFId(Long fId);

    /**
     * 批量删除算法规则
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbquaAlgorithmByFIds(String[] fIds);
}
