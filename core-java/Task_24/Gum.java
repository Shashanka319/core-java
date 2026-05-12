class Gum{
	String type;
	String color;
	double cost;
	int quantity;
	boolean goodForHealth;
	boolean available;
	
	Gum(String type, String color, double cost, int quantity, boolean goodForHealth, boolean available){
		this.type=type;
		this.color=color;
		this.cost=cost;
		this.quantity=quantity;
		this.goodForHealth=goodForHealth;
		this.available=available;
	}
	void infoOfGum(){
		System.out.println("type:"+this.type);
		System.out.println("color:"+this.color);
		System.out.println("cost:"+this.cost);
		System.out.println("quantity:"+this.quantity);
		System.out.println("goodForHealth:"+this.goodForHealth);
		System.out.println("available:"+this.available);
	}
}