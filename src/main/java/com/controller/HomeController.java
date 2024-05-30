package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	@GetMapping("home")
	public String getMethodName() {
		return "/index.jsp";
	}
	
	@GetMapping("")
	public String getMethodName2() {
		return "/index.jsp";
	}
	
}