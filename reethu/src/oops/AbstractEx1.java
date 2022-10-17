package oops;
abstract class Car
{
	public abstract void carModel();
	public void sound() {
	}
	{
		System.out.println("Benz");
	}
}

  
   class Ferrari extends Car
   {
   	public void carSound(){
   	}
   	{ 
  

   		System.out.println("High");
   	}
   }
public class AbstractEx1 {

	public static void main(String[] args) {
		Ferrari obj=new Ferrari();
		obj.carSound();

	}

}


