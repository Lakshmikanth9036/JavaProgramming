package com.bridgelabz.functionalPrograms;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.myException.MyException;
import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) throws MyException {
		
		PropertyConfigurator.configure("log4j.properties");
		try{
		System.out.println("Enter the value of a, b and c");
		double a = InputUtility.getScanner().nextDouble();
		double b = InputUtility.getScanner().nextDouble();
		double c = InputUtility.getScanner().nextDouble();
		Utility.quadratic(a, b, c);
		}
		catch(Exception e){
			throw new MyException("InputputMismatch");
		}
	}
}
