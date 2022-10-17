package multithreading;
class RunnableThread implements Runnable
{
	public void run()
	{
		int i;
		for( i=0;i<=5;i++)
			System.out.println("runnable");
		System.out.println(i);
	}
}
public class Multi {

	public static void main(String[] args) {
		RunnableThread t1=new RunnableThread();
		Thread t2=new Thread(t1);
		t2.start();
		
	}

}
