class Farmer{
	String name;
	boolean arachaLand;
	int age;
	int land;
	String locationofLand;
	String sonName;
	
	Farmer(String name, boolean arachaLand, int age, int land, String locationofLand, String sonName){
		this.name=name;
		this.arachaLand=arachaLand;
		this.age=age;
		this.land=land;
		this.locationofLand=locationofLand;
		this.sonName=sonName;
	}
	void getInfo(){
		
		System.out.println("name:"+this.name);
		System.out.println("arachaLand:"+this.arachaLand);
		System.out.println("age:"+this.age);
		System.out.println("land:"+this.land);
		System.out.println("locationofLand:"+this.locationofLand);
		System.out.println("sonName:"+this.sonName);
	}
}