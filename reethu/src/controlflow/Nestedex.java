package controlflow;
import java.util.Scanner;
public class Nestedex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter value m");
		m=sc.nextInt();
		System.out.println("Enter value n");
	n=sc.nextInt();
	for(j=m;j<=n;j++)
	{
		System.out.println("Table of "+j+"\n");	
for(i=1;i<=10;i++)
{
	System.out.print(j+"*"+i+"="+j*i+"\t");
}
System.out.println();
}


	}

}
