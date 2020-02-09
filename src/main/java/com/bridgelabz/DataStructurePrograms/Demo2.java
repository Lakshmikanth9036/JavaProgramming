package com.bridgelabz.DataStructurePrograms;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.bridgelabz.DataStructure.LinkedList;

public class Demo2 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach(System.out::print);
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(3);
		ar.add(2);
		ar.add(1);
		Stream<Integer> str = ar.stream();
		str.forEachOrdered(System.out::println);
		
	}
}
