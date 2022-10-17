package collectionframework;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedlistEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<String>();
		l.add("delhi");
		l.add("chennai");
		l.add("banglore");
		l.add("pune");
		Iterator itr=l.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  Iterator i=l.descendingIterator();
		  while(i.hasNext())  
		             {  
		                 System.out.println(i.next());  
		             }


	}

}
