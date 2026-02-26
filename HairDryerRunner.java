class HairDryerRunner{
	public static void main(String[] args){
		HairDryer hairDryer=new HairDryer();
		System.out.println("HairDryer:"+hairDryer.brand);
		System.out.println("HairDryer:"+hairDryer.cost);
		System.out.println("HairDryer:"+hairDryer.origin);
		System.out.println("HairDryer:"+hairDryer.quantity);
		System.out.println("HairDryer:"+hairDryer.quality);
		
		HairDryer hairDryer1=new HairDryer("Shark");
		System.out.println("hairDryer Brand:"+hairDryer1.brand);
		
		HairDryer hairDryer2=new HairDryer(250.5);
		System.out.println("hairDryer cost"+hairDryer2.cost);
		
		HairDryer hairDryer3=new HairDryer("Bangalore",3);
		System.out.println("hairDryer origin"+hairDryer3.origin);
		System.out.println("hairDryer origin"+hairDryer3.quantity);
		
		
		HairDryer hairDryer4=new HairDryer(2);
		System.out.println("hairDryer quantity"+hairDryer4.quantity);
		
		HairDryer hairDryer5=new HairDryer(true);
		System.out.println("hairDryer quality"+hairDryer5.quality);
		
		
		
		
		
	}
}