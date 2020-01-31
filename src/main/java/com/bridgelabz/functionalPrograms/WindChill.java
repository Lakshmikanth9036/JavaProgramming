package com.bridgelabz.functionalPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("Enter the value of t and v");
		double t = InputUtility.getScanner().nextDouble();
		double v = InputUtility.getScanner().nextDouble();
		System.out.println(Utility.windChill(t, v));
	}
}
