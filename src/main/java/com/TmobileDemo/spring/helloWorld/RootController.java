package com.TmobileDemo.spring.helloWorld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	@RequestMapping("/")
	 public String home() {
		 return "Hi Welcome!!!@!! This is a spring-boot app POC to test build and deploy to PCF by Jenkins.";
	 }
}
