package com.soft863.service;

import com.soft863.domain.TbdiaMajor;
import com.soft863.domain.TbdiaTeach;

import java.util.List;
import java.util.Map;

/**
 * 专业画像Service接口
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public interface ITbdiaMajorService 
{
    /**
     * 查询专业画像
     * 
     * @param fMid 专业画像主键
     * @return 专业画像
     */
    public TbdiaMajor selectTbdiaMajorByFMid(Long fMid);

    /**
     * 查询专业画像列表
     * 
     * @param tbdiaMajor 专业画像
     * @return 专业画像集合
     */
    public List<TbdiaMajor> selectTbdiaMajorList(TbdiaMajor tbdiaMajor);

    /**
     * 新增专业画像
     * 
     * @param tbdiaMajor 专业画像
     * @return 结果
     */
    public int insertTbdiaMajor(TbdiaMajor tbdiaMajor);

    /**
     * 修改专业画像
     * 
     * @param tbdiaMajor 专业画像
     * @return 结果
     */
    public int updateTbdiaMajor(TbdiaMajor tbdiaMajor);

    /**
     * 批量删除专业画像
     * 
     * @param fMids 需要删除的专业画像主键集合
     * @return 结果
     */
    public int deleteTbdiaMajorByFMids(String fMids);

    /**
     * 删除专业画像信息
     * 
     * @param fMid 专业画像主键
     * @return 结果
     */
    public int deleteTbdiaMajorByFMid(Long fMid);

    /**
     * 获取师资力量
     * @return 老师集合
     */
    List<TbdiaTeach> getTeacher(String majorCode);



    /**
     * 获取专业名
     *
     * @return 专业名集合
     */

    List<String> getMajorName();

    List<String> getMpass();

    List<Map<String, String>> selectMajorCount();

    List<TbdiaMajor> selectMajorOrder();

    List<TbdiaMajor> selectMpassOrder();
}
