package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	//http get request
	
	@GetMapping("/api")
	public String activity() {
		return" Created Restfull web-services using spring MVC";
	}
	
	
}
