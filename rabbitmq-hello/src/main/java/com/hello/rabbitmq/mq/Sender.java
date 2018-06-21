package com.hello.rabbitmq.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author chendongsuo
 * @create 2018-06-21 13:42
 * @email dongsuo.chen@nvr-china.com
 * @description 发送消息
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){

        String context = "hello,CHEN " + new Date();
        System.out.println("Sender :" +context);

        this.amqpTemplate.convertAndSend("first-hello",context);

    }
}
