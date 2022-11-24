package startproject;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args)
	{
	   Scanner scan	= new Scanner(System.in);
	   System.out.println("Enter the Number :");
			 int n = scan.nextInt();
		if(n%2==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
