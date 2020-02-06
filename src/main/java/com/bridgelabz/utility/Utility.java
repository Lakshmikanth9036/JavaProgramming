package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;

/**
 * @author Lakshmikanth N
 * @since 28/01/2020
 */

public class Utility {
	
	static Logger logger = Logger.getLogger(Utility.class);

	
	/**
	 * Displays Integer type array values
	 * @param a is the integer array that you want to display
	 */
	public static void dispIntArr(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	/**
	 * Displays String type array values
	 * @param s is the string array that you want to display
	 */
	public static void dispStringArr(String[] s){
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * Display the value of any Non Primitive type array
	 * @param a is an array that you want to display
	 */
	public static <E> void dispObjArr(E[] a){
		for (E t : a) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
	
	/**
	 * Display the value of any Non Primitive type array
	 * @param a is an array that you want to display
	 */
	public static <E> void disp2DArr(E[][] a){
		for (E[] ts : a) {
			for (E t : ts) {
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}

	/**
	 * Displays percentage of head and tail fallen in {@code n} tosses
	 * @param n is the number of times you want to toss the coin
	 */
	public static void headTailPer(int n){
		
		logger.info("Enter the headTailPer function");
		int head = 0, tail = 0, temp = n;
		
		if(n>0){
			logger.info(n);
			while(n>0){
				if(Math.random()>0.5)
					head++;
				else
					tail++;
				n--;
			}
		}
		else{
			logger.error("Please enter the positive value");
		}

		logger.info("Number of heads "+head+" Number of tails "+tail);
		double hper = (head*100.0)/temp;
		double tper = (tail*100.0)/temp;
		logger.info("Percent of head: "+hper);
		logger.info("Percent of tail: "+tper);
	}

	/**
	 * Return whether the year is leap year or not
	 * @param n year that we want to check is it a leap year or not
	 * @return true if {@code n} is a leap year or else it will return false
	 */
	public static boolean isLeapYear(int n){
		
		logger.info("Entering the isLeapYear method");
		if(n<1000 || n>9999){
			logger.error("Error value should be in the given range");
			return false;
		}
		if(n%400 == 0 || n%4 == 0 && n%100 != 0){
			logger.info(n+" is leap year");
			return true;
		}
		else{
		logger.info(n+" is not a leap year");
		return false;
		}
	}
	
	/**
	 * Returns power of the given number
	 * @param n is the number for which we want find power
	 * @param m is the power of {@code n}
	 * @return the {@code n^m}
	 */
	public static int pow(int n, int m){
		if(m<0)
			return -1;
		int val = 1;
		while(m>0){
			val *= n;
			m--;
		}
		return val;
	}
	
	/**
	 * Display 2 table till 2 power {@code n}
	 * @param n power of 2
	 */
	public static void powerOf2(int n){
		int pow = pow(2,n);
		int k = 1;
		while(k<pow){
			k *= 2; 
			System.out.println(k);
		}
	}
	
	/**
	 * Display the {@code n} harmonic values
	 * @param n is the number of harmonic value needed 
	 */
	public static void harmonic(int n){
		double k = 1;
		while(n>0){
			System.out.println(k);
			k += 1.0/n;
			n--;
		}
	}

	/**
	 * Display the possible prime of the given number
	 * @param n is number for which we need prime factors
	 */
	public static void primeFactors(int n){
		for(int i = 2 ; i<=n ; i++){
			if(n%i == 0){
				while(n%i == 0){
					n /= i;
					System.out.println(i);
				}
			}
		}
	}

	/**
	 * Returns power of the given double type number
	 * @param n is the double type number for which we want find power
	 * @param m is the power of {@code n}
	 * @return the {@code n^m}
	 */
	public static double pow(double n , int p){
		double pow = 1;
		while(p>0){
			pow = pow*n;
			p--;
		}
		return pow;
	}

	
	/**
	 * Return the square root of the given positive integer value 
	 * @param c is the value for which we need to find square root
	 * @return square root of the {@code c} 
	 */
	public static double sqrt(double c){
		if(c<0)
			return -1;
		double epsilon = 1e-15;
		double t = c;
		while(Math.abs(t-c/t)>epsilon*t){
			t = (c/t+t)/2.0;
		}
		return t;
	}
	
	/**
	 * Returns the distance from the origin to point plane of (x,y) 
	 * @param x is value with respect to x co-ordinate
	 * @param y is value with respect to y co-ordinate
	 * @return the distance between (0,0) to (x,y)
	 */
	public static double distance(double x, double y){
		double dist = sqrt(pow(x,2)+pow(y,2));
		return dist;
	}
	
	/**
	 * Display the quadratic equation of the degree of 3 
	 * @param a is the value of degree 3
	 * @param b is the value of degree 2
	 * @param c is the value of degree 1
	 */
	public static void quadratic(double a, double b,double c){
		
		logger.info("Entered quadratic function");
		
		double root1 = 0 , root2 = 0;
		double delta = (b*b) - (4*a*c);
		if(delta>0){
			logger.info("Entered if condition when delta value (positive) is "+delta);
			root1 = (-b+sqrt(delta))/(2*a);
			root2 = (-b-sqrt(delta))/(2*a);
			logger.info("When delta:: "+delta+" root1:: "+root1+" root2:: "+root2);
			System.out.println("root1 = "+root1+" and root2 = "+root2);
		}
		else if(delta == 0){
			logger.info("Entered if condition when delta value (zero) is "+delta);
			root1 = root2 = -b/(2*a);
			logger.info("When delta:: "+delta+" root1:: "+root1+" root2:: "+root2);
			System.out.println("root1 = "+root1+" and root2 = "+root2);
		}
		else{
			logger.info("Entered if condition when delta value (negative) is "+delta);
			root1 = -b/(2*a);
			root2 = sqrt(-delta)/(2*a);
			logger.info("When delta:: "+delta+" root1:: "+root1+" root2:: "+root2);
			System.out.printf("root1 = %.2f+%.2fi and root2 = %.2fi+%.2f",root1,root2,root1,root2);
		}
	}

	public static double windChill(double t, double v){
		double w = 35.7+0.6215*t+(0.4275*t - 35.75)*Math.pow(v, 0.16);
		return w;
	}
	
	/**
	 * Simple gambling game which returns number of  wins and percent of wins and losses
	 * @param stake is the total amount that user has with him before he start the game
	 * @param goal is the target amount which user tend to reach in the gambling simulation
	 * @param n is the maximum number of games that the user can play by which user has to reach the goal
	 */
	public static void gambler(int stake, int goal, int n){
		int win = 0, loss = 0;
		while(n>0 && stake != goal){
			if(Math.random()>0.5){
				stake += 1;
				win++;
			}
			else{
				stake -= 1;
				loss++;
			}
			n--;
		}
		double winPer = (win*100.0)/(win+loss);
		double lossPer = (loss*100.0)/(win+loss);
		System.out.println("Number of wins: "+win);
		System.out.println("Win percentage: "+winPer);
		System.out.println("Loss percentage: "+lossPer);
	}

	/**
	 * Display the elapsed time between start and stop
	 */
	public static void stopWatch(){
		System.out.println("Press any string to start the stopwatch");
		String s = InputUtility.getScanner().next();
		long start = System.currentTimeMillis();
		System.out.println("Press any string to stop the watch");
		String s1 = InputUtility.getScanner().next();
		long stop = System.currentTimeMillis();
		double elapsed = (stop-start)/1000.0;
		System.out.println("Elapsed time: "+elapsed);
	}

	/**
	 * Receives a array and returns the number of distinct triplets and corresponding triplet
	 * @param a is user provided input array
	 */
	public static void distinctTriplet(int[] a){
		
		logger.info("Entered distinctTriplet");
		int  d = 0;
		for (int i = 0; i < a.length-2; i++) {
			logger.info("Entered for loop for i : "+(i+1));
			int j = i+1, k = i+2;
			int zero = a[i]+a[j]+a[k];
			if(zero == 0){
				logger.info("Entered if condition when array elements are "+a[i]+" "+a[j]+" "+a[k]);
				System.out.println(a[i]+" "+a[j]+" "+a[k]);
				d++;
				logger.info("When if condition is met then the count of distinct triplet value is: "+d);
			}
		}
		System.out.println("Number of distinct triplets are: "+d);
	}
	
	/**
	 * Receives an array and return the array that contains only unique element  
	 * @param a is the array value received by user
	 * @return an unique array element
	 */
	public static int[] distinct(int[] a){
		int[] unique = InputUtility.getInt(a.length);
		
		int k = 0, n = a.length;
		
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count == 1)
				unique[k++] = a[i];
		}
		int[] u = InputUtility.getInt(k);
		for (int i = 0; i < u.length; i++) {
			u[i] = unique[i];
		}
		return u;
	}
	
	/**
	 * Display only unique coupon generate by {@code n} iteration 
	 * @param n is the number of coupons that need to be generated
	 */
	public static void distinctCoupon(int n){
		int[] a = InputUtility.getInt(n);
		for(int i = 0; i<n ; i++){
			int coupon = InputUtility.getRandom().nextInt(n);
			a[i] = coupon;
		}
		int[] distinct = distinct(a);
		Utility.dispIntArr(distinct);
	}
	
	/**
	 * Return the day of the week i.e; if Sunday it returns 0, if Monday it returns 1, soon
	 * @param m is the month 
	 * @param d is the day
	 * @param y is the year
	 * @return the day of the week
	 */
	public static int dayOftheWeek(int m, int d, int y){
		
		logger.info("Entered dayOftheWeek function");
		
		int yo = y-(14-m)/12;
		int x = yo+yo/4-yo/100+yo/400;
		int mo = m+12*((14-m)/12)-2;
		int d0 = -1;
		
		if(m>0 && m<=12 && y>999 && y<=9999 && d>0){
			logger.info("Entered if condition when m::"+m+"::d::"+d+"::y::"+y);
			if(isLeapYear(y) && m==2 && d<=29)
				d0 = (d+x+31*mo/12)%7;
			else if(!isLeapYear(y) && m==2 && d<=28)
				d0 = (d+x+31*mo/12)%7;
			else if ((m==4 || m==6 || m==9 || m==11)&& m!=2 && d<=30)
				d0 = (d+x+31*mo/12)%7;
			else if(m!=4 && m!=6 && m!=9 && m!=11 && m!=2 && d<=31)
				d0 = (d+x+31*mo/12)%7;
		}
		
		if(d0==-1){
			logger.error("Not entered correct date format");
		}
		return d0;
	}
	
	/**
	 * Return the Celsius value of the given Fahreneheit value
	 * @param temp is the Fahreneheit value 
	 * @return the Celsius value of the {@code temp}
	 */
	public static double fahrenheitToCelsius(double temp){
		double celsius = (temp - 32) * (5.0/9.0);
		return celsius;
	}
	
	/**
	 * Return the Fahreneheit value of the given Celsius value
	 * @param temp is the Celsius value 
	 * @return the Fahreneheit value of the {@code temp}
	 */
	public static double celsiusToFahrenheit(double temp){
		double fahre = (temp*9)/5 + 32;
		return fahre;
	}
	
	
	/**
	 * Calculates the monthly payments that user has to pay every month by principle loan amount, years to pay principle loan amount and rate of interest
	 * @param P is the principle loan amount
	 * @param Y is the years to pay principle loan amount
	 * @param R is the rate of interest
	 * @return the monthly payments that user has to pay
	 */
	public static double mounthlyPayment(double P, int Y, double R){
		if(P<1 || Y<1 || R<1)
			return -1;
		int n = 12*Y;
		double r = R/(12*100.0);
		double payment = (P*r)/(1-Math.pow(1+r, -n));
		return payment;
	}
	
	/**
	 * Fewest Notes to be returned for Vending Machine 
	 * @param n is the Change in rs to be returned by the Vending Machine 
	 * @return number of minimum Note needed to give the change
	 */
	public static int minNotes(int n){

		logger.info("Entered minNotes");
		
		if(n<1){
			logger.error(n+" value should be positive");
			return -1;
		}
		int[] notes = {1000,500,100,50,10,5,2,1};
		int minNotes = 0;
		for (int i = 0; i < notes.length; i++) {
			logger.info("Entered for loop where i:: "+i);
			while(n-notes[i]>-1){
				logger.info("Entered while loop when n:: "+n);
				n = n-notes[i];
				minNotes++;
				logger.info("Count of minNotes:: "+minNotes);
			}
		}
		return minNotes;
	}
	
	/**
	 * List of Rs Notes that would given in the Change by Vending Machine
	 * @param n is the Change in rs to be returned by the Vending Machine
	 * @return list of Rs Notes
	 */
	public static int[] change(int n){
		
		logger.info("Entered change function");
		
		int[] notes = {1000,500,100,50,10,5,2,1};
		int[] count = InputUtility.getInt(notes.length);
		
		for (int i = 0; i < notes.length; i++) {
			logger.info("Entered for loop when i:: "+i);
			while(n-notes[i]>-1){
				logger.info("Entered while loop when n:: "+n);
				n = n-notes[i];
				count[i]++;
				logger.info("Incrementing the count of note::"+notes[i]+" :: "+count[i]);
			}
		}
		return count;
	}
	
	/**
	 * Returns the binary equivalent of the given decimal number 
	 * @param n is the decimal number for which the binary equivalent is required
	 * @return the binary equivalent of {@code n}
	 */
	public static String toBinary(int n){
		String bin="";
		while(n>0){
			int r = n%2;
			bin = r+bin;
			n = n/2;
		}
		return bin;
	}
	
	/**
	 * Returns the decimal value of the given binary number
	 * @param n is the binary number for which the decimal value is required
	 * @return the decimal value of {@code n}
	 */
	public static int toDecimal(int n){
		int dec = 0, i = 0;
		while(n>0){
			int r = n%10;
			dec = dec + r*pow(2, i);
			n = n/10;
			i++;
		}
		return dec;
	}
	
	/**
	 * Read in the list of words comma separated from a File
	 * @param s is the file from which we read the words
	 * @return an array of string containing list of words that had been read from the file
	 */
	public static String[] splitListOfWords(String s){
		BufferedReader reader = null;
		String[] words = null;
		try{
			reader = new BufferedReader(new FileReader(s));
			String line = null;
			while((line=reader.readLine())!=null){
				words = line.split(",");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(reader!=null){
				try{
					reader.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		return words;
	}
	
	/**
	 * Write the content of the string array to a file
	 * @param s is the file in which we want to store the given string array
	 * @param str is the string array that we need to sore in {@code s} file
	 */
	public static void writeToFile(String s, String[] str){
		BufferedWriter writer = null;
		try{
			writer = new BufferedWriter(new FileWriter(s));
			for (int i = 0; i < str.length; i++) {
				writer.write(str[i]);
				if(i!=str.length-1)
					writer.write(",");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Using insertion sort mechanism sorts the given string array in lexograpical order
	 * @param s is the string array that need to be sorted
	 */
	public static void insertionSort(String[] s){
		for (int i = 1; i < s.length; i++) {
			int j = i-1;
			String temp = s[i];
			while(j>=0 && temp.compareTo(s[j])<0){
				s[j+1] = s[j];
				j--;
			}
			s[++j] = temp;
		}
	}
	
	/**
	 * Generic method which sort any type of array in its natural order using insertion sort mechanism
	 * @param s is the generic type array that need to be sorted
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] s){
		for (int i = 1; i < s.length; i++) {
			int j = i-1;
			T temp = s[i];
			while(j>=0 && temp.compareTo(s[j])<0){
				s[j+1] = s[j];
				j--;
			}
			s[++j] = temp;
		}
	}
	
	/**
	 * Search a given element using binary search technique
	 * @param s is the array form which we need to search the element
	 * @param ele is the element to be searched
	 * @param l is the starting index of the array
	 * @param h is the last index of the array
	 * @return mid value if the element is found else return -1
	 */
	public static int binarySearch(String[] s, String ele, int l, int h){
		int mid = (l+h)/2;
		if(l>h)
			return -1;
		if(s[mid].equals(ele))
			return mid;
		if(s[mid].compareTo(ele)<0)
			l = mid+1;
		if(s[mid].compareTo(ele)>0)
			h = mid-1;
		return binarySearch(s, ele, l, h);
	}
	
	/**
	 * Search a given element using binary search technique for any generic type array
	 * @param s is the array form which we need to search the element
	 * @param ele is the element to be searched
	 * @param l is the starting index of the array
	 * @param h is the last index of the array
	 * @return mid value if the element is found else return -1
	 */
	public static <E extends Comparable<E>> int binarySearchGeneric(E[] s, E ele, int l, int h){
		int mid = (l+h)/2;
		if(l>h)
			return -1;
		if(s[mid].equals(ele))
			return mid;
		if(s[mid].compareTo(ele)<0)
			l = mid+1;
		if(s[mid].compareTo(ele)>0)
			h = mid-1;
		return binarySearchGeneric(s, ele, l, h);
	}
	
	/**
	 * Using Bubble sort mechanism sorts the given integer array
	 * @param s is the integer array that need to be sorted
	 */
	public static void bubbleSort(int[] a){
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * Using Bubble sort mechanism sorts the given integer array
	 * @param s is the integer array that need to be sorted
	 */
	public static <E extends Comparable<E>> void bubbleSortGeneric(E[] a){
		
			for (int i = 0; i < a.length-1; i++) {
				for (int j = 0; j < a.length-i-1; j++) {
					if(a[j].compareTo(a[j+1])>0){
						E temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
	}
	
	/**
	 * Merge the given array 
	 * @param s is the array
	 * @param l is the least index
	 * @param h is the highest index
	 * @param m is the mid value
	 */
	public static void merge(String[] s, int l, int h, int m){
		String[] str = InputUtility.getString(h-l+1);
		int i = l , j = m+1, k = 0;
		while(i<=m && j<=h){
			if(s[i].compareTo(s[j])<0)
				str[k++] = s[i++];
			else
				str[k++] = s[j++];
		}
		while(i<=m)
			str[k++] = s[i++];
		while(j<=h)
			str[k++] = s[j++];
		for(int i1 = 0; i1 < str.length; i1++){
			s[l+i1] = str[i1];
		}
	}
	
	/**
	 * Sort the array using merge sort technique 
	 * @param s is the array to be sorted
	 * @param l is the least index 
	 * @param h is the highest index
	 */
	public static void mergeSort(String[] s, int l , int h){
		if(l<h){
			int m = (l+h)/2;
			mergeSort(s,l,m);
			mergeSort(s,m+1,h);
			merge(s, l, h, m);
		}
	}
	
	/**
	 * Return an array that contain the frequency of the letters in the given string
	 * @param s is the string
	 * @return the frequency of character in the string
	 */
	public static int[] frequency(String s){
		int[] frequency = InputUtility.getInt(26);
		for(int i = 0 ; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
				frequency[ch-65]++;
			else if(ch>='a' && ch<='z')
				frequency[ch-97]++;
			else if(ch>='0' && ch<='9')
				frequency[ch-48]++;
		}
		return frequency;
	}
	
	/**
	 * Returns if the given two strings are anagram or not
	 * @param s1 is the string given by user
	 * @param s2 is the string the need to be compared with other string
	 * @return true if both the string are anagram else return flase
	 */
	public static boolean isAnagram(String s1, String s2){
		int[] sc1 = frequency(s1);
		int[] sc2 = frequency(s2);
		for(int i = 0; i < 26; i++){
			if(sc1[i] != sc2[i])
				return false;
		}
		return true;
	}
	
	public static int quiz(int[] a){
		int l = 0, h = a.length-1, mid = (l+h)/2;
		
		while(true){
			System.out.println("Is the number is "+a[mid]+"?");
			System.out.println("If yes press y/Y else n/N");
			String ans = InputUtility.getScanner().next();
			if(ans.equalsIgnoreCase("y"))
				return mid;
			System.out.println("Is your value greater than the present value or less than that");
			System.out.println("If greater press g/G else l/L");
			String pos = InputUtility.getScanner().next();
			if(pos.equalsIgnoreCase("g")){
				l = mid+1;
				mid = (l+h)/2;
			}
			else{
				h = mid-1;
				mid = (l+h)/2;
			}
			if(l>h)
				return -1;
		}
	}
	
	/**
	 * Returns true if the given number is prime number
	 * @param n is the number to be checked 
	 * @return true if the number is prime number else returns false
	 */
	public static boolean isPrime(int n){
		if(n<2)
			return false;
		for(int i = 2; i<=n/2; i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	/**
	 * Returns true if the given string is palindrome
	 * @param s is the string to be checked 
	 * @return true if the string is palindrome else returns false
	 */
	public static boolean isPalin(String s){
		if(s.length()<2)
			return false;
		int l = 0, h = s.length()-1;
		while(l<h){
			if(s.charAt(l) != s.charAt(h))
				return false;
			l++;
			h--;
		}
		return true;
	}
	
	/**
	 * Returns the day of the week i.e; if Sunday 0, Monday 1, and soon
	 * @param m is the month
	 * @param d is the day 
	 * @param y is the year
	 * @return the day of the week
	 */
	public static int getDay(int m, int d, int y){
		int yo = y-(14-m)/12;
		int x = yo+yo/4-yo/100+yo/400;
		int mo = m+12*((14-m)/12)-2;
		int d0 = (d+x+31*mo/12)%7;
		return d0;
		}
}
