package com.lobin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    Server server;
    @GetMapping("/consumer")
    public String consumer() {
        return "feign consumer:--->"+ server.service();
    }
}