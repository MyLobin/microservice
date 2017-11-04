package com.lobin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${spring.application.name}")
    private String name;
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/service")
    public String service() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return "application:" + name + "_a  => " + services;
    }

    @Value("${spring}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    @GetMapping("exception")
    public String getException(){
        throw new RuntimeException();
    }

}
