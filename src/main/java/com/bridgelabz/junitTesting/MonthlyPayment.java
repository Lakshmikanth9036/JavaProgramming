package com.bridgelabz.junitTesting;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter the principle loan amount ");
		double P = InputUtility.getScanner().nextDouble();
		System.out.println("Enter the years to pay off a principle");
		int Y = InputUtility.getScanner().nextInt();
		System.out.println("Enter the rate percent interest compounded mounthly ");
		double R = InputUtility.getScanner().nextDouble();
		
		double payment = Utility.mounthlyPayment(P, Y, R);
		System.out.println("Monthly payment to be done is: "+payment);
	}

}
