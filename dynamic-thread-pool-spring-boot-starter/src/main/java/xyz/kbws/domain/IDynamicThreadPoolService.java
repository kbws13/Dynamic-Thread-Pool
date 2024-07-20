package xyz.kbws.domain;

import xyz.kbws.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author kbws
 * @date 2024/7/20
 * @description: 动态线程池服务
 */
public interface IDynamicThreadPoolService {

    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);
}
