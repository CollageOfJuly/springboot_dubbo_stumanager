package com.zj.web_class;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@DubboComponentScan("com.zj.serviceimpl")
@MapperScan("com.zj.dao")
public class WebClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClassApplication.class, args);
    }

}
