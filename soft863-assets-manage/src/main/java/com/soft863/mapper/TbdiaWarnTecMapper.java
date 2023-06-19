package com.soft863.mapper;

import java.util.List;
import java.util.Map;

import com.soft863.domain.TbdiaWarnStu;

/**
 * 教师预警Mapper接口
 *
 * @author wc
 * @date 2023-06-03
 */
public interface TbdiaWarnTecMapper
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
     * 删除教师预警
     *
     * @param fId 教师预警主键
     * @return 结果
     */
    public int deleteTbdiaWarnTecByFId(Long fId);

    /**
     * 批量删除教师预警
     *
     * @param fIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbdiaWarnTecByFIds(String[] fIds);

    /**
     * 批量处理教师预警
     *
     * @param fIds 需要处理的数据主键集合
     * @return 结果
     */
    public int updateAllTbdiaWarnTecByFIds(String[] fIds);

    /**
     * 各学院预警
     *
     * @return 结果
     */
    List<Map<String, Object>> selectFacWarnList();

    /**
     * 各学院预警处理比例
     *
     * @return 结果
     */
    List<Map<String, Object>> selectWarnProportionList();

    /**
     * 半年预警处理图
     *
     * @return 结果
     */
    List<Map<String, Object>> selectWarnList();

    /**
     * 当月预警
     *
     * @return  结果
     */
    List<Map<String, Object>> selectMonthWarnList();

}
