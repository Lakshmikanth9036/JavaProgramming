package com.bridgelabz.functionalPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class CubicRunningTime {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int n = InputUtility.getScanner().nextInt();
		System.out.println("Enter "+n+" elements");
		int[] a = InputUtility.getIntArr(n);
		Utility.distinctTriplet(a);
	}

}
