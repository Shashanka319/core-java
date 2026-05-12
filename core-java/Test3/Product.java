class Product{
	int productId;
	String productName;
	double price;
	int quantityAvailable;
	String category;
	double discountPercentage;
	
	Product(int productId,String productName,double price,int quantityAvailable,String category,double discountPercentage)
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
	double caluclateDiscountPrice(){
		double discountAmount = (price * discountPercentage) / 100;
		double finalPrice = price - discountAmount;
		return finalPrice;
		
	}
	double addToCart(int quantity){
		System.out.println("Executing the quantity in Add to Cart");
		if(quantity<=quantityAvailable){
			quantityAvailable=quantityAvailable-quantity;
			double totalPrice=caluclateDiscountPrice() * quantity;
			System.out.println("Items added ot cart");
			System.out.println("Total Price after the discount:"+totalPrice);
			
			return totalPrice;
		}
		else{
			System.out.println("Quantity is not available");
			return -1;
		}
		
		
	}
		
	double addToCart(int quantity, boolean isBulkPurchase){
		System.out.println("Executing the information in addToCart");
		if(isBulkPurchase==true || quantity>=10){
			double discount=(totalPrice*5) / 100 ;
			double grandPrice = price - discount;
			System.out.println("Grand Price :"+grandPrice);
			return grandPrice;
			
		}
	}
	
	
}