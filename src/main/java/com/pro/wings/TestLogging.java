package com.pro.wings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogging {
	
	
    private static final Logger logger = LogManager.getLogger(TestLogging.class);

	
	public static void main(String[] args) {
		
		testLogger();
		
	}

	private static void testLogger() {
		
		logger.info("Hello from Log4j 2");
		logger.error("Hello from Log4j 2 -> error msg");
		logger.fatal("Hello from Log4j 2 -> fatal msg");
		logger.warn("Hello from Log4j 2 -> warning msg");
		logger.debug("Hello from Log4j 2 -> debug msg");
		logger.trace("Hello from Log4j 2 -> trace msg");
		
		System.out.println("executing test logger!!!");
	}

}
