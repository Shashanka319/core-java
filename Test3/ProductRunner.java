class ProductRunner{
	public static void main(String[] values){
		Product product = new Product(101,"T-Shirt",500,10,"Cloth",15);
		
		product.getter();
		double price=product.caluclateDiscountPrice();
		System.out.println("price after Discount:"+price);
		
		double total=product.addToCart(2);
		System.out.println("After reduces the available quantity price:"+total);
		
		
	}
}