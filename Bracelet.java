class Bracelet{
	String name;
	int stockKeepingUnit;
	String type;
	String material;
	float retailPrice;
	int quantityInStock;
	float size;
	float weight;
	String claspType;
	String gemstoneType;
	float totalCaratWeight;
	boolean isAdjustable;
	String chainStyle;
	String color;
	int noOfCharms;
	String description;
	float discountPer;
	int supplierID;
	boolean isWaterProof;
	
	Bracelet(String name,
	int stockKeepingUnit,
	String type,
	String material,
	float retailPrice,
	int quantityInStock,
	float size,
	float weight,
	String claspType,
	String gemstoneType,
	float totalCaratWeight,
	boolean isAdjustable,
	String chainStyle,
	String color,
	int noOfCharms,
	String description,
	float discountPer,
	int supplierID,
	boolean isWaterProof)
	{
		this.name=name;
		this.stockKeepingUnit=stockKeepingUnit;
		this.type=type;
		this.material=material;
		this.retailPrice=retailPrice;
		this.quantityInStock=quantityInStock;
		this.size=size;
		this.weight=weight;
		this.claspType=claspType;
		this.gemstoneType=gemstoneType;
		this.totalCaratWeight=totalCaratWeight;
		this.isAdjustable=isAdjustable;
		this.chainStyle=chainStyle;
		this.color=color;
		this.noOfCharms=noOfCharms;
		this.description=description;
		this.supplierID=supplierID;
		this.isWaterProof=isWaterProof;
	}
}