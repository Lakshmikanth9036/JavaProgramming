package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int n = InputUtility.getScanner().nextInt();
		System.out.println("Enter "+n+" elements");
		String[] a = InputUtility.getStringArr(n);
		Utility.mergeSort(a, 0, a.length-1);
		Utility.dispStringArr(a);
	}

}
