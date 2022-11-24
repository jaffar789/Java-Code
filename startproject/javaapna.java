package startproject;

import java.util.Scanner;

public class javaapna {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner (System.in);
	int n=scan.nextInt();
	{
	 for(int i=1;i<=8;i++)
		{
		for(int j=1;j<8;j++)
		{
			if(i+j==n-1 )
			{
			
				System.out.print("*");
			}
			else
			{
				System.out.println(" *");
			}
			System.out.println();
		   

	}
		}
	}
}
}

	
	
