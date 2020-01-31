package com.bridgelabz.junitTesting;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		System.out.println("Enter the decimal value");
		int dec = InputUtility.getScanner().nextInt();
		String bin = Utility.toBinary(dec);
		System.out.println(bin);
		
		while(bin.length()!=8){
			bin = 0+bin;
		}
		
		String swap = bin.substring(4)+bin.substring(0,4);
		int conBin = Integer.parseInt(swap);
		System.out.println(Utility.toDecimal(conBin));
	}

}
