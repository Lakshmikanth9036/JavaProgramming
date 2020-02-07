package com.bridgelabz.algorithmPrograms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BubbleSortTest {

	@Test
	public void bubbleSortTest() {
		int[] expected = {1,2,3,4,5,6 };
		int[] actual = {3,4,2,5,1,6};
		assertArrayEquals(expected, Utility.bubbleSort(actual));
	}

}
