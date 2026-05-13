class ProductRunner{
	public static void main(String[] values){
		Product product = new Product(101,"T-Shirt",500,true,"Cloth",15);
		
		product.getter();
		product.caluclateDiscountPrice();
	}
}