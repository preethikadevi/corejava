package sumofeven;

import java.util.Scanner;

public class Sumofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
				System.out.println("sum of even numbers is:"+sum);
			}
		}
		
}
	


