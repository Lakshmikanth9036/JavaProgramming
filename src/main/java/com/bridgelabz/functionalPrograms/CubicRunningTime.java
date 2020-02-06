package com.bridgelabz.functionalPrograms;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class CubicRunningTime {

	public static void main(String[] args) {
		
		System.setProperty("fname.name", "F:\\Programs\\BridgeLabz\\JavaProgramming\\src\\main\\java\\com\\bridgelabz\\log\\CubicRunning.log");
		PropertyConfigurator.configure("log4j.properties");
		
		System.out.println("Enter the size of the array");
		int n = InputUtility.getScanner().nextInt();
		System.out.println("Enter "+n+" elements");
		int[] a = InputUtility.getIntArr(n);
		Utility.distinctTriplet(a);
	}

}
