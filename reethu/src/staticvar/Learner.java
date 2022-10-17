package staticvar;

 class Learner {
	int regno;
	String name;
	 static String ins="edubridge";//static used not to allocate memory each time as ins is same for all
	

	public Learner(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
	void display()
	{
		System.out.println(regno+" "+name+" "+ins);
	}


	public static void main(String[] args) {
		Learner l1=new Learner(147," ,"+"preethika");
		Learner l2=new Learner(148," ,"+"devi");
		l1.display();
		l2.display();
	}

}
