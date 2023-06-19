package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbtecStudentMapper;
import com.soft863.domain.TbtecStudent;
import com.soft863.service.ITbtecStudentService;
import com.soft863.common.core.text.Convert;

/**
 * 学生信息Service业务层处理
 * 
 * @author 863
 * @date 2023-06-02
 */
@Service
public class TbtecStudentServiceImpl implements ITbtecStudentService 
{
    @Autowired
    private TbtecStudentMapper tbtecStudentMapper;

    /**
     * 查询学生信息
     * 
     * @param fId 学生信息主键
     * @return 学生信息
     */
    @Override
    public TbtecStudent selectTbtecStudentByFId(Long fId)
    {
        return tbtecStudentMapper.selectTbtecStudentByFId(fId);
    }

    /**
     * 查询学生信息列表
     * 
     * @param tbtecStudent 学生信息
     * @return 学生信息
     */
    @Override
    public List<TbtecStudent> selectTbtecStudentList(TbtecStudent tbtecStudent)
    {
        return tbtecStudentMapper.selectTbtecStudentList(tbtecStudent);
    }

    /**
     * 新增学生信息
     * 
     * @param tbtecStudent 学生信息
     * @return 结果
     */
    @Override
    public int insertTbtecStudent(TbtecStudent tbtecStudent)
    {
        return tbtecStudentMapper.insertTbtecStudent(tbtecStudent);
    }

    /**
     * 修改学生信息
     * 
     * @param tbtecStudent 学生信息
     * @return 结果
     */
    @Override
    public int updateTbtecStudent(TbtecStudent tbtecStudent)
    {
        return tbtecStudentMapper.updateTbtecStudent(tbtecStudent);
    }

    /**
     * 批量删除学生信息
     * 
     * @param fIds 需要删除的学生信息主键
     * @return 结果
     */
    @Override
    public int deleteTbtecStudentByFIds(String fIds)
    {
        return tbtecStudentMapper.deleteTbtecStudentByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生信息信息
     * 
     * @param fId 学生信息主键
     * @return 结果
     */
    @Override
    public int deleteTbtecStudentByFId(Long fId)
    {
        return tbtecStudentMapper.deleteTbtecStudentByFId(fId);
    }
}
