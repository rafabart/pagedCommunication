package com.pageableConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class PageableConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageableConsumerApplication.class, args);
    }

}
