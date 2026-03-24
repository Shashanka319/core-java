class CapStore{
	Cap[] caps;
	int currentIndex;
	
	CapStore(Cap[] caps){
		this.caps=caps;
	}
	void capStore(Cap cap){
		if(this.caps!=null&& cap!=null ){
			System.out.println("Store the Cap in the CapStore");
			int index=this.caps.length-1;
			if(currentIndex<=index){
				this.caps[currentIndex]=cap;
				System.out.println("Cap"+cap+"is stored in"+currentIndex);
				currentIndex++;	
				System.out.println("Cap Info Stored in Next array of index:"+currentIndex);
			}else{
				System.out.println("Array Index is Full");
			}
			
			
		}else{
			System.out.println("Caps Array and name is Null");
		}
	}
}