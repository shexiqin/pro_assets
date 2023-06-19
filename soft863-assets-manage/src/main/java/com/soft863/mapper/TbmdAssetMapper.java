package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbmdAsset;

/**
 * 数据资产Mapper接口
 * 
 * @author wc
 * @date 2023-05-30
 */
public interface TbmdAssetMapper 
{
    /**
     * 查询数据资产
     * 
     * @param fId 数据资产主键
     * @return 数据资产
     */
    public TbmdAsset selectTbmdAssetByFId(Long fId);

    /**
     * 查询数据资产列表
     * 
     * @param tbmdAsset 数据资产
     * @return 数据资产集合
     */
    public List<TbmdAsset> selectTbmdAssetList(TbmdAsset tbmdAsset);

    /**
     * 新增数据资产
     * 
     * @param tbmdAsset 数据资产
     * @return 结果
     */
    public int insertTbmdAsset(TbmdAsset tbmdAsset);

    /**
     * 修改数据资产
     * 
     * @param tbmdAsset 数据资产
     * @return 结果
     */
    public int updateTbmdAsset(TbmdAsset tbmdAsset);

    /**
     * 删除数据资产
     * 
     * @param fId 数据资产主键
     * @return 结果
     */
    public int deleteTbmdAssetByFId(Long fId);

    /**
     * 批量删除数据资产
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbmdAssetByFIds(String[] fIds);

    int[] selNum1();

    Integer selTotal();

    Integer selPublish();

    int[] selShare();
}
