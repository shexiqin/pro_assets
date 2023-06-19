package com.soft863.service.impl;

import com.soft863.common.core.text.Convert;
import com.soft863.domain.TbdiaMajor;
import com.soft863.domain.TbdiaTeach;
import com.soft863.mapper.TbdiaMajorMapper;
import com.soft863.service.ITbdiaMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 专业画像Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
@Service
public class TbdiaMajorServiceImpl implements ITbdiaMajorService 
{
    @Autowired
    private TbdiaMajorMapper tbdiaMajorMapper;

    /**
     * 查询专业画像
     * 
     * @param fMid 专业画像主键
     * @return 专业画像
     */
    @Override
    public TbdiaMajor selectTbdiaMajorByFMid(Long fMid)
    {
        return tbdiaMajorMapper.selectTbdiaMajorByFMid(fMid);
    }

    /**
     * 查询专业画像列表
     * 
     * @param tbdiaMajor 专业画像
     * @return 专业画像
     */
    @Override
    public List<TbdiaMajor> selectTbdiaMajorList(TbdiaMajor tbdiaMajor)
    {
        return tbdiaMajorMapper.selectTbdiaMajorList(tbdiaMajor);
    }

    /**
     * 新增专业画像
     * 
     * @param tbdiaMajor 专业画像
     * @return 结果
     */
    @Override
    public int insertTbdiaMajor(TbdiaMajor tbdiaMajor)
    {
        return tbdiaMajorMapper.insertTbdiaMajor(tbdiaMajor);
    }

    /**
     * 修改专业画像
     * 
     * @param tbdiaMajor 专业画像
     * @return 结果
     */
    @Override
    public int updateTbdiaMajor(TbdiaMajor tbdiaMajor)
    {
        return tbdiaMajorMapper.updateTbdiaMajor(tbdiaMajor);
    }

    /**
     * 批量删除专业画像
     * 
     * @param fMids 需要删除的专业画像主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaMajorByFMids(String fMids)
    {
        return tbdiaMajorMapper.deleteTbdiaMajorByFMids(Convert.toStrArray(fMids));
    }

    /**
     * 删除专业画像信息
     * 
     * @param fMid 专业画像主键
     * @return 结果
     */
    @Override
    public int deleteTbdiaMajorByFMid(Long fMid)
    {
        return tbdiaMajorMapper.deleteTbdiaMajorByFMid(fMid);
    }

    /**
     * 获取师资力量
     * @return 师资力量集合
     */
    @Override
    public List<TbdiaTeach> getTeacher(String majorCode) {
        return tbdiaMajorMapper.selectTeacher(majorCode);
    }

    @Override
    public List<String> getMajorName() {
        return tbdiaMajorMapper.selectMajorName();
    }

    @Override
    public List<String> getMpass() {
        return tbdiaMajorMapper.selectMpass();
    }

    @Override
    public List<Map<String, String>> selectMajorCount() {
        return tbdiaMajorMapper.selectMajorCount();
    }

    @Override
    public List<TbdiaMajor> selectMajorOrder() {
        return tbdiaMajorMapper.selectMajorOrder();
    }

    @Override
    public List<TbdiaMajor> selectMpassOrder() {
        return tbdiaMajorMapper.selectMpassOrder();
    }


}
