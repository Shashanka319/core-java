class VillegeDetailes{
	static void get(int noOfPeople){
		System.out.println("Number Of Pepole In Villege:"+noOfPeople);
		if(noOfPeople<0){
			System.out.println("Data is invalid....");
			return;
		}
		System.out.println("Data is Valid");
	}
	static void get(String peopleName){
		System.out.println("People Name:"+peopleName);
		if(peopleName==null){
			System.out.println("Data is Invali...");
			return;
		}
		System.out.println("Data is Valid");
	}
}