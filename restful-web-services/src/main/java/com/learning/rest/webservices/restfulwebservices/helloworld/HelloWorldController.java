package com.learning.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello")
	public String Helloworld() {
		return "hiiii";
	}

	@GetMapping(path = "/helloworldbean")
	public HelloWorldBean Helloworldbean() {
		return new HelloWorldBean("hello world");
	}

}

//The constructor HelloWorldBean(String) is undefined