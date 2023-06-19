package com.soft863.scheduledtask;

import com.soft863.domain.TbquaTask;

import java.util.concurrent.TimeUnit;

public interface TaskService {
    TbquaTask loseTask(Integer timeInterval, TimeUnit timeUnit);
    TbquaTask moreTask(Integer timeInterval, TimeUnit timeUnit);
}
