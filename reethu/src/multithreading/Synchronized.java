package multithreading;
class Table{
	synchronized void print(int n) { 
		int i;
		for(i=1;i<=5;i++) {
			System.out.println(n*i);
	}}
}

public class Synchronized {

	public static void main(String[] args) {
	Table t=new Table();
	Thread t1=new Thread() {
		public void run() {
			t.print(4);
		}
	
	};
	Thread t2=new Thread(){  
		public void run(){  
		t.print(6);  
		}  
		}; 
		t1.start();  
		t2.start();  
}
}
