package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.LinkedList;
import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class UnorderedList {

	public static void main(String[] args) {
		String[] s = Utility.splitListOfWords("F:\\file.txt");
		LinkedList<String> list = new LinkedList<>();
 		for(int i = 0 ; i<s.length ; i++){
			list.add(s[i]);
		}
 		System.out.println("Enter the word that you want to search");
 		String ele = InputUtility.getScanner().next();
 		
 		if(list.search(ele))
 			list.remove(ele);
 		else
 			list.add(ele);
 		
 		System.out.println(list);
 		
 		String[] rewrote = InputUtility.getString(list.size());
 		int i = 0;
 		while(!list.isEmpty()){
 			rewrote[i] = list.pop();
 			i++;
 		}
 		Utility.writeToFile("F:\\file.txt", rewrote);
	}

}
