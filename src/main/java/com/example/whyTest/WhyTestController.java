package com.example.whyTest;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WhyTestController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Welcome home!");
		return "home";
	}
	
	@RequestMapping("/travel")
	public String travel() {
		System.out.println("Info about travel!");
		return "travel";
	}


}
