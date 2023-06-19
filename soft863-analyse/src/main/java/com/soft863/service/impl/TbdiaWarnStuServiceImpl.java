package com.soft863.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbdiaWarnStuMapper;
import com.soft863.domain.TbdiaWarnStu;
import com.soft863.service.ITbdiaWarnStuService;
import com.soft863.common.core.text.Convert;

/**
 * 学生预警Service业务层处理
 * 
 * @author wc
 * @date 2023-06-03
 */
@Service
public class TbdiaWarnStuServiceImpl implements ITbdiaWarnStuService 
{
    @Autowired
    private TbdiaWarnStuMapper tbdiaWarnStuMapper;

    /**
     * 查询学生预警
     * 
     * @param fId 学生预警主键
     * @return 学生预警
     */
    @Override
    public TbdiaWarnStu selectTbdiaWarnStuByFId(Long fId)
    {
        return tbdiaWarnStuMapper.selectTbdiaWarnStuByFId(fId);
    }

    /**
     * 查询学生预警列表
     * 
     * @param tbdiaWarnStu 学生预警
     * @return 学生预警
     */
    @Override
    public List<TbdiaWarnStu> selectTbdiaWarnStuList(TbdiaWarnStu tbdiaWarnStu)
    {
        return tbdiaWarnStuMapper.selectTbdiaWarnStuList(tbdiaWarnStu);
    }

    /**
     * 新增学生预警
     * 
     * @param tbdiaWarnStu 学生预警
     * @return 结果
     */
    @Override
    public int insertTbdiaWarnStu(TbdiaWarnStu tbdiaWarnStu)
    {
        return tbdiaWarnStuMapper.insertTbdiaWarnStu(tbdiaWarnStu);
    }

    /**
     * 修改学生预警
     * 
     * @param tbdiaWarnStu 学生预警
     * @return 结果
     */
    @Override
    public int updateTbdiaWarnStu(TbdiaWarnStu tbdiaWarnStu)
    {
        return tbdiaWarnStuMapper.updateTbdiaWarnStu(tbdiaWarnStu);
    }

    /**
     * 批量删除学生预警
     * 
     * @param fIds 需要删除的学生预警主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaWarnStuByFIds(String fIds)
    {
        return tbdiaWarnStuMapper.deleteTbdiaWarnStuByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除学生预警信息
     * 
     * @param fId 学生预警主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaWarnStuByFId(Long fId)
    {
        return tbdiaWarnStuMapper.deleteTbdiaWarnStuByFId(fId);
    }

    @Override
    public List<Map<String, Object>> getWarnBar() {
        return tbdiaWarnStuMapper.queryMonthAndWarnCount();
    }

    @Override
    public List<Map<String, Object>> getWarnProportion() {
        return tbdiaWarnStuMapper.queryWarnTypeAndCount();
    }

    @Override
    public Object getWarntotal() {
        return tbdiaWarnStuMapper.getCount();
    }

    @Override
    public Object getDealWarn() {
        return tbdiaWarnStuMapper.dealWarn();
    }

    @Override
    public Object getNoDealWarn() {
        return tbdiaWarnStuMapper.noDealWarn();
    }

    @Override
    public Object getCurWarn() {
        return tbdiaWarnStuMapper.getCurWarn();
    }

    @Override
    public List<TbdiaWarnStu> getGkWarn() {
        return tbdiaWarnStuMapper.getGkWarn();
    }

    @Override
    public List<TbdiaWarnStu> getByWarn() {
        return tbdiaWarnStuMapper.getByWarn();
    }

    @Override
    public List<TbdiaWarnStu> getTkWarn() {
        return tbdiaWarnStuMapper.getTkWarn();
    }

    @Override
    public List<Map<String, Object>> getWarnRadar() {
        return tbdiaWarnStuMapper.getRadar();
    }

    @Override
    public String getMaxWarnName() {
        return tbdiaWarnStuMapper.getMaxWarnName();
    }

    @Override
    public List<Map<Object,Object>> getWarnInfoByName(String name) {
        return tbdiaWarnStuMapper.getWarnInfoByName(name);
    }

    @Override
    public List<Map<String, Object>> getDealWarnMonth() {
        return tbdiaWarnStuMapper.getDealWarnMonth();
    }

    @Override
    public TbdiaWarnStu getWarnBySno(String sno) {
        return tbdiaWarnStuMapper.getWarnBySno(sno);
    }
}
