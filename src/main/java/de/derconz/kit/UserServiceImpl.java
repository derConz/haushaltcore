package de.derconz.kit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserServiceImpl {

	public void loginIn() {
		
	}
	
	public void logout() {
		
	}
	
	public void register() {
		
	}
	
	/**
	 * Just for LoggingTest
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(UserServiceImpl.class);
		logger.trace("llalaa");
		logger.trace("Trace");
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warning");
		logger.error("Error");
		logger.fatal("Fatal");
	}
}
