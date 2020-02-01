package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.Stack;

public class Demo {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}

}
