package com.jerry.news.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 12:05 2018/10/29
 * @Modified by:
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
        System.out.println("-------------news-gateway模块启动成功--------------");
    }
}
