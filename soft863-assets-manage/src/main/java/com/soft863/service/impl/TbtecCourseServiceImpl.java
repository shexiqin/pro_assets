package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbtecCourseMapper;
import com.soft863.domain.TbtecCourse;
import com.soft863.service.ITbtecCourseService;
import com.soft863.common.core.text.Convert;

/**
 * 课程设置Service业务层处理
 * 
 * @author wangying
 * @date 2023-05-31
 */
@Service
public class TbtecCourseServiceImpl implements ITbtecCourseService 
{
    @Autowired
    private TbtecCourseMapper tbtecCourseMapper;

    /**
     * 查询课程设置
     * 
     * @param fId 课程设置主键
     * @return 课程设置
     */
    @Override
    public TbtecCourse selectTbtecCourseByFId(Long fId)
    {
        return tbtecCourseMapper.selectTbtecCourseByFId(fId);
    }

    /**
     * 查询课程设置列表
     * 
     * @param tbtecCourse 课程设置
     * @return 课程设置
     */
    @Override
    public List<TbtecCourse> selectTbtecCourseList(TbtecCourse tbtecCourse)
    {
        return tbtecCourseMapper.selectTbtecCourseList(tbtecCourse);
    }

    /**
     * 新增课程设置
     * 
     * @param tbtecCourse 课程设置
     * @return 结果
     */
    @Override
    public int insertTbtecCourse(TbtecCourse tbtecCourse)
    {
        return tbtecCourseMapper.insertTbtecCourse(tbtecCourse);
    }

    /**
     * 修改课程设置
     * 
     * @param tbtecCourse 课程设置
     * @return 结果
     */
    @Override
    public int updateTbtecCourse(TbtecCourse tbtecCourse)
    {
        return tbtecCourseMapper.updateTbtecCourse(tbtecCourse);
    }

    /**
     * 批量删除课程设置
     * 
     * @param fIds 需要删除的课程设置主键
     * @return 结果
     */
    @Override
    public int deleteTbtecCourseByFIds(String fIds)
    {
        return tbtecCourseMapper.deleteTbtecCourseByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除课程设置信息
     * 
     * @param fId 课程设置主键
     * @return 结果
     */
    @Override
    public int deleteTbtecCourseByFId(Long fId)
    {
        return tbtecCourseMapper.deleteTbtecCourseByFId(fId);
    }
}
