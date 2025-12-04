package com.mpp.cache.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class RedisConfiguration {

    @Bean
    public RedisCacheManager redisCacheManager(RedisConnectionFactory connectionFactory) {
        RedisCacheConfiguration configuration = RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofMinutes(30));

        // Aqui eu consigo configurar caches com TTL personalizados pelo nome
        Map<String, RedisCacheConfiguration> cacheConfigs = new HashMap<>();

        cacheConfigs.put("fiveMinutesTtl", RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(5)));
        cacheConfigs.put("tenMinutesTtl", RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(10)));

        return RedisCacheManager.builder()
                .cacheDefaults(configuration)
                .withInitialCacheConfigurations(cacheConfigs)
                .build();
    }
}
