package forloop;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j;
		char ch='A';
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j++)
			{
				if(j<=i)
					
				System.out.print(ch+"\t");
				else
					System.out.print(" "+"\t");
			}
			System.out.println();
		

	}

}
}