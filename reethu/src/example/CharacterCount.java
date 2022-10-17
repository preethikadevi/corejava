package example;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		char a[]= {'a','c','d','c','r','e','d','l','c'};
		HashMap<Character ,Integer> obj= CharacterCount.countcharacter(a);

	}
static HashMap<Character,Integer> countcharacter (char a[]){
	

HashMap<Character,Integer> obj=new  HashMap<Character, Integer> ();
for(char c:a) {
if (obj.containsKey(c)) {

	obj.put(c, obj.get(a)+1);
}else
	obj.put(c, 1);
}
return obj;
}
}


