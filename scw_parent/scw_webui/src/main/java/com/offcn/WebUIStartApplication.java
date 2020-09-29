package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class )  //不启用JDBC
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class WebUIStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebUIStartApplication.class,args);
    }

}
