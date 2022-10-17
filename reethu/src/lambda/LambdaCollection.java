package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaCollection {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(42);
		l.add(88);
		l.add(66);
		//teaversing using foreach
		System.out.println("Traversing using foreach loop");
		for(Integer e: l){
			System.out.println(e);
		}
	//using lambda expression	
		System.out.println("Traversing using lambda expression");
		l.forEach(e->System.out.println(e));
	}

}
