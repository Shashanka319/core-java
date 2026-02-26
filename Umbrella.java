class Umbrella{
	String brandName;
	int ribCount;
	float diameter;
	boolean isOpen;
	String color;
	String material;
	
	Umbrella(String brandName,int ribCount,float diameter,boolean isOpen,String color,String material){
		this.brandName=brandName;
		this.ribCount=ribCount;
		this.diameter=diameter;
		this.isOpen=isOpen;
		this.color=color;
		this.material=material;
	}
	Umbrella(String brandName){
		this.brandName=brandName;
	}
	Umbrella(int ribCount,String brandName){
		this.ribCount=ribCount;
		this.brandName=brandName;
	}
	Umbrella(int ribCount){
		this.ribCount=ribCount;
	}
	Umbrella(float diameter){
		this.diameter=diameter;
	}
	Umbrella(){
		
	}
	
}