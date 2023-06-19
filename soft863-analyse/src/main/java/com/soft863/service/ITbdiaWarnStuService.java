package com.soft863.service;

import java.util.List;
import java.util.Map;

import com.soft863.domain.TbdiaWarnStu;

/**
 * 学生预警Service接口
 * 
 * @author wc
 * @date 2023-06-03
 */
public interface ITbdiaWarnStuService 
{
    /**
     * 查询学生预警
     * 
     * @param fId 学生预警主键
     * @return 学生预警
     */
    public TbdiaWarnStu selectTbdiaWarnStuByFId(Long fId);

    /**
     * 查询学生预警列表
     * 
     * @param tbdiaWarnStu 学生预警
     * @return 学生预警集合
     */
    public List<TbdiaWarnStu> selectTbdiaWarnStuList(TbdiaWarnStu tbdiaWarnStu);

    /**
     * 新增学生预警
     * 
     * @param tbdiaWarnStu 学生预警
     * @return 结果
     */
    public int insertTbdiaWarnStu(TbdiaWarnStu tbdiaWarnStu);

    /**
     * 修改学生预警
     * 
     * @param tbdiaWarnStu 学生预警
     * @return 结果
     */
    public int updateTbdiaWarnStu(TbdiaWarnStu tbdiaWarnStu);

    /**
     * 批量删除学生预警
     * 
     * @param fIds 需要删除的学生预警主键集合
     * @return 结果
     */
    public int deleteTbdiaWarnStuByFIds(String fIds);

    /**
     * 删除学生预警信息
     * 
     * @param fId 学生预警主键
     * @return 结果
     */
    public int deleteTbdiaWarnStuByFId(Long fId);

    List<Map<String, Object>> getWarnBar();

    List<Map<String, Object>> getWarnProportion();

    Object getWarntotal();

    Object getDealWarn();

    Object getNoDealWarn();

    Object getCurWarn();

    List<TbdiaWarnStu> getGkWarn();

    List<TbdiaWarnStu> getByWarn();

    List<TbdiaWarnStu> getTkWarn();

    List<Map<String, Object>> getWarnRadar();

    String getMaxWarnName();

    List<Map<Object,Object>> getWarnInfoByName(String name);

    List<Map<String, Object>> getDealWarnMonth();

    TbdiaWarnStu getWarnBySno(String sno);
}
