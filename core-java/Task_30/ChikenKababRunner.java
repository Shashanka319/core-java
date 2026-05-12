class ChikenKababRunner{
	public static void main(String[] values){
		ChickenKabab chickenKabab = new ChickenKabab();
		System.out.println("The Chicken Quantity:"+chickenKabab.quantity);
		System.out.println("The Chicken Price:"+chickenKabab.price);
		System.out.println("The Chicken Location:"+chickenKabab.location);
		
		
		System.out.println("--------->>>>>>>>>");
		
		ChickenKabab chickenKabab1=new ChickenKabab(3,540,"Mysore");
		System.out.println("The Chicken Quantity:"+chickenKabab1.quantity);
		System.out.println("The Chicken Price:"+chickenKabab1.price);
		System.out.println("The Chicken Location:"+chickenKabab1.location);
		
		System.out.println("-------->>>>>>>>>>>>>");
		
		ChickenKabab chickenKabab2 = new ChickenKabab(4,850);
		System.out.println("The Chicken Quantity:"+chickenKabab2.quantity);
		System.out.println("The Chicken Price:"+chickenKabab2.price);
		System.out.println("The Chicken Location:"+chickenKabab2.location);
		
		
		
	}
}