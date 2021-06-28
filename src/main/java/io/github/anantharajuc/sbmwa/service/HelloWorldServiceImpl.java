package io.github.anantharajuc.sbmwa.service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.anantharajuc.sbmwa.model.RESTcontrollerResponse;
import io.github.anantharajuc.sbmwa.repository.RESTControllerResponseRepository;

@Service
public class HelloWorldServiceImpl implements HelloWorldService
{
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private RESTControllerResponseRepository restControllerResponseRepository;

	@Override
	public RESTcontrollerResponse getService() 
	{
		RESTcontrollerResponse restControllerResponse;
		
		restControllerResponse = restControllerResponseRepository.getResponseByVerb("GET");
		
		restControllerResponse.setContent(restControllerResponse.getContent()+" "+LocalDateTime.now());
		
		restControllerResponse.setTotalRequestsCounter(counter.incrementAndGet());
		
		return restControllerResponse;
	}
	
	@Override
	public RESTcontrollerResponse putService() 
	{
		RESTcontrollerResponse restControllerResponse;
		
		restControllerResponse = restControllerResponseRepository.getResponseByVerb("PUT");
		
		restControllerResponse.setContent(restControllerResponse.getContent()+" "+LocalDateTime.now());
		
		restControllerResponse.setTotalRequestsCounter(counter.incrementAndGet());
		
		return restControllerResponse;
	}

	@Override
	public RESTcontrollerResponse postService() 
	{
		RESTcontrollerResponse restControllerResponse;
		
		restControllerResponse = restControllerResponseRepository.getResponseByVerb("POST");
		
		restControllerResponse.setContent(restControllerResponse.getContent()+" "+LocalDateTime.now());
		
		restControllerResponse.setTotalRequestsCounter(counter.incrementAndGet());
		
		return restControllerResponse;
	}

	@Override
	public RESTcontrollerResponse deleteService() 
	{
		RESTcontrollerResponse restControllerResponse;
		
		restControllerResponse = restControllerResponseRepository.getResponseByVerb("DELETE");
		
		restControllerResponse.setContent(restControllerResponse.getContent()+" "+LocalDateTime.now());
		
		restControllerResponse.setTotalRequestsCounter(counter.incrementAndGet());
		
		return restControllerResponse;
	}
}
