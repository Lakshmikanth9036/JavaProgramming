package com.bridgelabz.algorithmPrograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class InsertionSortTest {

	@Test
	public void insertionSortTest() {
		String[] expected = { "abhi", "ankush", "prabha", "revanth" , "shreesha" };
		String[] actual = { "shreesha" , "prabha" , "abhi" , "revanth" , "ankush" };
		assertArrayEquals(expected, Utility.insertionSort(actual));
	}

}
