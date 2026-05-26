class AquariumRunner{
	public static void main(String[]args){
		AquariumType type=new AquariumType();
		AquariumSpecies species= new AquariumSpecies();
		WaterEnvironment water = new WaterEnvironment();
		AqueriumMaintainance maintainance = new AqueriumMaintainance();
		AquariumEquipment equipment=new AquariumEquipment();
		Aquarium aquarium = new Aquarium("Mysore",200,true,false,"Mysore",type,null,water,maintainance,equipment);
		aquarium.getInfo();
	}
}