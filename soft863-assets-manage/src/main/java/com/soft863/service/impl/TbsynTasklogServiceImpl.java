package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbsynTasklogMapper;
import com.soft863.domain.TbsynTasklog;
import com.soft863.service.ITbsynTasklogService;
import com.soft863.common.core.text.Convert;

/**
 * 任务日志Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
@Service
public class TbsynTasklogServiceImpl implements ITbsynTasklogService 
{
    @Autowired
    private TbsynTasklogMapper tbsynTasklogMapper;

    /**
     * 查询任务日志
     * 
     * @param fId 任务日志主键
     * @return 任务日志
     */
    @Override
    public TbsynTasklog selectTbsynTasklogByFId(Long fId)
    {
        return tbsynTasklogMapper.selectTbsynTasklogByFId(fId);
    }

    /**
     * 查询任务日志列表
     * 
     * @param tbsynTasklog 任务日志
     * @return 任务日志
     */
    @Override
    public List<TbsynTasklog> selectTbsynTasklogList(TbsynTasklog tbsynTasklog)
    {
        return tbsynTasklogMapper.selectTbsynTasklogList(tbsynTasklog);
    }

    /**
     * 新增任务日志
     * 
     * @param tbsynTasklog 任务日志
     * @return 结果
     */
    @Override
    public int insertTbsynTasklog(TbsynTasklog tbsynTasklog)
    {
        return tbsynTasklogMapper.insertTbsynTasklog(tbsynTasklog);
    }

    /**
     * 修改任务日志
     * 
     * @param tbsynTasklog 任务日志
     * @return 结果
     */
    @Override
    public int updateTbsynTasklog(TbsynTasklog tbsynTasklog)
    {
        return tbsynTasklogMapper.updateTbsynTasklog(tbsynTasklog);
    }

    /**
     * 批量删除任务日志
     * 
     * @param fIds 需要删除的任务日志主键
     * @return 结果
     */
    @Override
    public int deleteTbsynTasklogByFIds(String fIds)
    {
        return tbsynTasklogMapper.deleteTbsynTasklogByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除任务日志信息
     * 
     * @param fId 任务日志主键
     * @return 结果
     */
    @Override
    public int deleteTbsynTasklogByFId(Long fId)
    {
        return tbsynTasklogMapper.deleteTbsynTasklogByFId(fId);
    }
}
