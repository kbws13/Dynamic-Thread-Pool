package xyz.kbws.registry;

import xyz.kbws.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author kbws
 * @date 2024/7/20
 * @description: 注册中心接口
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);
}
