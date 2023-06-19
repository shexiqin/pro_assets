package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbquaTask;
import com.soft863.mapper.TbquaTaskMapper;
import com.soft863.service.ITbquaTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 质检任务Service业务层处理
 * 
 * @author cuihangbo
 * @date 2023-05-31
 */
@Service
public class TbquaTaskServiceImpl implements ITbquaTaskService 
{
    @Autowired
    private TbquaTaskMapper tbquaTaskMapper;

    /**
     * 查询质检任务
     * 
     * @param fId 质检任务主键
     * @return 质检任务
     */
    @Override
    public TbquaTask selectTbquaTaskByFId(Long fId)
    {
        return tbquaTaskMapper.selectTbquaTaskByFId(fId);
    }

    /**
     * 查询质检任务列表
     * 
     * @param tbquaTask 质检任务
     * @return 质检任务
     */
    @Override
    public List<TbquaTask> selectTbquaTaskList(TbquaTask tbquaTask)
    {
        return tbquaTaskMapper.selectTbquaTaskList(tbquaTask);
    }

    /**
     * 新增质检任务
     * 
     * @param tbquaTask 质检任务
     * @return 结果
     */
    @Override
    public int insertTbquaTask(TbquaTask tbquaTask)
    {
        return tbquaTaskMapper.insertTbquaTask(tbquaTask);
    }

    /**
     * 修改质检任务
     * 
     * @param tbquaTask 质检任务
     * @return 结果
     */
    @Override
    public int updateTbquaTask(TbquaTask tbquaTask)
    {
        return tbquaTaskMapper.updateTbquaTask(tbquaTask);
    }

    /**
     * 批量删除质检任务
     * 
     * @param fIds 需要删除的质检任务主键
     * @return 结果
     */
    @Override
    public int deleteTbquaTaskByFIds(String fIds)
    {
        return tbquaTaskMapper.deleteTbquaTaskByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除质检任务信息
     * 
     * @param fId 质检任务主键
     * @return 结果
     */
    @Override
    public int deleteTbquaTaskByFId(Long fId)
    {
        return tbquaTaskMapper.deleteTbquaTaskByFId(fId);
    }

    @Override
    public TbquaTask selectByTaskId(TbquaTask tbquaTask) {
        return tbquaTaskMapper.selectByTaskId(tbquaTask);
    }
}
