package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet();
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(5);
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		set.remove(4);
		System.out.println(set);
		set.clear();
		System.out.println(set);

	}

}
