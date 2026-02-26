class StrawberryRunner{
	public static void main(String[] args){
		Strawberry strawberry= new Strawberry();
		System.out.println("Strawberry :"+strawberry. variety);
		System.out.println("Strawberry :"+strawberry.size);
		System.out.println("Strawberry :"+strawberry.weight);
		System.out.println("Strawberry :"+strawberry.isOrganic);
		System.out.println("Strawberry :"+strawberry.originCountry);
		
		
		Strawberry strawberry1= new Strawberry("red color","medium",4.5f,true,"USA");
		System.out.println("Strawberry :"+strawberry1. variety);
		System.out.println("Strawberry :"+strawberry1.size);
		System.out.println("Strawberry :"+strawberry1.weight);
		System.out.println("Strawberry :"+strawberry1.isOrganic);
		System.out.println("Strawberry :"+strawberry1.originCountry);
		
		Strawberry strawberry2= new Strawberry("Red");
		System.out.println("Strawberry :"+strawberry2. variety);
		
		Strawberry strawberry3= new Strawberry(3.8f,true);
		System.out.println("Strawberry :"+strawberry3. weight);
		System.out.println("Strawberry :"+strawberry3. isOrganic);
		
		Strawberry strawberry4= new Strawberry(3.8f);
		System.out.println("Strawberry :"+strawberry4. weight);
		
		Strawberry strawberry5= new Strawberry(true);
		System.out.println("Strawberry :"+strawberry3. isOrganic);
		
		
		
	}
}