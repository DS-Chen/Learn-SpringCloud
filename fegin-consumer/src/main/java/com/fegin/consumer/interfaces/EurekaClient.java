package com.fegin.consumer.interfaces;

import com.fegin.consumer.fallback.ClientHystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chendongsuo
 * @create 2018-06-21 10:16
 * @email dongsuo.chen@nvr-china.com
 * @description EurekaClient接口
 */
@FeignClient(value = "eureka-client",fallback = ClientHystrix.class)
public interface EurekaClient {
    @RequestMapping(value = "/dc",method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a,
                @RequestParam(value = "b") Integer b);
}
