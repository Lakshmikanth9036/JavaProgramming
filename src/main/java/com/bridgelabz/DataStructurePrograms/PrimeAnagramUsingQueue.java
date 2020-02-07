package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.LinkedList;
import com.bridgelabz.DataStructure.Queue;
import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramUsingQueue {

	public static void main(String[] args) {

		Object[][] obj = InputUtility.getObject2D(10, 100);

		LinkedList<String> list = new LinkedList<>();

		int prime = 2;

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
						list.add(s1);
						list.add(s2);
					}	
				}
			}
		}

		Queue<String> queue = new Queue<>();
		while(list.size()>0){
			queue.enqueue(list.pop());
		}

		System.out.println(queue);
	}
}
