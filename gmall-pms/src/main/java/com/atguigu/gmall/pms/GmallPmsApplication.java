package com.atguigu.gmall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
/*
EnableDiscoveryClient -- 服务发现
作用：
    能够让注册中心能够发现，扫描到该服务
@EnableDiscoveryClient和@EnableEurekaClient的区别：
    @EnableDiscoveryClient和@EnableEurekaClient共同点就是：
        都是能够让注册中心能够发现，扫描到该服务。
    不同点：@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient可以是其他注册中心。
原文链接：https://blog.csdn.net/zheng199172/article/details/82466139
 */
@EnableDiscoveryClient
@EnableFeignClients // 开启feign
@MapperScan("com.atguigu.gmall.pms.dao")
@EnableSwagger2
@RefreshScope // nacos中配置更改，不重启
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
