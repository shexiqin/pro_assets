package com.soft863.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soft863.mapper.TbstuCertificateMapper;
import com.soft863.domain.TbstuCertificate;
import com.soft863.service.ITbstuCertificateService;
import com.soft863.common.core.text.Convert;

/**
 * 职业技能等级证书获取（学工系统）Service业务层处理
 * 
 * @author 863
 * @date 2023-05-31
 */
@Service
public class TbstuCertificateServiceImpl implements ITbstuCertificateService 
{
    @Autowired
    private TbstuCertificateMapper tbstuCertificateMapper;

    /**
     * 查询职业技能等级证书获取（学工系统）
     * 
     * @param fId 职业技能等级证书获取（学工系统）主键
     * @return 职业技能等级证书获取（学工系统）
     */
    @Override
    public TbstuCertificate selectTbstuCertificateByFId(Long fId)
    {
        return tbstuCertificateMapper.selectTbstuCertificateByFId(fId);
    }

    /**
     * 查询职业技能等级证书获取（学工系统）列表
     * 
     * @param tbstuCertificate 职业技能等级证书获取（学工系统）
     * @return 职业技能等级证书获取（学工系统）
     */
    @Override
    public List<TbstuCertificate> selectTbstuCertificateList(TbstuCertificate tbstuCertificate)
    {
        return tbstuCertificateMapper.selectTbstuCertificateList(tbstuCertificate);
    }

    /**
     * 新增职业技能等级证书获取（学工系统）
     * 
     * @param tbstuCertificate 职业技能等级证书获取（学工系统）
     * @return 结果
     */
    @Override
    public int insertTbstuCertificate(TbstuCertificate tbstuCertificate)
    {
        return tbstuCertificateMapper.insertTbstuCertificate(tbstuCertificate);
    }

    /**
     * 修改职业技能等级证书获取（学工系统）
     * 
     * @param tbstuCertificate 职业技能等级证书获取（学工系统）
     * @return 结果
     */
    @Override
    public int updateTbstuCertificate(TbstuCertificate tbstuCertificate)
    {
        return tbstuCertificateMapper.updateTbstuCertificate(tbstuCertificate);
    }

    /**
     * 批量删除职业技能等级证书获取（学工系统）
     * 
     * @param fIds 需要删除的职业技能等级证书获取（学工系统）主键
     * @return 结果
     */
    @Override
    public int deleteTbstuCertificateByFIds(String fIds)
    {
        return tbstuCertificateMapper.deleteTbstuCertificateByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除职业技能等级证书获取（学工系统）信息
     * 
     * @param fId 职业技能等级证书获取（学工系统）主键
     * @return 结果
     */
    @Override
    public int deleteTbstuCertificateByFId(Long fId)
    {
        return tbstuCertificateMapper.deleteTbstuCertificateByFId(fId);
    }
}
