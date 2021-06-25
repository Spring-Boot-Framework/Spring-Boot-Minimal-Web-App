package io.github.anantharajuc.sbmwa.service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import io.github.anantharajuc.sbmwa.model.RESTcontrollerResponse;

@Service
public class HelloWorldServiceImpl implements HelloWorldService
{
	private final AtomicLong counter = new AtomicLong();

	@Override
	public RESTcontrollerResponse getService() 
	{
		return new RESTcontrollerResponse(counter.incrementAndGet(),"HTTP GET Handled - "+LocalDateTime.now());
	}

	@Override
	public RESTcontrollerResponse postService() 
	{
		return new RESTcontrollerResponse(counter.incrementAndGet(),"HTTP POST Handled - "+LocalDateTime.now());
	}

	@Override
	public RESTcontrollerResponse putService() 
	{
		return new RESTcontrollerResponse(counter.incrementAndGet(),"HTTP PUT Handled - "+LocalDateTime.now());
	}

	@Override
	public RESTcontrollerResponse deleteService() 
	{
		return new RESTcontrollerResponse(counter.incrementAndGet(),"HTTP DELETE Handled - "+LocalDateTime.now());
	}
}
