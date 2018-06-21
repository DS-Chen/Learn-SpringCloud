package com.hello.rabbitmq.mq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

/**
 * @author chendongsuo
 * @create 2018-06-21 13:49
 * @email dongsuo.chen@nvr-china.com
 * @description 配置类
 */

@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){
        return new Queue("first-hello");
    }
}
