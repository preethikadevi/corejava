package operaor;

public class operator {

	public static void main(String[] args) {
		//assignment operator
		int num1,num2;
		num1=10;
		System.out.println(num1);
		num2=num1;
		System.out.println(num2);
		//arithmetic operator
		int output =num1+num2;
		System.out.println("num1+num2:"+output);
        int result=num1-num2;
        System.out.println("num1-num2:"+result);
        int out= num1*num2;
        System.out.println("num1*num2:"+out);
        int res=num1/num2;
        System.out.println("num1/num2:"+res);
        int put=num1%num2;
        System.out.println("num1%num2:"+put);
        double number=10;
        boolean flag=false;
        System.out.println("+number="+ ++number);
        System.out.println("+number="+ --number);
        System.out.println("!flag="+ !flag);
        System.out.println(++number);
        System.out.println(number--);
        System.out.println(number);
        if(num1>num2)
        {
        	 System.out.println("num1 is greater");
        }
        if(num1<num2)
        {
        	System.out.println("num2 is greater");
        }
        if(num1==num2)
        {
        	System.out.println("both are equal");
        }
        int num3=50;
        boolean result2;
        result2=(num1>num2)&&(num3>num1);
        System.out.println(result2);
        result2=(num1>num2)||(num3>num1);
        System.out.println(result2);
        int febdays=29;
        String display;
        display=(febdays==28)?"non leap":"leap";
        System.out.println(display);
        int a=5,b=6,c=0;
        c=a&b;
        System.out.println("a&b="+c);
        c=a|b;
        System.out.println("a|b="+c);
        c=a^b;
        System.out.println("a^b="+c);
        
        
	}

}
