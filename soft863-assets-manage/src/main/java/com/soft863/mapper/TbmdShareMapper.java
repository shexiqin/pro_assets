package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbmdShare;

/**
 * 资产共享Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface TbmdShareMapper 
{
    /**
     * 查询资产共享
     * 
     * @param id 资产共享主键
     * @return 资产共享
     */
    public TbmdShare selectTbmdShareById(Long id);

    /**
     * 查询资产共享列表
     * 
     * @param tbmdShare 资产共享
     * @return 资产共享集合
     */
    public List<TbmdShare> selectTbmdShareList(TbmdShare tbmdShare);

    /**
     * 新增资产共享
     * 
     * @param tbmdShare 资产共享
     * @return 结果
     */
    public int insertTbmdShare(TbmdShare tbmdShare);

    /**
     * 修改资产共享
     * 
     * @param tbmdShare 资产共享
     * @return 结果
     */
    public int updateTbmdShare(TbmdShare tbmdShare);

    /**
     * 删除资产共享
     * 
     * @param id 资产共享主键
     * @return 结果
     */
    public int deleteTbmdShareById(Long id);

    /**
     * 批量删除资产共享
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbmdShareByIds(String[] ids);
}
