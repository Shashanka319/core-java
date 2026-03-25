class Product{
	String name;
	String make;
	String mfgDate;
	double cost;
	ProductType productType;
	String seller;
	ProductWarrentyYear productWarrentyYear;
	boolean warrentyExpired;
	int uniquwId;
	String originCountry;
	
	Product(String name, String make, String mfgDate, double cost, ProductType productType, String seller, ProductWarrentyYear productWarrentyYear,boolean warrentyExpired, int uniquwId, String originCountry)
	{
		this.name=name;
		this.make=make;
		this.mfgDate=mfgDate;
		this.cost=cost;
		this.productType=productType;
		this.seller=seller;
		this.productWarrentyYear=productWarrentyYear;
		this.warrentyExpired=warrentyExpired;
		this.uniquwId=uniquwId;
		this.originCountry=originCountry;
	}
	void productInfo(){
		System.out.println("Product Name:"+name);
		System.out.println("Make:"+make);
		System.out.println("Manufacturing Date:"+mfgDate);
		System.out.println("Cost:"+cost);
		System.out.println("Product Type:"+productType);
		System.out.println("Seller:"+seller);
		System.out.println("Warrenty Year:"+productWarrentyYear);
		System.out.println("Warrenty Expired:"+warrentyExpired);
		System.out.println("Unique Id Of Product:"+uniquwId);
		System.out.println("Origin Country:"+originCountry);
	}
	
}