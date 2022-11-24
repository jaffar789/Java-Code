package startproject;

import java.util.Scanner;

public class fibonacciirati {

	public static void main(String[] args)
	{
		System.out.println("fibonacci series of numbers");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int num1=0,num2=1;
		//System.out.println("fibonacci series of " +  n  + " numbers");
		for (int i = 1; i < n; ++i) {
			System.out.println(num1+" ");
			int sumoftwo= num1+num2;
			num1=num2;
			num2=sumoftwo;
		}

	}

}
