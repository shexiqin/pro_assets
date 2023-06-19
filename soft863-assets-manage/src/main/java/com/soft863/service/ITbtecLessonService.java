package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbtecLesson;

/**
 * 教师授课Service接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface ITbtecLessonService 
{
    /**
     * 查询教师授课
     * 
     * @param fId 教师授课主键
     * @return 教师授课
     */
    public TbtecLesson selectTbtecLessonByFId(Long fId);

    /**
     * 查询教师授课列表
     * 
     * @param tbtecLesson 教师授课
     * @return 教师授课集合
     */
    public List<TbtecLesson> selectTbtecLessonList(TbtecLesson tbtecLesson);

    /**
     * 新增教师授课
     * 
     * @param tbtecLesson 教师授课
     * @return 结果
     */
    public int insertTbtecLesson(TbtecLesson tbtecLesson);

    /**
     * 修改教师授课
     * 
     * @param tbtecLesson 教师授课
     * @return 结果
     */
    public int updateTbtecLesson(TbtecLesson tbtecLesson);

    /**
     * 批量删除教师授课
     * 
     * @param fIds 需要删除的教师授课主键集合
     * @return 结果
     */
    public int deleteTbtecLessonByFIds(String fIds);

    /**
     * 删除教师授课信息
     * 
     * @param fId 教师授课主键
     * @return 结果
     */
    public int deleteTbtecLessonByFId(Long fId);
}
