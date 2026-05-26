class WallPaper{
	int id;
	int resolution;
	float aspectRatio;
	int bitDepth;
	String color;
	String fileFormat;
	int fileSize;
	boolean copression;
	String path;
	String thmbnail;
	String title;
	String tag;
	String author;
	String licenseType;
	boolean live;
	String dynamicTheme;
	double rating;
	int date;
	int downloadCount;
	String category;
	
	WallPaper(int id,int resolution,float aspectRatio,int bitDepth,String color,String fileFormat,int fileSize,boolean copression,String path,String thmbnail,String title,String tag,String author,String licenseType,boolean live,String dynamicTheme,double rating,
	int date,int downloadCount,String category)
	{
		
		this.id=id;
		this.resolution=resolution;
		this.aspectRatio=aspectRatio;
		this.bitDepth=bitDepth;
		this.color=color;
		this.fileFormat=fileFormat;
		this.fileSize=fileSize;
		this.copression=copression;
		this.path=path;
		this.thmbnail=thmbnail;
		this.title=title;
		this.tag=tag;
		this.author=author;
		this.licenseType=licenseType;
		this.live=live;
		this.dynamicTheme=dynamicTheme;
		this.rating=rating;
		this.date=date;
		this.downloadCount=downloadCount;
		this.category=category;
	}
	void display(){
		
		System.out.println("Acces the Instance Veriables..");
		System.out.println("Id:"+this.id);
		System.out.println("resolution:"+this.resolution);
		System.out.println("aspectRatio:"+this.aspectRatio);
		System.out.println("bitDepth:"+this.bitDepth);
		System.out.println("color:"+this.color);
		System.out.println("fileFormat:"+this.fileFormat);
		System.out.println("fileSize:"+this.fileSize);
		System.out.println("copression:"+this.copression);
		System.out.println("path:"+this.path);
		System.out.println("thmbnail:"+this.thmbnail);
		System.out.println("title:"+this.title);
		System.out.println("tag:"+this.tag);
		System.out.println("author:"+this.author);
		System.out.println("licenseType:"+this.licenseType);
		System.out.println("live:"+this.live);
		System.out.println("dynamicTheme:"+this.dynamicTheme);
		System.out.println("Rating:"+this.rating);
		System.out.println("date:"+this.date);
		System.out.println("downloadCount:"+this.downloadCount);
		System.out.println("category:"+this.category);
	}
}