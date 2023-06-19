package com.soft863.service;

import java.util.List;

import com.soft863.domain.TbdiaTeach;
import com.soft863.domain.TbdiaTeacherEstimate;

/**
 * 优秀讲师评估Service接口
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
public interface ITbdiaTeacherEstimateService 
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
     * 批量删除优秀讲师评估
     * 
     * @param fIds 需要删除的优秀讲师评估主键集合
     * @return 结果
     */
    public int deleteTbdiaTeacherEstimateByFIds(String fIds);

    /**
     * 删除优秀讲师评估信息
     *
     * @param fTno 优秀讲师评估主键
     * @return 结果
     */
    public int deleteTbdiaTeacherEstimateByFId(Long fTno);

    List<TbdiaTeach> getTeacherData();

    int insertTbdiaTeacherEstimate(TbdiaTeacherEstimate tbdiaTeachEstimate);

    int deleteAll();
}
