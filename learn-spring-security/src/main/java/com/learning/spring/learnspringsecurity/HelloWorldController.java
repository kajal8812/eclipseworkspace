package com.learning.spring.learnspringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hellospring")
	public String hello() {
		return "welcome";
	}
}
