package com.bridgelabz.algorithmPrograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BinarySearchGenericTest {

	@Test
	public void binarySearchGenericTest_stringwhenElementFound() {
		String[] input = { "abhi", "ankush", "prabha", "revanth" , "shreesha" };
		assertEquals(1, Utility.binarySearchGeneric(input, "ankush", 0, 5));
	}
	
	@Test
	public void binarySearchGenericTest_stringWhenElementNotFound() {
		String[] input = { "abhi", "ankush", "prabha", "revanth" , "shreesha" };
		assertEquals(-1, Utility.binarySearchGeneric(input, "kanth", 0, 5));
	}
	
	@Test
	public void binarySearchGenericTest_integerwhenElementFound() {
		Integer[] input = { 1,2,3,4,5,6 };
		assertEquals(1, Utility.binarySearchGeneric(input, 2 , 0, 5));
	}
	
	@Test
	public void binarySearchGenericTest_integerWhenElementNotFound() {
		Integer[] input = { 1,2,3,4,5,6 };
		assertEquals(-1, Utility.binarySearchGeneric(input, 7 , 0, 5));
	}

}
