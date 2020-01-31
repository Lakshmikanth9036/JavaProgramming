package com.bridgelabz.basicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class PowTest {

	@Test
	public void powTest() {
		assertEquals(32, Utility.pow(2, 5));
	}

	@Test
	public void powTest_negative() {
		assertEquals(-1, Utility.pow(2, -1));
	}
}
