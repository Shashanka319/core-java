class WaterFall{
	static void info(String nameOfWaterfall,float height,double flowRate,boolean isHydrelectric,String formationTypes){
		System.out.println("Water Fall Name:"+nameOfWaterfall);
		System.out.println("Height:"+height);
		System.out.println("Flow Rate:"+flowRate);
		System.out.println("Is Hydrelectric:"+isHydrelectric);
		System.out.println("Types of Formation:"+formationTypes);
		if(nameOfWaterfall==null){
			System.out.println("Data is Invalid,Make a WaterFall Name is not Null");
			return;
		}
		if(height<0){
			System.out.println("Data is Invalid...");
			return;
		}
		if(flowRate<0){
			System.out.println("Data is Invalid...");
			return;
		}
		if(isHydrelectric==false){
			System.out.println("Data is Invalid..");
			return;
		}
		if(formationTypes==null){
			System.out.println("Data is Invalid,Make a Formation Types Not a Null");
			return;
		}
		System.out.println("Data is Valid..");
		
	}
	static void stateOwninginfo(String stateNmae,float totalPopulation,double annualGDP,float literacyRate,boolean isLandLocked,int stateCode){
		System.out.println("State Name:"+stateNmae);
		System.out.println("Total Population in crores:"+totalPopulation);
		System.out.println("Annual GDP in lackcrore:"+annualGDP);
		System.out.println("Literacy Rate in percentage:"+literacyRate);
		System.out.println("Is LandLocked:"+isLandLocked);
		System.out.println("State Code:"+stateCode);
		if(stateNmae==null){
			System.out.println("Data is Invalid,make a State Name is Not Null");
			return;
		}
		if(totalPopulation<0){
			System.out.println("Data is Invalid");
			return;
		}
		if(annualGDP<0){
			System.out.println("Data is Invalid");
			return;
		}
		if(literacyRate<0){
			System.out.println("Data is Invalid");
			return;
		}
		if(isLandLocked==false){
			System.out.println("Data is Invalid");
			return;
		}
		if(stateCode<0){
			System.out.println("Data is Invalid, Make a State Code is Not Null");
			return;
		}
		System.out.println("Data is Valid");
		
	}
}