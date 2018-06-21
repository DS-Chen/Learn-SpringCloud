package com.hello.rabbitmq.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author chendongsuo
 * @create 2018-06-21 13:47
 * @email dongsuo.chen@nvr-china.com
 * @description 接受者
 */
@Component
@RabbitListener(queues = "first-hello")
public class Receiver {
    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver :" + hello);
    }
}
