package startproject;

public class reversestring {

	public static void main(String[] args) 
	{
	 String str = "hello world";
	 String str1= " ";
	 String a[]= str.split(" ");
	 for (int i=0; i<a.length; i++)
	 {
		 System.out.println(a[i] + " ");
	 }
	 System.out.println(" ");
	 for(int i=a.length-1;i>=0; i--)
	 {
		 str1= str1 + a[i];
	 }
	 System.out.println(str1);
	}

}
