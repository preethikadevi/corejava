package collectionframework;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		ArrayList<Integer> l=new ArrayList<Integer>();
		list.add("preethika");
		list.add(1,"devi");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list);
		Iterator itr=l.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		
		  }

		
	}
	}


