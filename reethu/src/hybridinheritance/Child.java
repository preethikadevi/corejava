package hybridinheritance;


class HumanBody {
public void displayHuman()
{
System.out.println("Method defined inside humanBody class");
}
}
interface Male
{
 public void show();
}
interface Female
{
public void show();

}
public class Child extends HumanBody implements Male,Female
{
public void show()
{
System.out.println("Implementation of show()method defines in interface Male and Female");
}
public void displayChild()
{
System.out.println("Method defined child class");
}


public static void main(String[] args) {

   Child obj=new Child();
   System.out.println("Implementation of Hybrid inheritance in Java");
   obj.show();
   obj.displayChild();
}}