package startproject;

import java.util.Iterator;
import java.util.Scanner;

public class charstring {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	String s =scan.nextLine();
	int count=0;
	for (int i = 0; i<s.length(); i++)
	{
	char c = s.charAt(i);
	if(c=='a'||c=='A'
			||c=='e'||c=='E'
			||c=='i'||c=='I'
			||c=='o'||c=='O'
			||c=='u'||c=='U')
		count++;
	 }
		System.out.println(count);
	}
}
