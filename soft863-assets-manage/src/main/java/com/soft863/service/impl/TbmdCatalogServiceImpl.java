package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbmdCatalogMapper;
import com.soft863.domain.TbmdCatalog;
import com.soft863.service.ITbmdCatalogService;
import com.soft863.common.core.text.Convert;

/**
 * 资产目录Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
@Service
public class TbmdCatalogServiceImpl implements ITbmdCatalogService 
{
    @Autowired
    private TbmdCatalogMapper tbmdCatalogMapper;

    /**
     * 查询资产目录
     * 
     * @param fDirectId 资产目录主键
     * @return 资产目录
     */
    @Override
    public TbmdCatalog selectTbmdCatalogByFDirectId(Long fDirectId)
    {
        return tbmdCatalogMapper.selectTbmdCatalogByFDirectId(fDirectId);
    }

    /**
     * 查询资产目录列表
     * 
     * @param tbmdCatalog 资产目录
     * @return 资产目录
     */
    @Override
    public List<TbmdCatalog> selectTbmdCatalogList(TbmdCatalog tbmdCatalog)
    {
        return tbmdCatalogMapper.selectTbmdCatalogList(tbmdCatalog);
    }

    /**
     * 新增资产目录
     * 
     * @param tbmdCatalog 资产目录
     * @return 结果
     */
    @Override
    public int insertTbmdCatalog(TbmdCatalog tbmdCatalog)
    {
        return tbmdCatalogMapper.insertTbmdCatalog(tbmdCatalog);
    }

    /**
     * 修改资产目录
     * 
     * @param tbmdCatalog 资产目录
     * @return 结果
     */
    @Override
    public int updateTbmdCatalog(TbmdCatalog tbmdCatalog)
    {
        return tbmdCatalogMapper.updateTbmdCatalog(tbmdCatalog);
    }

    /**
     * 批量删除资产目录
     * 
     * @param fDirectIds 需要删除的资产目录主键
     * @return 结果
     */
    @Override
    public int deleteTbmdCatalogByFDirectIds(String fDirectIds)
    {
        return tbmdCatalogMapper.deleteTbmdCatalogByFDirectIds(Convert.toStrArray(fDirectIds));
    }

    /**
     * 删除资产目录信息
     * 
     * @param fDirectId 资产目录主键
     * @return 结果
     */
    @Override
    public int deleteTbmdCatalogByFDirectId(Long fDirectId)
    {
        return tbmdCatalogMapper.deleteTbmdCatalogByFDirectId(fDirectId);
    }
}
