package usingfinal;

public class FinalizeMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalizeMethod str2 = new finalizeMethod ();
		  str2 = null;
		       
		        System.gc();
		        System.out.println("output of main method");

		    }
		    
		    protected void finalize()
		    {
		        System.out.println("output of finalize method");
		    
		

	}

}
