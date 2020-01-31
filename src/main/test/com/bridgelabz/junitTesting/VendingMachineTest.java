package com.bridgelabz.junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class VendingMachineTest {

	@Test
	public void minNotesTest() {
		assertEquals(5, Utility.minNotes(1525));
	}
	
	@Test
	public void minNotesTest_invalidAmount() {
		assertEquals(-1, Utility.minNotes(-1525));
	}
	
	@Test
	public void changeTest() {
		int[] actual = Utility.change(1525);
		int[] expected = {1,1,0,0,2,1,0,0};
		assertArrayEquals(expected, actual);
	}
}
