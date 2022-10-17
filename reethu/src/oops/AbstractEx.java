package oops;
//abstract class
abstract class Bird
{
	//abstract method
	public abstract void birdSound();
	//regular method
	public void sleep() {
	}
	{
		System.out.println("Huuuu");
	}
}
//subclass (inherit from Animal)

class Parrot extends Bird
{
	public void birdSound(){
	}
	{ 
		//the body of animal sound

		System.out.println("The parrot say:oo oo");
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Parrot obj=new Parrot();
      obj.sleep();
	}

}
