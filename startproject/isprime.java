package startproject;

import java.util.Scanner;

public class isprime {
	static boolean isprime(int n) {
	for(int i=2; i<n/2; i++)
	{
		return false;
	}
	return true;
}

	public static void main(String[] args)
	{
      	Scanner scan = new Scanner(System.in);
      	int n =scan.nextInt();
      	for(int i=2; i<=n; i++)
      	{
      		if(isprime(i))
      		{
      			System.out.println(i);
      		}
	}

}
	}
