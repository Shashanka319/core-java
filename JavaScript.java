class JavaScript{
	
	int countFlies;
	String type;
	
	JavaScript(int countFlies, String type){
		
		this.countFlies=countFlies;
		this.type=type;
	}
	void getFile(){
		System.out.println("JavaScript Info , countFlies:" + this.countFlies + ", type:" + this.type);
	}
	
}