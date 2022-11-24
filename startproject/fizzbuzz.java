package startproject;

import java.util.Scanner;

public class fizzbuzz {
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		//int n =scan.nextInt();
		for (int i = 0; i < 10; i++) {
			
			if(i%5 == 0) {
				System.out.println("fizz");
			}
			if(i%3 == 0) {
				System.out.println("buzz");
			}
			else if(i%3!= 0) {
				System.out.println(i);
			}
			System.out.println();
			
		}

	}

}
