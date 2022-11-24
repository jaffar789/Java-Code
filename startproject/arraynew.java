package startproject;

import java.util.Scanner;

public class arraynew {

	public static void main(String[] args, int n) {
	Scanner scan =new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int[] arr=new int[a];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	int k=scan.nextInt();

	printSubarray(arr,k);
	}
	private static void printSubarray(int[] arr, int k) 
	{
		for(int i=0;i<=arr.length-3;i++)
		{
			for(int j=i; j<i+3; j++)
				System.out.println(arr[j] + " ");
		}

		System.out.println();


	}

}
