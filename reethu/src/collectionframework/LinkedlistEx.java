package collectionframework;

import java.util.LinkedList;

public class LinkedlistEx {

	public static void main(String[] args) {
	LinkedList<String> b=new LinkedList<String>();
	b.add("parrot");
	b.add("peacock");
	b.add("penguin");
	b.add("parrot");
	System.out.println("Elements in linkedlist:" +b);
	b.add(1,"sparrow");
	System.out.println("After insertion:" +b);
	b.remove(0);
	System.out.println("after removing:"+b);
	b.remove("penguin");
	System.out.println("after penguin removal:"+b);
	b.add("chikoo");
	b.add("dove");
	System.out.println("after insertion:" +b);
	b.removeFirst();
	System.out.println("removing first:"+b);
	b.add("chikoo");
	System.out.println("after chikoo insertion:"+b);
	b.removeLastOccurrence("chikoo");
	System.out.println("removing last occurance:"+b);
	b.clear();
	System.out.println("after clear method:"+b);
	b.addLast("parrot");
	System.out.println(b);
	}

}
