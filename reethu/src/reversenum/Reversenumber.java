package reversenum;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		int a,n=589,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		n=sc.nextInt();
		while(n!=0)
		{
			a=n%10;
			rev=(rev*10)+a;
			n=n/10;
		}
		System.out.println("rev number is:"+rev);
	}

}
