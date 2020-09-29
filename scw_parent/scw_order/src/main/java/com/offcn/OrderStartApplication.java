package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.offcn.order.mapper")
@EnableFeignClients
@EnableCircuitBreaker
public class OrderStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderStartApplication.class,args);
    }
}
