package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbtecCourse;

/**
 * 课程设置Service接口
 * 
 * @author wangying
 * @date 2023-05-31
 */
public interface ITbtecCourseService 
{
    /**
     * 查询课程设置
     * 
     * @param fId 课程设置主键
     * @return 课程设置
     */
    public TbtecCourse selectTbtecCourseByFId(Long fId);

    /**
     * 查询课程设置列表
     * 
     * @param tbtecCourse 课程设置
     * @return 课程设置集合
     */
    public List<TbtecCourse> selectTbtecCourseList(TbtecCourse tbtecCourse);

    /**
     * 新增课程设置
     * 
     * @param tbtecCourse 课程设置
     * @return 结果
     */
    public int insertTbtecCourse(TbtecCourse tbtecCourse);

    /**
     * 修改课程设置
     * 
     * @param tbtecCourse 课程设置
     * @return 结果
     */
    public int updateTbtecCourse(TbtecCourse tbtecCourse);

    /**
     * 批量删除课程设置
     * 
     * @param fIds 需要删除的课程设置主键集合
     * @return 结果
     */
    public int deleteTbtecCourseByFIds(String fIds);

    /**
     * 删除课程设置信息
     * 
     * @param fId 课程设置主键
     * @return 结果
     */
    public int deleteTbtecCourseByFId(Long fId);
}
