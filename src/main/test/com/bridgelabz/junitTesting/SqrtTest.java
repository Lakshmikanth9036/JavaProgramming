package com.bridgelabz.junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class SqrtTest {

	@Test
	public void sqrtTest() {
		assertEquals(2, Utility.sqrt(4), 0);
	}

	@Test
	public void sqrtTest_NegativeVal() {
		assertEquals(-1, Utility.sqrt(-4), 0);
	}
}
