package oddoreven;
import java.util.Scanner;

//import java.util.Scanner;
public class odd {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("enter a");
	a=sc.nextInt();
	System.out.println("enter b");
	b=sc.nextInt();
	if (a%2==0)
{
  System.out.println(a+ " number is even");
}
else
{
	System.out.println(a+ "number is odd");
}
	if (b%2==0)
	{
	  System.out.println(b+ " number is even");
	}
	else
	{
		System.out.println(b+ "number is odd");
	}
}
}
    