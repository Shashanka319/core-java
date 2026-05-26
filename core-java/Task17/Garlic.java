class Garlic{
	int garlicId;
	String varityName;
	String subpecie;
	String scientificName;
	String origin;
	double bulbSizeCm;
	int cloveCount;
	String color;
	boolean easyPeel;
	String cloveSize;
	int pungecyLevel;
	String flavor;
	double allicinContent;
	double sugarContent;
	int daysToHarvest;
	int storageLife;
	boolean organic;
	double price;
	double stock;
	boolean quality;
	
	Garlic(int garlicId,String varityName,String subpecie,String scientificName,String origin,double bulbSizeCm,int cloveCount,String color,
	boolean easyPeel,String cloveSize,int pungecyLevel,String flavor,double allicinContent,double sugarContent,int daysToHarvest,int storageLife,boolean organic,double price,double stock,boolean quality)
	{
		this.garlicId=garlicId;
		this.varityName=varityName;
		this.subpecie=subpecie;
		this.scientificName=scientificName;
		this.origin=origin;
		this.bulbSizeCm=bulbSizeCm;
		this.cloveCount=cloveCount;
		this.color=color;
		this.easyPeel=easyPeel;
		this.cloveSize=cloveSize;
		this.pungecyLevel=pungecyLevel;
		this.flavor=flavor;
		this.allicinContent=allicinContent;
		this.sugarContent=sugarContent;
		this.daysToHarvest=daysToHarvest;
		this.storageLife=storageLife;
		this.organic=organic;
		this.price=price;
		this.stock=stock;
		this.quality=quality;
	}
	void getinfo(){
		System.out.println("Acess the Instances Variables....");
		System.out.println("garlicId:"+this.garlicId);
		System.out.println("varityName:"+this.varityName);
		System.out.println("subpecie:"+this.subpecie);
		System.out.println("scientificName:"+this.scientificName);
		System.out.println("origin:"+this.origin);
		System.out.println("bulbSizeCm:"+this.bulbSizeCm);
		System.out.println("cloveCount:"+this.cloveCount);
		System.out.println("color:"+this.color);
		System.out.println("easyPeel:"+this.easyPeel);
		System.out.println("cloveSize:"+this.cloveSize);
		System.out.println("pungecyLevel:"+this.pungecyLevel);
		System.out.println("flavor:"+this.flavor);
		System.out.println("allicinContent:"+this.allicinContent);
		System.out.println("sugarContent:"+this.sugarContent);
		System.out.println("daysToHarvest:"+this.daysToHarvest);
		System.out.println("storageLife:"+this.storageLife);
		System.out.println("organic:"+this.organic);
		System.out.println("price:"+this.price);
		System.out.println("stock:"+this.stock);
		System.out.println("quality:"+this.quality);
		
	}
}