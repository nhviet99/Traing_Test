package com.example.demo

import org.apache.juli.logging.LogFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
class DemoApplication {
	private static Logger logger=new LoggerFactory().getLogger(DemoApplication.class);
	static void main(String[] args) {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		SpringApplication.run(DemoApplication, args)
	}

}
