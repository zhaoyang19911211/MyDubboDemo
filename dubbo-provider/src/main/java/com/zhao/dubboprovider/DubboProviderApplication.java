package com.zhao.dubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class DubboProviderApplication {

    public static void main(String[] args) {
        System.out.println("服务端启动。。。");
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
