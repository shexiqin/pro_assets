package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbtecLessonMapper;
import com.soft863.domain.TbtecLesson;
import com.soft863.service.ITbtecLessonService;
import com.soft863.common.core.text.Convert;

/**
 * 教师授课Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbtecLessonServiceImpl implements ITbtecLessonService 
{
    @Autowired
    private TbtecLessonMapper tbtecLessonMapper;

    /**
     * 查询教师授课
     * 
     * @param fId 教师授课主键
     * @return 教师授课
     */
    @Override
    public TbtecLesson selectTbtecLessonByFId(Long fId)
    {
        return tbtecLessonMapper.selectTbtecLessonByFId(fId);
    }

    /**
     * 查询教师授课列表
     * 
     * @param tbtecLesson 教师授课
     * @return 教师授课
     */
    @Override
    public List<TbtecLesson> selectTbtecLessonList(TbtecLesson tbtecLesson)
    {
        return tbtecLessonMapper.selectTbtecLessonList(tbtecLesson);
    }

    /**
     * 新增教师授课
     * 
     * @param tbtecLesson 教师授课
     * @return 结果
     */
    @Override
    public int insertTbtecLesson(TbtecLesson tbtecLesson)
    {
        return tbtecLessonMapper.insertTbtecLesson(tbtecLesson);
    }

    /**
     * 修改教师授课
     * 
     * @param tbtecLesson 教师授课
     * @return 结果
     */
    @Override
    public int updateTbtecLesson(TbtecLesson tbtecLesson)
    {
        return tbtecLessonMapper.updateTbtecLesson(tbtecLesson);
    }

    /**
     * 批量删除教师授课
     * 
     * @param fIds 需要删除的教师授课主键
     * @return 结果
     */
    @Override
    public int deleteTbtecLessonByFIds(String fIds)
    {
        return tbtecLessonMapper.deleteTbtecLessonByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除教师授课信息
     * 
     * @param fId 教师授课主键
     * @return 结果
     */
    @Override
    public int deleteTbtecLessonByFId(Long fId)
    {
        return tbtecLessonMapper.deleteTbtecLessonByFId(fId);
    }
}
