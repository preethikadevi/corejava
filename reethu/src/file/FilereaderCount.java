package file;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilereaderCount {

	
	public static void main(String[] args) throws Exception {
		
		FileReader f=new FileReader("F://JAVA/test.txt");
		
	    BufferedReader reader=new BufferedReader(new BufferedReader(f));
	    String line;
	    int count=0;
	   
	    while((line=reader.readLine())!=null){
	    	String words[]=line.split("");
	    	count=count+words.length;
	    	
	   
	    
	 	System.out.println("number of words present in file:"+count);//if ln not given all words print in sameline

		}
	}
	}


	