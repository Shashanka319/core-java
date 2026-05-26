class LionRunner{
	public static void main(String[] args){
		LionType type=new LionType();
		LionEyeColor eyeColor = new LionEyeColor();
		Zoo zoo = new Zoo("Bannerugatta","Lion",150,"Cornivours",7,true);
		Cornivours cornivours = new Cornivours();
		King king =new King();
		Lion lion = new Lion(5,"Lion","Bannerugatta",true,80,type,eyeColor,zoo,cornivours,king);
		type.getInfo("Lion",8,"Cornivours");
		eyeColor.getColor("Brown");
		zoo.getInfoOfZoo();
		cornivours.getData("Lion",true,"deer");
		King.kingOfWild("Nagarahole","Lion",true,true);
	
	}
}