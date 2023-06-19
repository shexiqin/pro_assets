package com.soft863.mapper;

import com.soft863.domain.TbquaRules;

import java.util.List;

/**
 * 质检规则Mapper接口
 * 
 * @author cuihangbo
 * @date 2023-06-06
 */
public interface TbquaRulesMapper 
{
    /**
     * 查询质检规则
     * 
     * @param fId 质检规则主键
     * @return 质检规则
     */
    public TbquaRules selectTbquaRulesByFId(Long fId);

    /**
     * 查询质检规则列表
     * 
     * @param tbquaRules 质检规则
     * @return 质检规则集合
     */
    public List<TbquaRules> selectTbquaRulesList(TbquaRules tbquaRules);

    /**
     * 新增质检规则
     * 
     * @param tbquaRules 质检规则
     * @return 结果
     */
    public int insertTbquaRules(TbquaRules tbquaRules);

    /**
     * 修改质检规则
     * 
     * @param tbquaRules 质检规则
     * @return 结果
     */
    public int updateTbquaRules(TbquaRules tbquaRules);

    /**
     * 删除质检规则
     * 
     * @param fId 质检规则主键
     * @return 结果
     */
    public int deleteTbquaRulesByFId(Long fId);

    /**
     * 批量删除质检规则
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbquaRulesByFIds(String[] fIds);
}
