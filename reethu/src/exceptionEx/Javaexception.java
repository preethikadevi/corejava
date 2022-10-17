package exceptionEx;

public class Javaexception {

	public static void main(String[] args) {
		
		try
		{
			//code may raise exception
			int data=100/0;
			
		}
		catch(ArithmeticException e)
		{
			
	  	System.out.println(e);
	  	
	  	//rest code od the program
		}
		System.out.println("rest of the code");
		
		}
	}


