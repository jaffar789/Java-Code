package startproject;

import java.util.Scanner;

public class alphabets {

	public static void main(String[] args) 
	{
      Scanner scan = new Scanner (System.in);
      int n=scan.nextInt();
      for (int i=0; i<n; i++)
       {
    	 for(int j=0; j<n; j++)
    	
    		 if(j==0|| i==0 && j<n || i== n-1)
    		 {
    			 System.out.print("*");
    		 }
    		 if(j==0
    				 || i==0
    				 || i==n/2
    				 || i==n-1)
    		 {
    			 System.out.print("*");
    		 }
    		 if(j==0
    				 ||i==0
    				 ||i==n/2)
    		  {
    			 System.out.print("*");
    		 }
    		 if(j==6
    				 || i==0
    				 || i==n-1)
    		 {
    			 System.out.print(" "+"*");
    		 }
    		 if(j==0
    				 || i==n/2
    				 ||j==n-1
    				 )
    		 {
    			 System.out.print("*");
    		 }
    		 if( j==0
    				 ||i==n-1
    				 )
    		 {
    			 System.out.print("*");
    		 }
    		  if(j==i
    				  ||j==0
    				  ||j==n-1)
    			  System.out.print("*");
    		 if(j==n/2
    				 || i==0
    				 )
    		 {
    			 System.out.print("*");
    		 }
    		 if(i==j
    				 || j==n-i-1)
    		 {
    			 System.out.print("*");
    		 }
    		 if(j==n-i-1
    				 ||i==0
    				 ||i==n-1)
    		 {
    			 System.out.print("*");
    		 }
    		 
    	   else
    	   {
    		   System.out.print(" ");
    	   }
    	 }
       
      System.out.println();
  
	}
	}
}
