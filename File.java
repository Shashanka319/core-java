class File{
	int size = 23;
	int count = 5;
	String fileType = "text";
	boolean store = true;
	int copy = 6;
	int noOfFiles;
	HTML html;
	CSS css;
	JavaScript javaScript;
	Java java;
	CProgramming cProgramming;
	
	File(int size,int count,String fileType,boolean store,int copy,int noOfFiles, HTML html, CSS css, JavaScript javaScript, Java java, CProgramming cProgramming){
		this.size=size;
		this.count=count;
		this.fileType=fileType;
		this.store=store;
		this.copy=copy;
		this.noOfFiles=noOfFiles;
		this.html=html;
		this.css=css;
		this.javaScript=javaScript;
		this.java=java;
		this.cProgramming=cProgramming;
		
		System.out.println("created File with noOfFiles html css javaScript java cProgramming using const");
		
		
	}
	
}