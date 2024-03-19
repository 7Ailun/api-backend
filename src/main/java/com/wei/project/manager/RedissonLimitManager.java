package com.wei.project.manager;

import com.wei.project.common.ErrorCode;
import com.wei.project.exception.BusinessException;
import org.redisson.api.RRateLimiter;
import org.redisson.api.RateIntervalUnit;
import org.redisson.api.RateType;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedissonLimitManager {
    @Resource
    private RedissonClient redissonClient;

    public void doRateLimit(String key) {
        RRateLimiter rateLimiter = redissonClient.getRateLimiter(key);
        // 创建限流器，每秒最多访问1次
        rateLimiter.trySetRate(RateType.OVERALL,1,1, RateIntervalUnit.SECONDS);
        // 当用户来时，请求一个令牌
        boolean result = rateLimiter.tryAcquire(1);
        if(!result) {
            throw new BusinessException(ErrorCode.TOO_MANY_REQUEST);
        }
    }
}