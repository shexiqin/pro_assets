package com.soft863.mapper;

import com.soft863.domain.TbquaDetail;

import java.util.List;

/**
 * 质检详情Mapper接口
 * 
 * @author cuihangbo
 * @date 2023-05-31
 */
public interface TbquaDetailMapper 
{
    /**
     * 查询质检详情
     * 
     * @param fId 质检详情主键
     * @return 质检详情
     */
    public TbquaDetail selectTbquaDetailByFId(Long fId);

    /**
     * 查询质检详情列表
     * 
     * @param tbquaDetail 质检详情
     * @return 质检详情集合
     */
    public List<TbquaDetail> selectTbquaDetailList(TbquaDetail tbquaDetail);

    /**
     * 新增质检详情
     * 
     * @param tbquaDetail 质检详情
     * @return 结果
     */
    public int insertTbquaDetail(TbquaDetail tbquaDetail);

    /**
     * 修改质检详情
     * 
     * @param tbquaDetail 质检详情
     * @return 结果
     */
    public int updateTbquaDetail(TbquaDetail tbquaDetail);

    /**
     * 删除质检详情
     * 
     * @param fId 质检详情主键
     * @return 结果
     */
    public int deleteTbquaDetailByFId(Long fId);

    /**
     * 批量删除质检详情
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbquaDetailByFIds(String[] fIds);
}
