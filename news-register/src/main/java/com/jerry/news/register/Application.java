package com.jerry.news.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 11:14 2018/10/29
 * @Modified by:
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
        System.out.println("-----------news-register模块启动成功-----------");
    }
}
