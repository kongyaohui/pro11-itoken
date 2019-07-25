package com.kyh.itoken.zipkin;

/**
 * ClassName : ZipKinApplication
 * Package : com.kyh.itoken.zipkin
 * Project : pro11_itoken
 * Description : developing...
 *
 * @Date : 2019/7/23 14:47
 * @Author : kongyaohui
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class, args);
    }
}
