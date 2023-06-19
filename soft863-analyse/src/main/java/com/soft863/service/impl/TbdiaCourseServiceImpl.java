package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbdiaCourse;
import com.soft863.mapper.TbdiaCourseMapper;
import com.soft863.service.ITbdiaCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 课程画像Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
@Service
public class TbdiaCourseServiceImpl implements ITbdiaCourseService 
{
    @Autowired
    private TbdiaCourseMapper tbdiaCourseMapper;

    /**
     * 查询课程画像
     * 
     * @param fId 课程画像主键
     * @return 课程画像
     */
    @Override
    public TbdiaCourse selectTbdiaCourseByFId(Long fId)
    {
        return tbdiaCourseMapper.selectTbdiaCourseByFId(fId);
    }

    /**
     * 查询课程画像列表
     * 
     * @param tbdiaCourse 课程画像
     * @return 课程画像
     */
    @Override
    public List<TbdiaCourse> selectTbdiaCourseList(TbdiaCourse tbdiaCourse)
    {
        return tbdiaCourseMapper.selectTbdiaCourseList(tbdiaCourse);
    }

    /**
     * 新增课程画像
     * 
     * @param tbdiaCourse 课程画像
     * @return 结果
     */
    @Override
    public int insertTbdiaCourse(TbdiaCourse tbdiaCourse)
    {
        return tbdiaCourseMapper.insertTbdiaCourse(tbdiaCourse);
    }

    /**
     * 修改课程画像
     * 
     * @param tbdiaCourse 课程画像
     * @return 结果
     */
    @Override
    public int updateTbdiaCourse(TbdiaCourse tbdiaCourse)
    {
        return tbdiaCourseMapper.updateTbdiaCourse(tbdiaCourse);
    }

    /**
     * 批量删除课程画像
     * 
     * @param fIds 需要删除的课程画像主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaCourseByFIds(String fIds)
    {
        return tbdiaCourseMapper.deleteTbdiaCourseByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除课程画像信息
     * 
     * @param fId 课程画像主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaCourseByFId(Long fId)
    {
        return tbdiaCourseMapper.deleteTbdiaCourseByFId(fId);
    }

    @Override
    public List<TbdiaCourse> selectCourseByMajor(String majorName) {
        return tbdiaCourseMapper.selectCourseByMajor(majorName);
    }

    @Override
    public TbdiaCourse selectByNo(String fCno) {
        return tbdiaCourseMapper.byNo(fCno);
    }

    @Override
    public List<Map<String, Integer>> cadaNum(String no) {
        return tbdiaCourseMapper.cadaNum(no);
    }

    @Override
    public String avg(String no) {
        return tbdiaCourseMapper.avg(no);
    }

    @Override
    public List<Map<Object,Object>> up(String no) {
        return tbdiaCourseMapper.up(no);
    }

    @Override
    public List<Map<Object, Object>> top() {
        return tbdiaCourseMapper.top();
    }
}
