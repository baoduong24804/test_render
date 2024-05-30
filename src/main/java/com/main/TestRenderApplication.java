package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(@ComponentScan(basePackages = "com"))
public class TestRenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRenderApplication.class, args);
	}

	class Controller{
		@GetMapping("/home")
	public String getMethodName() {
		return "/index.jsp";
	}
	
	@GetMapping("/")
	public String getMethodName2() {
		return "/index.jsp";
	}
	}

}
