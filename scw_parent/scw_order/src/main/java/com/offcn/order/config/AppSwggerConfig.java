package com.offcn.order.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //开启swagger2自动生成api文档的功能
public class AppSwggerConfig {
    @Bean("订单模块")
    public Docket createRestApi(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("订单模块")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/order.*"))
                .build().enable(true);
    }

    public ApiInfo apiInfo(){

        return new ApiInfoBuilder()
                .title("七易众筹-系统平台接口文档")
                .description("提供订单模块/支付模块的文档")
                .termsOfServiceUrl("http://www.ujiuye.com/")
                .version("1.0")
                .build();




    }


}
