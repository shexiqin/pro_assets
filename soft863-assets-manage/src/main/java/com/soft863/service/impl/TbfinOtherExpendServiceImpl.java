package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbfinOtherExpendMapper;
import com.soft863.domain.TbfinOtherExpend;
import com.soft863.service.ITbfinOtherExpendService;
import com.soft863.common.core.text.Convert;

/**
 * 学校其他支出情况Service业务层处理
 * 
 * @author gcx
 * @date 2023-05-31
 */
@Service
public class TbfinOtherExpendServiceImpl implements ITbfinOtherExpendService 
{
    @Autowired
    private TbfinOtherExpendMapper tbfinOtherExpendMapper;

    /**
     * 查询学校其他支出情况
     * 
     * @param fId 学校其他支出情况主键
     * @return 学校其他支出情况
     */
    @Override
    public TbfinOtherExpend selectTbfinOtherExpendByFId(Integer fId)
    {
        return tbfinOtherExpendMapper.selectTbfinOtherExpendByFId(fId);
    }

    /**
     * 查询学校其他支出情况列表
     * 
     * @param tbfinOtherExpend 学校其他支出情况
     * @return 学校其他支出情况
     */
    @Override
    public List<TbfinOtherExpend> selectTbfinOtherExpendList(TbfinOtherExpend tbfinOtherExpend)
    {
        return tbfinOtherExpendMapper.selectTbfinOtherExpendList(tbfinOtherExpend);
    }

    /**
     * 新增学校其他支出情况
     * 
     * @param tbfinOtherExpend 学校其他支出情况
     * @return 结果
     */
    @Override
    public int insertTbfinOtherExpend(TbfinOtherExpend tbfinOtherExpend)
    {
        return tbfinOtherExpendMapper.insertTbfinOtherExpend(tbfinOtherExpend);
    }

    /**
     * 修改学校其他支出情况
     * 
     * @param tbfinOtherExpend 学校其他支出情况
     * @return 结果
     */
    @Override
    public int updateTbfinOtherExpend(TbfinOtherExpend tbfinOtherExpend)
    {
        return tbfinOtherExpendMapper.updateTbfinOtherExpend(tbfinOtherExpend);
    }

    /**
     * 批量删除学校其他支出情况
     * 
     * @param fIds 需要删除的学校其他支出情况主键
     * @return 结果
     */
    @Override
    public int deleteTbfinOtherExpendByFIds(String fIds)
    {
        return tbfinOtherExpendMapper.deleteTbfinOtherExpendByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学校其他支出情况信息
     * 
     * @param fId 学校其他支出情况主键
     * @return 结果
     */
    @Override
    public int deleteTbfinOtherExpendByFId(Integer fId)
    {
        return tbfinOtherExpendMapper.deleteTbfinOtherExpendByFId(fId);
    }
}
