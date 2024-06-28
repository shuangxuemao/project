package com.example.springboot_dzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot_dzy")
public class SpringbootDzyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDzyApplication.class, args);
    }

}
