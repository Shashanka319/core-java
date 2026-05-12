class Biscuit{
	static int getCost(String name){
		System.out.println("Biscuit Name:"+name);
		if(name==null){
			System.out.println("Name is Invalid....");
			return 0;
		}
		System.out.println("Name is Valid...");
		
		
		if(name=="Parle-g"){
			return 10;
		}
		
		if(name=="Oreo"){
			
			return 10;
		}
		if(name=="Good Day"){
			return 20;
		}
		if(name=="Krak Jack"){
			return 20;
		}
		
		return 0;
	}

	static String getShape(String name){
		
		if(name=="Parle-g"){
			return "Rectangle";
		}
		
		if(name=="Oreo"){
			
			return "Circle";
		}
		if(name=="Good Day"){
			return "Circle";
		}
		if(name=="Krak Jack"){
			return "Squre";
		}
		
		return "ddg";
		
	}
	static String[] getFlavours(String name)
	{
		System.out.println("Executing getShape in Biscuit...");
		System.out.println("Name : "+name);
		if(name==null)
		{
			System.out.println("Name is invalid..");
			return null;
		}
		
		if(name=="parle-G")
		{
			String[] parleGFlavour={"Regular","Vanilla"};
			return parleGFlavour;
		}
		
		
		return null;
	}
	

}