package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbsynTask;

/**
 * 定时任务Service接口
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
public interface ITbsynTaskService 
{
    /**
     * 查询定时任务
     * 
     * @param fId 定时任务主键
     * @return 定时任务
     */
    public TbsynTask selectTbsynTaskByFId(Long fId);

    /**
     * 查询定时任务列表
     * 
     * @param tbsynTask 定时任务
     * @return 定时任务集合
     */
    public List<TbsynTask> selectTbsynTaskList(TbsynTask tbsynTask);

    /**
     * 新增定时任务
     * 
     * @param tbsynTask 定时任务
     * @return 结果
     */
    public int insertTbsynTask(TbsynTask tbsynTask);

    /**
     * 修改定时任务
     * 
     * @param tbsynTask 定时任务
     * @return 结果
     */
    public int updateTbsynTask(TbsynTask tbsynTask);

    /**
     * 批量删除定时任务
     * 
     * @param fIds 需要删除的定时任务主键集合
     * @return 结果
     */
    public int deleteTbsynTaskByFIds(String fIds);

    /**
     * 删除定时任务信息
     * 
     * @param fId 定时任务主键
     * @return 结果
     */
    public int deleteTbsynTaskByFId(Long fId);
}
