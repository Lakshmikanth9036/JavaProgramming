package com.bridgelabz.algorithmPrograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class InsertionSortGenericTest {

	@Test
	public void insertionSortGenerictest_withStringArray() {
		String[] expected = { "abhi", "ankush", "prabha", "revanth" , "shreesha" };
		String[] actual = { "shreesha" , "prabha" , "abhi" , "revanth" , "ankush" };
		assertArrayEquals(expected, Utility.insertionSortGeneric(actual));
	}
	
	@Test
	public void insertionSortGenerictest_withIntegerArray() {
		Integer[] expected = {1,2,3,4,5,6 };
		Integer[] actual = {3,4,2,5,1,6};
		assertArrayEquals(expected, Utility.insertionSortGeneric(actual));
	}
	
	@Test
	public void insertionSortGenerictest_withBooleanArray() {
		Boolean[] expected = {false,true};
		Boolean[] actual = {true,false};
		assertArrayEquals(expected, Utility.insertionSortGeneric(actual));
	}

}
