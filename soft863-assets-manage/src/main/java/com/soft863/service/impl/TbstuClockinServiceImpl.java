package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbstuClockinMapper;
import com.soft863.domain.TbstuClockin;
import com.soft863.service.ITbstuClockinService;
import com.soft863.common.core.text.Convert;

/**
 * 学生打卡Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
@Service
public class TbstuClockinServiceImpl implements ITbstuClockinService 
{
    @Autowired
    private TbstuClockinMapper tbstuClockinMapper;

    /**
     * 查询学生打卡
     * 
     * @param fId 学生打卡主键
     * @return 学生打卡
     */
    @Override
    public TbstuClockin selectTbstuClockinByFId(Long fId)
    {
        return tbstuClockinMapper.selectTbstuClockinByFId(fId);
    }

    /**
     * 查询学生打卡列表
     * 
     * @param tbstuClockin 学生打卡
     * @return 学生打卡
     */
    @Override
    public List<TbstuClockin> selectTbstuClockinList(TbstuClockin tbstuClockin)
    {
        return tbstuClockinMapper.selectTbstuClockinList(tbstuClockin);
    }

    /**
     * 新增学生打卡
     * 
     * @param tbstuClockin 学生打卡
     * @return 结果
     */
    @Override
    public int insertTbstuClockin(TbstuClockin tbstuClockin)
    {
        return tbstuClockinMapper.insertTbstuClockin(tbstuClockin);
    }

    /**
     * 修改学生打卡
     * 
     * @param tbstuClockin 学生打卡
     * @return 结果
     */
    @Override
    public int updateTbstuClockin(TbstuClockin tbstuClockin)
    {
        return tbstuClockinMapper.updateTbstuClockin(tbstuClockin);
    }

    /**
     * 批量删除学生打卡
     * 
     * @param fIds 需要删除的学生打卡主键
     * @return 结果
     */
    @Override
    public int deleteTbstuClockinByFIds(String fIds)
    {
        return tbstuClockinMapper.deleteTbstuClockinByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生打卡信息
     * 
     * @param fId 学生打卡主键
     * @return 结果
     */
    @Override
    public int deleteTbstuClockinByFId(Long fId)
    {
        return tbstuClockinMapper.deleteTbstuClockinByFId(fId);
    }
}
