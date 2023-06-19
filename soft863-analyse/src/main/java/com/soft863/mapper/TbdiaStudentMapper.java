package com.soft863.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.soft863.domain.TbdiaStudent;

/**
 * 学生画像Mapper接口
 * 
 * @author 863
 * @date 2023-06-02
 */
public interface TbdiaStudentMapper 
{
    /**
     * 查询学生画像
     * 
     * @param fId 学生画像主键
     * @return 学生画像
     */
    public TbdiaStudent selectTbdiaStudentByFId(Long fId);

    /**
     * 查询学生画像列表
     * 
     * @param tbdiaStudent 学生画像
     * @return 学生画像集合
     */
    public List<TbdiaStudent> selectTbdiaStudentList(TbdiaStudent tbdiaStudent);

    /**
     * 新增学生画像
     * 
     * @param tbdiaStudent 学生画像
     * @return 结果
     */
    public int insertTbdiaStudent(TbdiaStudent tbdiaStudent);

    /**
     * 修改学生画像
     * 
     * @param tbdiaStudent 学生画像
     * @return 结果
     */
    public int updateTbdiaStudent(TbdiaStudent tbdiaStudent);

    /**
     * 删除学生画像
     * 
     * @param fId 学生画像主键
     * @return 结果
     */
    public int deleteTbdiaStudentByFId(Long fId);

    /**
     * 批量删除学生画像
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbdiaStudentByFIds(String[] fIds);

    String excellentNum();

    List<Map<String, Integer>> sexNum();

    List<Map<String, Integer>> birthplace();

    List<Map<Object, Object>> deptNum();

    List<Map<String, Integer>> award();

    String test();

    String allNum();

    String help();

    List count();

    TbdiaStudent fNo(String fNo);

    String sc(String fNo);

    String absent(String fNo);

    List<Map<Object,Object>> stuSC(String fNo);

    List<Map<Object, Object>> stuDia(String fNo);

    List<Map<Object, Object>> yearSC(String fNo);

}
