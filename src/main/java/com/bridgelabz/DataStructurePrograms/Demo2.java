package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.LinkedList;

public class Demo2 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		LinkedList<Integer> list2 = list;
		System.out.println(list2);
	}
}
