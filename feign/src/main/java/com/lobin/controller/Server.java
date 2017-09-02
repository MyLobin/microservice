package com.lobin.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("server")
public interface Server {
    @GetMapping("/service")
    String service();
}