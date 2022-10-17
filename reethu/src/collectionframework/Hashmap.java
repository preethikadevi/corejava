package collectionframework;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "pink");
		map.put(2, "yellow");
		map.put(3, "violet");
		map.put(4, "blue");
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(3));
		System.out.println(map.get(2));
		System.out.println(map.replace(4, "red"));
		System.out.println(map);
		System.out.println(map.containsValue("blue"));
		System.out.println(map.get(3));
		System.out.println(map.put(5, "black"));
		System.out.println(map);
		System.out.println(map.replace(1, "white"));
		System.out.println(map);
		System.out.println(map.hashCode());
		System.out.println(map.equals(2));
		System.out.println(map.size());
		System.out.println(map.remove(3, "violet"));
		System.out.println(map);
		if(!map.containsValue("blue")) {
		      
		      map.put(1,"blue");
		    }

		    System.out.println("Updated HashMap:\n" + map);

		map.clear();
		System.out.println(map);
		

	}

}
