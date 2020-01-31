package com.bridgelabz.logicalPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class DistinctCoupon {

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = InputUtility.getScanner().nextInt();
		Utility.distinctCoupon(n);
	}
}
