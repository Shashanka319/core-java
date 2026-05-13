class Musuem{
	String name;
	double price;
	
	Musuem(){}
	Musuem(String name){
		this.name=name;
		System.out.println("Musuem name with String Constructor");
	}
	Musuem(double price){
		this.price=price;
		System.out.println("Museum Price with double Constructor...");
	}
}