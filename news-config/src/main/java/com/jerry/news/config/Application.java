package com.jerry.news.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 11:44 2018/10/29
 * @Modified by:
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
        System.out.println("------------news-config模块启动成功--------------");
    }
}
