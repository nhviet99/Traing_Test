package com.example.demo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.core.env.AbstractEnvironment

import javax.security.auth.login.Configuration

@SpringBootApplication
class DemoApplication {
	private static Logger logger= LoggerFactory.getLogger(DemoApplication.class);
	static void main(String[] args) {
	 	logger.trace("1");
		logger.debug("2")
		logger.info("3")
		logger.warn("4")
		logger.error("5")
		SpringApplication.run(DemoApplication, args)
	}

}
