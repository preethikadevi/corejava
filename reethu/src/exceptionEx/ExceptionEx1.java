package exceptionEx;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try
		{
			int a[]= {4,5,6,7,8};
			
			System.out.println(a[11]);
		}
		catch(Exception e)
		{
			System.out.println("undefined error.");
		}
		finally
		{
			System.out.println("Program executed inspite of errors.");
		}
	}

}
