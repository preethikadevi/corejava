package string;

public class Compare1 {

	public static void main(String[] args) {

		String s1="laptop";
		String s2="lap";
        int h=s1.compareToIgnoreCase(s2);
        if(h==0)
        {
        	System.out.println("equals");
        }
        else if(h>0)
        {
        	System.out.println("s1 is greater");
        }
        else
        {
        	System.out.println("s2 is greater");
        }
        System.out.println(h==0?"equals":(h>0?"s1":"s2"));
	}

}
