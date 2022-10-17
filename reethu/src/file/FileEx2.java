package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileEx2 {

	public static void main(String[] args) {
		try {
			
			/*if test.txt only given then code will execute but
			nothing will be print in text file so we need to give path also as F;*/
			OutputStream o= new FileOutputStream("F://JAVA/test.txt");
			o.write(70);
			o.write(65);
			o.write(78);
			o.close();
			System.out.println("Succesfully created and written the file");
			
		} catch (Exception e) {
			System.out.println("Exception");
			// TODO: handle exception
		} 
			
		
	}

}
