package com.sgl.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 1、将服务提供者注册到注册中心
 * 	    1、引入dubbo和 zk客户端相关依赖
 * 	    2、application.properties 配置dubbo的扫描包和注册中心地址
 * 	    3、使用dubbo 的@Service 注解发布服务
 */
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}
