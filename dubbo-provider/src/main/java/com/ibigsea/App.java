package com.ibigsea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * 是Spring Boot项目的核心注解,主要是开启自动配置
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}
