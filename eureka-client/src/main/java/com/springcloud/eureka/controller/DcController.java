package com.springcloud.eureka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author chendongsuo
 * @create 2018-06-12 9:51
 * @email dongsuo.chen@nvr-china.com
 * @description Dc控制器
 */
@RestController
@CrossOrigin
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dc",method = RequestMethod.GET)
    public Integer dc(@RequestParam(value = "a") Integer a,
                     @RequestParam(value = "b") Integer b) {

        Integer r=a+b;
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return r;
    }

}
