package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbfinOtherIncomeMapper;
import com.soft863.domain.TbfinOtherIncome;
import com.soft863.service.ITbfinOtherIncomeService;
import com.soft863.common.core.text.Convert;

/**
 * 学校其他收入情况（财务系统）Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbfinOtherIncomeServiceImpl implements ITbfinOtherIncomeService 
{
    @Autowired
    private TbfinOtherIncomeMapper tbfinOtherIncomeMapper;

    /**
     * 查询学校其他收入情况（财务系统）
     * 
     * @param fId 学校其他收入情况（财务系统）主键
     * @return 学校其他收入情况（财务系统）
     */
    @Override
    public TbfinOtherIncome selectTbfinOtherIncomeByFId(Long fId)
    {
        return tbfinOtherIncomeMapper.selectTbfinOtherIncomeByFId(fId);
    }

    /**
     * 查询学校其他收入情况（财务系统）列表
     * 
     * @param tbfinOtherIncome 学校其他收入情况（财务系统）
     * @return 学校其他收入情况（财务系统）
     */
    @Override
    public List<TbfinOtherIncome> selectTbfinOtherIncomeList(TbfinOtherIncome tbfinOtherIncome)
    {
        return tbfinOtherIncomeMapper.selectTbfinOtherIncomeList(tbfinOtherIncome);
    }

    /**
     * 新增学校其他收入情况（财务系统）
     * 
     * @param tbfinOtherIncome 学校其他收入情况（财务系统）
     * @return 结果
     */
    @Override
    public int insertTbfinOtherIncome(TbfinOtherIncome tbfinOtherIncome)
    {
        return tbfinOtherIncomeMapper.insertTbfinOtherIncome(tbfinOtherIncome);
    }

    /**
     * 修改学校其他收入情况（财务系统）
     * 
     * @param tbfinOtherIncome 学校其他收入情况（财务系统）
     * @return 结果
     */
    @Override
    public int updateTbfinOtherIncome(TbfinOtherIncome tbfinOtherIncome)
    {
        return tbfinOtherIncomeMapper.updateTbfinOtherIncome(tbfinOtherIncome);
    }

    /**
     * 批量删除学校其他收入情况（财务系统）
     * 
     * @param fIds 需要删除的学校其他收入情况（财务系统）主键
     * @return 结果
     */
    @Override
    public int deleteTbfinOtherIncomeByFIds(String fIds)
    {
        return tbfinOtherIncomeMapper.deleteTbfinOtherIncomeByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学校其他收入情况（财务系统）信息
     * 
     * @param fId 学校其他收入情况（财务系统）主键
     * @return 结果
     */
    @Override
    public int deleteTbfinOtherIncomeByFId(Long fId)
    {
        return tbfinOtherIncomeMapper.deleteTbfinOtherIncomeByFId(fId);
    }
}
