package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> list =  new LinkedList<>();
		list.add("abhi");
		list.add("revanth");
		list.add("ankush");
		System.out.println(list);
		list.orderList();
		System.out.println(list);
	}

}
