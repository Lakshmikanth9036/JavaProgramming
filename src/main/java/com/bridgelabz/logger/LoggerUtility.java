package com.bridgelabz.logger;

import org.apache.log4j.Logger;

import com.bridgelabz.utility.Utility;

public class LoggerUtility {
	
	private static Logger logger;

	public static Logger getLogger(String name){
		logger = Logger.getLogger(name);
		return logger;
	}
	
	
}
