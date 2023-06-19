package com.soft863.mapper;

import com.soft863.domain.TbdiaCourse;

import java.util.List;
import java.util.Map;

/**
 * 课程画像Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
public interface TbdiaCourseMapper 
{
    /**
     * 查询课程画像
     * 
     * @param fId 课程画像主键
     * @return 课程画像
     */
    public TbdiaCourse selectTbdiaCourseByFId(Long fId);

    /**
     * 查询课程画像列表
     * 
     * @param tbdiaCourse 课程画像
     * @return 课程画像集合
     */
    public List<TbdiaCourse> selectTbdiaCourseList(TbdiaCourse tbdiaCourse);

    /**
     * 新增课程画像
     * 
     * @param tbdiaCourse 课程画像
     * @return 结果
     */
    public int insertTbdiaCourse(TbdiaCourse tbdiaCourse);

    /**
     * 修改课程画像
     * 
     * @param tbdiaCourse 课程画像
     * @return 结果
     */
    public int updateTbdiaCourse(TbdiaCourse tbdiaCourse);

    /**
     * 删除课程画像
     * 
     * @param fId 课程画像主键
     * @return 结果
     */
    public int deleteTbdiaCourseByFId(Long fId);

    /**
     * 批量删除课程画像
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbdiaCourseByFIds(String[] fIds);

    List<TbdiaCourse> selectCourseByMajor(String majorName);

    TbdiaCourse byNo(String fCno);

    List<Map<String, Integer>> cadaNum(String no);

    String avg(String no);

    List<Map<Object,Object>> up(String no);

    List<Map<Object, Object>> top();

}
