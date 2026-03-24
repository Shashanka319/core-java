class FestivalStore{
	Festival[] festivals;
	int currentIndex =0;
	
	FestivalStore(Festival[] festivals){
		this.festivals=festivals;
	}
	void saveFestival(Festival festival){
		if(this.festivals!=null&& festival!=null){
			System.out.println("Executing the saveFestival in Festivals");
			System.out.println("Array and names are not null so proceed to store");
			int index=this.festivals.length-1;
			if(currentIndex<=index){
				this.festivals[currentIndex]=festival;
				System.out.println("Save the Festival Name"+festival+"in Index of"+currentIndex);
				currentIndex++;
				System.out.println("Store the next Festival info in Next Array of Index:"+currentIndex);
			}
		}
	}
}