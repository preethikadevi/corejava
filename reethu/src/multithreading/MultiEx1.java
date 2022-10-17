package multithreading;

class Thread1 extends Thread
{
	Synchronized void run()
	{
		int i;
		for( i=1;i<=5;i++)
		{
			System.out.println(i);
			try {Thread.sleep(8000);
				
			} catch (Exception e) {
				
			}
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		int i;
		for( i=6;i<=10;i++)
		{
			System.out.println(i);
			try {Thread.sleep(2000);
			
			} catch (Exception e) {
				
			}
		}
		}
}
 public class MultiEx1 {

	public static void main(String[] args) {
		Thread1 t1=new  Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		

	}

}