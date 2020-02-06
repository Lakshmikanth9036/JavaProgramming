package com.bridgelabz.logicalPrograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.InputUtility.InputUtility;
import com.bridgelabz.logger.LoggerUtility;

public class TicTacToe {
	
	static Logger logger = LoggerUtility.getLogger("TicTacToe.class");
	
	public static void place(char[][] b, int m, int n, char p){
		logger.info("Entered checPos function");
		logger.info("Initializing value of board in pos m::"+m+"::n::"+n+" to p::"+p);
		b[m][n] = p;
	}
	
	public static boolean checkPos(char[][] b, int m, int n){
		logger.info("Entered checPos function");
		logger.info("Checking wheather postion m::"+m+"::n::"+n+" position is filled or not");
		if(b[m][n] != '\u0000'){
			logger.info("Executes this if contiton when the postition is empty");
			return false;
		}
		logger.info("Comes to this line when the postition is filled");
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
		
		System.setProperty("fname.name", "F:\\Programs\\BridgeLabz\\JavaProgramming\\src\\main\\java\\com\\bridgelabz\\log\\TicTacToe.log");
		PropertyConfigurator.configure("log4j.properties");
		
		char[][] board = new char[3][3];
		
		logger.info("Started Tic-Tac-Toe game");
		
		int m = 0, n = 0, count = 9;
		while(true){
			
			logger.info("Entered while loop");
			
			if(count==0){
				logger.info("Checking if count::"+count+"==0");
				System.out.println("Board is full");
				break;
			}
			
			boolean res1 = false;
			while(!res1){
				logger.info("Checking user entered position is filled or not");
				System.out.println("Enter the row and column to place the pawn");
				m = InputUtility.getScanner().nextInt();
				n = InputUtility.getScanner().nextInt();
				res1 = checkPos(board,m,n);
				if(!res1){
					logger.info("Enter this condition if position is filled");
					System.out.println("Plz pick diff position");
				}
			}
			place(board,m,n,'X');
			count--;
			logger.info("Decrementing the board size by 1 now count::"+count);
			dispArray(board);
			boolean win1 = win(board, 'X');
			if(win1){
				System.out.println("human won");
				break;
			}
			
			
			if(count==0){
				logger.info("Checking if count::"+count+"==0");
				System.out.println("Board is full");
				break;
			}
			
			boolean res2 = false;
			while(!res2){
				logger.info("Checking computer generated numbers position is filled or not");
				m = InputUtility.getRandom().nextInt(3);
				n = InputUtility.getRandom().nextInt(3);
				res2 = checkPos(board,m,n);
				if(!res2){
					logger.info("Enter this condition if position is filled");
					System.out.println("Plz pick diff position");
				}
			}
			place(board,m,n,'O');
			count--;
			logger.info("Decrementing the board size by 1 now count::"+count);
			dispArray(board);
			boolean win2 = win(board, 'O');
			if(win2){
				System.out.println("computer won");
				break;
			}
		}	
	}
}
