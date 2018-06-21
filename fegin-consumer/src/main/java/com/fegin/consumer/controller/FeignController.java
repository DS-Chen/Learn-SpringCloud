package com.fegin.consumer.controller;

import com.fegin.consumer.interfaces.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendongsuo
 * @create 2018-06-21 10:20
 * @email dongsuo.chen@nvr-china.com
 * @description feign控制器
 */
@RestController
public class FeignController {

    @Autowired
    EurekaClient eurekaClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(){
        return eurekaClient.add(100,200);
    }
}
