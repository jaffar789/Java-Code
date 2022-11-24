package startproject;

import java.util.Scanner;

public class Multiple10 {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		if(n%10==0)
		{
			System.out.println("yes");
		}
		{
			System.out.println("no");
		}

	}

}
