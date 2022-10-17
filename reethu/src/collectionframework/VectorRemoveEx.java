package collectionframework;//refer javapoint
import java.util.*;
public class VectorRemoveEx {

	public static void main(String[] args) {
		Vector<Integer> in=new Vector< >();
		in.add(15);
		in.add(25);
		in.add(15);
		in.add(45);
		System.out.println("vector values:"+in);
		System.out.println("Remove first occurance of element:"+in.remove((Integer)15));
		System.out.println("vector values:"+in);
		System.out.println(in.capacity());
		System.out.println(in.isEmpty());
		System.out.println(in.firstElement());
		System.out.println(in.hashCode());
		System.out.println(in.size());
		System.out.println(in.getClass());
		System.out.println(in.lastElement());
		System.out.println(in.clone());
		System.out.println(in.contains(5));
	
		in.clear();
		System.out.println(in);

	}

}
