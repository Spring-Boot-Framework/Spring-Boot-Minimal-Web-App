package io.github.anantharajuc.sbmwa.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmwa.model.RESTcontrollerResponse;
import io.github.anantharajuc.sbmwa.service.HelloWorldServiceImpl;

import io.swagger.v3.oas.annotations.Operation;

import lombok.extern.log4j.Log4j2;

/*
 * Query Controller
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@Log4j2
@RestController()
@RequestMapping(value="/")
public class QueryController 
{
	@Autowired
	private HelloWorldServiceImpl helloWorldServiceImpl;
	
	@Operation(summary="HTTP GET Operation")
	@GetMapping()
	public ResponseEntity<RESTcontrollerResponse> get() 
	{
		log.info("-----> HTTP GET Handled - "+LocalDateTime.now());
		
		return ResponseEntity.ok(helloWorldServiceImpl.getService());
	}
}
