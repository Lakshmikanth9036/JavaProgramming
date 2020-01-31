package com.bridgelabz.junitTesting;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("Enter the amount");
		int n = InputUtility.getScanner().nextInt();
		int notes = Utility.minNotes(n);
		System.out.println("Minimun notes needed to return the amount: "+notes);
		int[] note = {1000,500,100,50,10,5,2,1};
		int[] count = Utility.change(n);
		for (int i = 0; i < count.length; i++) {
			if(count[i]>0){
				System.out.printf("%-4d ----> %d",note[i],count[i]);
				System.out.println();
			}
	
		}
	}

}
