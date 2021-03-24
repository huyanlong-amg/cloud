package com.hyl.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author huyanlong
 * @Date 2021/3/22 16:29
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced // 赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
