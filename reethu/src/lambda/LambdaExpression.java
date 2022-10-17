package lambda;

public class LambdaExpression {

	public static void main(String[] args) {
	int speed=90;
	/*//old model
	 Runnable r=new Runnable() {
		public void run(){System.out.println("Runnig at the sppeed of "+speed);
	};
	r.run();*/
	
	
	/*Runnable r=()->{
		System.out.println("Runnig at the sppeed of "+speed);
	};
r.run();
	}*/
	Runnable r1=(int s)->{
		System.out.println("Runnig at the sppeed of "+s);
	};
r1.run(speed);
}
}
