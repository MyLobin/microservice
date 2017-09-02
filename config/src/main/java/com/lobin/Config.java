package com.lobin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Config {
    public static void main(String[] args) {
		new SpringApplicationBuilder(Config.class).web(true).run(args);
	}
}