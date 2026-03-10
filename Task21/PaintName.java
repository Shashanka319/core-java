class PaintName{
	String name;
	double cost;
	
	PaintName(String name,double cost){
		this.name=name;
		this.cost=cost;
	}
	void getDetailes(){
		System.out.println("Paint Name:"+this.name);
		System.out.println("Paint Cost:"+this.cost);
	}
}