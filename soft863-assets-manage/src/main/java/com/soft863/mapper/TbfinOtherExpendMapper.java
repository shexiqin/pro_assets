package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbfinOtherExpend;

/**
 * 学校其他支出情况Mapper接口
 * 
 * @author gcx
 * @date 2023-05-31
 */
public interface TbfinOtherExpendMapper 
{
    /**
     * 查询学校其他支出情况
     * 
     * @param fId 学校其他支出情况主键
     * @return 学校其他支出情况
     */
    public TbfinOtherExpend selectTbfinOtherExpendByFId(Integer fId);

    /**
     * 查询学校其他支出情况列表
     * 
     * @param tbfinOtherExpend 学校其他支出情况
     * @return 学校其他支出情况集合
     */
    public List<TbfinOtherExpend> selectTbfinOtherExpendList(TbfinOtherExpend tbfinOtherExpend);

    /**
     * 新增学校其他支出情况
     * 
     * @param tbfinOtherExpend 学校其他支出情况
     * @return 结果
     */
    public int insertTbfinOtherExpend(TbfinOtherExpend tbfinOtherExpend);

    /**
     * 修改学校其他支出情况
     * 
     * @param tbfinOtherExpend 学校其他支出情况
     * @return 结果
     */
    public int updateTbfinOtherExpend(TbfinOtherExpend tbfinOtherExpend);

    /**
     * 删除学校其他支出情况
     * 
     * @param fId 学校其他支出情况主键
     * @return 结果
     */
    public int deleteTbfinOtherExpendByFId(Integer fId);

    /**
     * 批量删除学校其他支出情况
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbfinOtherExpendByFIds(String[] fIds);
}
