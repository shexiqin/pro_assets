package com.soft863.service;

import java.util.List;
import java.util.Map;

import com.soft863.domain.TbdiaWarnStu;

/**
 * 教师预警Service接口
 * 
 * @author wc
 * @date 2023-06-03
 */
public interface ITbdiaWarnTecService
{
    /**
     * 查询教师预警
     * 
     * @param fId 教师预警主键
     * @return 教师预警
     */
    public TbdiaWarnStu selectTbdiaWarnTecByFId(Long fId);

    /**
     * 查询教师预警列表
     * 
     * @param tbdiaWarnStu 教师预警
     * @return 教师预警集合
     */
    public List<TbdiaWarnStu> selectTbdiaWarnTecList(TbdiaWarnStu tbdiaWarnStu);

    /**
     * 新增教师预警
     * 
     * @param tbdiaWarnStu 教师预警
     * @return 结果
     */
    public int insertTbdiaWarnTec(TbdiaWarnStu tbdiaWarnStu);

    /**
     * 修改教师预警
     * 
     * @param tbdiaWarnStu 教师预警
     * @return 结果
     */
    public int updateTbdiaWarnTec(TbdiaWarnStu tbdiaWarnStu);

    /**
     * 批量删除教师预警
     * 
     * @param fIds 需要删除的教师预警主键集合
     * @return 结果
     */
    public int deleteTbdiaWarnTecByFIds(String fIds);

    /**
     * 删除教师预警信息
     * 
     * @param fId 教师预警主键
     * @return 结果
     */
    public int deleteTbdiaWarnTecByFId(Long fId);


    /**
     * 批量处理教师预警
     *
     * @param fIds 需要处理的教师预警主键集合
     * @return 结果
     */
    public int updateAllTbdiaWarnTec(String fIds);

    /**
     * 查询各个学院的预警统计信息
     *
     * @return  结果
     */
    List<Map<String, Object>> selectFacWarnList();

    /**
     * 查询各个学院预警处理比例
     *
     * @return  结果
     */
    List<Map<String, Object>> selectWarnProportionList();

    /**
     * 半年预警查询
     *
     * @return 结果
     */
    List<Map<String, Object>> selectWarList();

    /**
     * 当月预警查询
     *
     * @return 结果
     */
    List<Map<String, Object>> selectMonthWarnList();

}
