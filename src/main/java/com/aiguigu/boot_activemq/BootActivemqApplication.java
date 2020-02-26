package com.aiguigu.boot_activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling      // 是否开启
public class BootActivemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootActivemqApplication.class, args);
    }

}
