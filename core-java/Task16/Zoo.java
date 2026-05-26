class Zoo{
	String name;
	double price;
	
	Zoo(){}
	
	Zoo(String name){
		this.name=name;
		System.out.println("Zoo Name with String constructor...");
	}
	Zoo(double price){
		this.price=price;
		System.out.println("Zoo price with double constructor...");
	}
}