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
						return true;
						
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
	
	boolean update(int presentSize,String newTree){
			System.out.println("Upadating the new tree");

	if(presentSize>0 &&  presentSize<this.treeNames.length){
			System.out.println("Upadated Tree Name:"+newTree);
			this.treeNames[presentSize]=newTree;
			System.out.println("Updated Index Value:"+presentSize);
			return true;
		}
		else{
			System.out.println("Index is not valid");
		}
		return false;
		
	}
   boolean update(String oldValue,String newValue)
   {
	   if(oldValue!=null){
		   if(newValue!=null){
			   System.out.println("New Value is Not Null Procees to check update.....");
			   for(int i=0;i<this.treeNames.length;i++){
				   if(this.treeNames[i]==newValue){
					   this.treeNames[i]=newValue;
					   System.out.println("Value Updated.....");
					   System.out.println("Updated Value:"+newValue);
				   }
				   
			   }
		   }else{
			   System.out.println("New Value is Null");
		   }
			   
		   
	   }
	   return false;
	   
	   
   }   
   String delete(int index){
	   System.out.println("Deleted By Index ...");
	   if(treeNames!=null){
		   if(index>=0 && index<this.treeNames.length ){
			   if(this.treeNames[index]!=null){
				   String deleted = this.treeNames[index];
				   this.treeNames[index]=null;
				   System.out.println("Deleted"+deleted+"from index:"+index);
				   return deleted;
			   }else{
				   System.out.println("No element Present this index");
			   }
		   }else{
			   System.out.println("Invalid Data");
		   }
	   }else{
		   System.out.println("Array is Null Check once");
	   }
	   return null;
   }
   String delete(String name){
	   System.out.println("Delete the value from index");
	   if(this.treeNames!=null){
		   if(name!=null){
			   int index=0;
			   for(String value:this.treeNames){
				   System.out.println("Checking index"+index+":"+value);
				   if(value != null &&value==name){
					   String deleted=this.treeNames[index];
					   this.treeNames[index]=null;
					   System.out.println("Deleted"+deleted+"from index:"+index);
					   return deleted;
				   }
				   index++;
			   }
			   System.out.println("Tree name not found");
		   }else{
			   System.out.println("Name is Null Can not deleted");
		   }
	   }else{
			   System.out.println("Array is null");
		   }
	   return null;
   }
}

