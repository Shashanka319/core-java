class TreeRunner{
	public static void main(String[] values){
		String[] trees=new String[10];
		Tree tree = new Tree(trees);
		tree.saveTreename("Neem");
		tree.saveTreename("Sandalwood");
		tree.saveTreename("teak");
		tree.saveTreename("Banyan");
		tree.saveTreename("Ashoka");
		tree.saveTreename("Mango Tree");
		tree.saveTreename("Coconut");
		tree.saveTreename("Gulmohar");
		tree.saveTreename("Bambo");
		tree.saveTreename("Tamarind");
		tree.searchTreeName("Neem");
		tree.searchTreeName("Bambo");
		
		tree.update(2,"Arecha Tree");
		tree.update("Neem","Arecha Tree");
		
		tree.delete(2);
		tree.delete("Sandalwood");
		
		
	}
}