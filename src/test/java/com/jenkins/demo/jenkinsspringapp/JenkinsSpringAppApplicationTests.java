package com.jenkins.demo.jenkinsspringapp;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class
JenkinsSpringAppApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(JenkinsSpringAppApplication.class);

	@Test
	void contextLoads() {
		logger.info("This logger is from Test Class")
		assertTrue(true);
	}

}
