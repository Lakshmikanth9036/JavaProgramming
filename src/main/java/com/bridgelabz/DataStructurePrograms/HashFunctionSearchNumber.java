package com.bridgelabz.DataStructurePrograms;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.DataStructure.LinkedList;
import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class HashFunctionSearchNumber {

	public static void main(String[] args) {

		System.out.println("Enter the value to be searched ");
		int n = InputUtility.getScanner().nextInt();

		String[] str = Utility.splitListOfWords("F:\\integer.txt");
		System.out.println(str.length);
		Integer[] val = InputUtility.getInteger(str.length);
		for (int i = 0; i < val.length; i++) {
			val[i] = Integer.parseInt(str[i]);
		}

		Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();

		for(int i = 0 ; i < val.length ; i++){
			Integer r = val[i]%11;
			if(map.containsKey(r)){
				LinkedList<Integer> list =  map.get(r);
				list.add(val[i]);
				map.put(r, list );
			}
			else{
				LinkedList<Integer> list = new LinkedList<>();
				list.add(val[i]);
				map.put(r, list);
			}
		}

//		for(Map.Entry<Integer, LinkedList<Integer>> v : map.entrySet()){
//			System.out.println(v.getKey()+"------>"+v.getValue());
//		}

		Integer rem = n%11;
		LinkedList<Integer> lst = map.get(rem);
		if(lst.search(n)){
			System.out.println(n+" element found");
			lst.remove(n);
		}
		else{
			System.out.println(n+" element is not found so added to "+rem+" bucket");
			lst.add(n);
		}
		for(Map.Entry<Integer, LinkedList<Integer>> v : map.entrySet()){
			System.out.println(v.getKey()+"------>"+v.getValue());
		}
	}
}
