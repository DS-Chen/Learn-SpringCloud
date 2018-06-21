package com.fegin.consumer.fallback;

import com.fegin.consumer.interfaces.EurekaClient;

import org.springframework.stereotype.Component;


/**
 * @author chendongsuo
 * @create 2018-06-21 10:51
 * @email dongsuo.chen@nvr-china.com
 * @description ClientHystrix回调
 */
@Component
public class ClientHystrix implements EurekaClient {
    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
