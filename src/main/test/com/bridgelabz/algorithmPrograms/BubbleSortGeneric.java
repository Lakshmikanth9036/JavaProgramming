package com.bridgelabz.algorithmPrograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BubbleSortGeneric {

	@Test
	public void bubbleSortGenerictest_withStringArray() {
		String[] expected = { "abhi", "ankush", "prabha", "revanth" , "shreesha" };
		String[] actual = { "shreesha" , "prabha" , "abhi" , "revanth" , "ankush" };
		assertArrayEquals(expected, Utility.bubbleSortGeneric(actual));
	}
	
	@Test
	public void bubbleSortGenerictest_withIntegerArray() {
		Integer[] expected = {1,2,3,4,5,6 };
		Integer[] actual = {3,4,2,5,1,6};
		assertArrayEquals(expected, Utility.bubbleSortGeneric(actual));
	}
	
	@Test
	public void bubbleSortGenerictest_withBooleanArray() {
		Boolean[] expected = {false,true};
		Boolean[] actual = {true,false};
		assertArrayEquals(expected, Utility.bubbleSortGeneric(actual));
	}


}
