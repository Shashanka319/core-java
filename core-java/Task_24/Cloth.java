class Cloth{
	String type;
	String name;
	double price;
	int quantity;
	boolean quality;
	boolean available;
	
	Cloth(String type,String name, double price, int quantity,boolean quality, boolean available){
		this.type=type;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		this.available=available;
	}
	void clothInfo(){
		System.out.println("Type:"+this.type);
		System.out.println("Name:"+this.name);
		System.out.println("Price:"+this.price);
		System.out.println("quality:"+this.quality);
		System.out.println("Quantity:"+this.quantity);
		System.out.println("Available:"+this.available);
		
	}
}