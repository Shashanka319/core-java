class MuseumCreator{
	static void getMusem(){
		System.out.println("Create a deafult of Musem name and Price:");
		Musuem musuem = new Musuem();
		System.out.println("Museum Name:"+musuem.name);
		System.out.println("Museum Price"+musuem.price);
		System.out.println("Default of Museum Name and Price Successfully Created...");
	}
	static void getMusem(String name){
		System.out.println("Create a new Museum Name....");
		Musuem musuem=new Musuem(name);
		System.out.println("Museum Name:"+musuem.name);
		System.out.println("new Museum name is Successfully Created");
	}
	static void getMusem(double price){
		System.out.println("Create a new Museum Price....");
		Musuem musuem=new Musuem(price);
		System.out.println("Musuem Price:"+musuem.price);
		System.out.println("new Museum price is Successfully Created..");
	}
	
	
}