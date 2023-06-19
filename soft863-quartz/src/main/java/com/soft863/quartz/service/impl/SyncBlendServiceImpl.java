package com.soft863.quartz.service.impl;

import com.soft863.quartz.mapper.SyncBlendMapper;
import com.soft863.quartz.service.SyncBlendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 董文斌
 */
@Service
public class SyncBlendServiceImpl implements SyncBlendService {
    @Autowired
    private SyncBlendMapper syncBlendMapper;

    /**
     * 学生融合表同步
     * @return
     */
    @Override
    public int syncStudent() {
        syncBlendMapper.truncateStu();
        return syncBlendMapper.syncStudent();
    }

    /**
     * 教师融合表同步
     * @return
     */
    @Override
    public int SyncTeacher() {
        syncBlendMapper.insert();
        syncBlendMapper.delete();
        return syncBlendMapper.update();
    }
    /**
     * 替换数据
     * @return
     */
    @Override
    public int updateEdu() {
        return syncBlendMapper.updateEdu();
    }

}
