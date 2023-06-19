package com.soft863.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbdiaStudentMapper;
import com.soft863.domain.TbdiaStudent;
import com.soft863.service.ITbdiaStudentService;
import com.soft863.common.core.text.Convert;

/**
 * 学生画像Service业务层处理
 * 
 * @author 863
 * @date 2023-06-02
 */
@Service
public class TbdiaStudentServiceImpl implements ITbdiaStudentService 
{
    @Autowired
    private TbdiaStudentMapper tbdiaStudentMapper;

    /**
     * 查询学生画像
     * 
     * @param fId 学生画像主键
     * @return 学生画像
     */
    @Override
    public TbdiaStudent selectTbdiaStudentByFId(Long fId)
    {
        return tbdiaStudentMapper.selectTbdiaStudentByFId(fId);
    }

    /**
     * 查询学生画像列表
     * 
     * @param tbdiaStudent 学生画像
     * @return 学生画像
     */
    @Override
    public List<TbdiaStudent> selectTbdiaStudentList(TbdiaStudent tbdiaStudent)
    {
        return tbdiaStudentMapper.selectTbdiaStudentList(tbdiaStudent);
    }

    /**
     * 新增学生画像
     * 
     * @param tbdiaStudent 学生画像
     * @return 结果
     */
    @Override
    public int insertTbdiaStudent(TbdiaStudent tbdiaStudent)
    {
        return tbdiaStudentMapper.insertTbdiaStudent(tbdiaStudent);
    }

    /**
     * 修改学生画像
     * 
     * @param tbdiaStudent 学生画像
     * @return 结果
     */
    @Override
    public int updateTbdiaStudent(TbdiaStudent tbdiaStudent)
    {
        return tbdiaStudentMapper.updateTbdiaStudent(tbdiaStudent);
    }

    /**
     * 批量删除学生画像
     * 
     * @param fIds 需要删除的学生画像主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaStudentByFIds(String fIds)
    {
        return tbdiaStudentMapper.deleteTbdiaStudentByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生画像信息
     * 
     * @param fId 学生画像主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaStudentByFId(Long fId)
    {
        return tbdiaStudentMapper.deleteTbdiaStudentByFId(fId);
    }

    @Override
    public String excellentNum() {
        return tbdiaStudentMapper.excellentNum();
    }

    @Override
    public List<Map<String, Integer>> award() {
        return tbdiaStudentMapper.award();
    }

    @Override
    public List<Map<Object,Object>> deptnum() {
        return tbdiaStudentMapper.deptNum();
    }

    @Override
    public List<Map<String, Integer>> birthplace() {
        return tbdiaStudentMapper.birthplace();
    }

    @Override
    public List<Map<String,Integer>> sexNum() {
        return tbdiaStudentMapper.sexNum();
    }

    @Override
    public String test() {
        return tbdiaStudentMapper.test();
    }

    @Override
    public String allNum() {
        return tbdiaStudentMapper.allNum();
    }

    @Override
    public String good() {
        return tbdiaStudentMapper.help();
    }

    @Override
    public List count() {
        return tbdiaStudentMapper.count();
    }

    @Override
    public TbdiaStudent selectTbdiaStudentByFNo(String fNo) {
        return tbdiaStudentMapper.fNo(fNo);
    }

    @Override
    public String sc(String fNo) {
        return tbdiaStudentMapper.sc(fNo);
    }

    @Override
    public String absent(String fNo) {
        return tbdiaStudentMapper.absent(fNo);
    }

    @Override
    public List<Map<Object,Object>> stuSC(String fNo) {
        return tbdiaStudentMapper.stuSC(fNo);
    }

    @Override
    public List<Map<Object, Object>> stuDia(String fNo) {
        return tbdiaStudentMapper.stuDia(fNo);
    }

    @Override
    public List<Map<Object, Object>> yearSC(String fNo) {
        return tbdiaStudentMapper.yearSC(fNo);
    }
}
