package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbfinExpendMapper;
import com.soft863.domain.TbfinExpend;
import com.soft863.service.ITbfinExpendService;
import com.soft863.common.core.text.Convert;

/**
 * 学校经费支出Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbfinExpendServiceImpl implements ITbfinExpendService 
{
    @Autowired
    private TbfinExpendMapper tbfinExpendMapper;

    /**
     * 查询学校经费支出
     * 
     * @param fId 学校经费支出主键
     * @return 学校经费支出
     */
    @Override
    public TbfinExpend selectTbfinExpendByFId(Long fId)
    {
        return tbfinExpendMapper.selectTbfinExpendByFId(fId);
    }

    /**
     * 查询学校经费支出列表
     * 
     * @param tbfinExpend 学校经费支出
     * @return 学校经费支出
     */
    @Override
    public List<TbfinExpend> selectTbfinExpendList(TbfinExpend tbfinExpend)
    {
        return tbfinExpendMapper.selectTbfinExpendList(tbfinExpend);
    }

    /**
     * 新增学校经费支出
     * 
     * @param tbfinExpend 学校经费支出
     * @return 结果
     */
    @Override
    public int insertTbfinExpend(TbfinExpend tbfinExpend)
    {
        return tbfinExpendMapper.insertTbfinExpend(tbfinExpend);
    }

    /**
     * 修改学校经费支出
     * 
     * @param tbfinExpend 学校经费支出
     * @return 结果
     */
    @Override
    public int updateTbfinExpend(TbfinExpend tbfinExpend)
    {
        return tbfinExpendMapper.updateTbfinExpend(tbfinExpend);
    }

    /**
     * 批量删除学校经费支出
     * 
     * @param fIds 需要删除的学校经费支出主键
     * @return 结果
     */
    @Override
    public int deleteTbfinExpendByFIds(String fIds)
    {
        return tbfinExpendMapper.deleteTbfinExpendByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学校经费支出信息
     * 
     * @param fId 学校经费支出主键
     * @return 结果
     */
    @Override
    public int deleteTbfinExpendByFId(Long fId)
    {
        return tbfinExpendMapper.deleteTbfinExpendByFId(fId);
    }
}
