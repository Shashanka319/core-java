class CSS{
	
	String type;
	String style;
	
	
	CSS(String type, String style){
		
		this.type=type;
		this.style=style;
		
	}
	void getFile(){
		
		System.out.println("CSS Info, type:" + this.type + ", style:" + this.style);
	}
}