package oops;
class Note
{
	void run()
	{
		System.out.println("note is not in stock");
	}
}

	
   public class OverriddingEx1 extends Note {
	void run()
	{
		System.out.println("note is not in stock");
	}

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverriddingEx1 obj=new OverriddingEx1();
		obj.run();
	}

}
