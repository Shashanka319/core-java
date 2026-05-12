class CarromRunner{
	public static void main(String [] args){
		Carrom carrom = new Carrom();
		System.out.println("Carrom Board Type:"+carrom.boardType);
		System.out.println("Carrom thicknessMm :"+carrom.thicknessMm);
		System.out.println("Carrom includesCoins :"+carrom.includesCoins);
		System.out.println("Carrom brand:"+carrom.brand);
		System.out.println("Carrom price:"+carrom.price);
		
		Carrom carrom1= new Carrom("Squre",5,true,"Stricker",1500);
		System.out.println("Carrom Board Type:"+carrom1.boardType);
		System.out.println("Carrom thicknessMm :"+carrom1.thicknessMm);
		System.out.println("Carrom includesCoins :"+carrom1.includesCoins);
		System.out.println("Carrom brand:"+carrom1.brand);
		System.out.println("Carrom price:"+carrom1.price);
		
		
		Carrom carrom2= new Carrom("Stricker",1500);
		System.out.println("Carrom Brand:"+carrom2.brand);
		System.out.println("Carrom Brand:"+carrom2.price);
		
		Carrom carrom3= new Carrom(5);
		System.out.println("Carrom Brand:"+carrom3.thicknessMm);
		
		Carrom carrom4= new Carrom("Stricker");
		System.out.println("Carrom Brand:"+carrom4.brand);
		
		Carrom carrom5= new Carrom(true);
		System.out.println("Carrom Brand:"+carrom5.includesCoins);
		
	}
}