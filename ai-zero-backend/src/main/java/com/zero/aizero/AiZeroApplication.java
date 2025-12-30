package com.zero.aizero;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zero.aizero.mapper")
public class AiZeroApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiZeroApplication.class, args);
        System.out.println("------启动成功------");
    }

}
