package com.bridgelabz.functionalPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Distance {
	public static void main(String[] args) {
	System.out.println("Enter the value of x");
	double x = InputUtility.getScanner().nextDouble();
	System.out.println("Enter the value of y");
	double y = InputUtility.getScanner().nextDouble();
	System.out.println(Utility.distance(x, y));
	}
}
