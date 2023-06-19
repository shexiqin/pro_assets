package com.soft863.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbdiaWarnTecMapper;
import com.soft863.domain.TbdiaWarnStu;
import com.soft863.service.ITbdiaWarnTecService;
import com.soft863.common.core.text.Convert;

/**
 * 教师预警Service业务层处理
 * 
 * @author wc
 * @date 2023-06-03
 */
@Service
public class TbdiaWarnTecServiceImpl implements ITbdiaWarnTecService
{
    @Autowired
    private TbdiaWarnTecMapper tbdiaWarnTecMapper;

    /**
     * 查询教师预警
     * 
     * @param fId 教师预警主键
     * @return 教师预警
     */
    @Override
    public TbdiaWarnStu selectTbdiaWarnTecByFId(Long fId)
    {
        return tbdiaWarnTecMapper.selectTbdiaWarnTecByFId(fId);
    }

    /**
     * 查询教师预警列表
     * 
     * @param tbdiaWarnStu 教师预警
     * @return 教师预警
     */
    @Override
    public List<TbdiaWarnStu> selectTbdiaWarnTecList(TbdiaWarnStu tbdiaWarnStu)
    {
        return tbdiaWarnTecMapper.selectTbdiaWarnTecList(tbdiaWarnStu);
    }

    /**
     * 新增教师预警
     * 
     * @param tbdiaWarnStu 教师预警
     * @return 结果
     */
    @Override
    public int insertTbdiaWarnTec(TbdiaWarnStu tbdiaWarnStu)
    {
        return tbdiaWarnTecMapper.insertTbdiaWarnTec(tbdiaWarnStu);
    }

    /**
     * 修改教师预警
     * 
     * @param tbdiaWarnStu 教师预警
     * @return 结果
     */
    @Override
    public int updateTbdiaWarnTec(TbdiaWarnStu tbdiaWarnStu)
    {
        return tbdiaWarnTecMapper.updateTbdiaWarnTec(tbdiaWarnStu);
    }

    /**
     * 批量删除教师预警
     * 
     * @param fIds 需要删除的教师预警主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaWarnTecByFIds(String fIds)
    {
        return tbdiaWarnTecMapper.deleteTbdiaWarnTecByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除教师预警信息
     * 
     * @param fId 教师预警主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaWarnTecByFId(Long fId)
    {
        return tbdiaWarnTecMapper.deleteTbdiaWarnTecByFId(fId);
    }

    /**
     * 批量处理教师预警
     *
     * @param fIds 需要修改的教师预警主键集合
     * @return  结果
     */
    @Override
    public int updateAllTbdiaWarnTec(String fIds) {
        return tbdiaWarnTecMapper.updateAllTbdiaWarnTecByFIds(Convert.toStrArray(fIds));
    }


    /**
     * 查询各个学院的预警统计信息
     *
     * @return 结果
     */
    @Override
    public List<Map<String, Object>> selectFacWarnList() {
        return tbdiaWarnTecMapper.selectFacWarnList();
    }

    /**
     * 查询各个学院预警处理比例
     *
     * @return  结果
     */
    @Override
    public List<Map<String, Object>> selectWarnProportionList() {
        return tbdiaWarnTecMapper.selectWarnProportionList();
    }


    /**
     * 半年预警查询
     *
     * @return  结果
     */
    @Override
    public List<Map<String, Object>> selectWarList() {
        return tbdiaWarnTecMapper.selectWarnList();
    }


    /**
     * 当月预警
     *
     * @return  结果
     */
    @Override
    public List<Map<String, Object>> selectMonthWarnList() {
        return tbdiaWarnTecMapper.selectMonthWarnList();
    }
}
