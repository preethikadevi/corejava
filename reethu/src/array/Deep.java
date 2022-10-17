package array;

public class Deep {

	public static void main(String[] args) {
		int Array[]= {1,2,3,4,5};
		int clonearray[]=Array.clone();
		System.out.println(Array!=clonearray);
        for(int i=0;i<clonearray.length;i++)
        {
        	
            System.out.print(clonearray[i]+" ");
        }
        System.out.println("length of array:"+Array.length);
	}

}
