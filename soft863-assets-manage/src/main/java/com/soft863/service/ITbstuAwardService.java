package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbstuAward;

/**
 * 获奖学生(学工系统)Service接口
 * 
 * @author 863
 * @date 2023-06-02
 */
public interface ITbstuAwardService 
{
    /**
     * 查询获奖学生(学工系统)
     * 
     * @param fId 获奖学生(学工系统)主键
     * @return 获奖学生(学工系统)
     */
    public TbstuAward selectTbstuAwardByFId(Long fId);

    /**
     * 查询获奖学生(学工系统)列表
     * 
     * @param tbstuAward 获奖学生(学工系统)
     * @return 获奖学生(学工系统)集合
     */
    public List<TbstuAward> selectTbstuAwardList(TbstuAward tbstuAward);

    /**
     * 新增获奖学生(学工系统)
     * 
     * @param tbstuAward 获奖学生(学工系统)
     * @return 结果
     */
    public int insertTbstuAward(TbstuAward tbstuAward);

    /**
     * 修改获奖学生(学工系统)
     * 
     * @param tbstuAward 获奖学生(学工系统)
     * @return 结果
     */
    public int updateTbstuAward(TbstuAward tbstuAward);

    /**
     * 批量删除获奖学生(学工系统)
     * 
     * @param fIds 需要删除的获奖学生(学工系统)主键集合
     * @return 结果
     */
    public int deleteTbstuAwardByFIds(String fIds);

    /**
     * 删除获奖学生(学工系统)信息
     * 
     * @param fId 获奖学生(学工系统)主键
     * @return 结果
     */
    public int deleteTbstuAwardByFId(Long fId);
}
