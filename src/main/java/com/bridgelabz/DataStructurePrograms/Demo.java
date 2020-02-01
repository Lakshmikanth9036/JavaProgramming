package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.Queue;

public class Demo {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());
	}

}
