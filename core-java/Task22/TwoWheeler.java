class TwoWheeler{
	String[] modelNames;
	int index;
	
	TwoWheeler(String[] modelNames){
		this.modelNames=modelNames;
	}
	void storemodelName(String model){
		System.out.println("Model Names:"+model);
		if(modelNames!=null){
			int size=this.modelNames.length-1;
			if(this.index<=size){
				this.modelNames[index]=model;
				System.out.println("Saved at index:"+this.index);
				this.index++;
				System.out.println("Model Name is Stored ,go tp next index"+this.index);
			}else{
				System.out.println("Storage is full.");
			}
		}else{
			System.out.println("Array is null.");
		}
		
	}
}