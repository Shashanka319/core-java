class Rain{
	float precipitation ;
	boolean isAcidRain;
	String category;
	String originCity;
	String velocity;
	
	Rain (){}
	
	Rain(float precipitation,
	boolean isAcidRain,
	String category,
	String originCity,
	String velocity){
		this.precipitation=precipitation;
		this.isAcidRain=isAcidRain;
		this.category=category;
		this.originCity=originCity;
		this.velocity=velocity;
	}
	
	Rain(float precipitation){
		this.precipitation=precipitation;
		
	}
	
	Rain(boolean isAcidRain){
		this.isAcidRain=isAcidRain;
	}
	
	Rain(String category){
		this.category=category;
	}
	
	Rain(String originCity,String category){
		this.originCity=originCity;
		this.category=category;
	}
	
	Rain(String velocity,float precipitation){
		this.velocity=velocity;
		this.precipitation=precipitation;
	}
	
}