package com.kyh.itoken.springboot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName : SpringbootAdminApplication
 * Package : com.kyh.itoken.springboot.admin
 * Project : pro11_itoken
 * Description : developing...
 *
 * @Date : 2019/7/23 15:59
 * @Author : kongyaohui
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class SpringbootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdminApplication.class, args);
    }
}
