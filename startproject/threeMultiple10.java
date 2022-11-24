package startproject;

import java.util.Scanner;

public class threeMultiple10 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if(n>=100 && n<=999 && n%10==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
