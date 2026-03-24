class GumStore{
	Gum[] gums;
	int currentIndex;
	GumStore(Gum[] gums){
		this.gums=gums;
	}
	void gumStore(Gum gum){
		if(this.gums!=null && gum!=null){
			int index=this.gums.length-1;
			if(this.currentIndex<=index){
				this.gums[currentIndex]=gum;
				System.out.println("Storing the Gu, Info in Index:"+currentIndex);
				currentIndex++;
			}
		}
	}
}