package com.bridgelabz.algorithmPrograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BinarySearchTest {

	@Test
	public void binarySearchtest_whenElementFound() {
		String[] input = { "abhi", "ankush", "prabha", "revanth" , "shreesha" };
		assertEquals(1, Utility.binarySearch(input, "ankush", 0, 5));
	}
	
	@Test
	public void binarySearchtest_whenElementNotFound() {
		String[] input = { "abhi", "ankush", "prabha", "revanth" , "shreesha" };
		assertEquals(-1, Utility.binarySearch(input, "kanth", 0, 5));
	}

}
