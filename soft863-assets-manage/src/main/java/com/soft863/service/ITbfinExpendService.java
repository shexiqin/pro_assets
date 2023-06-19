package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbfinExpend;

/**
 * 学校经费支出Service接口
 * 
 * @author ruoyi
 * @date 2023-05-31
 */
public interface ITbfinExpendService 
{
    /**
     * 查询学校经费支出
     * 
     * @param fId 学校经费支出主键
     * @return 学校经费支出
     */
    public TbfinExpend selectTbfinExpendByFId(Long fId);

    /**
     * 查询学校经费支出列表
     * 
     * @param tbfinExpend 学校经费支出
     * @return 学校经费支出集合
     */
    public List<TbfinExpend> selectTbfinExpendList(TbfinExpend tbfinExpend);

    /**
     * 新增学校经费支出
     * 
     * @param tbfinExpend 学校经费支出
     * @return 结果
     */
    public int insertTbfinExpend(TbfinExpend tbfinExpend);

    /**
     * 修改学校经费支出
     * 
     * @param tbfinExpend 学校经费支出
     * @return 结果
     */
    public int updateTbfinExpend(TbfinExpend tbfinExpend);

    /**
     * 批量删除学校经费支出
     * 
     * @param fIds 需要删除的学校经费支出主键集合
     * @return 结果
     */
    public int deleteTbfinExpendByFIds(String fIds);

    /**
     * 删除学校经费支出信息
     * 
     * @param fId 学校经费支出主键
     * @return 结果
     */
    public int deleteTbfinExpendByFId(Long fId);
}
