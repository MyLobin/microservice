package com.lobin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceB {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                ServiceB.class)
                .web(true).run(args);
    }
}