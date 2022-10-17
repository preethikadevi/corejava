package constructor;

public class ParameterisedCons {
	ParameterisedCons(int i, int j){
	      System.out.print("parameterized constructor");
	   }
	ParameterisedCons(int i, int j, int k){
	      System.out.print("parameterized constructor1");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedCons obj = new ParameterisedCons(4,5,5);

	}

}
//passing inside parameter as (4,5,5)