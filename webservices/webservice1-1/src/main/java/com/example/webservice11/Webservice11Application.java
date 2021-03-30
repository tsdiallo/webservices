package com.example.webservice11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Webservice11Application {
	@GetMapping("/")
	public String sayHello(){
		return "Hello !";
	}
}
