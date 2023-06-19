package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbquaDetail;
import com.soft863.mapper.TbquaDetailMapper;
import com.soft863.service.ITbquaDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 质检详情Service业务层处理
 * 
 * @author cuihangbo
 * @date 2023-05-31
 */
@Service
public class TbquaDetailServiceImpl implements ITbquaDetailService 
{
    @Autowired
    private TbquaDetailMapper tbquaDetailMapper;

    /**
     * 查询质检详情
     * 
     * @param fId 质检详情主键
     * @return 质检详情
     */
    @Override
    public TbquaDetail selectTbquaDetailByFId(Long fId)
    {
        return tbquaDetailMapper.selectTbquaDetailByFId(fId);
    }

    /**
     * 查询质检详情列表
     * 
     * @param tbquaDetail 质检详情
     * @return 质检详情
     */
    @Override
    public List<TbquaDetail> selectTbquaDetailList(TbquaDetail tbquaDetail)
    {
        return tbquaDetailMapper.selectTbquaDetailList(tbquaDetail);
    }

    /**
     * 新增质检详情
     * 
     * @param tbquaDetail 质检详情
     * @return 结果
     */
    @Override
    public int insertTbquaDetail(TbquaDetail tbquaDetail)
    {
        return tbquaDetailMapper.insertTbquaDetail(tbquaDetail);
    }

    /**
     * 修改质检详情
     * 
     * @param tbquaDetail 质检详情
     * @return 结果
     */
    @Override
    public int updateTbquaDetail(TbquaDetail tbquaDetail)
    {
        return tbquaDetailMapper.updateTbquaDetail(tbquaDetail);
    }

    /**
     * 批量删除质检详情
     * 
     * @param fIds 需要删除的质检详情主键
     * @return 结果
     */
    @Override
    public int deleteTbquaDetailByFIds(String fIds)
    {
        return tbquaDetailMapper.deleteTbquaDetailByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除质检详情信息
     * 
     * @param fId 质检详情主键
     * @return 结果
     */
    @Override
    public int deleteTbquaDetailByFId(Long fId)
    {
        return tbquaDetailMapper.deleteTbquaDetailByFId(fId);
    }
}
