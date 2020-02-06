package com.bridgelabz.algorithmPrograms;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		
		System.setProperty("fname.name", "F:\\Programs\\BridgeLabz\\JavaProgramming\\src\\main\\java\\com\\bridgelabz\\log\\Anagram.log");
		PropertyConfigurator.configure("log4j.properties");
		
		System.out.println("Enter first string");
		String s1 = InputUtility.getScanner().next();
		System.out.println("Enter second string");
		String s2 = InputUtility.getScanner().next();
		boolean res = Utility.isAnagram(s1, s2);
		if(res)
			System.out.println("Anagram");
		else
			System.out.println("Not a anagram");
	}

}
