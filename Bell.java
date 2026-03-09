class Bell{
	int noOfBell;
	String name;
	int quantity;
	double price;
	boolean quality;
	BellType type;
	BellColor color;
	BellCompany company;
	Clock alaram;
	Cycle bell;
	
	Bell(int noOfBell,String name,int quantity,double price,boolean quality,
	BellType type,BellColor color,BellCompany company,Clock alaram,Cycle bell)
	{
		this.noOfBell=noOfBell;
		this.name=name;
		quantity=quantity;
		price=price;
		quality=quality;
		type=type;
		color=color;
		company=company;
		alaram=alaram;
		bell=bell;
		System.out.println("Access the instance variables with both primitive and non Primitive Data Types");
	}
	
	
}