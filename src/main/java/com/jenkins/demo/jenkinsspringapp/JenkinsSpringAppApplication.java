package com.jenkins.demo.jenkinsspringapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringAppApplication implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(JenkinsSpringAppApplication.class);

	public static void main(String[] args) {
		logger.info("This is Application for establishing Spring App with Jenkins CI");
		SpringApplication.run(JenkinsSpringAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("This is logger from CommandLineRunner.run()");
	}
}
