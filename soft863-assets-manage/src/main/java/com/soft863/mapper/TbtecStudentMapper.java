package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbtecStudent;

/**
 * 学生信息Mapper接口
 * 
 * @author 863
 * @date 2023-06-02
 */
public interface TbtecStudentMapper 
{
    /**
     * 查询学生信息
     * 
     * @param fId 学生信息主键
     * @return 学生信息
     */
    public TbtecStudent selectTbtecStudentByFId(Long fId);

    /**
     * 查询学生信息列表
     * 
     * @param tbtecStudent 学生信息
     * @return 学生信息集合
     */
    public List<TbtecStudent> selectTbtecStudentList(TbtecStudent tbtecStudent);

    /**
     * 新增学生信息
     * 
     * @param tbtecStudent 学生信息
     * @return 结果
     */
    public int insertTbtecStudent(TbtecStudent tbtecStudent);

    /**
     * 修改学生信息
     * 
     * @param tbtecStudent 学生信息
     * @return 结果
     */
    public int updateTbtecStudent(TbtecStudent tbtecStudent);

    /**
     * 删除学生信息
     * 
     * @param fId 学生信息主键
     * @return 结果
     */
    public int deleteTbtecStudentByFId(Long fId);

    /**
     * 批量删除学生信息
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbtecStudentByFIds(String[] fIds);
}
