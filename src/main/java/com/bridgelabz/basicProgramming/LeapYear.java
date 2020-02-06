package com.bridgelabz.basicProgramming;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.myException.MyException;
import com.bridgelabz.utility.Utility;

public class LeapYear {
	

	public static void main(String[] args) throws MyException  {
		
		PropertyConfigurator.configure("log4j.properties");
		try{
		System.out.println("Enter the Year");
		int n = InputUtility.getScanner().nextInt();
		boolean res = Utility.isLeapYear(n);
		if (res)
			System.out.println(n + " is a leap year");
		else
			System.out.println(n+"is not a leap year");
		}
		catch(Exception e){
			throw new MyException("InputMismatch Exception");
		}
	}

}
