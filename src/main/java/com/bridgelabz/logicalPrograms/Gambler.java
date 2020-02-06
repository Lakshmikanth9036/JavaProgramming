package com.bridgelabz.logicalPrograms;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.myException.MyException;
import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) throws MyException {
		
		PropertyConfigurator.configure("log4j.properties");
		try{
		System.out.println("Enter the Stake amount");
		int stake = InputUtility.getScanner().nextInt();
		System.out.println("Enter the Goal amount");
		int goal = InputUtility.getScanner().nextInt();
		System.out.println("Enter the number of time you want to paly");
		int n = InputUtility.getScanner().nextInt();
		Utility.gambler(stake, goal, n);
		}
		catch(Exception e){
			throw new MyException("InputMismatch Exception");
		}
	}

}
