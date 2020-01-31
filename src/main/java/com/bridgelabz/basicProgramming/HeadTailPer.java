package com.bridgelabz.basicProgramming;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class HeadTailPer {

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = InputUtility.getScanner().nextInt();
		Utility.headTailPer(n);
	}

}
