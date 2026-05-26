class Paper{
	int paperId;
	int weight;
	double thickness;
	double opacity;
	int brightness;
	String color;
	String finish;
	boolean coated;
	String textureType;
	boolean translucent;
	String sizeStandard;
	double width;
	double height;
	String brand;
	double pricePerReam;
	int quantity;
	int sheetCount;
	String material;
	boolean recyclable;
	boolean quality;
	
	Paper(int paperId,int weight,double thickness,double opacity,int brightness,String color,String finish,boolean coated,String textureType,boolean translucent,String sizeStandard,double width,double height,String brand,double pricePerReam,int quantity,int sheetCount,String material,boolean recyclable,boolean quality)
	{
		this.paperId=paperId;
		this.weight=weight;
		this.thickness=thickness;
		this.opacity=opacity;
		this.brightness=brightness;
		this.color=color;
		this.finish=finish;
		this.coated=coated;
		this.textureType=textureType;
		this.translucent=translucent;
		this.sizeStandard=sizeStandard;
		this.width=width;
		this.height=height;
		this.brand=brand;
		this.pricePerReam=pricePerReam;
		this.quantity=quantity;
		this.sheetCount=sheetCount;
		this.material=material;
		this.recyclable=recyclable;
		this.quality=quality;
		
		
	}
	void output(){
		System.out.println("Access the instances Variables...");
		System.out.println("paperId:"+this.paperId);
		System.out.println("weight:"+this.weight);
		System.out.println("thickness:"+this.thickness);
		System.out.println("opacity:"+this.opacity);
		System.out.println("brightness:"+this.brightness);
		System.out.println("color:"+this.color);
		System.out.println("finish:"+this.finish);
		System.out.println("coated:"+this.coated);
		System.out.println("textureType:"+this.textureType);
		System.out.println("translucent:"+this.translucent);
		System.out.println("sizeStandard:"+this.sizeStandard);
		System.out.println("width:"+this.width);
		System.out.println("height:"+this.height);
		System.out.println("brand:"+this.brand);
		System.out.println("pricePerReam:"+this.pricePerReam);
		System.out.println("quantity:"+this.quantity);
		System.out.println("sheetCount:"+this.sheetCount);
		System.out.println("material:"+this.material);
		System.out.println("recyclable:"+this.recyclable);
		System.out.println("quality:"+this.quality);
	}
}