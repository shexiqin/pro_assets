package com.soft863.service;

import com.soft863.domain.TbstuLeave;

import java.util.List;

/**
 * 学生请假信息（学工系统）Service接口
 * 
 * @author cuihangbo
 * @date 2023-05-30
 */
public interface ITbstuLeaveService 
{
    /**
     * 查询学生请假信息（学工系统）
     * 
     * @param fId 学生请假信息（学工系统）主键
     * @return 学生请假信息（学工系统）
     */
    public TbstuLeave selectTbstuLeaveByFId(Long fId);

    /**
     * 查询学生请假信息（学工系统）列表
     * 
     * @param tbstuLeave 学生请假信息（学工系统）
     * @return 学生请假信息（学工系统）集合
     */
    public List<TbstuLeave> selectTbstuLeaveList(TbstuLeave tbstuLeave);

    /**
     * 新增学生请假信息（学工系统）
     * 
     * @param tbstuLeave 学生请假信息（学工系统）
     * @return 结果
     */
    public int insertTbstuLeave(TbstuLeave tbstuLeave);

    /**
     * 修改学生请假信息（学工系统）
     * 
     * @param tbstuLeave 学生请假信息（学工系统）
     * @return 结果
     */
    public int updateTbstuLeave(TbstuLeave tbstuLeave);

    /**
     * 批量删除学生请假信息（学工系统）
     * 
     * @param fIds 需要删除的学生请假信息（学工系统）主键集合
     * @return 结果
     */
    public int deleteTbstuLeaveByFIds(String fIds);

    /**
     * 删除学生请假信息（学工系统）信息
     * 
     * @param fId 学生请假信息（学工系统）主键
     * @return 结果
     */
    public int deleteTbstuLeaveByFId(Long fId);
}
