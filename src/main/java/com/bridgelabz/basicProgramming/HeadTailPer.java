package com.bridgelabz.basicProgramming;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class HeadTailPer {

	public static void main(String[] args) {
		
		System.setProperty("fname.name", "F:\\Programs\\BridgeLabz\\JavaProgramming\\src\\main\\java\\com\\bridgelabz\\log\\HeadTail.log");
		PropertyConfigurator.configure("log4j.properties");
		
		System.out.println("Enter the value of n");
		int n = InputUtility.getScanner().nextInt();
		Utility.headTailPer(n);
	}

}
