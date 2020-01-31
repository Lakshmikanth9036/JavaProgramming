package com.bridgelabz.junitTesting;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter the temperature which you want to convert");
		double temp = InputUtility.getScanner().nextDouble();
		System.out.println("Do you want to convert form Fahrenheit To Celsius or Celsius To Fahrenheit");
		System.out.println("if Fahrenheit To Celsius press 1 \nif Celsius To Fahrenheit press 2");
		int choice = InputUtility.getScanner().nextInt();
		switch(choice){
			case 1: System.out.println(Utility.fahrenheitToCelsius(temp));
				break;
			case 2: System.out.println(Utility.celsiusToFahrenheit(temp));
				break;
			default: System.out.println("Plz enter the choice in the given list");
				break;
		} 
				
	}

}
