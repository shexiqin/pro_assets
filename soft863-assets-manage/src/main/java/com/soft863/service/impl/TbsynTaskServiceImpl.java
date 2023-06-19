package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbsynTaskMapper;
import com.soft863.domain.TbsynTask;
import com.soft863.service.ITbsynTaskService;
import com.soft863.common.core.text.Convert;

/**
 * 定时任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
@Service
public class TbsynTaskServiceImpl implements ITbsynTaskService 
{
    @Autowired
    private TbsynTaskMapper tbsynTaskMapper;

    /**
     * 查询定时任务
     * 
     * @param fId 定时任务主键
     * @return 定时任务
     */
    @Override
    public TbsynTask selectTbsynTaskByFId(Long fId)
    {
        return tbsynTaskMapper.selectTbsynTaskByFId(fId);
    }

    /**
     * 查询定时任务列表
     * 
     * @param tbsynTask 定时任务
     * @return 定时任务
     */
    @Override
    public List<TbsynTask> selectTbsynTaskList(TbsynTask tbsynTask)
    {
        return tbsynTaskMapper.selectTbsynTaskList(tbsynTask);
    }

    /**
     * 新增定时任务
     * 
     * @param tbsynTask 定时任务
     * @return 结果
     */
    @Override
    public int insertTbsynTask(TbsynTask tbsynTask)
    {
        return tbsynTaskMapper.insertTbsynTask(tbsynTask);
    }

    /**
     * 修改定时任务
     * 
     * @param tbsynTask 定时任务
     * @return 结果
     */
    @Override
    public int updateTbsynTask(TbsynTask tbsynTask)
    {
        return tbsynTaskMapper.updateTbsynTask(tbsynTask);
    }

    /**
     * 批量删除定时任务
     * 
     * @param fIds 需要删除的定时任务主键
     * @return 结果
     */
    @Override
    public int deleteTbsynTaskByFIds(String fIds)
    {
        return tbsynTaskMapper.deleteTbsynTaskByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除定时任务信息
     * 
     * @param fId 定时任务主键
     * @return 结果
     */
    @Override
    public int deleteTbsynTaskByFId(Long fId)
    {
        return tbsynTaskMapper.deleteTbsynTaskByFId(fId);
    }
}
