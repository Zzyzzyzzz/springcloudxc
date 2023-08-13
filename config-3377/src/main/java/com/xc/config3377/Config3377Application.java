package com.xc.config3377;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Config3377Application {

    public static void main(String[] args) {
        SpringApplication.run(Config3377Application.class, args);
    }

}
