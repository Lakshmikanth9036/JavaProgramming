package com.bridgelabz.logicalPrograms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class DistinctCouponTest {

	@Test
	public void distinctTest() {
		int[] input = {1,1,2,2,3,0,6,7};
		int[] expected = {3,0,6,7};
		assertArrayEquals(expected, Utility.distinct(input));
	}

}
