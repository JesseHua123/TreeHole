package com.muxingliu.mywebsiteend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.muxingliu.mywebsiteend.dao")
public class MywebsiteEndApplication {


    public static void main(String[] args) {
        SpringApplication.run(MywebsiteEndApplication.class, args);
    }

}
