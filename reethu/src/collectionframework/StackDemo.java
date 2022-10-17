package collectionframework;
import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> S=new Stack<Integer>();
		Stack<String> A=new Stack<String>();
		S.push(15);
		S.push(25);
		S.push(45);
		S.push(85);
		S.push(65);
		S.push(35);
		A.push("orange");
		A.push("mango");
		A.push("apple");
		A.push("lemon");
		System.out.println("Initial Stack:" +S);
		System.out.println("Popped element:" +S.pop());
		System.out.println("Popped element:" +S.pop());
		System.out.println("Stack after Pop :" +S);
		System.out.println("Peek:" +S.peek());
		System.out.println("Stack after peek:" +S);
		System.out.println("Initial String:" +A);
		System.out.println("Popped element:" +A.pop());
		System.out.println("element at zero position:" +A.get(0));
		System.out.println("remove element at first position:" +A.remove(1));
		System.out.println("After operation String:" +A);
		System.out.println(A.isEmpty());
	
	}

}
