class ChickenKabab extends Chicken{
	ChickenKabab(){
		super(2,480,"BTM");
	}
	ChickenKabab(int quantity,double price,String location){
		super (quantity,price,location);
	}
	ChickenKabab(int quantity,double price){
		super(quantity,price,"Bangalore");
	}
	
	
}
