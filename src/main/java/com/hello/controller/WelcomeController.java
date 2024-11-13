package com.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
@RequestMapping("/hello")
	public String welcome() {
		return "welcome to springboot application";
	}
}
