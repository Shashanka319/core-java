class MapStore{
	Map[] informations;
	int currentIndex;
	MapStore(Map[] informations){
		this.informations=informations;
	}
	void savemapInfo(Map information){
		System.out.println("Executing the savemapInfoin MapStore");
		if(this.informations!=null && information!=null){
			int index=this.informations.length-1;
			if(this.currentIndex<=index){
				this.informations[currentIndex]=information;
				System.out.println("information is Stored in the Array:"+information);
				System.out.println("Index of the Stored Information:"+currentIndex);
				currentIndex++;
				System.out.println("Stored the information in next array index:"+currentIndex);
			}else{
				System.out.println("Array is Full Chek Once");
			}
		}else{
			System.out.println("Informations are Null Chek Once...");
		}
	}
	
}