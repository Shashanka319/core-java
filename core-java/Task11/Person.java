class Person{
	static void contactInfo(String name,String[] emails,long[] mobileNumbers,String address){
		System.out.println("Name of the Person:"+name);
		for(int i=0;i<emails.length;i++)
		System.out.println("Person Email:"+emails[i]);
		for(int j=0;j<mobileNumbers.length;j++)
		System.out.println("Person Mobile Number:"+mobileNumbers[j]);
		System.out.println("Person Address:"+address);
		if(name==null){
			System.out.println("Data is Invalid...");
			return;
		}
		if(emails==null){
			System.out.println("Data is Invalid...");
			return;
		}
		if(mobileNumbers==null){
			System.out.println("Data is Invalid...");
			return;
		}
		if(address==null){
			System.out.println("Data is Invalid...");
			return;
		}
		System.out.println("Data is Valid...");
		
	}
	static void foodDish(String name,String[] ingredients){
		System.out.println("Fooddish Name:"+name);
		for(int a=0;a<ingredients.length;a++)
		System.out.println("Fooddish Ingredients:"+ingredients[a]);
		if(name==null){
			System.out.println("Data is Invalid");
			return;
		}
		if(ingredients==null){
			System.out.println("Data is Invalid");
			return;
		}
		System.out.println("Data is Valid");
			
	}
	static void laptop(String brand,String model,String[] ports,String[] countriesOfWarranty){
		System.out.println("Laptop Brand:"+brand);
		System.out.println("Model:"+model);
		for(int b=0;b<ports.length;b++)
		System.out.println("Ports:"+ports[b]);
		for(int c=0;c<countriesOfWarranty.length;c++)
		System.out.println("Countries Of Warrenty:"+countriesOfWarranty[c]);
		if(brand==null){
			System.out.println("Data is Invalid");
			return;
		}
		if(model==null){
			System.out.println("Data is Invalid");
			return;
		}
		if(ports==null){
			System.out.println("Data is Invalid");
			return;
		}
		if(countriesOfWarranty==null){
			System.out.println("Data is Invalid");
			return;
		}
		System.out.println("Data is Valid");
		
	}

}