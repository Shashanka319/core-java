class HTML{
	
	String tags;
	int applicationCount;
	
	HTML(String tags, int applicationCount){
		
		this.tags=tags;
		this.applicationCount=applicationCount;
	}
	
	void getFile(){
		
		System.out.println("Tags:" + this.tags);
		System.out.println("Application count:" + this.applicationCount);
		System.out.println("Created HTML file using const.,,");
	}
	
}