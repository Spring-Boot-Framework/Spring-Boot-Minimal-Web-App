package io.github.anantharajuc.sbmwa.controller;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmwa.model.RESTcontrollerResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController("/")
public class HelloWorldController 
{
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping()
	public ResponseEntity<RESTcontrollerResponse> helloWorld() 
	{
		log.info("-----> HTTP GET Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(new RESTcontrollerResponse(counter.incrementAndGet(),"HTTP GET Handled - "+LocalDateTime.now()));
	}
	
	@PostMapping
	public ResponseEntity<RESTcontrollerResponse> createProduct()
	{
		log.info("-----> HTTP POST Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(new RESTcontrollerResponse(counter.incrementAndGet(),"HTTP POST Handled - "+LocalDateTime.now()));
	}
	
	@PutMapping
	public ResponseEntity<RESTcontrollerResponse> updateProduct()
	{
		log.info("-----> HTTP PUT Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(new RESTcontrollerResponse(counter.incrementAndGet(),"HTTP PUT Handled - "+LocalDateTime.now()));
	}
	
	@DeleteMapping
	public ResponseEntity<RESTcontrollerResponse> deleteProduct()
	{
		log.info("-----> HTTP DELETE Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(new RESTcontrollerResponse(counter.incrementAndGet(),"HTTP DELETE Handled - "+LocalDateTime.now()));
	}
}
