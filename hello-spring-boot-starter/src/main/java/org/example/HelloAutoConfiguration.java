package org.example;

import org.example.service.HelloService;
import org.example.service.impl.HelloServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouwenhua02
 * @date 2022/1/2
 */
@Configuration
@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloService.class)
public class HelloAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        return new HelloServiceImpl();
    }
}
