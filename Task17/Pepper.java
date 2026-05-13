class Pepper{
	int pepperId;
	String commonName;
	String scientificName;
	String color;
	int units;
	boolean spicy;
	double weight;
	double price;
	String origin;
	boolean organic;
	double vitaminContent;
	int daysToMaturity;
	String growthHabit;
	int quantity;
	int lifeSpan;
	double idealStorageTemp;
	int seedCountPerFruit;
	String flover;
	double rating;
	boolean quality;
	
	Pepper(int pepperId,String commonName,String scientificName,String color,int units,boolean spicy,double weight,double price,String origin,
	boolean organic,double vitaminContent,int daysToMaturity,String growthHabit,int quantity,int lifeSpan,double idealStorageTemp,int seedCountPerFruit,String flover,double rating,boolean quality)
	{
		this.pepperId=pepperId;
		this.commonName=commonName;
		this.scientificName=scientificName;
		this.color=color;
		this.units=units;
		this.spicy=spicy;
		this.weight=weight;
		this.price=price;
		this.origin=origin;
		this.organic=organic;
		this.vitaminContent=vitaminContent;
		this.daysToMaturity=daysToMaturity;
		this.growthHabit=growthHabit;
		this.quantity=quantity;
		this.lifeSpan=lifeSpan;
		this.idealStorageTemp=idealStorageTemp;
		this.seedCountPerFruit=seedCountPerFruit;
		this.flover=flover;
		this.rating=rating;
		this.quality=quality;
		
	}
	void shows(){
		System.out.println("Acess the instance Variables ...");
		System.out.println("pepperId:"+this.pepperId);
		System.out.println("commonName:"+this.commonName);
		System.out.println("scientificName:"+this.scientificName);
		System.out.println("color:"+this.color);
		System.out.println("units:"+this.units);
		System.out.println("spicy:"+this.spicy);
		System.out.println("weight:"+this.weight);
		System.out.println("price:"+this.price);
		System.out.println("origin:"+this.origin);
		System.out.println("organic:"+this.organic);
		System.out.println("vitaminContent:"+this.vitaminContent);
		System.out.println("daysToMaturity:"+this.daysToMaturity);
		System.out.println("growthHabit:"+this.growthHabit);
		System.out.println("quantity:"+this.quantity);
		System.out.println("lifeSpan:"+this.lifeSpan);
		System.out.println("idealStorageTemp:"+this.idealStorageTemp);
		System.out.println("seedCountPerFruit:"+this.seedCountPerFruit);
		System.out.println("flover:"+this.flover);
		System.out.println("rating:"+this.rating);
		System.out.println("quality:"+this.quality);
	}
}