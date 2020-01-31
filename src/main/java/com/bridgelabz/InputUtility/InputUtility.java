package com.bridgelabz.InputUtility;

import java.util.Random;
import java.util.Scanner;

public class InputUtility {
	
	public static final Scanner in;
	public static final Random rand;
	
	static{
		rand = new Random();
		in = new Scanner(System.in);
	}
	
	public static final Scanner getScanner(){
		return in;
	}
	
	public static final Random getRandom(){
		return rand;
	}
	
	public static int[] getIntArr(int n){
		int[] arr = new int[n];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = in.nextInt();
		}
		return arr;
	}
	
	public static String[] getStringArr(int n){
		String[] arr = new String[n];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = in.next();
		}
		return arr;
	}
	
	public static Integer[] getIntegerArr(int n){
		Integer[] arr = new Integer[n];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = in.nextInt();
		}
		return arr;
	}
	
	public static int[] getInt(int n){
		int[] arr = new int[n];
		return arr;
	}
	
	public static Object[] getObject(int n){
		Object[] arr = new Object[n];
		return arr;
	}
	
	public static String[] getString(int n){
		String[] arr = new String[n];
		return arr;
	}
	
	public static Integer[][] getInteger2DArr(int m,int n){
		Integer[][] a = new Integer[m][n];
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < a[i].length ; j++){
				a[i][j] = InputUtility.getScanner().nextInt();
			}
		}
		return a;
	}
	
	public static Double[][] getDouble2DArr(int m,int n){
		Double[][] a = new Double[m][n];
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < a[i].length ; j++){
				a[i][j] = InputUtility.getScanner().nextDouble();
			}
		}
		return a;
	}
	
	public static Boolean[][] getBoolean2DArr(int m,int n){
		Boolean[][] a = new Boolean[m][n];
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < a[i].length ; j++){
				a[i][j] = InputUtility.getScanner().nextBoolean();
			}
		}
		return a;
	}
	
}
