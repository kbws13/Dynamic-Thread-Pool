package xyz.kbws.config;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.kbws.domain.DynamicThreadPoolService;

import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author kbws
 * @date 2024/7/20
 * @description: 动态配置入口
 */
@Configuration
public class DynamicThreadPoolAutoConfig {

    private final Logger logger = LoggerFactory.getLogger(DynamicThreadPoolAutoConfig.class);

    @Bean("dynamicThreadPoolService")
    public DynamicThreadPoolService dynamicThreadPoolService(ApplicationContext applicationContext, Map<String, ThreadPoolExecutor> threadPoolExecutorMap) {
        String applicationName = applicationContext.getEnvironment().getProperty("spring.application.name");
        if (StringUtils.isBlank(applicationName)) {
            applicationName = "default";
            logger.warn("动态线程池，启动提示。SpringBoot 应用未配置 spring.application.name 无法获取到应用名称");
        }

        return new DynamicThreadPoolService(applicationName, threadPoolExecutorMap);
    }

}
