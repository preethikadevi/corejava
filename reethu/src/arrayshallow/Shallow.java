package arrayshallow;

public class Shallow {

	public static void main(String[] args) {
		int Array[][]={ {1,2,3,4,5},{6,7,8,9}};
		int clonearray[][]=Array.clone();
		System.out.println(Array!=clonearray);
        for(int i=0;i<clonearray.length;i++)
        {
        	
            System.out.print(clonearray[i]+" ");
        }
	}

}


