package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbmdShareMapper;
import com.soft863.domain.TbmdShare;
import com.soft863.service.ITbmdShareService;
import com.soft863.common.core.text.Convert;

/**
 * 资产共享Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
@Service
public class TbmdShareServiceImpl implements ITbmdShareService 
{
    @Autowired
    private TbmdShareMapper tbmdShareMapper;

    /**
     * 查询资产共享
     * 
     * @param id 资产共享主键
     * @return 资产共享
     */
    @Override
    public TbmdShare selectTbmdShareById(Long id)
    {
        return tbmdShareMapper.selectTbmdShareById(id);
    }

    /**
     * 查询资产共享列表
     * 
     * @param tbmdShare 资产共享
     * @return 资产共享
     */
    @Override
    public List<TbmdShare> selectTbmdShareList(TbmdShare tbmdShare)
    {
        return tbmdShareMapper.selectTbmdShareList(tbmdShare);
    }

    /**
     * 新增资产共享
     * 
     * @param tbmdShare 资产共享
     * @return 结果
     */
    @Override
    public int insertTbmdShare(TbmdShare tbmdShare)
    {
        return tbmdShareMapper.insertTbmdShare(tbmdShare);
    }

    /**
     * 修改资产共享
     * 
     * @param tbmdShare 资产共享
     * @return 结果
     */
    @Override
    public int updateTbmdShare(TbmdShare tbmdShare)
    {
        return tbmdShareMapper.updateTbmdShare(tbmdShare);
    }

    /**
     * 批量删除资产共享
     * 
     * @param ids 需要删除的资产共享主键
     * @return 结果
     */
    @Override
    public int deleteTbmdShareByIds(String ids)
    {
        return tbmdShareMapper.deleteTbmdShareByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除资产共享信息
     * 
     * @param id 资产共享主键
     * @return 结果
     */
    @Override
    public int deleteTbmdShareById(Long id)
    {
        return tbmdShareMapper.deleteTbmdShareById(id);
    }
}
