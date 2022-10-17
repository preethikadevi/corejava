package file;

import java.io.File;
import java.io.IOException;

public class FileSubFolderCreation {

	public static void main(String[] args) throws IOException {
		File f=new File("F://JAVA//");
		String[] s=f.list();
		for(int i=0;i<s.length;i++)
		{
			if(s[i].charAt(0)=='t');
			System.out.println(s[i]);
		}
		


			}
	
			
	}

