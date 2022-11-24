package startproject;

import java.util.Scanner;

public class arrayreverse {

	public static void main(String[] args)
	{
	 Scanner scan = new Scanner (System.in);
	 System.out.println("enter the size of array");
	 int a =scan.nextInt();
	 int[] ar=new int[a];
	 System.out.println("enter the array");
	 for(int i=0; i<ar.length;i++) {
		ar[i] =scan.nextInt();
		 }
		 System.out.println("reverse the array");
		 for(int i=ar.length-1;i>=0;i--) {
			 System.out.println(ar[i]+" ");
		 }
	}

}
