package com.bridgelabz.basicProgramming;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bridgelabz.utility.Utility;

@RunWith(Parameterized.class)
public class LeapYearTest {
	
	private boolean expected;
	private int input;

	public LeapYearTest(boolean expected, int input) {
		super();
		this.expected = expected;
		this.input = input;
	}

	@Parameters
	public static Collection<Object[]> testConditions(){
		return Arrays.asList(new Object[][] {{true,2020},{false,2021},{false,202},{false,20202}});	
	}
	
	@Test
	public void	leapYearTest() {
		assertEquals(expected,Utility.isLeapYear(input));
	}

}
