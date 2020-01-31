package com.bridgelabz.junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class MonthlyPaymentTest {

	@Test
	public void monthltPaymentTest() {
		assertEquals(426.2823196934589, Utility.mounthlyPayment(10000, 2, 2.2),0);
	}
	
	@Test
	public void monthltPaymentTest_invalidValues() {
		assertEquals(-1, Utility.mounthlyPayment(-10000, 2, 2.2),0);
	}

}
