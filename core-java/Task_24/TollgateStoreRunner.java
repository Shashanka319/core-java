class TollgateStoreRunner{
	public static void main(String[] args){
		Tollgate toll=new Tollgate("Tumkur",115,"Truck",true,false,"Satish");
		Tollgate toll1=new Tollgate("Hiriyur",115,"Bus",true,false,"Ganesh");
		Tollgate toll2=new Tollgate("Bangalore",155,"Jeep",true,false,"Satish");
		Tollgate toll3=new Tollgate("Belagam",175,"Truck",true,false,"Satish");
		Tollgate toll4=new Tollgate("Ballary",250,"Van",true,false,"Satish");
		Tollgate toll5=new Tollgate("Hampi",115,"car",true,false,"Satish");
		Tollgate toll6=new Tollgate("Hospete",115,"Truck",true,false,"Satish");
		Tollgate toll7=new Tollgate("Mangalore",115,"Truck",true,false,"Satish");
		Tollgate toll8=new Tollgate("Vijaypur",115,"Jeep",true,false,"Satish");
		Tollgate toll9=new Tollgate("Hubballi",115,"Bus",true,false,"Satish");
		toll.info();
		Tollgate[] saves = new Tollgate[10];
		TollgateStore stores=new TollgateStore(saves);
		stores.storeTollInfo(toll);
		
		toll1.info();
		stores.storeTollInfo(toll1);
		toll2.info();
		stores.storeTollInfo(toll2);
		toll3.info();
		stores.storeTollInfo(toll3);
		toll4.info();
		stores.storeTollInfo(toll4);
		toll5.info();
		stores.storeTollInfo(toll5);
		toll6.info();
		stores.storeTollInfo(toll6);
		toll7.info();
		stores.storeTollInfo(toll7);
		toll8.info();
		stores.storeTollInfo(toll8);
		toll9.info();
		stores.storeTollInfo(toll9);
		
	}
}