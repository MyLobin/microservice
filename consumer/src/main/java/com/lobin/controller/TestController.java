package com.lobin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/consumer")
    public String consumer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("SERVER");
        System.out.println(serviceInstance.getUri());
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/service";
        System.out.println(url);
        return "consumer:--->"+restTemplate.getForObject(url, String.class);
    }
}