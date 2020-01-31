package com.bridgelabz.basicProgramming;

import com.bridgelabz.InputUtility.InputUtility;

public class ReplaceTemplate {

	public static void main(String[] args) {
		System.out.println("Enter the user name");
		String s = InputUtility.getScanner().next();
		System.out.println("Hello "+s+", How are you?" );
	}
}
