package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbperStaffMapper;
import com.soft863.domain.TbperStaff;
import com.soft863.service.ITbperStaffService;
import com.soft863.common.core.text.Convert;

/**
 * 人事数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbperStaffServiceImpl implements ITbperStaffService 
{
    @Autowired
    private TbperStaffMapper tbperStaffMapper;

    /**
     * 查询人事数据
     * 
     * @param fId 人事数据主键
     * @return 人事数据
     */
    @Override
    public TbperStaff selectTbperStaffByFId(Long fId)
    {
        return tbperStaffMapper.selectTbperStaffByFId(fId);
    }

    /**
     * 查询人事数据列表
     * 
     * @param tbperStaff 人事数据
     * @return 人事数据
     */
    @Override
    public List<TbperStaff> selectTbperStaffList(TbperStaff tbperStaff)
    {
        return tbperStaffMapper.selectTbperStaffList(tbperStaff);
    }

    /**
     * 新增人事数据
     * 
     * @param tbperStaff 人事数据
     * @return 结果
     */
    @Override
    public int insertTbperStaff(TbperStaff tbperStaff)
    {
        return tbperStaffMapper.insertTbperStaff(tbperStaff);
    }

    /**
     * 修改人事数据
     * 
     * @param tbperStaff 人事数据
     * @return 结果
     */
    @Override
    public int updateTbperStaff(TbperStaff tbperStaff)
    {
        return tbperStaffMapper.updateTbperStaff(tbperStaff);
    }

    /**
     * 批量删除人事数据
     * 
     * @param fIds 需要删除的人事数据主键
     * @return 结果
     */
    @Override
    public int deleteTbperStaffByFIds(String fIds)
    {
        return tbperStaffMapper.deleteTbperStaffByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除人事数据信息
     * 
     * @param fId 人事数据主键
     * @return 结果
     */
    @Override
    public int deleteTbperStaffByFId(Long fId)
    {
        return tbperStaffMapper.deleteTbperStaffByFId(fId);
    }
}
