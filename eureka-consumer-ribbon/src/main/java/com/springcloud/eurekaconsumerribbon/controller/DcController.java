package com.springcloud.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chendongsuo
 * @create 2018-06-12 11:14
 * @email dongsuo.chen@nvr-china.com
 * @description dc Controller
 */
@RestController
@CrossOrigin
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc(){
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
