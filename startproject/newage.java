package startproject;

import java.util.Scanner;

public class newage 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the tables");
		int nl=scan.nextInt();
		{
			for(int i=1;i<=10; i++)
			{
				System.out.println(nl + "*" + i + "=" + nl*i);
		}
		
			}
	}
}

