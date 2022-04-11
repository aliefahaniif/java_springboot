package com.alterra.springmongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmongoApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringmongoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringmongoApplication.class, args);

		logger.info("Application is running");
		logger.debug("Application debugging is started");
	}

}
