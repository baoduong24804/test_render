package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	@GetMapping("/home")
	public String getMethodName() {
		return "Home hello";
	}
	
	@GetMapping("/")
	public String getMethodName2() {
		return "Hello2";
	}
	
}
