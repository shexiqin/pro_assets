package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbmdCollect;

/**
 * 资产目录收藏Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
public interface TbmdCollectMapper 
{
    /**
     * 查询资产目录收藏
     * 
     * @param fId 资产目录收藏主键
     * @return 资产目录收藏
     */
    public TbmdCollect selectTbmdCollectByFId(Long fId);

    /**
     * 查询资产目录收藏列表
     * 
     * @param tbmdCollect 资产目录收藏
     * @return 资产目录收藏集合
     */
    public List<TbmdCollect> selectTbmdCollectList(TbmdCollect tbmdCollect);

    /**
     * 新增资产目录收藏
     * 
     * @param tbmdCollect 资产目录收藏
     * @return 结果
     */
    public int insertTbmdCollect(TbmdCollect tbmdCollect);

    /**
     * 修改资产目录收藏
     * 
     * @param tbmdCollect 资产目录收藏
     * @return 结果
     */
    public int updateTbmdCollect(TbmdCollect tbmdCollect);

    /**
     * 删除资产目录收藏
     * 
     * @param fId 资产目录收藏主键
     * @return 结果
     */
    public int deleteTbmdCollectByFId(Long fId);

    /**
     * 批量删除资产目录收藏
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbmdCollectByFIds(String[] fIds);
}
