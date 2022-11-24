package startproject;

import java.util.Scanner;

public class secondlarge {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int n =scan.nextInt();
		int[] ar=new int[n];
		for(int i=0; i<ar.length; i++)
		{
			ar[i]=scan.nextInt();
		}
     System.out.println(secondLargest(ar));
	}
}
	/*private static int SecondLargest(int[]ar)
{
	int f1 = Integer.MAX_VALUE;
	int s1 = Integer.MIN_VALUE;
	for(int i=0; i<ar.length; i++)
	{
		if (ar[i]>f1)
		{
			s1=f1;
			f1=s1;
		}
		else if(ar[i]>s1)
		{
			s1=ar[i];
		}
	}
		return s1;
}
}*/
