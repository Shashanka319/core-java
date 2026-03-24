class Map{
	String type;
	int distance;
	String startingPoint;
	String destinationPoint;
	String travelType;
	boolean accurate;
	
	Map(String type,String startingPoint,int distance,String destinationPoint,boolean accurate,String travelType){
		this.type=type;
		this.startingPoint=startingPoint;
		this.distance=distance;
		this.destinationPoint=destinationPoint;
		this.accurate=accurate;
		this.travelType=travelType;
	}
	void mapInfo(){
		System.out.println("Type:"+this.type);
		System.out.println("Starting Point:"+this.startingPoint);
		System.out.println("distance:"+this.distance);
		System.out.println("destinationPoint:"+this.destinationPoint);
		System.out.println("accurate:"+this.accurate);
		System.out.println("travelType:"+this.travelType);
	}
}