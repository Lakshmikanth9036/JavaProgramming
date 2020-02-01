package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.Queue;
import com.bridgelabz.InputUtility.InputUtility;

public class BankingSimulation {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<>();
		System.out.println("Enter number of people");
		int n = InputUtility.getScanner().nextInt();
		System.out.println("Enter your names");
		for(int i = 0 ; i < n ; i++){
			String s = InputUtility.getScanner().next();
			queue.enqueue(s);
		}
		while(!queue.isEmpty()){
			String s = queue.dequeue();
			System.out.println("Welcome to cash counter "+s);
			System.out.println("Would you like to withdraw or deposit a money from you account");
			String with = InputUtility.getScanner().next();
			System.out.println("Thanks "+s+" for "+with);
		}
		
	}

}
