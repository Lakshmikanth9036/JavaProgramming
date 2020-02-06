package com.bridgelabz.basicProgramming;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class LeapYear {
	

	public static void main(String[] args) {
		
		System.setProperty("fname.name", "F:\\Programs\\BridgeLabz\\JavaProgramming\\src\\main\\java\\com\\bridgelabz\\log\\LeapYear.log");
		PropertyConfigurator.configure("log4j.properties");
		
		System.out.println("Enter the Year");
		int n = InputUtility.getScanner().nextInt();
		boolean res = Utility.isLeapYear(n);
		if (res)
			System.out.println(n + " is a leap year");
		else
			System.out.println(n+"is not a leap year");
	}

}
