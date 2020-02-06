package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int n = InputUtility.getScanner().nextInt();
		System.out.println("Enter " + n + " array element");
		int[] a = InputUtility.getIntArr(n);
		Utility.bubbleSort(a);
		Utility.dispIntArr(a);
	}

}
