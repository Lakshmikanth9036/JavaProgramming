package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class GenericsSorting {


	public static void main(String[] args) {
		System.out.println("Enter array elements");
		Integer[] a = InputUtility.getIntegerArr(10);
//		Utility.bubbleSortGeneric(a);
//		Utility.dispObjArr(a);
		Utility.bubbleSortGeneric(a);
		Utility.dispObjArr(a);
	}

}
