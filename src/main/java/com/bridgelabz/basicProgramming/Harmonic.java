package com.bridgelabz.basicProgramming;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Harmonic {

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = InputUtility.getScanner().nextInt();
		Double[] val = Utility.harmonic(n);
		Utility.dispObjArr(val);
	}
}
