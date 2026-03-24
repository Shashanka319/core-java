class Cap{
	String capName;
	double cost;
	int quantity;
	boolean quality;
	String type;
	String color;
	
	Cap(String capName,double cost,int quantity,boolean quality,String type,String color){
		this.capName=capName;
		this.cost=cost;
		this.quantity=quantity;
		this.quality=quality;
		this.type=type;
		this.color=color;
	}
	void capInfo(){
		System.out.println("Cap Name:"+capName);
		System.out.println("Cap Cost:"+cost);
		System.out.println("Cap Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		System.out.println("Cap Type:"+type);
		System.out.println("Cap Color:"+color);
	}
}