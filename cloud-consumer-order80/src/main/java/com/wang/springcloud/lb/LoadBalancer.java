package com.wang.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author 王晋南
 * @Date 2020/06/29 15:19
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> instances);
}
