class Map{
	int id;
	String title;
	String type;
	String name;
	boolean digital;
	double lat;
	double centerlong;
	int raito;
	int zoomLevel;
	String unit;
	String fileFormat;
	boolean hasgridlines;
	int layerCOunt;
	double opacity;
	boolean enabled;
	int poiCount;
	double searchRadius;
	boolean realTime;
	int creationYear;
	String licenceType;
	
	
	
	Map(int id,String title,String type,String name,boolean digital,double lat,double centerlong,int raito,int zoomLevel,String unit,String fileFormat,boolean hasgridlines,int layerCOunt,double opacity,boolean enabled,int poiCount,double searchRadius,boolean realTime,int creationYear,String licenceType)
	{
		this.id=id;
		this.title=title;
		this.type=type;
		this.name=name;
		this.digital=digital;
		this.lat=lat;
		this.centerlong=centerlong;
		this.raito=raito;
		this.zoomLevel=zoomLevel;
		this.unit=unit;
		this.fileFormat=fileFormat;
		this.hasgridlines=hasgridlines;
		this.layerCOunt=layerCOunt;
		this.opacity=opacity;
		this.enabled=enabled;
		this.poiCount=poiCount;
		this.searchRadius=searchRadius;
		this.realTime=realTime;
		this.creationYear=creationYear;
		this.licenceType=licenceType;
		
	}
	void getMap(){
		System.out.println("Acess the instances Variables..");
		System.out.println("id:"+this.id);
		System.out.println("title:"+this.title);
		System.out.println("type:"+this.type);
		System.out.println("name:"+this.name);
		System.out.println("digital:"+this.digital);
		System.out.println("lat:"+this.lat);
		System.out.println("centerlong:"+this.centerlong);
		System.out.println("raito:"+this.raito);
		System.out.println("zoomLevel:"+this.zoomLevel);
		System.out.println("unit:"+this.unit);
		System.out.println("fileFormat:"+this.fileFormat);
		System.out.println("hasgridlines:"+this.hasgridlines);
		System.out.println("layerCOunt:"+this.layerCOunt);
		System.out.println("opacity:"+this.opacity);
		System.out.println("enabled:"+this.enabled);
		System.out.println("poiCount:"+this.poiCount);
		System.out.println("searchRadius:"+this.searchRadius);
		System.out.println("realTime:"+this.realTime);
		System.out.println("creationYear:"+this.creationYear);
		
	}
}