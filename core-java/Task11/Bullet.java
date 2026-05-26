class Bullet{
	static int component(int caliber,double powderGrains,boolean isRimfire){
		System.out.println("Caliber of Bullet in Inches:"+caliber);
		System.out.println("Weight of the Bullet in Grains:"+powderGrains);
		System.out.println("Bullet is Imfire:"+isRimfire);
		if(caliber<0){
			System.out.println("Data is Invalid..");
			return 98;
		}
		if(powderGrains<0){
			System.out.println("Data is Invalid..");
			return 98;
		}
		if(isRimfire==false){
			System.out.println("Data is Invalid..");
			return true;
		
		System.out.println("Data is valid...");
		return 97;		
	}
	static float Spin(int twisrate){
		System.out.println("Suitcase Color Name:"+colorName);
		if(colorName==null){
			System.out.println("Data is Invalid.....");
			return 5.9;
		}
		System.out.println("Data is Valid...");
		return 68.6;
	}
	static String getType(String suitcaseType){
		System.out.println("Suitcase Type:"+suitcaseType);
		if(suitcaseType==null){
			System.out.println("Data is Invalid.....");
			return "5";
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
			return 5;
		}
		System.out.println("Data is Valid...");
		
		return 0;
		
	}
}