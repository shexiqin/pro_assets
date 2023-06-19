package com.soft863.service.impl;

import java.util.List;

import com.soft863.domain.TbdiaTeach;
import com.soft863.mapper.TbdiaTeachMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbdiaTeacherEstimateMapper;
import com.soft863.domain.TbdiaTeacherEstimate;
import com.soft863.service.ITbdiaTeacherEstimateService;
import com.soft863.common.core.text.Convert;

/**
 * 优秀讲师评估Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-03
 */
@Service
public class TbdiaTeacherEstimateServiceImpl implements ITbdiaTeacherEstimateService 
{
    @Autowired
    private TbdiaTeacherEstimateMapper tbdiaTeacherEstimateMapper;

    @Autowired
    private  TbdiaTeachMapper tbdiaTeachMapper;


    /**
     * 查询优秀讲师评估
     * 
     * @param fId 优秀讲师评估主键
     * @return 优秀讲师评估
     */
    @Override
    public TbdiaTeacherEstimate selectTbdiaTeacherEstimateByFId(Long fId)
    {
        return tbdiaTeacherEstimateMapper.selectTbdiaTeacherEstimateByFId(fId);
    }

    /**
     * 查询优秀讲师评估列表
     *
     * @param tbdiaTeacherEstimate 优秀讲师评估
     * @return 优秀讲师评估
     */
    @Override
    public List<TbdiaTeacherEstimate> selectTbdiaTeacherEstimateList(TbdiaTeacherEstimate tbdiaTeacherEstimate)
    {
        return tbdiaTeacherEstimateMapper.selectTbdiaTeacherEstimateList(tbdiaTeacherEstimate);
    }

    /**
     * 修改优秀讲师评估
     * 
     * @param tbdiaTeacherEstimate 优秀讲师评估
     * @return 结果
     */
    @Override
    public int updateTbdiaTeacherEstimate(TbdiaTeacherEstimate tbdiaTeacherEstimate)
    {
        return tbdiaTeacherEstimateMapper.updateTbdiaTeacherEstimate(tbdiaTeacherEstimate);
    }

    /**
     * 批量删除优秀讲师评估
     * 
     * @param fIds 需要删除的优秀讲师评估主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaTeacherEstimateByFIds(String fIds)
    {
        return tbdiaTeacherEstimateMapper.deleteTbdiaTeacherEstimateByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除优秀讲师评估信息
     * 
     * @param fTno 优秀讲师评估主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaTeacherEstimateByFId(Long fTno)
    {
        return tbdiaTeacherEstimateMapper.deleteTbdiaTeacherEstimateByFId(fTno);
    }

    @Override
    public List<TbdiaTeach> getTeacherData() {
        return tbdiaTeachMapper.selectTbdiaTeachList(null);
    }

    @Override
    public int insertTbdiaTeacherEstimate(TbdiaTeacherEstimate tbdiaTeachEstimate) {
        return tbdiaTeacherEstimateMapper.insertTbdiaTeacherEstimate(tbdiaTeachEstimate);
    }

    @Override
    public int deleteAll() {
        return tbdiaTeacherEstimateMapper.deleteAll();
    }
}
