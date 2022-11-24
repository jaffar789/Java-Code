package startproject;

import java.util.Scanner;

public class threeDigit {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the three Digits Number");
		  int n = scan.nextInt();
		  if(n>=100 && n<=999)
		  {
			  System.out.println("yes");
		  }
		  else
		  {
			  System.out.println("no");
		  }
		
	}

}
