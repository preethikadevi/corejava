package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class BufferReaderEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		   FileInputStream fr=new FileInputStream("F://JAVA/test.txt");
		    BufferedReader reader=new BufferedReader(new InputStreamReader(fr));
		    String line;
		    while((line=reader.readLine())!=null)
		    
		    {
		    	System.out.println(line);//if ln not given all words print in sameline
		    }
	

			}

		}
	