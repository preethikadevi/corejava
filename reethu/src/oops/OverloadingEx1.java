package oops;

public class OverloadingEx1 
{

void sum(int a,double b)
{
System.out.println(a+b);
} 
void sum(double b,int a)
{
System.out.println(a+b);
}
 
public static void main(String[] args) 
{
	OverloadingEx1 obj=new OverloadingEx1(); 
obj.sum(78,63.55); 
obj.sum(150.32,28);
}
}
