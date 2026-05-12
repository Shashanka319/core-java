class Ocean{
	static void oceanInfo(String oceanName,int oceanLength,float oceanWaterLevel,float oceanSalinity,String giants){
	
		System.out.println("Ocean Name:"+oceanName);
		System.out.println("Ocean Length"+oceanLength);
		System.out.println("Ocean Level:"+oceanWaterLevel);
		System.out.println("Ocean Salinity:"+oceanSalinity);
		System.out.println("Giants:"+giants);
		if(oceanName==null){
			System.out.println("Data is invalid, Make a Ocean Name is not null");
			return;
		}
		if(oceanLength<0){
			System.out.println("Data is Invalid...");
			return;
		}
		if(oceanWaterLevel<0){
			System.out.println("Data is invalid....");
			return;
		}
		if(oceanSalinity<0){
			System.out.println("Data is Invalid");
			return;
		}
		if(giants==null){
			System.out.println("Data is Invalid, Make a Giants not null");
			return;
		}
		System.out.println("Data is Valid..");
	}
}