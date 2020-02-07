package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.DataStructure.Queue;
import com.bridgelabz.DataStructure.Stack;
import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class CalendarQueue {

	public static void main(String[] args) {

		System.out.println("Enter the month");
		int m = InputUtility.getScanner().nextInt();
		System.out.println("Enter the year");
		int y = InputUtility.getScanner().nextInt();

		int day = Utility.getDay(m, 1, y);	

		String[] months = {"", "January", "February", "March",
				"April", "May", "June",
				"July", "August", "September",
				"October", "November", "December"};
		int[] days = {0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
		String[] week = {"S " , "M " , "T " , "W " , "Th" , "F " , "S "};

		System.out.println(months[m]+" "+y);

		for(int i=0 ; i<week.length; i++){
			System.out.print(week[i]+" ");
		}
		System.out.println();

		if(Utility.isLeapYear(y) && m==2){
			days[m] = 29;
		}

		Queue<Object> queue = new Queue<>();

		for(int i = 0 ; i<day ; i++){
			queue.enqueue(" ");
		}

		for(int i=1 ; i<=days[m] ; i++){
			queue.enqueue(i);
		}

		//		for(int i = 0 ; i<day ; i++){
		//			System.out.print(queue.dequeue()+"  ");
		//		}
		//
		//		for(int i=1 ; i<=days[m] ; i++){
		//				System.out.print(queue.dequeue()+" ");
		//			if(i<10)
		//				System.out.print(" ");
		//			if((i+day)%7 == 0)
		//				System.out.println();
		//		}

		Stack<Object> stk = new Stack<>();
		Stack<Object> stack = new Stack<>();
		while(!queue.isEmpty()){
			stk.push(queue.dequeue());
		}
		while(!stk.isEmpty()){
			stack.push(stk.pop());
		}

		for(int i = 0 ; i<day ; i++){
			System.out.print(stack.pop()+"  ");
		}

		for(int i=1 ; i<=days[m] ; i++){
			System.out.print(stack.pop()+" ");
			if(i<10)
				System.out.print(" ");
			if((i+day)%7 == 0)
				System.out.println();
		}
	}

}
