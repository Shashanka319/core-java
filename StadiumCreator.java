class StadiumCreator{
	static void getStadium(){
		System.out.println("Create a default of getStadium Name and badmintonCourtThere...");
		Stadium stadium=new Stadium();
		System.out.println("Stadium name:"+stadium.name);
		System.out.println("Stadium badmintonCourtThere:"+stadium.badmintonCourtThere);
		System.out.println("Default of getStadium Name and badmintonCourtThere are Succussfully Created...");
	}
	static void getStadium(String name){
		System.out.println("Creation of Stadium Name...");
		Stadium stadium=new Stadium(name);
		System.out.println("Stadium Name:"+stadium.name);
		System.out.println("Stadium Name is Successfully Created...");
	}
	static void getStadium(boolean badmintonCourtThere){
		System.out.println("Creation of Stadium badmintonCourtThere...");
		Stadium stadium=new Stadium(badmintonCourtThere);
		System.out.println("Stadium badmintonCourtThere:"+stadium.badmintonCourtThere);
		System.out.println("Stadium badmintonCourtThere is Successfully Created...");
	}
	

}