package startproject;

import java.util.Scanner;

public class basicprogram {
	static boolean luckynumber(int a,int b) {
		if(a==33||b==33||(a-b)==33||(b-a)==33||(a+b)==33) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(luckynumber(a,b));

	}

}
