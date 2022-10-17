package multithreading;

public class MultiEx2 {

	public static void main(String[] args) {
		Thread thread1 = new Thread("Thread1");
		thread1.start();
		Thread thread2 = new Thread("Thread2");
		thread2.start();
	}
}
		class Multithread implements Runnable
		{
			Thread eat;
			private String cook;
			Thread (String name)
			{
				cook=name;
			}
			
			public void run() {
				System.out.println(cook);
				for(int i=0;i<3;i++) {
					System.out.println(i);
					System.out.println(cook);
					try {Thread.sleep(2000);} catch (Exception e) {} 
						
				}
			}
			
		
		public void start() {
			System.out.println("Thread started");
			if(eat==null) { 
				eat=new Thread(this,cook);
				eat.start();
				
			}
		}

	

}
