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
    RestTemplate restTemplate;
    @GetMapping("/consumer")
    public String consumer() {
        return "ribbon consumer:--->"+ restTemplate.getForObject("http://SERVER/service", String.class);
    }
}