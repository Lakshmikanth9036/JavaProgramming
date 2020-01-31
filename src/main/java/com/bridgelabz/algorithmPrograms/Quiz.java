package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Quiz {

	public static void main(String[] args) {
		System.out.println("Enter the range: ");
		int n = InputUtility.getScanner().nextInt();
		int[] a = InputUtility.getInt(Utility.pow(2, n));
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		System.out.println("Think of any number between 0  and "+a[a.length-1]);
		
		int val = Utility.quiz(a);
		 if(val>=0)
			 System.out.println("Final answer is: "+a[val]);
		 else
			 System.out.println("Value is not found");
		
		
	}

}
