class SportsShop{
	static void get(int shuttle,String rocketName){
		System.out.println("Number of Shuttle:"+shuttle);
		System.out.println("shuttle Rocket Name"+rocketName);
		if(shuttle<0){
			System.out.println("Data is Invalid...");
			return;
		}
		if(rocketName==null){
			System.out.println("Data is Invali....");
			return;
		}
		System.out.println("Data is Valid.......");
	}
	static void get(String rocketName,int shuttle){
		System.out.println("Rockets Name:"+rocketName);
		System.out.println("no Of Shuttle:"+shuttle);
		if(rocketName==null){
			System.out.println("Data is Invalid...");
			return;
		}
		if(shuttle<0){
			System.out.println("Data is Invalid....");
			return;
		}
		System.out.println("Data is Valid");
	}
	static void get(int shuttle,String rocketName,int numberOfRockets){
		System.out.println("Number Of Shuttle:"+shuttle);
		System.out.println("Rocket Name:"+rocketName);
		System.out.println("Number Of  Rocket:"+numberOfRockets);
		if(shuttle<0){
			System.out.println("Data is Invalid.....");
			return;
		}
		if(rocketName==null){
			System.out.println("Data is Invalid....");
			return;
		}
		if(numberOfRockets<0){
			System.out.println("Data ia Invalid...");
			return;
		}
		System.out.println("Data is Valid..");
	}
}