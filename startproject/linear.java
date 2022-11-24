package startproject;

import java.util.Scanner;

public class linear {
	
	static boolean linear(int a, int b) {
		
	if(a+b==33)
	{
		return true;
	}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
	 Scanner scan = new Scanner(System.in);
	 int a=scan.nextInt();
	 int b=scan.nextInt();
	 System.out.println(linear());


	}

}
