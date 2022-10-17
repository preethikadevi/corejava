package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	String age;
	String name;
	String salary;
	int ch;
Scanner sc =new Scanner(System.in);

	while(true)
	{
		System.out.println("Press 1 to add student");
		System.out.println("press 2 to display student data:");
		System.out.println("press 3 to search");
		System.out.println("press 4 to delete");
		System.out.println("Enter your choice:");
		ch = sc.nextInt();
	
	switch(ch)
	{
	case 1:
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.next();
		System.out.println("Enter salary");
		salary=sc.next();
		Student s=new Student();
		s.setName(name);
		s.setAge(age);
		s.setSalary(salary);
		al.add(s);
		System.out.println("student record added");
		break;
	
	case 2:
		for(int i=0;i<al.size();i++)
		{
			System.out.println("student record"+(i+1));
			System.out.println("student name:"+al.get(i).getName());
			System.out.println("student age:"+al.get(i).getAge());
			System.out.println("student salary:"+al.get(i).getSalary());
			break;
		}
		case 3:
		System.out.println("Enter the name ");
		name=sc.next();
		int ii=0;
		if(al.get(ii).getName().contains(name));
		System.out.println("student record"+(++ii));
		System.out.println("student name:"+al.get(ii).getName());
		System.out.println("student age:"+al.get(ii).getAge());
		System.out.println("student salary:"+al.get(ii).getSalary());
	
	if(ii==0)
	{
		System.out.println("no record found for that search");
		
	
	break;
	}
	case 4:
		System.out.println("enter the student name for delete:");
		name=sc.next();
		int searchI=0;
		for(int i=0;i<al.size();i++)
			if(al.get(i).getName().contains(name)) {
				System.out.println("Student record:"+(++searchI));
				al.remove(i);
			}
	
	if (searchI==0) {
		System.out.println("no record found for delete record");
}
	else {
		
			System.out.println("student record has been succesfully deleted");
	}
	}
	}
	}
}

