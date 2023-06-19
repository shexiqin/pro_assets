package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbquaAlgorithm;
import com.soft863.mapper.TbquaAlgorithmMapper;
import com.soft863.service.ITbquaAlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 算法规则Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbquaAlgorithmServiceImpl implements ITbquaAlgorithmService 
{
    @Autowired
    private TbquaAlgorithmMapper tbquaAlgorithmMapper;

    /**
     * 查询算法规则
     * 
     * @param fId 算法规则主键
     * @return 算法规则
     */
    @Override
    public TbquaAlgorithm selectTbquaAlgorithmByFId(Long fId)
    {
        return tbquaAlgorithmMapper.selectTbquaAlgorithmByFId(fId);
    }

    /**
     * 查询算法规则列表
     * 
     * @param tbquaAlgorithm 算法规则
     * @return 算法规则
     */
    @Override
    public List<TbquaAlgorithm> selectTbquaAlgorithmList(TbquaAlgorithm tbquaAlgorithm)
    {
        return tbquaAlgorithmMapper.selectTbquaAlgorithmList(tbquaAlgorithm);
    }

    /**
     * 新增算法规则
     * 
     * @param tbquaAlgorithm 算法规则
     * @return 结果
     */
    @Override
    public int insertTbquaAlgorithm(TbquaAlgorithm tbquaAlgorithm)
    {
        return tbquaAlgorithmMapper.insertTbquaAlgorithm(tbquaAlgorithm);
    }

    /**
     * 修改算法规则
     * 
     * @param tbquaAlgorithm 算法规则
     * @return 结果
     */
    @Override
    public int updateTbquaAlgorithm(TbquaAlgorithm tbquaAlgorithm)
    {
        return tbquaAlgorithmMapper.updateTbquaAlgorithm(tbquaAlgorithm);
    }

    /**
     * 批量删除算法规则
     * 
     * @param fIds 需要删除的算法规则主键
     * @return 结果
     */
    @Override
    public int deleteTbquaAlgorithmByFIds(String fIds)
    {
        return tbquaAlgorithmMapper.deleteTbquaAlgorithmByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除算法规则信息
     * 
     * @param fId 算法规则主键
     * @return 结果
     */
    @Override
    public int deleteTbquaAlgorithmByFId(Long fId)
    {
        return tbquaAlgorithmMapper.deleteTbquaAlgorithmByFId(fId);
    }
}
