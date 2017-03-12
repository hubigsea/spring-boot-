package com.ibigsea.bootprofile;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication 
@RestController
public class App {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(App.class, args);
	}
}
