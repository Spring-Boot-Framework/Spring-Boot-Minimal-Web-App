package io.github.anantharajuc.sbmwa.controller;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController("/")
public class HelloWorldController 
{
	@GetMapping()
	public ResponseEntity<String> helloWorld() 
	{
		log.info("-----> HTTP GET Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok("HTTP GET Handled - "+LocalDateTime.now());
	}
	
	@PostMapping
	public ResponseEntity<String> createProduct()
	{
		log.info("-----> HTTP POST Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok("HTTP POST Handled - "+LocalDateTime.now());
	}
	
	@PutMapping
	public ResponseEntity<String> updateProduct()
	{
		log.info("-----> HTTP PUT Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok("HTTP PUT Handled - "+LocalDateTime.now());
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteProduct()
	{
		log.info("-----> HTTP DELETE Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok("HTTP DELETE Handled - "+LocalDateTime.now());
	}
}
