class MapStoreRunner{
		public static void main(String[] args){
		Map map = new Map("Road Map","Bangalore",280,"Channagiri",true,"Bike");
		Map map1 = new Map("Satelite","Bangalore",260,"Chitradurga",true,"Bus");
		Map map2 = new Map("Road Map","Bangalore",360,"Davanagere",true,"Bus");
		Map map3 = new Map("Satelite","Bangalore",260,"Chitradurga",true,"Bus");
		Map map4 = new Map("Road Map","Bangalore",860,"Kalburgi",true,"Bus");
		Map map5 = new Map("Road Map","Bangalore",700,"mantralaya",true,"Bus");
		Map map6 = new Map("Satelite","Bangalore",300,"Shivmoga",true,"Train");
		Map map7 = new Map("Road Map","Bangalore",1500,"Delhi",true,"Flight");
		Map map8 = new Map("Satelite","Bangalore",2900,"Jamuu and Kashmira",true,"Flight");
		Map map9 = new Map("Road Map","Bangalore",1500,"Rajastan",true,"Train");
		map.mapInfo();
		
		Map[] informations=new Map[10];
		MapStore save= new MapStore(informations);
		save.savemapInfo(map);
		
		map1.mapInfo();
		save.savemapInfo(map1);
		
		map2.mapInfo();
		save.savemapInfo(map2);
		
		map3.mapInfo();
		save.savemapInfo(map3);
		
		map4.mapInfo();
		save.savemapInfo(map4);
		
		map5.mapInfo();
		save.savemapInfo(map5);
		
		map6.mapInfo();
		save.savemapInfo(map6);
		
		map7.mapInfo();
		save.savemapInfo(map7);
		
		map8.mapInfo();
		save.savemapInfo(map8);
		
		map9.mapInfo();
		save.savemapInfo(map9);
	}
}