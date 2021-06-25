package io.github.anantharajuc.sbmwa;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;
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
		
		Dotenv dotenv = Dotenv.load();
		
		log.info("-----> Secret Credential 1 - "+dotenv.get("SECRET_CREDENTIAL1", "Unable to fetch SECRET_CREDENTIAL1"));
		log.info("-----> Secret Credential 2 - "+dotenv.get("SECRET_CREDENTIAL2", "Unable to fetch SECRET_CREDENTIAL2"));
	}
}
