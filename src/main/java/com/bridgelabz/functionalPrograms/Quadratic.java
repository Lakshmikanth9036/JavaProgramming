package com.bridgelabz.functionalPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Enter the value of a, b and c");
		double a = InputUtility.getScanner().nextDouble();
		double b = InputUtility.getScanner().nextDouble();
		double c = InputUtility.getScanner().nextDouble();
		Utility.quadratic(a, b, c);
	}
}
