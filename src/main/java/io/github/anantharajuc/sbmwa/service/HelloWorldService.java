package io.github.anantharajuc.sbmwa.service;

import org.springframework.stereotype.Service;

import io.github.anantharajuc.sbmwa.model.RESTcontrollerResponse;

@Service()
public interface HelloWorldService 
{
	RESTcontrollerResponse getService();
	
	RESTcontrollerResponse postService(RESTcontrollerResponse restControllerResponse);
	
	RESTcontrollerResponse putService();
	
	RESTcontrollerResponse deleteService();
}
