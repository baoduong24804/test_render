package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@GetMapping("/home")
	public String getMethodName() {
		return "index";
	}
	
	@GetMapping("/")
	@ResponseBody
	public String getMethodName2() {
		return "Hello329";
	}
	
}
