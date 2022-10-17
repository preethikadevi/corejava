package avg;

public class Avg {
	public static void main(String[] args) {
	int[] num= new int[5];
	num[0]=15;
	num[1]=16;
	num[2]=17;
	num[3]=18;
	num[4]=19;
	double avg=0.0;
	int sum=0;
	for(int i=0;i<5;i++)
		sum=sum+num[i];
	avg=(double)sum/5;
	 System.out.println("sum of five numbers:"+sum);
	 System.out.println("average of five numbers:"+avg);

	}

}
