package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbfinOtherIncome;

/**
 * 学校其他收入情况（财务系统）Service接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface ITbfinOtherIncomeService 
{
    /**
     * 查询学校其他收入情况（财务系统）
     * 
     * @param fId 学校其他收入情况（财务系统）主键
     * @return 学校其他收入情况（财务系统）
     */
    public TbfinOtherIncome selectTbfinOtherIncomeByFId(Long fId);

    /**
     * 查询学校其他收入情况（财务系统）列表
     * 
     * @param tbfinOtherIncome 学校其他收入情况（财务系统）
     * @return 学校其他收入情况（财务系统）集合
     */
    public List<TbfinOtherIncome> selectTbfinOtherIncomeList(TbfinOtherIncome tbfinOtherIncome);

    /**
     * 新增学校其他收入情况（财务系统）
     * 
     * @param tbfinOtherIncome 学校其他收入情况（财务系统）
     * @return 结果
     */
    public int insertTbfinOtherIncome(TbfinOtherIncome tbfinOtherIncome);

    /**
     * 修改学校其他收入情况（财务系统）
     * 
     * @param tbfinOtherIncome 学校其他收入情况（财务系统）
     * @return 结果
     */
    public int updateTbfinOtherIncome(TbfinOtherIncome tbfinOtherIncome);

    /**
     * 批量删除学校其他收入情况（财务系统）
     * 
     * @param fIds 需要删除的学校其他收入情况（财务系统）主键集合
     * @return 结果
     */
    public int deleteTbfinOtherIncomeByFIds(String fIds);

    /**
     * 删除学校其他收入情况（财务系统）信息
     * 
     * @param fId 学校其他收入情况（财务系统）主键
     * @return 结果
     */
    public int deleteTbfinOtherIncomeByFId(Long fId);
}
