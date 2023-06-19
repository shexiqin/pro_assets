package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbstuAwardMapper;
import com.soft863.domain.TbstuAward;
import com.soft863.service.ITbstuAwardService;
import com.soft863.common.core.text.Convert;

/**
 * 获奖学生(学工系统)Service业务层处理
 * 
 * @author 863
 * @date 2023-06-02
 */
@Service
public class TbstuAwardServiceImpl implements ITbstuAwardService 
{
    @Autowired
    private TbstuAwardMapper tbstuAwardMapper;

    /**
     * 查询获奖学生(学工系统)
     * 
     * @param fId 获奖学生(学工系统)主键
     * @return 获奖学生(学工系统)
     */
    @Override
    public TbstuAward selectTbstuAwardByFId(Long fId)
    {
        return tbstuAwardMapper.selectTbstuAwardByFId(fId);
    }

    /**
     * 查询获奖学生(学工系统)列表
     * 
     * @param tbstuAward 获奖学生(学工系统)
     * @return 获奖学生(学工系统)
     */
    @Override
    public List<TbstuAward> selectTbstuAwardList(TbstuAward tbstuAward)
    {
        return tbstuAwardMapper.selectTbstuAwardList(tbstuAward);
    }

    /**
     * 新增获奖学生(学工系统)
     * 
     * @param tbstuAward 获奖学生(学工系统)
     * @return 结果
     */
    @Override
    public int insertTbstuAward(TbstuAward tbstuAward)
    {
        return tbstuAwardMapper.insertTbstuAward(tbstuAward);
    }

    /**
     * 修改获奖学生(学工系统)
     * 
     * @param tbstuAward 获奖学生(学工系统)
     * @return 结果
     */
    @Override
    public int updateTbstuAward(TbstuAward tbstuAward)
    {
        return tbstuAwardMapper.updateTbstuAward(tbstuAward);
    }

    /**
     * 批量删除获奖学生(学工系统)
     * 
     * @param fIds 需要删除的获奖学生(学工系统)主键
     * @return 结果
     */
    @Override
    public int deleteTbstuAwardByFIds(String fIds)
    {
        return tbstuAwardMapper.deleteTbstuAwardByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除获奖学生(学工系统)信息
     * 
     * @param fId 获奖学生(学工系统)主键
     * @return 结果
     */
    @Override
    public int deleteTbstuAwardByFId(Long fId)
    {
        return tbstuAwardMapper.deleteTbstuAwardByFId(fId);
    }
}
