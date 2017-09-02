package com.lobin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceA {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                ServiceA.class)
                .web(true).run(args);
    }
}