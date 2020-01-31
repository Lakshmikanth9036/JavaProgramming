package com.bridgelabz.algorithmPrograms;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bridgelabz.utility.Utility;

@RunWith(Parameterized.class)
public class PrimeTest {
	
	private boolean expected;
	private int input;

	public PrimeTest(boolean expected, int input) {
		super();
		this.expected = expected;
		this.input = input;
	}

	@Parameters
	public static Collection<Object[]> getPerameters(){
		return Arrays.asList(new Object[][] {{true, 7}, {true, 2}, {false, 1},{false, 0},{false, 6}});
	}
	
	@Test
	public void isPrimetest() {
		assertEquals(expected, Utility.isPrime(input));
	}

}
