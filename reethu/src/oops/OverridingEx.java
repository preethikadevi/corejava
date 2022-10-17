package oops;
class Bank
{
	int gerRateOfInterest()
	{
		return 0;
	}}
	class SBI extends Bank
	{
		int getRateOfInterest()
		{
			return 1;
		}}
	class ICICI extends Bank
	{
		int getRateOfInterest()
	
		{
			return 12;
		}}
		class AXIS extends Bank
		{
			int getRateOfInterest()
		
			{
				return 25;
			}
}

public class OverridingEx {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println("SBI rate of interest:"+s.getRateOfInterest());
		System.out.println("ICICI rate of interest:"+i.getRateOfInterest());
		System.out.println("AXIS rate of interest:"+a.getRateOfInterest());
	}

}
