package com.zhao.dubboconsumer;

import com.zhao.api.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class DubboConsumerApplication {

    public static void main(String[] args) {
        System.out.println("消费者启动。。。");
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
