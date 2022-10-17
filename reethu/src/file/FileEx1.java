package file;//creating pdf file in f drive

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		File f=new File("F://JAVA/test.pdf");
		if (f.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("file already exists");
		}
		Path p=Paths.get("F:\\JAVA\\test.pdf");
		boolean status;
		status=Files.isWritable(p);
        System.out.println("file is writable-" + status);	
       String path=f.getAbsolutePath();
      System.out.println("Absolute path"+path);
      String path1=f.getPath();
      System.out.println(" path"+path);
      String path2=f.getCanonicalPath();
      System.out.println("canonical path"+path);
     
	}
}


	