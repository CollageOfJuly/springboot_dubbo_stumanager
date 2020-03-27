package com.zj.web_stu;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zj")
@DubboComponentScan("com.zj.serviceimpl")
@MapperScan("com.zj.dao")
public class WebStuApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStuApplication.class, args);
    }

}
