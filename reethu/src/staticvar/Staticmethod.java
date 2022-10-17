package staticvar;

public class Staticmethod {
	static int add(int a,int b) {
	return a+b;
	}
	int multiply (int a,int b)
	{
		return a*b;
	}
	void sub (int a,int b)
	{
		System.out.println("subtraction:"+(a-b));
	}
	public static void main(String[] args) {
		int result=Staticmethod.add(5, 4);
		System.out.println("sum:"+result);
		Staticmethod st=new Staticmethod();;
		int mul=st.multiply(2, 3);
		System.out.println("multiplication");
		st.sub(5, 4);

	}

}
