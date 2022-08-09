package com.sample.webapp.controllers;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	Logger logger = LoggerFactory.getLogger(DemoController.class); 
	
	@GetMapping("/")
	public String homePage() {
		return "Home Page";
	}

	@PostConstruct
	public void post() {
		logger.info("entity created!");
	}
	
}
