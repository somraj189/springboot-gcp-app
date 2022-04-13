package com.test.springbootgcpapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGcpAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGcpAppApplication.class, args);
	}

	@GetMapping("/hello")
	public String getMessage() {
		return "Welcome to Springboot GCP Project...!";
	}
}
