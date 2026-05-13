class Stadium{
	String name;
	boolean badmintonCourtThere;
	
	Stadium(){}
	
	Stadium(String name){
		this.name=name;
		System.out.println("Stadium Name with String Constructor..");
	}
	Stadium(boolean badmintonCourtThere){
		this.badmintonCourtThere=badmintonCourtThere;
		System.out.println("Stadium badminton Court There or Not with boolean Constructor..");
	}
	
}