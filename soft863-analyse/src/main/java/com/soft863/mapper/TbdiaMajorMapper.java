package com.soft863.mapper;

import com.soft863.domain.TbdiaMajor;
import com.soft863.domain.TbdiaTeach;

import java.util.List;
import java.util.Map;

/**
 * 专业画像Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-01
 */
public interface TbdiaMajorMapper 
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
     * 删除专业画像
     * 
     * @param fMid 专业画像主键
     * @return 结果
     */
    public int deleteTbdiaMajorByFMid(Long fMid);

    /**
     * 批量删除专业画像
     * 
     * @param fMids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbdiaMajorByFMids(String[] fMids);

    /**
     * 获取师资力量
     * @return 师资力量集合
     */
    List<TbdiaTeach> selectTeacher(String majorCode);


    List<String> selectMajorName();

    List<String> selectMpass();

    List<Map<String, String>> selectMajorCount();

    /**
     * 获取在校人数前五
     * @return
     */List<TbdiaMajor> selectMajorOrder();

    /**
     * 获取升学率前五
     * @return
     */
    List<TbdiaMajor> selectMpassOrder();
}
