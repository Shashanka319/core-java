class Suitcase{
	static int getLength(int suitcaseLength){
		System.out.println("Suitcase Length:"+suitcaseLength);
	
		if(suitcaseLength<0){
			System.out.println("Data is Invalid..");
			return 7;
		}
		System.out.println("Data is valid...");
		return 97;		
	}
	static String getColor(String colorName){
		System.out.println("Suitcase Color Name:"+colorName);
		if(colorName==null){
			System.out.println("Data is Invalid.....,");
			return "rhf";
		}
		System.out.println("Data is Valid...");
		return "fd";
	}
	static String getType(String suitcaseType){
		System.out.println("Suitcase Type:"+suitcaseType);
		if(suitcaseType==null){
			System.out.println("Data is Invalid.....");
			return "jsdk";
		}
		System.out.println("Data is Valid...");
		return "jy";
	}
	static boolean isEmpty(boolean suitcaseIsEmpty){
		System.out.println("Suitcase Is Empty:"+suitcaseIsEmpty);
		if(suitcaseIsEmpty==false){
			System.out.println("Data is Invalid.....");
			return true;
		}
		System.out.println("Data is Valid...");
		
		return true;
		
	}
	static int getNoOfCloth(int noOfCloth){
		System.out.println("Number Of Cloths:"+noOfCloth);
		if(noOfCloth<0){
			System.out.println("Data is Invalid.....");
			return 84;
		}
		System.out.println("Data is Valid...");
		
		return 0;
		
	}
}