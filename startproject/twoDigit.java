package startproject;

import java.util.Scanner;

public class twoDigit {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number:");
	int n=scan.nextInt();
	if(n>=10 && n<=99)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}

	}

}
