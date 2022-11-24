package startproject;

import java.util.HashSet;
import java.util.Scanner;

public class sudoku {
	
	public static boolean isvalidSudoku(char[][] board){
		HashSet hash = new HashSet();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]!='.') {
					if(!hash.add("row" + i+board[i][j])|| !hash.add("coloum"+j+board[i][j])){
						return false;
					}
					if(!hash.add("box"+(i/3)*3+j/3+board[i][j])) {
						return false;
					}
				}
			}
		}
		return false;
	}
		        	
		        	 public static void main(String[] args)
		        	    {
		        	        char[][] board = new char[][] {
		        	            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
		        	            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
		        	            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
		        	            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
		        	            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
		        	            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
		        	            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
		        	            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
		        	            { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
		        	        };
		        	        if(isvalidSudoku(board) ? "YES" : "NO"))
		        	        {
							System.out.println("finish");
		        	        }else 
		        	        	System.out.println("try again");
	}
	}

