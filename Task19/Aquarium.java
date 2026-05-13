class Aquarium{
	String name;
	double price;
	boolean attractive;
	boolean holiday;
	String location;
	AquariumType type;
	AquariumSpecies species;
	WaterEnvironment water;
	AqueriumMaintainance maintainance; 
	AquariumEquipment equipment;
	
	Aquarium(String name,double price,boolean attractive,boolean holiday,String location,
	AquariumType type,AquariumSpecies species,WaterEnvironment water,AqueriumMaintainance maintainance, AquariumEquipment equipment)
	{
		this.name=name;
		this.price=price;
		this.attractive=attractive;
		this.holiday=holiday;
		this.location=location;
		this.type=type;
		this.species=species;
		this.water=water;
		this.maintainance=maintainance;
		this.equipment=equipment;
	}
	void getInfo(){
		System.out.println("name:"+this.name);
		System.out.println("price:"+this.price);
		System.out.println("attractive:"+this.attractive);
		System.out.println("holiday:"+this.holiday);
		System.out.println("location:"+this.location);
		System.out.println("type:"+this.type);
		System.out.println("species:"+this.species);
		System.out.println("water:"+this.water);
		System.out.println("maintainance:"+this.maintainance);
		System.out.println("equipment:"+this.equipment);
		
		if(type !=null){
			type.gettype("Small","blue");
		}else
		{
			System.out.println("type is not null");
		}
		if(species !=null){
			species.getspecies("Fish species",5);
		}else
		{
			System.out.println("species is not null");
		}
		if(water !=null){
			water.getwater(true,"Mysore Auarium",200);
		}else
		{
			System.out.println("water is not null");
		}
		if(maintainance !=null){
			maintainance.getmaintanance(true,0);
		}else
		{
			System.out.println("maintainance is not null");
		}
		if(equipment !=null){
			equipment.getequipment(false,"Mysore",null);
		}else
		{
			System.out.println("equipment is not null");
		}
	}
	
	
	
}