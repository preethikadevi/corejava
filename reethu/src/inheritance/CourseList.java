package inheritance;
import java.util.Scanner;

public class CourseList extends StudentList {
	public int crid;//crid=course id
	public String crnm;//crnm=course name
	public int getCrid()
	{
		return crid;
	}
	public void setCrid(int crid)
	{
		this.crid=crid;
	}
	public String getCrnm()
	{
		return crnm;
	}
	public void setCrnm(String crnm)
	{
		this.crnm=crnm;
	}
	
	public String toString()
	{
		return "Course ID:"+getCrid()+"Coursename:"+getCrnm()+"StudentID:"+getStid()+"Student Name:"+getStdname()+"Department:"+getDepart();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseList A[]=new CourseList[1];
		for(int i=0;i<A.length;i++)
		{
			A[i]=new CourseList();
			System.out.println("Enter course id:");
			A[i].setCrid(sc.nextInt());
			System.out.println("Enter course name:");
			A[i].setCrnm(sc.next());
			System.out.println("Enter Student id:");
			A[i].setCrid(sc.nextInt());
			System.out.println("Enter Student name:");
			A[i].setStdname(sc.next());
			System.out.println("Enter Department:");
			A[i].setDepart(sc.next());
			System.out.println(A[i]);
		}

	}

}
