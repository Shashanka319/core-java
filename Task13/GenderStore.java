class GenderStore{
	String[] genders;
	int currentIndex;
	GenderStore(String[] genders){
		this.genders=genders;
	}
	void store(String gender){
		if(genders!=null && gender!=null){
			int index=this.genders.length-1;
			if(this.currentIndex<=index){
				this.genders[currentIndex]=gender;
				System.out.println("Store the Gender name:"+gender);
				System.out.println("Storing index of gender:"+currentIndex);
				currentIndex++;
			}else{
				System.out.println("Array index is out of Reach Can not store further names");
			}
		}else{
			System.out.println("Array of genders and name of gender is null check once...");
		}
	}
	void sortAsc(){
		String temp;
		for(int i=0;i<this.genders.length;i++){
			for(int j=i+1;j<this.genders.length;j++){
				if(this.genders[j].compareTo(this.genders[i])<0){
					temp=this.genders[i];
					this.genders[i]=this.genders[j];
					this.genders[j]=temp;
					
				}
			}
		}System.out.println("Sorted Array...");
		 System.out.println("Current Genders in Array:");
		for (int i = 0; i < this.genders.length; i++) {
        System.out.println("Index " + i + ": " + this.genders[i]);
		}
	}
	void sortDes(){
		String temp;
		for(int i=0;i<this.genders.length;i++){
			for(int j=i+1;j<this.genders.length;j++){
				if(this.genders[j].compareTo(this.genders[i])>0){
					temp=this.genders[i];
					this.genders[i]=this.genders[j];
					this.genders[j]=temp;
					
				}else{
					System.out.println("Desending order of Information not Obtained...");
				}
			}
		}
		System.out.println("Desending order of Information Obtained...");
		System.out.println("Current Genders In Array..");
		for(int i =0;i<this.genders.length;i++){
			System.out.println("Index:"+i+this.genders[i]);
		}
	}
	

}