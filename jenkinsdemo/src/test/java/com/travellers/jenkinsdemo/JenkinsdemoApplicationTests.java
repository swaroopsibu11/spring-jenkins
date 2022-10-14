package com.travellers.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsdemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsdemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test case executing...");
		assertEquals(true,true);
	}

}
