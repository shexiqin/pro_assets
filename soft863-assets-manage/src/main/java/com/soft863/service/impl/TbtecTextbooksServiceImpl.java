package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbtecTextbooksMapper;
import com.soft863.domain.TbtecTextbooks;
import com.soft863.service.ITbtecTextbooksService;
import com.soft863.common.core.text.Convert;

/**
 * 教材选用Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbtecTextbooksServiceImpl implements ITbtecTextbooksService 
{
    @Autowired
    private TbtecTextbooksMapper tbtecTextbooksMapper;

    /**
     * 查询教材选用
     * 
     * @param fId 教材选用主键
     * @return 教材选用
     */
    @Override
    public TbtecTextbooks selectTbtecTextbooksByFId(Long fId)
    {
        return tbtecTextbooksMapper.selectTbtecTextbooksByFId(fId);
    }

    /**
     * 查询教材选用列表
     * 
     * @param tbtecTextbooks 教材选用
     * @return 教材选用
     */
    @Override
    public List<TbtecTextbooks> selectTbtecTextbooksList(TbtecTextbooks tbtecTextbooks)
    {
        return tbtecTextbooksMapper.selectTbtecTextbooksList(tbtecTextbooks);
    }

    /**
     * 新增教材选用
     * 
     * @param tbtecTextbooks 教材选用
     * @return 结果
     */
    @Override
    public int insertTbtecTextbooks(TbtecTextbooks tbtecTextbooks)
    {
        return tbtecTextbooksMapper.insertTbtecTextbooks(tbtecTextbooks);
    }

    /**
     * 修改教材选用
     * 
     * @param tbtecTextbooks 教材选用
     * @return 结果
     */
    @Override
    public int updateTbtecTextbooks(TbtecTextbooks tbtecTextbooks)
    {
        return tbtecTextbooksMapper.updateTbtecTextbooks(tbtecTextbooks);
    }

    /**
     * 批量删除教材选用
     * 
     * @param fIds 需要删除的教材选用主键
     * @return 结果
     */
    @Override
    public int deleteTbtecTextbooksByFIds(String fIds)
    {
        return tbtecTextbooksMapper.deleteTbtecTextbooksByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除教材选用信息
     * 
     * @param fId 教材选用主键
     * @return 结果
     */
    @Override
    public int deleteTbtecTextbooksByFId(Long fId)
    {
        return tbtecTextbooksMapper.deleteTbtecTextbooksByFId(fId);
    }
}
