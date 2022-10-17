package collectionframework;

import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("two");
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		set.clear();
		System.out.println(set);

	}

}
