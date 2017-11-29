package com.lobin;

import com.google.common.collect.Maps;
import com.lobin.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.*;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceA {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                ServiceA.class)
                .web(true).run(args);
    }
}