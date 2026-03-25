class FarmerStore{
	Farmer[] farmers;
	int currentIndex;
	
	FarmerStore(Farmer[] farmers){
		this.farmers=farmers;
	}
	void storeInfo(Farmer farmer){
		if(this.farmers!=null&& farmer!=null){
			int index=this.farmers.length-1;
			if(this.currentIndex<=index){
				this.farmers[currentIndex]=farmer;
				System.out.println("Store the Farme information In index:"+currentIndex);
				currentIndex++;
			}else{
				System.out.println("Array is Full Cna not store");
			}
		}else{
			System.out.println("Farmers and name is Null Check Once...");
		}
	}
}