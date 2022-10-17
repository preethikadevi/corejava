package string;

public class Stringmethod {

	public static void main(String[] args) {
	String a="  jAva";
	System.out.println("String a="+a);
	String b=new String("HAPPY");
	System.out.println("String b="+b);
	System.out.println("The length of the String:"+a.length());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a+b);
	System.out.println(a.concat(b));
	System.out.println("character at position 3:"+a.charAt(5));
	System.out.println(a.equals(b));
	System.out.println(a.equalsIgnoreCase(b));
	System.out.println(a.compareTo(b));
	System.out.println(a.contains("e"));
	
	
	}

}
