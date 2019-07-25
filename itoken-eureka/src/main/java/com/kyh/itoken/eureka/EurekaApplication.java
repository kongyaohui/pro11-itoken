package com.kyh.itoken.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName : EurekaApplication
 * Package : com.kyh.itoken.eureka
 * Project : pro11_itoken
 * Description : developing...
 *
 * @Date : 2019/7/21 13:00
 * @Author : kongyaohui
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
