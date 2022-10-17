package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	 public String name;
	   public String address;
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	}


public class SerializationEx1 {

	public static void main(String[] args) throws Exception{
		 Employee e = new Employee();
	      e.name = "devi";
	      e.address = "mettur,salem";
	      FileOutputStream fileOut = new FileOutputStream("F:\\JAVA\\reethu.image");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in F:\\JAVA\\reethu.image");
	         FileInputStream fileIn = new FileInputStream("F:\\JAVA\\reethu.image");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	         System.out.println("Deserialized Employee...");
		      System.out.println("Name: " + e.name);
		      System.out.println("Address: " + e.address);
	}

}
