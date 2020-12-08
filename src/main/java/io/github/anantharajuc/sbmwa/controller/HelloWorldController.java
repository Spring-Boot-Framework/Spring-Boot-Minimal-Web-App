package io.github.anantharajuc.sbmwa.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorldController 
{
	@GetMapping()
	public String helloWorld() 
	{
		return "Greetings from Spring Boot Minimal Web Application! - "+LocalDateTime.now();
	}
}
