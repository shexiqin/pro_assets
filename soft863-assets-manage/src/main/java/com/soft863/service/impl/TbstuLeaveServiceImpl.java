package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbstuLeave;
import com.soft863.mapper.TbstuLeaveMapper;
import com.soft863.service.ITbstuLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生请假信息（学工系统）Service业务层处理
 * 
 * @author cuihangbo
 * @date 2023-05-30
 */
@Service
public class TbstuLeaveServiceImpl implements ITbstuLeaveService 
{
    @Autowired
    private TbstuLeaveMapper tbstuLeaveMapper;

    /**
     * 查询学生请假信息（学工系统）
     * 
     * @param fId 学生请假信息（学工系统）主键
     * @return 学生请假信息（学工系统）
     */
    @Override
    public TbstuLeave selectTbstuLeaveByFId(Long fId)
    {
        return tbstuLeaveMapper.selectTbstuLeaveByFId(fId);
    }

    /**
     * 查询学生请假信息（学工系统）列表
     * 
     * @param tbstuLeave 学生请假信息（学工系统）
     * @return 学生请假信息（学工系统）
     */
    @Override
    public List<TbstuLeave> selectTbstuLeaveList(TbstuLeave tbstuLeave)
    {
        return tbstuLeaveMapper.selectTbstuLeaveList(tbstuLeave);
    }

    /**
     * 新增学生请假信息（学工系统）
     * 
     * @param tbstuLeave 学生请假信息（学工系统）
     * @return 结果
     */
    @Override
    public int insertTbstuLeave(TbstuLeave tbstuLeave)
    {
        return tbstuLeaveMapper.insertTbstuLeave(tbstuLeave);
    }

    /**
     * 修改学生请假信息（学工系统）
     * 
     * @param tbstuLeave 学生请假信息（学工系统）
     * @return 结果
     */
    @Override
    public int updateTbstuLeave(TbstuLeave tbstuLeave)
    {
        return tbstuLeaveMapper.updateTbstuLeave(tbstuLeave);
    }

    /**
     * 批量删除学生请假信息（学工系统）
     * 
     * @param fIds 需要删除的学生请假信息（学工系统）主键
     * @return 结果
     */
    @Override
    public int deleteTbstuLeaveByFIds(String fIds)
    {
        return tbstuLeaveMapper.deleteTbstuLeaveByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生请假信息（学工系统）信息
     * 
     * @param fId 学生请假信息（学工系统）主键
     * @return 结果
     */
    @Override
    public int deleteTbstuLeaveByFId(Long fId)
    {
        return tbstuLeaveMapper.deleteTbstuLeaveByFId(fId);
    }
}
