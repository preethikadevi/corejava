package string;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		String s1=new String("java");
        String s2=new String("java");
        if(str==s1)
        	System.out.println("both are equal");
        else
        	System.out.println("not equal");
        if(str.equals(s1))
        	System.out.println("both are equal");
        else
        	System.out.println("not equal");
        System.out.println(s1.length());
	}

}
