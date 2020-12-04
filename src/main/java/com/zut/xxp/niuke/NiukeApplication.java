package com.zut.xxp.niuke;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "com.zut.xxp.niuke.dao")
//@ComponentScan(basePackages = {"com.zut.xxp.niuke.dao"})

@SpringBootApplication
public class NiukeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiukeApplication.class, args);
    }

}
