package multipleinheritancee;

class Machine implements MachineTV,MachineFAN,MachineFridge
{
	public void TV()
	{
		System.out.println("TV is Working");
	}
	public void FAN()
	{
		System.out.println("FAN is Working");
	}
	public void Fridge()
	{
		System.out.println("Fridge is Working");
	}
}

public class Multi 
{
	public static void main(String[] args) {
		Machine m=new Machine();
		m.TV();
		m.FAN();
		m.Fridge();

	}

}
