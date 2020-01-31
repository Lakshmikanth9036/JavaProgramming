package com.bridgelabz.logicalPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		System.out.println("Enter the Stake amount");
		int stake = InputUtility.getScanner().nextInt();
		System.out.println("Enter the Goal amount");
		int goal = InputUtility.getScanner().nextInt();
		System.out.println("Enter the number of time you want to paly");
		int n = InputUtility.getScanner().nextInt();
		Utility.gambler(stake, goal, n);
	}

}
