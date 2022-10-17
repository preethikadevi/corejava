package file;
import java.io.*;
import java.io.IOException;
public class FileEx3 {

	public static void main(String[] args) throws IOException
	{
		
			BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
			System.out.println("enter your name");
	String name=br.readLine();
	System.out.println("enter your age");
	int age=Integer.parseInt(br.readLine());
	System.out.println("enter your percentage");
	double percentage=Double.parseDouble(br.readLine());
	System.out.println("my name is: "+name);
	System.out.println("My age is: "+age);
	System.out.println("My percentage is: "+percentage);
		} 
		
		
		
	}


