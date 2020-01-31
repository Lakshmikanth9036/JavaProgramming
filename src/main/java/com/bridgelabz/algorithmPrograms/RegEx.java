package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.InputUtility.InputUtility;

public class RegEx {

	public static void main(String[] args) {
		String s = "Hello <<name>>, We have your full name as <<full name>> \nin our system. your contact number is 91-9006625234. \nPlease,let us know in case of any clarification \nThank you BridgeLabz 01/01/2016.";
		System.out.println(s);
		System.out.println("Enter your first name");
		String name = InputUtility.getScanner().next();
		System.out.println("Enter your full name");
		String fullName = InputUtility.getScanner().next();
		System.out.println("Enter your phone no.");
		String mobileNo = InputUtility.getScanner().next();
		System.out.println("Enter date of submission");
		String date = InputUtility.getScanner().next();
		s = s.replace("<<name>>", name);
		s = s.replace("<<full name>>", fullName);
		s = s.replaceAll("\\d{10}", mobileNo);
		s = s.replaceAll("\\d{2}/\\d{2}/\\d{4}", date);
		System.out.println(s);		
	}

}
