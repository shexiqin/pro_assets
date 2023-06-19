package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbdiaStudentSessionScore;

/**
 * 学生成绩Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-07
 */
public interface TbdiaStudentSessionScoreMapper 
{
    /**
     * 查询学生成绩
     * 
     * @param fId 学生成绩主键
     * @return 学生成绩
     */
    public TbdiaStudentSessionScore selectTbdiaStudentSessionScoreByFId(Long fId);

    /**
     * 查询学生成绩列表
     * 
     * @param tbdiaStudentSessionScore 学生成绩
     * @return 学生成绩集合
     */
    public List<TbdiaStudentSessionScore> selectTbdiaStudentSessionScoreList(TbdiaStudentSessionScore tbdiaStudentSessionScore);

    /**
     * 新增学生成绩
     * 
     * @param tbdiaStudentSessionScore 学生成绩
     * @return 结果
     */
    public int insertTbdiaStudentSessionScore(TbdiaStudentSessionScore tbdiaStudentSessionScore);

    /**
     * 修改学生成绩
     * 
     * @param tbdiaStudentSessionScore 学生成绩
     * @return 结果
     */
    public int updateTbdiaStudentSessionScore(TbdiaStudentSessionScore tbdiaStudentSessionScore);

    /**
     * 删除学生成绩
     * 
     * @param fId 学生成绩主键
     * @return 结果
     */
    public int deleteTbdiaStudentSessionScoreByFId(Long fId);

    /**
     * 批量删除学生成绩
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbdiaStudentSessionScoreByFIds(String[] fIds);
}
