package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbsynTasklog;

/**
 * 任务日志Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
public interface TbsynTasklogMapper 
{
    /**
     * 查询任务日志
     * 
     * @param fId 任务日志主键
     * @return 任务日志
     */
    public TbsynTasklog selectTbsynTasklogByFId(Long fId);

    /**
     * 查询任务日志列表
     * 
     * @param tbsynTasklog 任务日志
     * @return 任务日志集合
     */
    public List<TbsynTasklog> selectTbsynTasklogList(TbsynTasklog tbsynTasklog);

    /**
     * 新增任务日志
     * 
     * @param tbsynTasklog 任务日志
     * @return 结果
     */
    public int insertTbsynTasklog(TbsynTasklog tbsynTasklog);

    /**
     * 修改任务日志
     * 
     * @param tbsynTasklog 任务日志
     * @return 结果
     */
    public int updateTbsynTasklog(TbsynTasklog tbsynTasklog);

    /**
     * 删除任务日志
     * 
     * @param fId 任务日志主键
     * @return 结果
     */
    public int deleteTbsynTasklogByFId(Long fId);

    /**
     * 批量删除任务日志
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbsynTasklogByFIds(String[] fIds);
}
