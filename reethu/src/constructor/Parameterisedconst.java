package constructor;

public class Parameterisedconst {
	String studentName;
	int studentAge;
	Parameterisedconst(String name,int age){
		studentName=name;
		studentAge=age;
		age=23;
	} 
	void display() {
		System.out.println(studentName+ " " +studentAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterisedconst myobj=new Parameterisedconst("reethu" ,25);
		myobj.display();
	}

}
