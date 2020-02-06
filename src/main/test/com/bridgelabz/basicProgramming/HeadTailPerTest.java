package com.bridgelabz.basicProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class HeadTailPerTest {

	@Test
	public void headTailPertest() {
		Double[] per=Utility.headTailPer(20);
		double d = per[0]+per[1];
		assertEquals(100, d, 0);
	}

}
