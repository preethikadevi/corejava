package accessmodifier;
class ParentClass{
	int a=15;
	public int b=22;
	protected int c=58;
	private int d=50;
	void showData()
{
		System.out.println("Inside ParentClass");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
}
}
class ChildClass extends ParentClass{
	void accessData() {
		System.out.println("Inside ChildClass");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		//System.out.println("d= "+d); //private member cant be accesed
	}
}
public class AccessmodifierEx {

	public static void main(String[] args) {
	ChildClass obj=new ChildClass();
	obj.showData();
	obj.accessData();

	}

}
