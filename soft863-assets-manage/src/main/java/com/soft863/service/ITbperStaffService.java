package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbperStaff;

/**
 * 人事数据Service接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface ITbperStaffService 
{
    /**
     * 查询人事数据
     * 
     * @param fId 人事数据主键
     * @return 人事数据
     */
    public TbperStaff selectTbperStaffByFId(Long fId);

    /**
     * 查询人事数据列表
     * 
     * @param tbperStaff 人事数据
     * @return 人事数据集合
     */
    public List<TbperStaff> selectTbperStaffList(TbperStaff tbperStaff);

    /**
     * 新增人事数据
     * 
     * @param tbperStaff 人事数据
     * @return 结果
     */
    public int insertTbperStaff(TbperStaff tbperStaff);

    /**
     * 修改人事数据
     * 
     * @param tbperStaff 人事数据
     * @return 结果
     */
    public int updateTbperStaff(TbperStaff tbperStaff);

    /**
     * 批量删除人事数据
     * 
     * @param fIds 需要删除的人事数据主键集合
     * @return 结果
     */
    public int deleteTbperStaffByFIds(String fIds);

    /**
     * 删除人事数据信息
     * 
     * @param fId 人事数据主键
     * @return 结果
     */
    public int deleteTbperStaffByFId(Long fId);
}
