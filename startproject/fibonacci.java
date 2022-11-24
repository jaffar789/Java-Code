package startproject;

import java.util.Scanner;

public class fibonacci {

	static int fibo(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
			return fibo(n-1)+fibo(n-2);		}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
System.out.println(fibo(n));
	}
}
