package com.bridgelabz.junitTesting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bridgelabz.utility.Utility;

@RunWith(Parameterized.class)
public class DayOfWeekTest {

	private int expected,month,day,year;
	
	public DayOfWeekTest(int expected, int month, int day, int year) {
		super();
		this.expected = expected;
		this.month = month;
		this.day = day;
		this.year = year;
	}

	@Parameters
	public static Collection<Integer[]> testConditions(){
		Integer[][] expectedOutput = {{4,1,30,2020},{-1,-1,-30,20202},{-1,2,30,2020},{-1,2,29,2021},{-1,4,31,2021},{0,1,31,2021}};
		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void dayOfWeektest() {
		assertEquals(expected, Utility.dayOftheWeek(month, day, year));
	}

//	@Test
//	public void dayOfWeektest_invalidDateAndMonthAndYear(){
//		assertEquals(-1, Utility.dayOftheWeek(-1, -30, 20202));
//	}
//	
//	@Test
//	public void dayOfWeektest_leapYear2ndMonth29(){
//		assertEquals(-1, Utility.dayOftheWeek(2, 30, 2020));
//	}
//	
//	@Test
//	public void dayOfWeektest_nonLeapYear2ndMonth28(){
//		assertEquals(-1, Utility.dayOftheWeek(2, 29, 2021));
//	}
//	
//	@Test
//	public void dayOfWeektest_nonLeapYearOtherMonths(){
//		assertEquals(-1, Utility.dayOftheWeek(4, 31, 2021));
//	}
//	
//	@Test
//	public void dayOfWeektest_nonLeapYearOtherMonths2(){
//		assertEquals(0, Utility.dayOftheWeek(1, 31, 2021));
//	}
	
}
