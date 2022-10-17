package controlflow;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		a=sc.nextInt();
		if(a<50)
		System.out.println("your score is below average"+a);
		else if(a>=60||a<74)
		System.out.println("your score is average"+a);
		else if(a<=75)
		System.out.println("your score is good"+a);
		else if(a<=100)
		System.out.println("your score is excellent"+a);
		else
			System.out.println("enter avalid mark");
			
       
	}

}

