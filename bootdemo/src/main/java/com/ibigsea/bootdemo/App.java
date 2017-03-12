package com.ibigsea.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 是Spring Boot项目的核心注解,主要是开启自动配置
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
public class App {
	
	@Autowired
	private UserSetting userSetting;
	
	@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot, name is " + userSetting.getName() + ", age is "+ userSetting.getAge();
	}
	
	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(App.class);
//		app.setBannerMode(Mode.OFF);
//		app.run(args);
		SpringApplication.run(App.class, args);
	}
}
