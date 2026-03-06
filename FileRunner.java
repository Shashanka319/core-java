class FileRunner{
	public static void main(String[]args){
		FileType type=new FileType("java",1024);
		FileName name=new FileName();
		FileSort sort=new FileSort();
		FileView view=new FileView();
		FileDetailes detailes=new FileDetailes();
		;
		File file = new File(2,"Instance Variables",1024,true,true,type,name,sort,view,detailes);
	}
}