package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbfinIncome;

/**
 * 学校经费收入Service接口
 * 
 * @author zpc
 * @date 2023-05-31
 */
public interface ITbfinIncomeService 
{
    /**
     * 查询学校经费收入
     * 
     * @param fId 学校经费收入主键
     * @return 学校经费收入
     */
    public TbfinIncome selectTbfinIncomeByFId(Long fId);

    /**
     * 查询学校经费收入列表
     * 
     * @param tbfinIncome 学校经费收入
     * @return 学校经费收入集合
     */
    public List<TbfinIncome> selectTbfinIncomeList(TbfinIncome tbfinIncome);

    /**
     * 新增学校经费收入
     * 
     * @param tbfinIncome 学校经费收入
     * @return 结果
     */
    public int insertTbfinIncome(TbfinIncome tbfinIncome);

    /**
     * 修改学校经费收入
     * 
     * @param tbfinIncome 学校经费收入
     * @return 结果
     */
    public int updateTbfinIncome(TbfinIncome tbfinIncome);

    /**
     * 批量删除学校经费收入
     * 
     * @param fIds 需要删除的学校经费收入主键集合
     * @return 结果
     */
    public int deleteTbfinIncomeByFIds(String fIds);

    /**
     * 删除学校经费收入信息
     * 
     * @param fId 学校经费收入主键
     * @return 结果
     */
    public int deleteTbfinIncomeByFId(Long fId);
}
