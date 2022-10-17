package oops;

public class OverloadingEx2 
{ 
	public void disp(char a)
{
	System.out.println(a);
}
public void disp(char a, int num)
{
	System.out.println(a+" "+num);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverloadingEx2 obj =new OverloadingEx2(); 	
obj.disp('a');
obj.disp('a',7);
	}

}
