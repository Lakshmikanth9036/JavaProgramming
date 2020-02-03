package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.utility.Utility;

public class Calendar {
	public static void main(String[] args) {
		Object[][] cal = new Object[6][7];
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

		int d = 1;
		
		for(int i = 0 ; i<6 ;i++){
			for(int j = 0 ; j < 7 ; j++){
				if(i==0 && j<day){
					cal[i][j] = "  ";
				}
				else{
					if(d<=days[m])
						cal[i][j]=d++;
					else
						cal[i][j] = "";
				}
			}
		}
		
		for(int i = 0 ; i<6 ;i++){
			for(int j = 0 ; j < 7 ; j++){
				String s = cal[i][j].toString();
				System.out.print(s+" ");
				if(!s.equals("") && s.length()<2)
					System.out.print(" ");	
			}
			System.out.println();
		}
	}
}
