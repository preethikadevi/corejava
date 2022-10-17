package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEx {

	public static void main(String[] args) throws IOException{
		File f=new File("F://JAVA/test.txt");
		 
		if (f.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("file already exists");
		}
		Path p=Paths.get("F:\\JAVA\\test.txt");
		boolean status;
		status=Files.isWritable(p);
        System.out.println("file is writable" + status);	
	}
}