class Necklace{
	String necklaceName;
	int id;
	String category;
	String baseMetal;
	float length;
	int price;
	int stockLevel;
	String closureType;
	String mainGemstone;
	String gemstoneShape;
	boolean isHypollergnic;
	float pendantWidth;
	float height;
	String metalPurity;
	String platingMaterial;
	float chainThickness;
	boolean isEngravable;
	String genderTarget;
	float weight;
	String careInstructions;
	
	Necklace(String necklaceName,
	int id,
	String category,
	String baseMetal,
	float length,
	int price,
	int stockLevel,
	String closureType,
	String mainGemstone,
	String gemstoneShape,
	boolean isHypollergnic,
	float pendantWidth,
	float height,
	String metalPurity,
	String platingMaterial,
	float chainThickness,
	boolean isEngravable,
	String genderTarget,
	float weight,
	String careInstructions)
	{
		this.necklaceName=necklaceName;
		this.id=id;
		this.category=category;
		this.baseMetal=baseMetal;
		this.length=length;
		this.price=price;
		this.stockLevel=stockLevel;
		this.closureType=closureType;
		this.mainGemstone=mainGemstone;
		this.gemstoneShape=gemstoneShape;
		this.isHypollergnic=isHypollergnic;
		this.pendantWidth=pendantWidth;
		this.height=height;
		this.metalPurity=metalPurity;
		this.platingMaterial=platingMaterial;
		this.chainThickness=chainThickness;
		this.isEngravable=isEngravable;
		this.genderTarget=genderTarget;
		this.weight=weight;
		this.careInstructions=careInstructions;
	}
}