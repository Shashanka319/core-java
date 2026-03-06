class Coach{
	String name;
	int age;
	double salary;
	String game;
	boolean good;
	Tennis tennis;
	Badminton badminton;
	Cricket cricket;
	Kabbaddi kabbaddi;
	FootBall football;
	
	Coach(String name,int age,double salary,String game,boolean good,
	Tennis tennis,Badminton badminton,Cricket cricket,Kabbaddi kabbaddi,FootBall football)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.good=good;
		this.game=game;
		this.tennis=tennis;
		this.badminton=badminton;
		this.cricket=cricket;
		this.kabbaddi=kabbaddi;
		this.football=football;
		
		System.out.println("Sccuessfull Acess All Instance variables...");
		}
}