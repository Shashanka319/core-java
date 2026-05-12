class Java{
	
	int countFiles;
	String type;
	
	Java(int countFiles, String type){
		this.countFiles=countFiles;
		this.type=type;
	}
	
	void getFile(){
		
		System.out.println("Java Info, countFiles:" + this.countFiles + ", type:" + this.type);
	}
	
}