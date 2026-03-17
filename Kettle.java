class Kettle{
	String[] kettelNames;
	int currentSize;
	Kettle(String[] kettelNames){
		this.kettelNames=kettelNames;
	}
	void savekettaleNames(String kettelName){
		System.out.println("Executing the Kettel Names in Kettle...");
			System.out.println("Kettele Name :"+kettelName);
		if(this.kettelNames!=null){
			System.out.println("Kettele Names is Not Null proceeed to Save");
			int size=kettelNames.length-1;
			System.out.println("Size of the Array:"+size);
			if(currentSize<=size){
				this.kettelNames[currentSize]=kettelName;
				System.out.println("Kettele Name is Save in Current Size:"+currentSize);
				currentSize++;
				System.out.println("Kettle Name is Save in Next Size:"+currentSize);
				
			}else{
				System.out.println("Array Size is Not Match Check once");
			}
			
			
		}else{
			System.out.println("Kettel Names is Null");
		}
	}
	
	boolean searchKettleNames(String kettelName){
		if(kettelName!=null){
			System.out.println("Kettle Names is Not Null Proceed to Search");
			System.out.println("Search the kettle name in Kettle Names :"+kettelName);
			if(kettelNames!=null){
				System.out.println("Searching Starts by Comaparing the kettle Name in Array");
				for(String name:kettelNames){
					if(name==kettelName){
						System.out.println("Kettle Name is Found in Array:"+name);
						break;
					}else{
						System.out.println("Kettle Name is Not Found....");
					}
				}
			}else{
				System.out.println("kettelNames is Null Can not search");
			}
		}
		return false;
	}
}