package startproject;

import java.util.Scanner;

public class Array {

	public static void main(String[] args)
	{
		System.out.println("Enter the value:");
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 int [] arr = new int[n];

	 System.out.println("the array element:");
	 for(int i=0; i<arr.length;i++) {
		 
		arr[i]=scan.nextInt();

		 }
	 System.out.println("Reversed array:");
	 for(int j = arr.length-1;j>=0;j--) {
		 
		 System.out.print(" "+arr[j]);
	
	 }
	 

	 
	}

}
