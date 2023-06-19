package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbmdCatalog;

/**
 * 资产目录Service接口
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
public interface ITbmdCatalogService 
{
    /**
     * 查询资产目录
     * 
     * @param fDirectId 资产目录主键
     * @return 资产目录
     */
    public TbmdCatalog selectTbmdCatalogByFDirectId(Long fDirectId);

    /**
     * 查询资产目录列表
     * 
     * @param tbmdCatalog 资产目录
     * @return 资产目录集合
     */
    public List<TbmdCatalog> selectTbmdCatalogList(TbmdCatalog tbmdCatalog);

    /**
     * 新增资产目录
     * 
     * @param tbmdCatalog 资产目录
     * @return 结果
     */
    public int insertTbmdCatalog(TbmdCatalog tbmdCatalog);

    /**
     * 修改资产目录
     * 
     * @param tbmdCatalog 资产目录
     * @return 结果
     */
    public int updateTbmdCatalog(TbmdCatalog tbmdCatalog);

    /**
     * 批量删除资产目录
     * 
     * @param fDirectIds 需要删除的资产目录主键集合
     * @return 结果
     */
    public int deleteTbmdCatalogByFDirectIds(String fDirectIds);

    /**
     * 删除资产目录信息
     * 
     * @param fDirectId 资产目录主键
     * @return 结果
     */
    public int deleteTbmdCatalogByFDirectId(Long fDirectId);
}
