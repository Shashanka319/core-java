class CProgramming{
	
	String fileType;
	int count;
	
	CProgramming(String fileType, int count){
		
		this.fileType=fileType;
		this.count=count;
	}
	void getFile(){
		System.out.println("CProgramming Info , fileType:" + this.fileType + ",count:" + this.count);
	}
	
}