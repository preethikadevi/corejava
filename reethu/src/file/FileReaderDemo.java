package file;//

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
    FileReader fr=new FileReader("F://JAVA/test.txt");
    BufferedReader br=new BufferedReader(fr);
    int i;
    while((i=br.read())!=-1)
    {
    	System.out.println((char) i);//also check what output comes if ln not given
    }
br.close();
fr.close();

	}

}
