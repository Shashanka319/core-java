class BiscuitRunner{
	public static void main(String []values){
		String biscuitName="Good Day";
		int cost=Biscuit.getCost(biscuitName);
		System.out.println("Biscuit Cost:"+cost);
		
		
		System.out.println("Biscuit Shape:"+Biscuit.getShape(biscuitName));
		
		String[] name=Biscuit.getFlavours("parle-G");
		//System.out.println("Biscuit Flavours:"+name);
		
		
	}
}