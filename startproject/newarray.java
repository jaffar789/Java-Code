package startproject;

import java.util.Scanner;

public class newarray 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int colum=sc.nextInt();
		int[][] number =new int [row][colum];
		//intput
		//row
		//colum
		for(int i=0;i<row;i++) {
			for (int j = 0; j < colum; j++)
			{
				number[i][j]=sc.nextInt();
			}
		}
			//output
		          int x=sc.nextInt();
			for (int i = 0; i < row; i++) 
			{
			 for (int j = 0; j < colum; j++)
			 {
				 if(x==number[i][j]) {
				System.out.print("x found at location" +  " " + i + " " +"," +j+ " ");
			 }	
			//System.out.println();
			}
		

		
	}

}
}
