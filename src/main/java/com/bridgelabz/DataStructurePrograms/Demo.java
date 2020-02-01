package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.LinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(5);
		System.out.println(list);
		list.orderList();
		System.out.println(list);
	}

}
