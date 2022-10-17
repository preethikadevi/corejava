package file;

import java.io.File;

public class FileFolderCreation {

	public static void main(String[] args) {
		File f=new File("F://JAVA/devi");
		if(!f.exists())
		{
			f.mkdir();//create folder
		}
		

	}

}
