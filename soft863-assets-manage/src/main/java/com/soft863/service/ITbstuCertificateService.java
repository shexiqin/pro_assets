package com.soft863.service;

import java.util.List;
import com.soft863.domain.TbstuCertificate;

/**
 * 职业技能等级证书获取（学工系统）Service接口
 * 
 * @author 863
 * @date 2023-05-31
 */
public interface ITbstuCertificateService 
{
    /**
     * 查询职业技能等级证书获取（学工系统）
     * 
     * @param fId 职业技能等级证书获取（学工系统）主键
     * @return 职业技能等级证书获取（学工系统）
     */
    public TbstuCertificate selectTbstuCertificateByFId(Long fId);

    /**
     * 查询职业技能等级证书获取（学工系统）列表
     * 
     * @param tbstuCertificate 职业技能等级证书获取（学工系统）
     * @return 职业技能等级证书获取（学工系统）集合
     */
    public List<TbstuCertificate> selectTbstuCertificateList(TbstuCertificate tbstuCertificate);

    /**
     * 新增职业技能等级证书获取（学工系统）
     * 
     * @param tbstuCertificate 职业技能等级证书获取（学工系统）
     * @return 结果
     */
    public int insertTbstuCertificate(TbstuCertificate tbstuCertificate);

    /**
     * 修改职业技能等级证书获取（学工系统）
     * 
     * @param tbstuCertificate 职业技能等级证书获取（学工系统）
     * @return 结果
     */
    public int updateTbstuCertificate(TbstuCertificate tbstuCertificate);

    /**
     * 批量删除职业技能等级证书获取（学工系统）
     * 
     * @param fIds 需要删除的职业技能等级证书获取（学工系统）主键集合
     * @return 结果
     */
    public int deleteTbstuCertificateByFIds(String fIds);

    /**
     * 删除职业技能等级证书获取（学工系统）信息
     * 
     * @param fId 职业技能等级证书获取（学工系统）主键
     * @return 结果
     */
    public int deleteTbstuCertificateByFId(Long fId);
}
