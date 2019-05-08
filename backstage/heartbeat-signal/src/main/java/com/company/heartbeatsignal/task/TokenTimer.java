package com.company.heartbeatsignal.task;

import com.company.heartbeatsignal.config.RepairAppConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Liquid
 * @类名： TokenTimer
 * @描述：
 * @date 2019/3/28
 */
@Slf4j
public class TokenTimer {
    private static ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
            new BasicThreadFactory.Builder().namingPattern("token-schedule-pool-%d").daemon(true).build());

    public static void start() {
        executorService.scheduleAtFixedRate(() -> {

            RepairAppConfig.accessToken = null;
            RepairAppConfig.enterpriseWeChatAccessToken = null;

            log.info("获取access_token成功，有效时长{}秒 token:{}", RepairAppConfig.ACCESS_TOKEN_EFFECTIVE_SECOND, RepairAppConfig.enterpriseWeChatAccessToken);

        }, 0, RepairAppConfig.ACCESS_TOKEN_EFFECTIVE_SECOND - 200, TimeUnit.SECONDS);
    }

}