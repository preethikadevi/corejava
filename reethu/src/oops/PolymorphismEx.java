package oops;//polymorphism:we can derive many forms from one form and it has 2 types
class Polygon//here render is overrided using overriding method
{
	public void render()
	{
		System.out.println("Rendering polygon..");
	}
}
class Square extends Polygon
{
	public void render()
	{
		System.out.println("Rendering square..");
	}
}
class Circle extends Polygon
{
	public void render()
	{
		System.out.println("Rendering polygon..");
	}
}
public class PolymorphismEx {

	public static void main(String[] args) {
		//creating object of a circle
		//dynamic binding
     Circle c=new Circle();
     c.render();
     Square s=new Square();
     s.render();
     Polygon p=new Polygon();
     p.render();
	}

}
