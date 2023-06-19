package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbtecTextbooks;

/**
 * 教材选用Service接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface ITbtecTextbooksService 
{
    /**
     * 查询教材选用
     * 
     * @param fId 教材选用主键
     * @return 教材选用
     */
    public TbtecTextbooks selectTbtecTextbooksByFId(Long fId);

    /**
     * 查询教材选用列表
     * 
     * @param tbtecTextbooks 教材选用
     * @return 教材选用集合
     */
    public List<TbtecTextbooks> selectTbtecTextbooksList(TbtecTextbooks tbtecTextbooks);

    /**
     * 新增教材选用
     * 
     * @param tbtecTextbooks 教材选用
     * @return 结果
     */
    public int insertTbtecTextbooks(TbtecTextbooks tbtecTextbooks);

    /**
     * 修改教材选用
     * 
     * @param tbtecTextbooks 教材选用
     * @return 结果
     */
    public int updateTbtecTextbooks(TbtecTextbooks tbtecTextbooks);

    /**
     * 批量删除教材选用
     * 
     * @param fIds 需要删除的教材选用主键集合
     * @return 结果
     */
    public int deleteTbtecTextbooksByFIds(String fIds);

    /**
     * 删除教材选用信息
     * 
     * @param fId 教材选用主键
     * @return 结果
     */
    public int deleteTbtecTextbooksByFId(Long fId);
}
