package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbfinIncomeMapper;
import com.soft863.domain.TbfinIncome;
import com.soft863.service.ITbfinIncomeService;
import com.soft863.common.core.text.Convert;

/**
 * 学校经费收入Service业务层处理
 * 
 * @author zpc
 * @date 2023-05-31
 */
@Service
public class TbfinIncomeServiceImpl implements ITbfinIncomeService 
{
    @Autowired
    private TbfinIncomeMapper tbfinIncomeMapper;

    /**
     * 查询学校经费收入
     * 
     * @param fId 学校经费收入主键
     * @return 学校经费收入
     */
    @Override
    public TbfinIncome selectTbfinIncomeByFId(Long fId)
    {
        return tbfinIncomeMapper.selectTbfinIncomeByFId(fId);
    }

    /**
     * 查询学校经费收入列表
     * 
     * @param tbfinIncome 学校经费收入
     * @return 学校经费收入
     */
    @Override
    public List<TbfinIncome> selectTbfinIncomeList(TbfinIncome tbfinIncome)
    {
        return tbfinIncomeMapper.selectTbfinIncomeList(tbfinIncome);
    }

    /**
     * 新增学校经费收入
     * 
     * @param tbfinIncome 学校经费收入
     * @return 结果
     */
    @Override
    public int insertTbfinIncome(TbfinIncome tbfinIncome)
    {
        return tbfinIncomeMapper.insertTbfinIncome(tbfinIncome);
    }

    /**
     * 修改学校经费收入
     * 
     * @param tbfinIncome 学校经费收入
     * @return 结果
     */
    @Override
    public int updateTbfinIncome(TbfinIncome tbfinIncome)
    {
        return tbfinIncomeMapper.updateTbfinIncome(tbfinIncome);
    }

    /**
     * 批量删除学校经费收入
     * 
     * @param fIds 需要删除的学校经费收入主键
     * @return 结果
     */
    @Override
    public int deleteTbfinIncomeByFIds(String fIds)
    {
        return tbfinIncomeMapper.deleteTbfinIncomeByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学校经费收入信息
     * 
     * @param fId 学校经费收入主键
     * @return 结果
     */
    @Override
    public int deleteTbfinIncomeByFId(Long fId)
    {
        return tbfinIncomeMapper.deleteTbfinIncomeByFId(fId);
    }
}
