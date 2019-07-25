package com.kyh.itoken.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ClassName : ZuulApplication
 * Package : com.kyh.itoken.zuul
 * Project : pro11_itoken
 * Description : developing...
 *
 * @Date : 2019/7/21 20:48
 * @Author : kongyaohui
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
