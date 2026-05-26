class Singer{
	String[] singerNames;
	int currentSize;
	
	Singer(String[] singerNames){
		this.singerNames=singerNames;
	}
	
	void saveSingerName(String singerName){
		System.out.println("Saves the siger names in Singer Array");
		System.out.println("Singer Name:"+singerName);
		if(this.singerNames!=null){
			int index=this.singerNames.length-1;
			System.out.println("Total Index of this Singer Name:"+index);
			if(currentSize<index){
				System.out.println("Singer Name is Saved in Index:"+this.currentSize);
				currentSize++;
				System.out.println("Saved the another Singer Name in the nexe Index:"+this.currentSize);
				
				
			}else{
				System.out.println("Array is Full Check once...");
			
			}
		}else{
			System.out.println("Array is Null");
		}
	}
	boolean searchSingerName(String singerName){
		if(singerName!=null){
			System.out.println("Search the Singer Name as "+singerName+ "In array");
			if(this.singerNames!=null){
				System.out.println("Starts the Searching by Comparing Singer Names within Array");
				for(String name:this.singerNames){
					if(singerName==name){
						System.out.println("Singer Name is Found in array");
						return true;
					}
					else{
						System.out.println("Singer Name"+singerName+" is Not Found");
						return false;
					}
				}
			}else{
				System.out.println("Singer Names of array is Null Can Not Search");
			}
		}
		return false;
	}
	
}