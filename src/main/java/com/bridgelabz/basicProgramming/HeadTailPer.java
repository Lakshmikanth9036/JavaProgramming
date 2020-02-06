package com.bridgelabz.basicProgramming;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.myException.MyException;
import com.bridgelabz.utility.Utility;

public class HeadTailPer {

	public static void main(String[] args) throws MyException {
		
		PropertyConfigurator.configure("log4j.properties");
		try{
			System.out.println("Enter the value of n");
			int n = InputUtility.getScanner().nextInt();
			Double[] per = Utility.headTailPer(n);
			System.out.println("Head percent is "+per[0]);
			System.out.println("Tail percent is "+per[1]);
		}
		catch(Exception e){
			throw new MyException("InputMismatch Exception");
		}
	}

}
