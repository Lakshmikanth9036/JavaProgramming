package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.utility.Utility;

public class SearchWord {

	public static void main(String[] args) {
		String[] words = Utility.splitListOfWords("F:\\file.txt");
		Utility.insertionSort(words);
		Utility.dispStringArr(words);
		int index = Utility.binarySearch(words, "prabha", 0, words.length-1);
		if(index>=0)
			System.out.println("Found element "+words[index]+" in "+index);
		else
			System.out.println("Element not found");
	}

}
