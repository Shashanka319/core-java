class Product{
	int productId;
	String productName;
	double price;
	boolean quantityAvailable;
	String category;
	double discountPercentage;
	
	Product(int productId,String productName,double price,boolean quantityAvailable,String category,double discountPercentage)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantityAvailable=quantityAvailable;
		this.category=category;
		this.discountPercentage=discountPercentage;
	}
	void getter(){
		System.out.println("Product Information..");
		System.out.println("Product Id:"+this.productId);
		System.out.println("productName:"+this.productName);
		System.out.println("price:"+this.price);
		System.out.println("quantityAvailable:"+this.quantityAvailable);
		System.out.println("category:"+this.category);
		System.out.println("discountPercentage:"+this.discountPercentage);
	}
	
}