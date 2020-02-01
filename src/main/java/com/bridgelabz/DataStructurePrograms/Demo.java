package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.Deque;

public class Demo {
	public static void main(String[] args) {
		Deque<Integer> deque = new Deque<>();
		deque.addRear(40);
		deque.addRear(50);
		deque.addRear(60);
		System.out.println(deque);
		deque.addFront(30);
		deque.addFront(20);
		deque.addFront(10);
		System.out.println(deque);
		System.out.println(deque.removeRear());
		System.out.println(deque);
		System.out.println(deque.removeFront());
		System.out.println(deque);
		System.out.println(deque.removeFront());
		System.out.println(deque.removeFront());
		System.out.println(deque.removeFront());
		System.out.println(deque.removeFront());
		System.out.println(deque.isEmpty());
		
		
	}

}
