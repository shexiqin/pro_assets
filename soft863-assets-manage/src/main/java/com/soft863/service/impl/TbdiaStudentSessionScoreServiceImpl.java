package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbdiaStudentSessionScoreMapper;
import com.soft863.domain.TbdiaStudentSessionScore;
import com.soft863.service.ITbdiaStudentSessionScoreService;
import com.soft863.common.core.text.Convert;

/**
 * 学生成绩Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-07
 */
@Service
public class TbdiaStudentSessionScoreServiceImpl implements ITbdiaStudentSessionScoreService 
{
    @Autowired
    private TbdiaStudentSessionScoreMapper tbdiaStudentSessionScoreMapper;

    /**
     * 查询学生成绩
     * 
     * @param fId 学生成绩主键
     * @return 学生成绩
     */
    @Override
    public TbdiaStudentSessionScore selectTbdiaStudentSessionScoreByFId(Long fId)
    {
        return tbdiaStudentSessionScoreMapper.selectTbdiaStudentSessionScoreByFId(fId);
    }

    /**
     * 查询学生成绩列表
     * 
     * @param tbdiaStudentSessionScore 学生成绩
     * @return 学生成绩
     */
    @Override
    public List<TbdiaStudentSessionScore> selectTbdiaStudentSessionScoreList(TbdiaStudentSessionScore tbdiaStudentSessionScore)
    {
        return tbdiaStudentSessionScoreMapper.selectTbdiaStudentSessionScoreList(tbdiaStudentSessionScore);
    }

    /**
     * 新增学生成绩
     * 
     * @param tbdiaStudentSessionScore 学生成绩
     * @return 结果
     */
    @Override
    public int insertTbdiaStudentSessionScore(TbdiaStudentSessionScore tbdiaStudentSessionScore)
    {
        return tbdiaStudentSessionScoreMapper.insertTbdiaStudentSessionScore(tbdiaStudentSessionScore);
    }

    /**
     * 修改学生成绩
     * 
     * @param tbdiaStudentSessionScore 学生成绩
     * @return 结果
     */
    @Override
    public int updateTbdiaStudentSessionScore(TbdiaStudentSessionScore tbdiaStudentSessionScore)
    {
        return tbdiaStudentSessionScoreMapper.updateTbdiaStudentSessionScore(tbdiaStudentSessionScore);
    }

    /**
     * 批量删除学生成绩
     * 
     * @param fIds 需要删除的学生成绩主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaStudentSessionScoreByFIds(String fIds)
    {
        return tbdiaStudentSessionScoreMapper.deleteTbdiaStudentSessionScoreByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生成绩信息
     * 
     * @param fId 学生成绩主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaStudentSessionScoreByFId(Long fId)
    {
        return tbdiaStudentSessionScoreMapper.deleteTbdiaStudentSessionScoreByFId(fId);
    }
}
