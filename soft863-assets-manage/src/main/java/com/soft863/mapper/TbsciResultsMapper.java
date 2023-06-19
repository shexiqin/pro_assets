package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbsciResults;

/**
 * 教师科研业绩Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface TbsciResultsMapper 
{
    /**
     * 查询教师科研业绩
     * 
     * @param fId 教师科研业绩主键
     * @return 教师科研业绩
     */
    public TbsciResults selectTbsciResultsByFId(Long fId);

    /**
     * 查询教师科研业绩列表
     * 
     * @param tbsciResults 教师科研业绩
     * @return 教师科研业绩集合
     */
    public List<TbsciResults> selectTbsciResultsList(TbsciResults tbsciResults);

    /**
     * 新增教师科研业绩
     * 
     * @param tbsciResults 教师科研业绩
     * @return 结果
     */
    public int insertTbsciResults(TbsciResults tbsciResults);

    /**
     * 修改教师科研业绩
     * 
     * @param tbsciResults 教师科研业绩
     * @return 结果
     */
    public int updateTbsciResults(TbsciResults tbsciResults);

    /**
     * 删除教师科研业绩
     * 
     * @param fId 教师科研业绩主键
     * @return 结果
     */
    public int deleteTbsciResultsByFId(Long fId);

    /**
     * 批量删除教师科研业绩
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbsciResultsByFIds(String[] fIds);
}
