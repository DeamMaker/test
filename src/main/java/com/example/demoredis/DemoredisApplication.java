package com.example.demoredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DemoredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoredisApplication.class, args);
    }

}
