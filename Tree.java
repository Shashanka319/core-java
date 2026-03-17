class Tree{
	String[] treeNames;
	int presentSize;
	
	Tree(String[] treeNames){
		this.treeNames=treeNames;
	}
	void saveTreename(String treeName){
		System.out.println("Executing the saveTreename in Tree");
		System.out.println("Tree Name:"+treeName);
		if(this.treeNames!=null){
			System.out.println("Tree Names is not null Procced to Savee");
			int size=treeNames.length-1;
			if(presentSize<=size){
				this.treeNames[presentSize]=treeName;
				System.out.println("Tree Name is Save in current Size:"+presentSize);
				presentSize++;
				System.out.println("Tree Name is Save in Next index:"+presentSize);
			}else{
				System.out.println("Array size is not Match...");
			}
		}
		else{
			System.out.println("Tree Name is Null");
		}
	}
	boolean searchTreeName(String treeName){
		if(treeName!=null){
			System.out.println("Tree Name is Not Null Proceed to Search");
			System.out.println("Tree Name:"+treeName);
			if(treeNames!=null){
				System.out.println("Searching the Tree Name by comaparing in Array");
				for(String name:treeNames){
					if(name==treeName){
						System.out.println("Tree name is Found in Array");
						return false;
						
					}else{
						System.out.println("Tree Name is Not Found");
					}
				}
			}else{
				System.out.println("Tree Name is Not match so Can not search");
			}
		}
		return false;
	}
	
}