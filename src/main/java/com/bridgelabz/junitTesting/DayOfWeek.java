package com.bridgelabz.junitTesting;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		
		System.setProperty("fname.name", "F:\\Programs\\BridgeLabz\\JavaProgramming\\src\\main\\java\\com\\bridgelabz\\log\\DayOfWeek.log");
		PropertyConfigurator.configure("log4j.properties");
		
		System.out.println("Enter the month");
		int m = InputUtility.getScanner().nextInt();
		System.out.println("Enter the day");
		int d = InputUtility.getScanner().nextInt();
		System.out.println("Enter the year");
		int y = InputUtility.getScanner().nextInt();
		int d0 = Utility.dayOftheWeek(m, d, y);
		switch(d0){
		case 0:System.out.println("Sunday");
		  	   break;
		case 1:System.out.println("Monday");
	  	   break;
		case 2:System.out.println("Tuesday");
	  	   break;
		case 3:System.out.println("Wednesday");
	  	   break;
		case 4:System.out.println("Thuresday");
	  	   break;
		case 5:System.out.println("Friday");
	  	   break;
		case 6:System.out.println("Saturday");
	  	   break;
	  	default: System.out.println("Enter the valid date");
	  	   break;
		}
	}

}
