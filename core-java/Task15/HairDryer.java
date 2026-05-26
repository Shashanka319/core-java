class HairDryer{
	String brand;
	double cost;
	 String origin;
	int quantity;
	boolean quality;
	
	HairDryer(){
		
	}
	
	HairDryer(String brand){
		this.brand=brand;
	}
	
	HairDryer(double cost){
		this.cost=cost;
	}
	
	HairDryer(String origin,int quantity){
		this.origin=origin;
		this.quantity=quantity;
	}
	
	HairDryer(int quantity){
		this.quantity=quantity;
	}
	
	HairDryer(boolean quality){
		this.quality=quality;
	}
}