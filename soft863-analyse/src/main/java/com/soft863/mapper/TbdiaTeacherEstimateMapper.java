package com.soft863.mapper;

import java.util.List;
import com.soft863.domain.TbdiaTeacherEstimate;

/**
 * 优秀讲师评估Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
public interface TbdiaTeacherEstimateMapper 
{
    /**
     * 查询优秀讲师评估
     * 
     * @param fId 优秀讲师评估主键
     * @return 优秀讲师评估
     */
    public TbdiaTeacherEstimate selectTbdiaTeacherEstimateByFId(Long fId);

    /**
     * 查询优秀讲师评估列表
     * 
     * @param tbdiaTeacherEstimate 优秀讲师评估
     * @return 优秀讲师评估集合
     */
    public List<TbdiaTeacherEstimate> selectTbdiaTeacherEstimateList(TbdiaTeacherEstimate tbdiaTeacherEstimate);



    /**
     * 修改优秀讲师评估
     * 
     * @param tbdiaTeacherEstimate 优秀讲师评估
     * @return 结果
     */
    public int updateTbdiaTeacherEstimate(TbdiaTeacherEstimate tbdiaTeacherEstimate);

    /**
     * 删除优秀讲师评估
     * 
     * @param fTno 优秀讲师评估主键
     * @return 结果
     */
    public int deleteTbdiaTeacherEstimateByFId(Long fTno);

    /**
     * 批量删除优秀讲师评估
     * 
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbdiaTeacherEstimateByFIds(String[] fIds);

    //插入一条新的优秀教师评估
    public int  insertTbdiaTeacherEstimate(TbdiaTeacherEstimate tbdiaTeachEstimate);

    int deleteAll();
}
