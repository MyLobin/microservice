package com.lobin;

import com.lobin.test.CacheDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCache {

    public static void main(String[] args) {
         SpringApplication.run(SpringCache.class);
         //
        CacheDemo cacheDemo=new CacheDemo();
        cacheDemo.testA();
    }

}
