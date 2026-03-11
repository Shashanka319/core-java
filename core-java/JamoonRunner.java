class JamoonRunner{
	public static void main(String[] values){
		int[] counts={10,5,8};
		
		Ingridient[] flavor=new Ingridient[3];
		flavor[0]=new Ingridient("Jamoon","Sweet");
		flavor[1]=new Ingridient("Jmoon","Sugarless");
		flavor[2]=new Ingridient("Jamoon","sugar");
		
		Jamoon jamoon = new Jamoon(counts,flavor);
		jamoon.getDisplay();
		
	}
}