package com.wang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 王晋南
 * @Date 2020/06/22 13:57
 */
@RestController
@Slf4j
public class OrderZKController {
    public static final String INVOKE_URL = "http;//cloud-provider-payment";

    private RestTemplate restTemplate;

    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class );
        return result;
    }
}
