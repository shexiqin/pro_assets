package com.soft863.service;

import com.soft863.domain.TbquaTask;

import java.util.List;

/**
 * 质检任务Service接口
 * 
 * @author cuihangbo
 * @date 2023-05-31
 */
public interface ITbquaTaskService 
{
    /**
     * 查询质检任务
     * 
     * @param fId 质检任务主键
     * @return 质检任务
     */
    public TbquaTask selectTbquaTaskByFId(Long fId);

    /**
     * 查询质检任务列表
     * 
     * @param tbquaTask 质检任务
     * @return 质检任务集合
     */
    public List<TbquaTask> selectTbquaTaskList(TbquaTask tbquaTask);

    /**
     * 新增质检任务
     * 
     * @param tbquaTask 质检任务
     * @return 结果
     */
    public int insertTbquaTask(TbquaTask tbquaTask);

    /**
     * 修改质检任务
     * 
     * @param tbquaTask 质检任务
     * @return 结果
     */
    public int updateTbquaTask(TbquaTask tbquaTask);

    /**
     * 批量删除质检任务
     * 
     * @param fIds 需要删除的质检任务主键集合
     * @return 结果
     */
    public int deleteTbquaTaskByFIds(String fIds);

    /**
     * 删除质检任务信息
     * 
     * @param fId 质检任务主键
     * @return 结果
     */
    public int deleteTbquaTaskByFId(Long fId);

    public TbquaTask selectByTaskId(TbquaTask tbquaTask);
}
