package com.lobin.test;

import com.lobin.cache.annotation.CacheTest;
import org.springframework.context.annotation.Bean;

public class CacheDemo {

    @CacheTest
    @Bean
    public void testA(){
        System.out.println("do testA");
    }
}
