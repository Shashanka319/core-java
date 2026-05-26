class ZooCreator{
	static void getZoo(){
		System.out.println("Create a default of Zoo Name and Price...");
		Zoo zoo=new Zoo();
		System.out.println("Zoo name:"+zoo.name);
		System.out.println("ZOo Price:"+zoo.price);
		System.out.println("Default of Zoo Name and Price are Succussfully Created...");
	}
	static void getZoo(String name){
		System.out.println("Creation of Zoo Name...");
		Zoo zoo=new Zoo(name);
		System.out.println("Zoo Name:"+zoo.name);
		System.out.println("Zoo Name is Successfully Created...");
	}
	static void getZoo(double price){
		System.out.println("Creation of Zoo Price...");
		Zoo zoo=new Zoo(price);
		System.out.println("Zoo Price:"+zoo.price);
		System.out.println("Zoo Price is Successfully Created...");
	}
	
}