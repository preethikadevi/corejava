package objectclass;

public class City {
	public String name;
	public long population;
	
	public void display()
	{ 
		System.out.println("city name:"+name);
				System.out.println("population:"+population);
	}

	public static void main(String[] args) {
		City metro1,metro2;
		metro1=new City();
		metro2=new City();
		metro1.name="banglore";
		metro1.population=452687;
		System.out.println("detailsof metro city1:");
		metro1.display();
		metro2.name="chennai";
		metro2.population=245867;
		System.out.println("detailsof metro city2:");
		metro2.display();
		
	}

}

