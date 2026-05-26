class Motor{
	String name;
	int noOfMotor;
	boolean good;
	String color;
	double cost;
	MotorModel model;
	MotorType type;
	MotorColor motorColor;
	Bike bike;
	Bore bore;
	
	Motor(String name,int noOfMotor,boolean good,String color,double cost,
	MotorModel model,MotorType type,MotorColor motorColor,Bike bike,Bore bore)
	{
		this.name=name;
		this.noOfMotor=noOfMotor;
		this.good=good;
		this.color=color;
		this.cost=cost;
		this.model=model;
		this.type=type;
		this.motorColor=motorColor;
		this.bike=bike;
		this.bore=bore;
		System.out.println("Access the all Intances Variables with both primitive and Non primitive Data types....");
	}
}