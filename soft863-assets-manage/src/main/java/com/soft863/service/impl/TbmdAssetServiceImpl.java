package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbmdAssetMapper;
import com.soft863.domain.TbmdAsset;
import com.soft863.service.ITbmdAssetService;
import com.soft863.common.core.text.Convert;

/**
 * 数据资产Service业务层处理
 * 
 * @author wc
 * @date 2023-05-30
 */
@Service
public class TbmdAssetServiceImpl implements ITbmdAssetService 
{
    @Autowired
    private TbmdAssetMapper tbmdAssetMapper;

    /**
     * 查询数据资产
     * 
     * @param fId 数据资产主键
     * @return 数据资产
     */
    @Override
    public TbmdAsset selectTbmdAssetByFId(Long fId)
    {
        return tbmdAssetMapper.selectTbmdAssetByFId(fId);
    }

    /**
     * 查询数据资产列表
     * 
     * @param tbmdAsset 数据资产
     * @return 数据资产
     */
    @Override
    public List<TbmdAsset> selectTbmdAssetList(TbmdAsset tbmdAsset)
    {
        return tbmdAssetMapper.selectTbmdAssetList(tbmdAsset);
    }

    /**
     * 新增数据资产
     * 
     * @param tbmdAsset 数据资产
     * @return 结果
     */
    @Override
    public int insertTbmdAsset(TbmdAsset tbmdAsset)
    {
        return tbmdAssetMapper.insertTbmdAsset(tbmdAsset);
    }

    /**
     * 修改数据资产
     * 
     * @param tbmdAsset 数据资产
     * @return 结果
     */
    @Override
    public int updateTbmdAsset(TbmdAsset tbmdAsset)
    {
        return tbmdAssetMapper.updateTbmdAsset(tbmdAsset);
    }

    /**
     * 批量删除数据资产
     * 
     * @param fIds 需要删除的数据资产主键
     * @return 结果
     */
    @Override
    public int deleteTbmdAssetByFIds(String fIds)
    {
        return tbmdAssetMapper.deleteTbmdAssetByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除数据资产信息
     * 
     * @param fId 数据资产主键
     * @return 结果
     */
    @Override
    public int deleteTbmdAssetByFId(Long fId)
    {
        return tbmdAssetMapper.deleteTbmdAssetByFId(fId);
    }

    @Override
    public int[] selNum1() {
        return tbmdAssetMapper.selNum1();
    }

    @Override
    public Integer selTotal() {
        return tbmdAssetMapper.selTotal();
    }

    @Override
    public Integer selPublish() {
        return tbmdAssetMapper.selPublish();
    }

    @Override
    public int[] selShare() {
        return tbmdAssetMapper.selShare();
    }


}
