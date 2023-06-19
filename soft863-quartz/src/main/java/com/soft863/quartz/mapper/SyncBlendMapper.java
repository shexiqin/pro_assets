package com.soft863.quartz.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface SyncBlendMapper {
    int syncStudent();
    int truncateStu();
    int insert();
    int update();
    int delete();
    int updateEdu();
}
