package com.bridgelabz.junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BinaryTest {


	@Test
	public void toBinarytest() {
		assertEquals("1100100", Utility.toBinary(100));
	}
	
	public void toDecimaltest() {
		assertEquals(70, Utility.toDecimal(1000110));
	}

}
