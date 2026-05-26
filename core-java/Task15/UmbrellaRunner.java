class UmbrellaRunner{
	public static void main(String[]args){
		Umbrella umbrella=new Umbrella("Toggale",28,34.7f,true,"Green","Steel");
		System.out.println("Umbrella Brand Name:"+umbrella.brandName);
		System.out.println("Umbrella Rib COunt:"+umbrella.ribCount);
		System.out.println("Umbrella Diameter:"+umbrella.diameter);
		System.out.println("Umbrella Is Open:"+umbrella.isOpen);
		System.out.println("Umbrella Color:"+umbrella.color);
		System.out.println("Umbrella Materieal:"+umbrella.material);
		
		Umbrella umbrella1=new Umbrella("Toggle");
		System.out.println("Umbrella Brand Name:"+umbrella1.brandName);
		
		Umbrella umbrella2=new Umbrella(45,"Toggle");
		System.out.println("Umbrella Rib COunt:"+umbrella2.ribCount);
		System.out.println("Umbrella Brand Name:"+umbrella2.brandName);
		
		
		Umbrella umbrella3=new Umbrella(56);
		System.out.println("Umbrella Rib Count:"+umbrella3.ribCount);
		
		Umbrella umbrella4=new Umbrella(45.5f);
		System.out.println("Umbrella Diameter:"+umbrella4.brandName);
		
		Umbrella umbrella5=new Umbrella();
		System.out.println("Umbrella Brand Name :"+umbrella5.brandName);
		System.out.println("Umbrella Rib Count :"+umbrella5.ribCount);
		System.out.println("Umbrella Diameter:"+umbrella5.diameter);
		System.out.println("Umbrella Color:"+umbrella5.color);
		System.out.println("Umbrella Is Open:"+umbrella5.isOpen);
		System.out.println("Umbrella Matetrial:"+umbrella5.material);
		
	}
}