package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class PrimeIn2D {

	public static void main(String[] args) {
		Object[][] obj = InputUtility.getObject2D(10, 100);
		Object[][] anag = InputUtility.getObject2D(10, 100);
		
		int prime = 2, p = 0, q = 0;
		
		for(int i = 0; i < obj.length; i++){
			for (int j = 0; j < obj[i].length; j++) {
				if(Utility.isPrime(prime))
					obj[i][j] = prime;
				else
					obj[i][j] ="";
				prime++;
			}
			
			for (int j = 0; j < obj[i].length; j++){
				for(int k = j+1; k < obj[i].length; k++){
					String s1 = obj[i][j].toString();
					String s2 = obj[i][k].toString();
					if(s1.equals("") || s2.equals("")){
						
					}
					else if(Utility.isAnagram(s1, s2)){
						anag[p][q++] = s1;
						anag[p][q++] = s2;
					}	
				}
			}
			p++;
		}
		
		for(int i = 0; i < anag.length; i++){
			for (int j = 0; j < anag[i].length; j++) {
					if(anag[i][j] != null)
						System.out.print(anag[i][j]+" ");
			}
			System.out.println();
		}
	}

}
