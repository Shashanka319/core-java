class ClothStore{
	Cloth[] clothes;
	int currentIndex;
	
	ClothStore(Cloth[] clothes){
		this.clothes=clothes;
	}
	void storeCloth(Cloth cloth){
		System.out.println("Executing the storeCloth in ClothStore");
		
		if(this.clothes !=null && cloth!=null){
			int index=clothes.length-1;
			System.out.println("Store the Cloth Inforamtion in Array Index:"+currentIndex);
			if(this.currentIndex<=index){
				this.clothes[currentIndex]=cloth;
				
				currentIndex++;
				System.out.println("Store the cloth in next Array index:"+currentIndex);
			}else{
				System.out.println("Array is Full Can Not Store ");
			}
		}else{
			System.out.println("Clothe Info Is Null Check Once");
		}
	}
}