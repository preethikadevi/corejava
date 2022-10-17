package controlflow;

import java.util.Scanner;

public class Switchmonths {

	public static void main(String[] args) {
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		
		month=sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("MONTH IS JANUARY");
		break;
		case 2:
			System.out.println("MONTH IS FEB");
		break;
		case 3:
			System.out.println("MONTH IS MARCH");
		break;
		case 4:
			System.out.println("MONTH IS APRIL");
		break;
		case 5:
			System.out.println("MONTH IS MAY");
		break;
		case 6:
			System.out.println("MONTH IS JUNE");
		break;
		case 7:
			System.out.println("MONTH IS JULY");
		break;
		case 8:
			System.out.println("MONTH IS AUGUST");
		break;
		case 9:
			System.out.println("MONTH IS SEPTEMBER");
		break;
		case 10:
			System.out.println("MONTH IS OCTOBER");
		break;
		case 11:
			System.out.println("MONTH IS NOVEMBER");
		break;
		case 12:
			System.out.println("MONTH IS DECEMBER");
		break;
		default:
			System.out.println("INVALID MONTH");
	
	}
	}
}
