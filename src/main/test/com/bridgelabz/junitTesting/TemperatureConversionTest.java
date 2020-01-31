package com.bridgelabz.junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class TemperatureConversionTest {

	@Test
	public void temperatureConversionTest_fahrenheitToCelsius() {
		assertEquals(0, Utility.fahrenheitToCelsius(32), 0);
	}
	
	@Test
	public void temperatureConversionTest_celsiusToFahrenheit() {
		assertEquals(32, Utility.celsiusToFahrenheit(0), 0);
	}

}
