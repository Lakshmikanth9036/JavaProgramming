package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.Deque;
import com.bridgelabz.InputUtility.InputUtility;

public class PalindromeChecker {

	public static void main(String[] args) {
		Deque<Character> deque = new Deque<>();
		System.out.println("Enter the string");
		String s = InputUtility.getScanner().next();
		char[] ch = s.toCharArray();
		for(int i = 0 ; i < ch.length ; i++){
			deque.addRear(ch[i]);
		}
		
		String rev = "";
		while(!deque.isEmpty()){
			rev = rev+deque.removeRear();
		}
		
		if(s.equals(rev))
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
	}

}
