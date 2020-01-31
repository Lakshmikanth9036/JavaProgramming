package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class GenericsSorting {


	public static void main(String[] args) {
		System.out.println("Enter array elements");
		String[] s = InputUtility.getStringArr(5);
//		Utility.bubbleSortGeneric(a);
//		Utility.dispObjArr(a);
		Utility.bubbleSortGeneric(s);
		Utility.dispObjArr(s);
	}

}
