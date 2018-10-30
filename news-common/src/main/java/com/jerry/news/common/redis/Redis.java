package com.jerry.news.common.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 15:03 2018/10/29
 * @Modified by:
 */
@Component
public class Redis {

    @Autowired
    private RedisTemplate template;

    private ValueOperations valueOperations;

    @PostConstruct
    public void init() {
        this.valueOperations = template.opsForValue();
    }

    public void set(String key, String value, long expire) {
        valueOperations.set(key, value, expire, TimeUnit.SECONDS);
    }


    public void set(String key, String value) {
        template.opsForValue().set(key, value);
    }

    public Object get(String key) {
        return template.opsForValue().get(key);
    }

    public void delete(String key) {
        template.delete(key);
    }
}
