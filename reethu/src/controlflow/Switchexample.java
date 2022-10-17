package controlflow;

import java.util.Scanner;

public class Switchexample {

	public static void main(String[] args) {
	    float pie=3.14f;
	    float radius,a,c;
	    int ch;
	    Scanner obj=new Scanner(System.in);
	    System.out.println("main menu");
	    System.out.println("1:Area of circle");
	    System.out.println("2:Circumference of a circle");
	    System.out.println("3:exit");
	    System.out.println("Enter your choice[1-3]:");
	    ch=obj.nextInt();
	    System.out.println("Enter Radius:");
	    radius=obj.nextInt();
	    switch(ch)
	    {
	    case 1:
	    	a=pie*radius*radius;
	    	System.out.println("Area:"+a);
	    	break;
	    case 2:
	    	c=2*pie*radius;
	    	System.out.println("Circumference:"+c);
	    	break;
	    case 3:
	    	System.exit(0);
	    	break;
	    default:
	    	System.out.println("Invalid choice");
	    	break;
	    }
	    

	}

}
