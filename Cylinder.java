class Cylinder{
	String[] cylinderNames;
	int currentIndex;
	
	Cylinder(String[] cylinderNames){
		this.cylinderNames=cylinderNames;
		
	}
	void saveCylinderName(String cylinderName){
		System.out.println("Executing save the cylinder Names in Cylinder...");
		System.out.println("Cylinder Name:"+cylinderName);
		if(this.cylinderNames!=null){
			System.out.println("Cylider Name is Not Null prooced to save");
			int index=this.cylinderNames.length-1;
			System.out.println("Array index of this Cylinder Names:"+index);
			if(currentIndex<=index){
				this.cylinderNames[currentIndex]=cylinderName;
				System.out.println("Cylinder name Save in Current  Index:"+currentIndex);
				currentIndex++;
			}
			else{
				System.out.println("Another Cylinder Name Stored in next Index:"+currentIndex);
			}
			
			
		}else{
			System.out.println("cylinder Name is Null Can not save it");
		}
	}
	boolean searchCylindername(String cylinderName){
		if(cylinderName!=null){
			System.out.println("Name is Not null proceed to Search");
			System.out.println("Searching the Cylinder name in Saved Cylinder Names:"+cylinderName);
			if(cylinderNames!=null){
				System.out.println("Searching Starts by Comparing the Names in Array...");
				for(String name:this.cylinderNames){
					if(name==cylinderName){
						System.out.println("Cylinder Name is Found in Array:"+name);
						break;	
						
					}
					else{
						System.out.println("Cylinder name is Not Found in ArraY...");
					}
				}
			}
		}else{
			System.out.println("Name is Null check once");
		}
		return false;
		
	}
	

	
}
