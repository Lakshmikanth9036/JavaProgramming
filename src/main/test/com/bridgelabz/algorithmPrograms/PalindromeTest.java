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
public class PalindromeTest {
	
	private boolean expected;
	private String input;

	public PalindromeTest(boolean expected, String input) {
		super();
		this.expected = expected;
		this.input = input;
	}

	@Parameters
	public static Collection<Object[]> getPerameters(){
		return  Arrays.asList(new Object[][] {{true, "madam"}, {true, "malayalam"}, {true, "1001"},{false, "adc"}, {false, "1212"}});
	}
	
	@Test
	public void isPalintest() {
		assertEquals(expected, Utility.isPalin(input));
	}

}
