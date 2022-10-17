package constructor;

public class ConstructorThis {
	ConstructorThis()
	{
		this(4);
		System.out.println("Default Constructor.");
	}
	ConstructorThis(int i)
	{
		this(4,5);
		System.out.println("Constructor with one argument.");
	}
	ConstructorThis(int i,int j)
	{
		this(4,5,6);
		System.out.println("Constructor with two argument.");
	}
     ConstructorThis(int i,int j,int k)
    {
	System.out.println("Constructor with three argument.");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorThis constructorThis = new ConstructorThis();} 

	}


