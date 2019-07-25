package com.kyh.itoken.config;

/**
 * ClassName : ConfigApplication
 * Package : com.kyh.itoken.config
 * Project : pro11_itoken
 * Description : developing...
 *
 * @Date : 2019/7/23 11:54
 * @Author : kongyaohui
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}