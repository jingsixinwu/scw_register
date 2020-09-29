package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.offcn.user.mapper")
public class UserStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserStartApplication.class,args);
    }
}
