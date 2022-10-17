package controlflow;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("z");
		break;
		case 2:System.out.println("c");
		break;
		case 3:System.out.println("b");
		break;
		case 4:System.out.println("h");
		break;
		default:System.out.println("m5");

	}

}
}