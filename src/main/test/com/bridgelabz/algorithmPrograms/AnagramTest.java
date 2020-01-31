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
public class AnagramTest {

	private boolean expected;
	private String s1;
	private String s2;
	
	public AnagramTest(boolean expected, String s1, String s2) {
		super();
		this.expected = expected;
		this.s1 = s1;
		this.s2 = s2;
	}

	@Parameters
	public static Collection<Object[]> getParameters(){
		return Arrays.asList(new Object[][] {{true, "Bored", "Robed"},{true, "Dormitory", "Dirty room"},{true, "School master", "The classroom"},{true, "Funeral", "Real fun"},{true, "Eleven plus two", "Twelve plus one"},{false, "ramayana", "maragana"}});
	}
	
	@Test
	public void isAnagramtest() {
		assertEquals(expected, Utility.isAnagram(s1, s2));
	}

}
