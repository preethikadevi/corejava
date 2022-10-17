package arraylist;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		ArrayList<Integer> I=new ArrayList<Integer>();
		list.add("preethika");
		list.add(1,"devi");
		
		System.out.println("list of elements: "+list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.clone());
		System.out.println(list.indexOf(I));
	}

}
