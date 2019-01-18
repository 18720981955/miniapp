package com.wx.miniapp.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
/**
 * redis配置类
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/30 16:33
 */
@Configuration
@EnableCaching
public class RedisCacheConfig  extends CachingConfigurerSupport {
    /**
     * 缓存管理器
     * @param redisTemplate
     * @return
     */
    @Bean
    public CacheManager cacheManager(RedisTemplate<?,?> redisTemplate) {
        RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
        return rcm;
    }

    /**
     * redis模板操作类
     * @param factory 由springboot注入
     * @return
     */
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
        redisTemplate.setConnectionFactory(factory);
        //key序列化方式，在定义了key生成策略之后再加以下代码
//    	RedisSerializer<String> redisSerializer = new StringRedisSerializer();
//    	redisTemplate.setKeySerializer(redisSerializer);
//    	redisTemplate.setHashKeySerializer(redisSerializer);
        return redisTemplate;
    }


}
