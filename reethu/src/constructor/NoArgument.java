package constructor;
public class NoArgument {
	int i;
	NoArgument()
	{
    int i=15;
    System.out.println("Creating No Argument constructor");
    System.out.println("i= "+i);
}
	public static void main(String[] args) {
		NoArgument skilling=new NoArgument();
	}
}