package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbmdCollectMapper;
import com.soft863.domain.TbmdCollect;
import com.soft863.service.ITbmdCollectService;
import com.soft863.common.core.text.Convert;

/**
 * 资产目录收藏Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
@Service
public class TbmdCollectServiceImpl implements ITbmdCollectService 
{
    @Autowired
    private TbmdCollectMapper tbmdCollectMapper;

    /**
     * 查询资产目录收藏
     * 
     * @param fId 资产目录收藏主键
     * @return 资产目录收藏
     */
    @Override
    public TbmdCollect selectTbmdCollectByFId(Long fId)
    {
        return tbmdCollectMapper.selectTbmdCollectByFId(fId);
    }

    /**
     * 查询资产目录收藏列表
     * 
     * @param tbmdCollect 资产目录收藏
     * @return 资产目录收藏
     */
    @Override
    public List<TbmdCollect> selectTbmdCollectList(TbmdCollect tbmdCollect)
    {
        return tbmdCollectMapper.selectTbmdCollectList(tbmdCollect);
    }

    /**
     * 新增资产目录收藏
     * 
     * @param tbmdCollect 资产目录收藏
     * @return 结果
     */
    @Override
    public int insertTbmdCollect(TbmdCollect tbmdCollect)
    {
        return tbmdCollectMapper.insertTbmdCollect(tbmdCollect);
    }

    /**
     * 修改资产目录收藏
     * 
     * @param tbmdCollect 资产目录收藏
     * @return 结果
     */
    @Override
    public int updateTbmdCollect(TbmdCollect tbmdCollect)
    {
        return tbmdCollectMapper.updateTbmdCollect(tbmdCollect);
    }

    /**
     * 批量删除资产目录收藏
     * 
     * @param fIds 需要删除的资产目录收藏主键
     * @return 结果
     */
    @Override
    public int deleteTbmdCollectByFIds(String fIds)
    {
        return tbmdCollectMapper.deleteTbmdCollectByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除资产目录收藏信息
     * 
     * @param fId 资产目录收藏主键
     * @return 结果
     */
    @Override
    public int deleteTbmdCollectByFId(Long fId)
    {
        return tbmdCollectMapper.deleteTbmdCollectByFId(fId);
    }
}
