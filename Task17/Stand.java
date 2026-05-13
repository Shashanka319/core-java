class Stand{
	int id;
	String name;
	String brand;
	String moduleNo;
	String serialNo;
	String material;
	double weight;
	String color;
	boolean adjustable;
	double maxHeight;
	String standType;
	boolean foldable;
	boolean hasWheels;
	int angleRange;
	String baseType;
	double price;
	int stockLevel;
	int warrenty;
	double rating;
	boolean quality;
	
	Stand(int id,String name,String brand,String moduleNo,String serialNo,String material,double weight,String color,boolean adjustable,
	double maxHeight,String standType,boolean foldable,boolean hasWheels,int angleRange,String baseType,double price,int stockLevel,int warrenty,double rating,boolean quality)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.moduleNo=moduleNo;
		this.serialNo=serialNo;
		this.weight=weight;
		this.color=color;
		this.adjustable=adjustable;
		this.maxHeight=maxHeight;
		this.standType=standType;
		this.foldable=foldable;
		this.hasWheels=hasWheels;
		this.angleRange=angleRange;
		this.baseType=baseType;
		this.price=price;
		this.stockLevel=stockLevel;
		this.warrenty=warrenty;
		this.rating=rating;
		this.quality=quality;
	}
	
	void getStand(){
		System.out.println("Acess the Instances variables.....");
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("brand:"+this.brand);
		System.out.println("moduleNo:"+this.moduleNo);
		System.out.println("serialNo:"+this.serialNo);
		System.out.println("weight:"+this.weight);
		System.out.println("color:"+this.color);
		System.out.println("adjustable:"+this.adjustable);
		System.out.println("maxHeight:"+this.maxHeight);
		System.out.println("standType:"+this.standType);
		System.out.println("foldable:"+this.foldable);
		System.out.println("hasWheels:"+this.hasWheels);
		System.out.println("angleRange:"+this.angleRange);
		System.out.println("baseType:"+this.baseType);
		System.out.println("price:"+this.price);
		System.out.println("stockLevel:"+this.stockLevel);
		System.out.println("warrenty:"+this.warrenty);
		System.out.println("rating:"+this.rating);
		System.out.println("quality:"+this.quality);
		
	}
	
	
}