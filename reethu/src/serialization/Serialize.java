package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String [] args) {
	      Employee e = new Employee();
	      e.name = "devi";
	      e.address = "mettur,salem";
	      
	      
	      try {
	         FileOutputStream fileOut = new FileOutputStream("F:\\JAVA\\employee.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in F:\\JAVA\\employee.txt");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }
	}