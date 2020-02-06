package com.bridgelabz.basicProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class HarmonicTest {

	@Test
	public void harmonicTest() {
		Double[] expected = {1.0, 1.2, 1.45, 1.7833333333333332, 2.283333333333333};
		assertArrayEquals(expected, Utility.harmonic(5));
	}
	
}
