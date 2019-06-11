package com.boot;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		logger.info("Starting application");
		
		SpringApplication.run(App.class, args);
	}
	
	
}
