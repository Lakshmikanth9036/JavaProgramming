package com.bridgelabz.functionalPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows ");
		int m = InputUtility.getScanner().nextInt();
		System.out.println("Enter the number of colomns ");
		int n = InputUtility.getScanner().nextInt();
		Double[][] a=InputUtility.getDouble2DArr(m, n);
		Utility.disp2DArr(a);
	}

}
