package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbquaRules;
import com.soft863.mapper.TbquaRulesMapper;
import com.soft863.service.ITbquaRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 质检规则Service业务层处理
 * 
 * @author cuihangbo
 * @date 2023-06-06
 */
@Service
public class TbquaRulesServiceImpl implements ITbquaRulesService 
{
    @Autowired
    private TbquaRulesMapper tbquaRulesMapper;

    /**
     * 查询质检规则
     * 
     * @param fId 质检规则主键
     * @return 质检规则
     */
    @Override
    public TbquaRules selectTbquaRulesByFId(Long fId)
    {
        return tbquaRulesMapper.selectTbquaRulesByFId(fId);
    }

    /**
     * 查询质检规则列表
     * 
     * @param tbquaRules 质检规则
     * @return 质检规则
     */
    @Override
    public List<TbquaRules> selectTbquaRulesList(TbquaRules tbquaRules)
    {
        return tbquaRulesMapper.selectTbquaRulesList(tbquaRules);
    }

    /**
     * 新增质检规则
     * 
     * @param tbquaRules 质检规则
     * @return 结果
     */
    @Override
    public int insertTbquaRules(TbquaRules tbquaRules)
    {
        return tbquaRulesMapper.insertTbquaRules(tbquaRules);
    }

    /**
     * 修改质检规则
     * 
     * @param tbquaRules 质检规则
     * @return 结果
     */
    @Override
    public int updateTbquaRules(TbquaRules tbquaRules)
    {
        return tbquaRulesMapper.updateTbquaRules(tbquaRules);
    }

    /**
     * 批量删除质检规则
     * 
     * @param fIds 需要删除的质检规则主键
     * @return 结果
     */
    @Override
    public int deleteTbquaRulesByFIds(String fIds)
    {
        return tbquaRulesMapper.deleteTbquaRulesByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除质检规则信息
     * 
     * @param fId 质检规则主键
     * @return 结果
     */
    @Override
    public int deleteTbquaRulesByFId(Long fId)
    {
        return tbquaRulesMapper.deleteTbquaRulesByFId(fId);
    }
}
