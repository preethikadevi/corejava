package constructor;

public class Parameterized {
	int i;
	Parameterized(int i)
	{
		this.i=1;
		
		 System.out.println("number:"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized a=new Parameterized(1);
		Parameterized b=new Parameterized(2);
		Parameterized c=new Parameterized(3);
		Parameterized d=new Parameterized(4);
		Parameterized e=new Parameterized(5);
	}

}
