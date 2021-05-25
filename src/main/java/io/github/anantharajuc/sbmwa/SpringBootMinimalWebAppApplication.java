package io.github.anantharajuc.sbmwa;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

/*
 * Spring Boot Minimal Web App 
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@Log4j2
@SpringBootApplication
public class SpringBootMinimalWebAppApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootMinimalWebAppApplication.class, args);
		
		log.info("-----> Started Spring Boot Minimal Web App - "+LocalDateTime.now());
	}
}
