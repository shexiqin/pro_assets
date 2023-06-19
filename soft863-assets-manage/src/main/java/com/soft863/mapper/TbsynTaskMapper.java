package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbsynTask;
import org.springframework.stereotype.Repository;

/**
 * 定时任务Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-08
 */
@Repository
public interface TbsynTaskMapper 
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
     * 删除定时任务
     * 
     * @param fId 定时任务主键
     * @return 结果
     */
    public int deleteTbsynTaskByFId(Long fId);

    /**
     * 批量删除定时任务
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbsynTaskByFIds(String[] fIds);
}
