class GenderStoreRunner{
	public static void main(String[] values){
		String[] genders=new String[3];
		GenderStore save=new GenderStore(genders);
		save.store("Male");
		save.store("Female");
		save.store("Transgender");
		save.sortAsc();
		save.sortDes();
		
	}
}