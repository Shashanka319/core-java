class TollgateStore{
	Tollgate[] tollgates;
	int currentIndex;
	
	TollgateStore(Tollgate[] tollgates){
		this.tollgates=tollgates;
	}
	void storeTollInfo(Tollgate tollgate){
		if(this.tollgates!=null && tollgate!=null){
			int index= this.tollgates.length-1;
			if(this.currentIndex<=index){
				this.tollgates[currentIndex]=tollgate;
				System.out.println("Store the Tollgate in Index:"+currentIndex);
				currentIndex++;
				System.out.println("Store the anothe tollgate in next index:"+currentIndex);
			}
		}
	}
}