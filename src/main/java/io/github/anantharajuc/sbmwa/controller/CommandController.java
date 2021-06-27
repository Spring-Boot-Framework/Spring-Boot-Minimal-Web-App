package io.github.anantharajuc.sbmwa.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmwa.model.RESTcontrollerResponse;
import io.github.anantharajuc.sbmwa.service.HelloWorldServiceImpl;

import io.swagger.v3.oas.annotations.Operation;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController()
@RequestMapping(value="/")
public class CommandController 
{
	@Autowired
	private HelloWorldServiceImpl helloWorldServiceImpl;

	@Operation(summary="HTTP PUT Operation")
	@PutMapping
	public ResponseEntity<RESTcontrollerResponse> put()
	{
		log.info("-----> HTTP PUT Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(helloWorldServiceImpl.putService());
	}
	
	@Operation(summary="HTTP POST Operation")
	@PostMapping
	public ResponseEntity<RESTcontrollerResponse> post()
	{
		log.info("-----> HTTP POST Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(helloWorldServiceImpl.postService());
	}
	
	@Operation(summary="HTTP DELETE Operation")
	@DeleteMapping
	public ResponseEntity<RESTcontrollerResponse> delete()
	{
		log.info("-----> HTTP DELETE Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(helloWorldServiceImpl.deleteService());
	}
}
