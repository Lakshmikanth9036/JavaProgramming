package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.Stack;
import com.bridgelabz.InputUtility.InputUtility;

public class BalancedParentheses {
	
	public static boolean isBalanced(String s){
		Stack<Character> stack = new Stack<>();
		for(int i = 0 ;i <s.length() ; i++){
			char ch = s.charAt(i);
			if(ch == '('){
				stack.push(ch);
			}
			else{
				if(stack.isEmpty() && ch == ')'){
					return false;
				}
				else if(ch == ')')
					stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the expression");
		String s = InputUtility.getScanner().next();
		boolean res = isBalanced(s);
		if(res)
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
	}

}
