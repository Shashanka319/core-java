class HamperRunner{
	public static void main(String[]args){
		Hamper hamper=new Hamper();
		hamper.open();
		hamper.close();
		hamper.addItem();
		hamper.removeItem();
		hamper.clear();
		hamper.clean();
		hamper.weigh();
		hamper.carry();
		hamper.stack();
		hamper.isFull();
		hamper.isEmpty();
		hamper.checkExpiry();
		hamper.searchItems();
		hamper.calculateTotalValue();
		hamper.checkHamper();
		Hamper.applyDiscount();
		Hamper.ship();
		Hamper.wrop();
		Hamper.label();
		Hamper.restock();
		
	}
}