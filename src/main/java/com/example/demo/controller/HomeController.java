package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(name = "/home")
	private String home() {
		return "Welcome to the Learners home.";
	}

}
