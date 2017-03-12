package com.ibigsea.test_starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibigsea.jedis.client.RedisClient;


@SpringBootApplication 
@RestController
public class App {
	
	@Autowired
	private RedisClient redisClient;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@RequestMapping("/set")
	public String set(String key, String value) throws Exception{
		redisClient.set(key, value);
		return "success";
	}
	
	@RequestMapping("/get")
	public String get(String key) throws Exception {
		return redisClient.get(key);
	}
}
