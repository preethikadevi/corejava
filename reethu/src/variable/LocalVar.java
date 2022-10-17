package variable;

public class LocalVar 

{ 
	int a=5;
	public void age()
	{
		int age =0;
		age=15;
		System.out.println("his age is:"+age);
	}

	public static void main(String[] args) {
		LocalVar temp=new LocalVar();
		temp.age();
	
	}

}
