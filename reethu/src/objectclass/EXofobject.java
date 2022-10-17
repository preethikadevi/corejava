package objectclass;

public class EXofobject {
	public String name;
	public long population;
	
	public void display()
	{ 
		System.out.println("city name:"+name);
				System.out.println("population:"+population);
	}

	public static void main(String[] args) {
		EXofobject metro1,metro2;
		metro1=new EXofobject();
		metro2=new EXofobject();
		metro1.name="banglore";
		metro1.population=452687;
		System.out.println("detailsof metro city1:");
		metro1.display();
		metro2.name="chennai";
		metro1.population=45268557;
		System.out.println("details of metro city2:");
		metro2.display();
		
	}

}
