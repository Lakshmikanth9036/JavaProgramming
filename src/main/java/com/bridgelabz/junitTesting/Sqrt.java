package com.bridgelabz.junitTesting;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		double c = InputUtility.getScanner().nextDouble();
		double val = Utility.sqrt(c);
		System.out.println(val);
	}

}
