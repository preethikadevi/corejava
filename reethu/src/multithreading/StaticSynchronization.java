package multithreading;
class Table
{
    synchronized static void printTable (int n)
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println (n * i);
            try
            {
                Thread.sleep (400);
            } 
            catch (Exception e)
            {
            }
        }
    }
}

class MyThreads1 extends Thread
{
    public void run ()
    {
        Table.printTable (1);
    }
}
class MyThreads2 extends Thread
{
    public void run ()
    {
        Table.printTable (1);
    }
}
class MyThreads3 extends Thread
{
    public void run ()
    {
        Table.printTable (1);
    }
}
class MyThreads4 extends Thread
{
    public void run ()
    {
        Table.printTable (1);
    }
}

public class StaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyThreads1 t1 = new MyThreads1 ();
	        MyThreads2 t2 = new MyThreads2 ();
	        MyThreads3 t3 = new MyThreads3 ();
	        MyThreads4 t4 = new MyThreads4 ();
	        t1.start ();
	        t2.start ();
	        t3.start ();
	        t4.start ();
	    }
	

	}

