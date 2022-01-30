package com.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * EnableSwagger2是springfox提供的一个注解，代表swagger2相关技术开启。
 * 会扫描当前类所在包及子包中所有的类型中的注解，做swagger文档的定制。
 */
@SpringBootApplication
@EnableSwagger2
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
