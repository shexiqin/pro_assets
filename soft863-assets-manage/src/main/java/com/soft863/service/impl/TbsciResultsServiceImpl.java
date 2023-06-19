package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbsciResultsMapper;
import com.soft863.domain.TbsciResults;
import com.soft863.service.ITbsciResultsService;
import com.soft863.common.core.text.Convert;

/**
 * 教师科研业绩Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbsciResultsServiceImpl implements ITbsciResultsService 
{
    @Autowired
    private TbsciResultsMapper tbsciResultsMapper;

    /**
     * 查询教师科研业绩
     * 
     * @param fId 教师科研业绩主键
     * @return 教师科研业绩
     */
    @Override
    public TbsciResults selectTbsciResultsByFId(Long fId)
    {
        return tbsciResultsMapper.selectTbsciResultsByFId(fId);
    }

    /**
     * 查询教师科研业绩列表
     * 
     * @param tbsciResults 教师科研业绩
     * @return 教师科研业绩
     */
    @Override
    public List<TbsciResults> selectTbsciResultsList(TbsciResults tbsciResults)
    {
        return tbsciResultsMapper.selectTbsciResultsList(tbsciResults);
    }

    /**
     * 新增教师科研业绩
     * 
     * @param tbsciResults 教师科研业绩
     * @return 结果
     */
    @Override
    public int insertTbsciResults(TbsciResults tbsciResults)
    {
        return tbsciResultsMapper.insertTbsciResults(tbsciResults);
    }

    /**
     * 修改教师科研业绩
     * 
     * @param tbsciResults 教师科研业绩
     * @return 结果
     */
    @Override
    public int updateTbsciResults(TbsciResults tbsciResults)
    {
        return tbsciResultsMapper.updateTbsciResults(tbsciResults);
    }

    /**
     * 批量删除教师科研业绩
     * 
     * @param fIds 需要删除的教师科研业绩主键
     * @return 结果
     */
    @Override
    public int deleteTbsciResultsByFIds(String fIds)
    {
        return tbsciResultsMapper.deleteTbsciResultsByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除教师科研业绩信息
     * 
     * @param fId 教师科研业绩主键
     * @return 结果
     */
    @Override
    public int deleteTbsciResultsByFId(Long fId)
    {
        return tbsciResultsMapper.deleteTbsciResultsByFId(fId);
    }
}
