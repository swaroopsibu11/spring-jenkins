package com.travellers.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsdemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsdemoApplication.class);

	@PostConstruct
	public void init(){
		logger.info("application started...");
	}

	public static void main(String[] args) {
		logger.info("application executed...");
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
