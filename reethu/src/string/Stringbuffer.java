package string;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("reading");
		s1.append("Emergency");
        System.out.println(s1);
		s1.insert(16,"Technology");
		System.out.println(s1);
		s1.replace(7, 14, "cry");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println(s1.capacity());

	}

}
