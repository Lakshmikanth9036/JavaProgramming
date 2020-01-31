package com.bridgelabz.logicalPrograms;

import com.bridgelabz.InputUtility.InputUtility;

public class TicTacToe {
	
	public static void place(char[][] b, int m, int n, char p){
		b[m][n] = p;
	}
	
	public static boolean checkPos(char[][] b, int m, int n){
		if(b[m][n] != '\u0000')
			return false;
		return true;
	}
	
	public static boolean win(char[][] b, char c) {
		if(b[0][0] == b[0][1] && b[0][0] == b[0][2] && b[0][0] == c)
			return true;
		else if(b[1][0] == b[1][1] && b[1][0] == b[1][2] && b[1][0] == c)
			return true;
		else if(b[2][0] == b[2][1] && b[2][0] == b[2][2] && b[2][0] == c)
			return true;
		else if(b[0][0] == b[1][0] && b[0][0] == b[2][0] && b[0][0] == c)
			return true;
		else if(b[0][1] == b[1][1] && b[0][1] == b[2][1] && b[0][1] == c)
			return true;
		else if(b[0][2] == b[1][2] && b[0][2] == b[2][2] && b[0][2] == c)
			return true;
		else if(b[0][0] == b[1][1] && b[0][0] == b[2][2] && b[0][0] == c)
			return true;
		else if(b[0][2] == b[1][1] && b[0][2] == b[2][0] && b[0][2] == c)
			return true;
		return false;
	}
	
	public static void dispArray(char[][] a){
		for (char[] cs : a) {
			for (char c : cs) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		char[][] board = new char[3][3];
		
		int m = 0, n = 0, count = 9;
		while(true){
			
			if(count==0){
				System.out.println("Board is full");
				break;
			}
			
			boolean res1 = false;
			while(!res1){
				System.out.println("Enter the row and column to place the pawn");
				m = InputUtility.getScanner().nextInt();
				n = InputUtility.getScanner().nextInt();
				res1 = checkPos(board,m,n);
				if(!res1)
					System.out.println("Plz pick diff position");
			}
			place(board,m,n,'X');
			count--;
			dispArray(board);
			boolean win1 = win(board, 'X');
			if(win1){
				System.out.println("human won");
				break;
			}
			
			
			if(count==0){
				System.out.println("Board is full");
				break;
			}
			
			boolean res2 = false;
			while(!res2){
				System.out.println("Enter the row and column to place the pawn");
				m = InputUtility.getRandom().nextInt(3);
				n = InputUtility.getRandom().nextInt(3);
				res2 = checkPos(board,m,n);
				if(!res2)
					System.out.println("Plz pick diff position");
			}
			place(board,m,n,'O');
			count--;
			dispArray(board);
			boolean win2 = win(board, 'O');
			if(win2){
				System.out.println("computer won");
				break;
			}
		}	
	}
}
