class ProfileStore{
	Profile[] profiles;
	int currentIndex;
	
	ProfileStore(Profile[] profiles){
		this.profiles=profiles;
	}
	void storeProfile(Profile profile){
		if(this.profiles!=null && profile!=null){
			int index=this.profiles.length-1;
			if(this.currentIndex<=index){
				this.profiles[currentIndex]=profile;
				System.out.println("Store the Profile info in indez :"+currentIndex);
				currentIndex++;
			}
		}
	}
}