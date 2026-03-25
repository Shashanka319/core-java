class FarmerStoreRunner{
	public static void main(String[] args){
		Farmer farmer=new Farmer("Kumar",true,46,2,"Hodigere","Shashank");
		Farmer farmer1=new Farmer("Nagaraj",true,57,2,"Hodigere","Sangam");
		Farmer farmer2=new Farmer("Ramappa",true,58,3,"Benkikere","Prasanna");
		Farmer farmer3=new Farmer("Moodlappa",true,60,2,"Yaragattihalli","Kishor");
		Farmer farmer4=new Farmer("Devraj",false,58,0,"Hodigere","Avinash");
		Farmer farmer5=new Farmer("Kenchappa",true,59,1,"Hodigere","Chandru");
		Farmer farmer6=new Farmer("Danvir",false,45,2,"Nallur","Sathish");
		Farmer farmer7=new Farmer("Siddappa",false,72,4,"Talya","Paramesh");
		Farmer farmer8=new Farmer("Ashok",true,62,2,"Talya","Sanju");
		Farmer farmer9=new Farmer("Rajjappa",true,68,3,"Hodigere","Santhu");
		farmer.getInfo();
		Farmer[] farmers=new Farmer[10];
		FarmerStore farmerStore= new FarmerStore(farmers);
		farmerStore.storeInfo(farmer);
	}
}