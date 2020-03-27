package com.zj.web_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zj")
public class WebManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebManagerApplication.class, args);
    }

}
