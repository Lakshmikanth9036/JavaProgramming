package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramAndPalinrome {

	public static void main(String[] args) {
		int[] a = InputUtility.getInt(1000);
		int k = 0;
		for(int i=2; i<1000; i++){
			if(Utility.isPrime(i))
				a[k++] = i;
		}
		
		Object[] prime = InputUtility.getObject(k);
		for(int i = 0 ; i < prime.length; i++){
			prime[i] = a[i];
		}
		
		Utility.dispObjArr(prime);
		
		for(int i = 0 ; i < prime.length; i++){
			for( int j = i+1; j<prime.length; j++){
				String s1 = prime[i].toString();
				String s2 = prime[j].toString();
				if(Utility.isAnagram(s1, s2))
					System.out.println(s1+" "+s2);
			}
		}
		
		for(int i = 0 ; i < prime.length; i++){
			String s = prime[i].toString();
			if(Utility.isPalin(s))
				System.out.println(s);
		}
	}
}
