package com.spring.userservice.user_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@GetMapping("/name")
	public String getUser() {
		
		return "User Print";
	}

}
