package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.Stack;
import com.bridgelabz.InputUtility.InputUtility;

public class BalancedParentheses {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		System.out.println("Enter the expression");
		String s = InputUtility.getScanner().next();
		int k = 0;
		
		while(k<s.length()){
			char ch = s.charAt(k);
			if(ch == '('){
				stack.push(ch);
			}
			else if(ch == ')'){
				if(!stack.isEmpty())
					stack.pop();
				if(stack.isEmpty()){
					break;
				}
			}
			k++;
		}
		if(stack.isEmpty() && k == s.length()-1)
			System.out.println("Given expression is valid expression");
		else
			System.out.println("Given expression is not a valid expression");
	}

}
