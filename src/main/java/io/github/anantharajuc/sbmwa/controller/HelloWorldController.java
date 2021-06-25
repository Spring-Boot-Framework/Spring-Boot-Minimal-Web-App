package io.github.anantharajuc.sbmwa.controller;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmwa.model.RESTcontrollerResponse;
import io.github.anantharajuc.sbmwa.service.HelloWorldServiceImpl;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController("/")
public class HelloWorldController 
{
	@Autowired
	private HelloWorldServiceImpl helloWorldServiceImpl;
	
	@GetMapping()
	public ResponseEntity<RESTcontrollerResponse> get() 
	{
		log.info("-----> HTTP GET Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(helloWorldServiceImpl.getService());
	}
	
	@PostMapping
	public ResponseEntity<RESTcontrollerResponse> post()
	{
		log.info("-----> HTTP POST Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(helloWorldServiceImpl.postService());
	}
	
	@PutMapping
	public ResponseEntity<RESTcontrollerResponse> put()
	{
		log.info("-----> HTTP PUT Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(helloWorldServiceImpl.putService());
	}
	
	@DeleteMapping
	public ResponseEntity<RESTcontrollerResponse> delete()
	{
		log.info("-----> HTTP DELETE Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(helloWorldServiceImpl.deleteService());
	}
}
